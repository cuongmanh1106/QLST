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
import model.m_chi_tiet_hoa_don;
import model.m_khach_hang;

/**
 *
 * @author Admin
 */
public class ct_hoa_don_query {
    
     private Connection conn;
    private ResultSet results;
    private m_chi_tiet_hoa_don kh = new m_chi_tiet_hoa_don();
    
    public ct_hoa_don_query(){
        Properties props  = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");//let me read content of a file 
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ct_hoa_don_query.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ct_hoa_don_query.class.getName()).log(Level.SEVERE, null, ex);
        }
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String password = props.getProperty("user.password");
        
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ct_hoa_don_query.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = (Connection) DriverManager.getConnection(url,username,password);
        } catch (SQLException ex) {
            Logger.getLogger(ct_hoa_don_query.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void them_ct_hoa_don(m_chi_tiet_hoa_don ct) throws SQLException
    {
        String sql = "insert into chi_tiet_hoa_don(ma_hoa_don,ma_san_pham,so_luong,don_gia) values (?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, ct.getMa_hoa_don());
        ps.setInt(2, ct.getMa_san_pham());
        ps.setInt(3, ct.getSo_luong());
        ps.setInt(4, ct.getDon_gia());
        
        ps.executeUpdate();
    }
    
    public static void main (String[] args) throws SQLException
    {
        ct_hoa_don_query cq = new ct_hoa_don_query();
        m_chi_tiet_hoa_don ct = new m_chi_tiet_hoa_don();
        
        ct.setMa_hoa_don(1);
        ct.setMa_san_pham(2);
        ct.setSo_luong(1);
        ct.setDon_gia(30);
        
        cq.them_ct_hoa_don(ct);
    }
    
}
