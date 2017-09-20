
<% String view = (String) request.getAttribute("view");
if(view == "views/san_pham_admin/v_san_pham.jsp")
{
%>

<%@include file="../views/san_pham_admin/v_san_pham.jsp" %>

<%
    
}

else if(view == "views/san_pham_admin/v_them_san_pham.jsp")
{
%>


<%@include file="../views/san_pham_admin/v_them_san_pham.jsp" %>

<%
    
}
else if(view == "views/san_pham_admin/v_sua_san_pham.jsp")
{
%>

<%@include file="../views/san_pham_admin/v_sua_san_pham.jsp" %>

<%
    
}
else if(view == "views/san_pham_admin/v_search_san_pham.jsp")
{
%>

<%@include file="../views/san_pham_admin/v_search_san_pham.jsp" %>

<%
    
}
else if(view == "views/loai_san_pham_admin/v_loai_san_pham.jsp")
{
%>

<%@include file="../views/loai_san_pham_admin/v_loai_san_pham.jsp" %>

<%
    
}
else if(view == "views/loai_san_pham_admin/v_them_loai_san_pham.jsp")
{
%>
<%@include file="../views/loai_san_pham_admin/v_them_loai_san_pham.jsp" %>

<%
    
}
else if(view == "views/loai_san_pham_admin/v_sua_loai_san_pham.jsp")
{
%>

<%@include file="../views/loai_san_pham_admin/v_sua_loai_san_pham.jsp" %>

<%
    
}
else if(view == "views/loai_san_pham_admin/v_search_loai_san_pham.jsp")
{
%>
<%@include file="../views/loai_san_pham_admin/v_search_loai_san_pham.jsp" %>

<%
    
}
else if(view == "views/loai_san_pham_admin/v_ds_san_pham.jsp")
{
%>
<%@include file="../views/loai_san_pham_admin/v_ds_san_pham.jsp" %>

<%
    
}
else if(view == "views/loai_san_pham_cha_admin/v_loai_san_pham_cha.jsp")
{
%>
<%@include file="../views/loai_san_pham_cha_admin/v_loai_san_pham_cha.jsp" %>

<%
    
}
else if(view == "views/loai_san_pham_cha_admin/v_them_loai_san_pham_cha.jsp")
{
%>
<%@include file="../views/loai_san_pham_cha_admin/v_them_loai_san_pham_cha.jsp" %>

<%
    
}
else if(view == "views/khach_hang_admin/v_khach_hang.jsp")
{
%>
<%@include file="../views/khach_hang_admin/v_khach_hang.jsp" %>

<%
    
}
%>


