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
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.m_hoa_don;

/**
 *
 * @author Admin
 */
public class hoa_don_query {
    
    
     private Connection conn;
    private ResultSet results;
    private m_hoa_don l = new m_hoa_don();
    
    public hoa_don_query(){
        Properties props  = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");//let me read content of a file 
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(hoa_don_query.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(hoa_don_query.class.getName()).log(Level.SEVERE, null, ex);
        }
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String password = props.getProperty("user.password");
        
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(hoa_don_query.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = (Connection) DriverManager.getConnection(url,username,password);
        } catch (SQLException ex) {
            Logger.getLogger(hoa_don_query.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int them_hoa_don(m_hoa_don hd) throws SQLException
    {
        String query = "insert into hoa_don(ngay_in,ma_khach_hang,tri_gia,tinh_trang) values(?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);//get last_id when insert
        
        Date d = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        ps.setString(1, ft.format(d));
        ps.setInt(2, hd.getMa_khach_hang());
        ps.setInt(3, hd.getTri_gia());
        ps.setInt(4, 1);
        
        ps.executeUpdate();
        this.results = ps.getGeneratedKeys();
        int key = 0;
        if(this.results.next())
        {
            key = this.results.getInt(1);
        }
        return key;
        
        
    }
    
    public static void main (String[] args) throws SQLException
    {
        hoa_don_query cq = new hoa_don_query();
        m_hoa_don ct = new m_hoa_don();
        
        ct.setMa_khach_hang(1);
        ct.setTri_gia(50);
        
        
        System.out.print(cq.them_hoa_don(ct));
    }
    
}
