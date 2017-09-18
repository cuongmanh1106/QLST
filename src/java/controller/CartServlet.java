/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dbHelpers.san_pham_query;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Item;
import model.cart;
import model.m_san_pham;

/**
 *
 * @author Admin
 */
public class CartServlet extends HttpServlet {

   
   

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //pass execution on to doPost
        doPost(request,response);
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        san_pham_query sq = new san_pham_query();
        
        HttpSession session = request.getSession();
        String command = request.getParameter("command");
        int ma_san_pham = Integer.parseInt(request.getParameter("ma_san_pham"));
        cart c = (cart) session.getAttribute("cart");
        
        try{
            m_san_pham sp = sq.doc_san_pham_theo_ma_san_pham(ma_san_pham);
            switch(command)
            {
                case "plus":
                    if(c.getCartItems().containsKey(ma_san_pham))
                    {
                        c.plusToCart(ma_san_pham, new Item(sp,c.getCartItems().get(ma_san_pham).getSo_luong()));
                    }
                else
                    {
                        c.plusToCart(ma_san_pham, new Item(sp,1));
                    }
                break;
                
                case "remove":
                
                    c.removeToCart(ma_san_pham);
                    break;
                
            }
            
        }catch(Exception e){
            e.printStackTrace();
            
        }
        session.setAttribute("cart", c);
        response.sendRedirect("/QL_SieuThi/index.jsp");
    }
        
  

   
}
