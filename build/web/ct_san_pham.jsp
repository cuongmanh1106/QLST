<%-- 
    Document   : ct_san_pham
    Created on : Sep 13, 2017, 8:41:50 PM
    Author     : Admin
--%>

<%@page import="model.m_san_pham"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <% m_san_pham sp = (m_san_pham) request.getAttribute("sp");%>
        <h1>Hello World!</h1>
        <table>
            <tr>
                <td><img src="public/images/<%= sp.getHinh()%>" width="150px"></td>
                <td><%= sp.getTen_san_pham()%></td>
            </tr>
            <tr>
                <td><%= sp.getTen_san_pham()%></td>
            </tr>
            <tr>
                <td><%= sp.getDon_gia()%></td>
            </tr>
        </table>
    </body>
</html>
