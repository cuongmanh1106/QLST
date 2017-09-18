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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.m_loai_san_pham;
import model.m_san_pham;

/**
 *
 * @author Admin
 */
public class san_pham_query {
    
    private Connection conn;
    private ResultSet results;
    private m_san_pham sp = new m_san_pham();
    
    public san_pham_query(){
        Properties props  = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");//let me read content of a file 
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(san_pham_query.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(san_pham_query.class.getName()).log(Level.SEVERE, null, ex);
        }
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String password = props.getProperty("user.password");
        
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(san_pham_query.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = (Connection) DriverManager.getConnection(url,username,password);
        } catch (SQLException ex) {
            Logger.getLogger(san_pham_query.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<m_san_pham> Doc_san_pham() throws SQLException
    {
        String query = "select * from san_pham";
        PreparedStatement ps = conn.prepareStatement(query);
        this.results = ps.executeQuery();
        
        ArrayList<m_san_pham> list = new ArrayList<>();
        
        while(this.results.next())
        {
            m_san_pham sp = new m_san_pham();
            
            sp.setMa_san_pham(this.results.getInt("ma_san_pham"));
            sp.setTen_san_pham(this.results.getString("ten_san_pham"));
            sp.setMa_loai(this.results.getInt("ma_loai"));
            sp.setMo_ta_tom_tat(this.results.getString("mo_ta_tom_tat"));
            sp.setMo_ta_chi_tiet(this.results.getString("mo_ta_chi_tiet"));
            sp.setDon_gia(this.results.getInt("don_gia"));
            sp.setHinh(this.results.getString("hinh"));
            sp.setSan_pham_moi(this.results.getInt("san_pham_moi"));
            sp.setSo_lan_xem(this.results.getInt("so_lan_xem"));
            sp.setNgay_tao(this.results.getString("ngay_tao"));
            list.add(sp);
            
        }
        return list;
    }
    
    public ArrayList<m_san_pham> Doc_san_pham_phan_trang(int vt , int limit) throws SQLException
    {
        String query = "select * from san_pham limit ?,?";
        PreparedStatement ps = conn.prepareStatement(query);
        
        ps.setInt(1, vt);
        ps.setInt(2, limit);
        this.results = ps.executeQuery();
        
        ArrayList<m_san_pham> list = new ArrayList<>();
        
        while(this.results.next())
        {
            m_san_pham sp = new m_san_pham();
            
            sp.setMa_san_pham(this.results.getInt("ma_san_pham"));
            sp.setTen_san_pham(this.results.getString("ten_san_pham"));
            sp.setMa_loai(this.results.getInt("ma_loai"));
            sp.setMo_ta_tom_tat(this.results.getString("mo_ta_tom_tat"));
            sp.setMo_ta_chi_tiet(this.results.getString("mo_ta_chi_tiet"));
            sp.setDon_gia(this.results.getInt("don_gia"));
            sp.setHinh(this.results.getString("hinh"));
            sp.setSan_pham_moi(this.results.getInt("san_pham_moi"));
            sp.setSo_lan_xem(this.results.getInt("so_lan_xem"));
            sp.setNgay_tao(this.results.getString("ngay_tao"));
            list.add(sp);
            
        }
        return list;
    }
    
    public int dem_san_pham() throws SQLException
    {
        String query = "select count(ma_san_pham) from san_pham";
        PreparedStatement ps = conn.prepareStatement(query);
        
       
        this.results = ps.executeQuery();
        
        ArrayList<m_san_pham> list = new ArrayList<>();
        
        int count = 0;
        while(this.results.next())
        {
            count = this.results.getInt("count(ma_san_pham)");
            
        }
        return count;
    }
    
    public m_san_pham doc_san_pham_theo_ma_san_pham(int ma_san_pham) throws SQLException
    {
        String query = "select * from san_pham where ma_san_pham=?";
        PreparedStatement ps = conn.prepareStatement(query);
        
        ps.setInt(1, ma_san_pham);
        this.results = ps.executeQuery();
        this.results.next();
        m_san_pham sp = new m_san_pham();
        sp.setMa_san_pham(this.results.getInt("ma_san_pham"));
        sp.setTen_san_pham(this.results.getString("ten_san_pham"));
        sp.setMa_loai(this.results.getInt("ma_loai"));
        sp.setMo_ta_tom_tat(this.results.getString("mo_ta_tom_tat"));
        sp.setMo_ta_chi_tiet(this.results.getString("mo_ta_chi_tiet"));
        sp.setDon_gia(this.results.getInt("don_gia"));
        sp.setHinh(this.results.getString("hinh"));
        sp.setSo_lan_xem(this.results.getInt("so_lan_xem"));
        sp.setSan_pham_moi(this.results.getInt("san_pham_moi"));
        
        return sp;
    }
    
    public void them_san_pham(m_san_pham sp) throws SQLException
    {
        String query ="insert into san_pham(ten_san_pham,ma_loai,mo_ta_tom_tat,mo_ta_chi_tiet,don_gia,hinh,san_pham_moi,so_lan_xem,ngay_tao) values(?,?,?,?,?,?,1,0,?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, sp.getTen_san_pham());
        ps.setInt(2, sp.getMa_loai());
        ps.setString(3, sp.getMo_ta_tom_tat());
        ps.setString(4, sp.getMo_ta_chi_tiet());
        ps.setInt(5, sp.getDon_gia());
        ps.setString(6, sp.getHinh());
        Date d = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        ps.setString(7, ft.format(d));
        
        ps.executeUpdate();
    }
    
    public void xoa_san_pham(int ma_san_pham) throws SQLException
    {
        String sql = "delete from san_pham where ma_san_pham=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, ma_san_pham);
        ps.executeUpdate();
    }
    
    public void cap_nhat_san_pham(m_san_pham sp) throws SQLException
    {
        String sql = "update san_pham set ten_san_pham = ? , ma_loai=?,mo_ta_tom_tat=?,mo_ta_chi_tiet=?,don_gia=?,hinh=?,san_pham_moi=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        
        ps.setString(1, sp.getTen_san_pham());
        ps.setInt(2, sp.getMa_loai());
        ps.setString(3, sp.getMo_ta_tom_tat());
        ps.setString(4, sp.getMo_ta_chi_tiet());
        ps.setInt(5, sp.getDon_gia());
        ps.setString(6, sp.getHinh());
        ps.setInt(7, sp.getSan_pham_moi());
        
        ps.executeUpdate();
    }
    
    
    
    public static void main (String[] args) throws SQLException
    {
        san_pham_query sq = new san_pham_query();
        m_san_pham sp = new m_san_pham();
        
        //Doc All
        
        /*
        ArrayList<m_san_pham> list = new ArrayList<>();
        
        list = sq.Doc_san_pham();
        for(m_san_pham s:list)
        {
            System.out.println(s.getTen_san_pham());
        }
        */
        //Phan trang
        /*
         ArrayList<m_san_pham> list = new ArrayList<>();
        
        list = sq.Doc_san_pham_phan_trang(0,2);
        for(m_san_pham s:list)
        {
            System.out.println(s.getNgay_tao());
        }
        */
        
        //count
        
//        System.out.print(sq.dem_san_pham());
        
        //Them----------------------------->
        
        /*
        sp.setTen_san_pham("Chip");
        sp.setMa_loai(2);
        sp.setMo_ta_tom_tat("Chip chip");
        sp.setMo_ta_chi_tiet("Chip Ship chip ship");
        sp.setDon_gia(50);
        sp.setHinh("c.png");
        
        sq.them_san_pham(sp);
        */
        
        //Xoa------------------------->
//        sq.xoa_san_pham(4);
        
        //Doc 1 sp------------------------------------->
        
        sp = sq.doc_san_pham_theo_ma_san_pham(2);
        System.out.print(sp.getMo_ta_chi_tiet());
        
        
        
        
    }
    
}
