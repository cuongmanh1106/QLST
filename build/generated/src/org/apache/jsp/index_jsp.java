package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.m_khach_hang;
import model.Item;
import java.util.Map;
import model.cart;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>shop</title>\n");
      out.write("        <link href=\"public/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("        <script src=\"public/js/jquery.min.js\"></script>\n");
      out.write("        <!-- Custom Theme files -->\n");
      out.write("        <!--theme-style-->\n");
      out.write("        <link href=\"public/css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\t\n");
      out.write("        <!--//theme-style-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"Bonfire Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, \n");
      out.write("              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <!--fonts-->\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>\n");
      out.write("        <!--//fonts-->\n");
      out.write("        <script type=\"text/javascript\" src=\"public/js/move-top.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"public/js/easing.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            jQuery(document).ready(function ($) {\n");
      out.write("                $(\".scroll\").click(function (event) {\n");
      out.write("                    event.preventDefault();\n");
      out.write("                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!--slider-script-->\n");
      out.write("        <script src=\"public/js/responsiveslides.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                $(\"#slider1\").responsiveSlides({\n");
      out.write("                    auto: true,\n");
      out.write("                    speed: 500,\n");
      out.write("                    namespace: \"callbacks\",\n");
      out.write("                    pager: true,\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!--//slider-script-->\n");
      out.write("        <script>$(document).ready(function (c) {\n");
      out.write("                $('.alert-close').on('click', function (c) {\n");
      out.write("                    $('.message').fadeOut('slow', function (c) {\n");
      out.write("                        $('.message').remove();\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script>$(document).ready(function (c) {\n");
      out.write("                $('.alert-close1').on('click', function (c) {\n");
      out.write("                    $('.message1').fadeOut('slow', function (c) {\n");
      out.write("                        $('.message1').remove();\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    m_khach_hang kh = null;
    
    if(session.getAttribute("kh")!=null)
    {
        kh = (m_khach_hang)session.getAttribute("kh");
    }
    
    cart ca = (cart)session.getAttribute("cart");
    if(ca == null)
    {
        ca = new cart();
        session.setAttribute("cart", ca);
    }
    


      out.write("\n");
      out.write("\n");
      out.write("<div class=\"header\">\n");
      out.write("    ");
if(kh!=null){
      out.write("\n");
      out.write("    <p>");
      out.print( kh.getEmail());
      out.write("</p>\n");
      out.write("    <p>");
      out.print( kh.getTen_khach_hang());
      out.write("</p>\n");
      out.write("    <p>");
      out.print( kh.getPhai());
      out.write("</p>\n");
      out.write("    <p>");
      out.print( kh.getNgay_sinh());
      out.write("</p>\n");
      out.write("    <p>");
      out.print( kh.getDia_chi());
      out.write("</p>\n");
      out.write("    <p>");
      out.print( kh.getDien_thoai());
      out.write("</p>\n");
      out.write("    <p>");
      out.print( kh.getMat_khau());
      out.write("</p>\n");
      out.write("    \n");
      out.write("    ");
}
      out.write("\n");
      out.write("            <div class=\"header-top\">\n");
      out.write("                <div class=\"container\">\t\n");
      out.write("                    <div class=\"header-top-in\">\t\t\t\n");
      out.write("                        <div class=\"logo\">\n");
      out.write("                            <a href=\"index.jsp\"><img src=\"images/logo.png\" alt=\" \" ></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"header-in\">\n");
      out.write("                            <ul class=\"icon1 sub-icon1\">\n");
      out.write("                                \n");
      out.write("                                <li><a href=\"signin\">  Sign In/</a></li>\n");
      out.write("                                <li><a href=\"register\">  Register</a></li>\n");
      out.write("                                <li><div class=\"cart\">\n");
      out.write("                                        <a href=\"#\" class=\"cart-in\"> </a>\n");
      out.write("                                        <span>");
      out.print( ca.countItem());
      out.write(" </span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <ul class=\"sub-icon1 list\">\n");
      out.write("                                        <h3>Recently added items(2)</h3>\n");
      out.write("                                        <div class=\"shopping_cart\">\n");
      out.write("                                            \n");
      out.write("                                            ");
for(Map.Entry<Integer , Item> list: ca.getCartItems().entrySet() ){
      out.write("\n");
      out.write("                                            <div class=\"cart_box\">\n");
      out.write("                                                <div class=\"message\">\n");
      out.write("                                                    <div class=\"alert-close\"> </div> \n");
      out.write("                                                    <div class=\"list_img\"><img src=\"public/images/");
      out.print( list.getValue().getSp().getHinh());
      out.write("\" class=\"img-responsive\" alt=\"\"></div>\n");
      out.write("                                                    <div class=\"list_desc\"><h4><a href=\"CartServlet?command=remove&ma_san_pham=");
      out.print( list.getValue().getSp().getMa_san_pham());
      out.write('"');
      out.write('>');
      out.print( list.getValue().getSp().getTen_san_pham());
      out.write("</a></h4>1 x<span class=\"actual\">\n");
      out.write("                                                            ");
      out.print( list.getValue().getSp().getDon_gia());
      out.write("</span></div>\n");
      out.write("                                                    \n");
      out.write("                                                    <div class=\"clearfix\"></div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            ");
}
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"total\">\n");
      out.write("                                            <div class=\"total_left\">CartSubtotal : </div>\n");
      out.write("                                            <div class=\"total_right\">");
      out.print( ca.totalCart());
      out.write("</div>\n");
      out.write("                                            <div class=\"clearfix\"> </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"login_buttons\">\n");
      out.write("                                            <div class=\"check_button\"><a href=\"xemgiohang\">Check out</a></div>\n");
      out.write("                                            <div class=\"clearfix\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"clearfix\"></div>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"> </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>");
      out.write("\n");
      out.write("        <h1>Menu</h1>\n");
      out.write("        \n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"san_pham\">Danh sach san pham</a></li>\n");
      out.write("            <li><a href=\"san_phams?pages=1&command=ao_nam\" title=\"user\">List of user</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
