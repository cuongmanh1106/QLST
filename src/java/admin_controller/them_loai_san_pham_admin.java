/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin_controller;

import dbHelpers.loai_san_pham_cha_query;
import dbHelpers.loai_san_pham_query;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.m_loai_san_pham;
import model.m_loai_san_pham_cha;

/**
 *
 * @author Admin
 */
@WebServlet(name = "them_loai_san_pham_admin", urlPatterns = {"/them_loai_san_pham"})
public class them_loai_san_pham_admin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 3.2 Final//EN\">");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet them_loai_san_pham_admin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet them_loai_san_pham_admin at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        doPost(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String ten_loai = request.getParameter("ten_loai");
        int ma_loai_cha = Integer.parseInt(request.getParameter("ma_loai_cha"));
        
        loai_san_pham_query lq = new loai_san_pham_query();
        
        m_loai_san_pham lsp = new m_loai_san_pham();
        
        lsp.setTen_loai(ten_loai);
        lsp.setMa_loai_cha(ma_loai_cha);
        
        try {
            lq.Them_loai_san_pham(lsp);
        } catch (SQLException ex) {
            Logger.getLogger(them_loai_san_pham_admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String url = "/loai_san_pham_admin";
        RequestDispatcher dis = request.getRequestDispatcher(url);
        dis.forward(request, response);
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
