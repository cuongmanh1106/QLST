/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbHelpers;

import com.mysql.jdbc.Connection;
import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.m_nguoi_dung;

/**
 *
 * @author Admin
 */
public class nguoi_dung_query {
    
    private Connection conn;
    private ResultSet results;
    private m_nguoi_dung kh = new m_nguoi_dung();
    
    public nguoi_dung_query(){
        Properties props  = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");//let me read content of a file 
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(nguoi_dung_query.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(nguoi_dung_query.class.getName()).log(Level.SEVERE, null, ex);
        }
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String password = props.getProperty("user.password");
        
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(nguoi_dung_query.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = (Connection) DriverManager.getConnection(url,username,password);
        } catch (SQLException ex) {
            Logger.getLogger(nguoi_dung_query.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public  m_nguoi_dung dang_nhap_admin(String ten_dang_nhap, String mat_khau) throws SQLException
    {
        String sql = "select * from nguoi_dung where ten_dang_nhap = ? and mat_khau = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, ten_dang_nhap);
        ps.setString(2, mat_khau);
        
        this.results = ps.executeQuery();
        
        if(this.results.next())
        {
            m_nguoi_dung nd = new m_nguoi_dung();
            
            nd.setTen_dang_nhap(this.results.getString("ten_dang_nhap"));
            nd.setHo_ten(this.results.getString("ho_ten"));
            nd.setMat_khau(this.results.getString("mat_khau"));
            nd.setEmail(this.results.getString("email"));
            nd.setMa_nguoi_dung(this.results.getInt("ma_nguoi_dung"));
            return nd;
        }
        return null;
    }
    
    public static void main(String[] args) throws SQLException
    {
        m_nguoi_dung nd = new m_nguoi_dung();
        nguoi_dung_query nq = new nguoi_dung_query();
        
        nd = nq.dang_nhap_admin("zc", "123");
        
        System.out.println(nd);
        
    }
    
}
