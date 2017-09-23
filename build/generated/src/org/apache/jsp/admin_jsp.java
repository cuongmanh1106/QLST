package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.m_nguoi_dung;
import model.m_loai_san_pham;
import dbHelpers.loai_san_pham_query;
import dbHelpers.loai_san_pham_cha_query;
import java.util.ArrayList;
import model.m_san_pham;
import model.m_loai_san_pham;
import java.util.ArrayList;
import java.util.ArrayList;
import model.m_loai_san_pham;
import java.util.ArrayList;
import model.m_san_pham;
import model.m_loai_san_pham;
import dbHelpers.loai_san_pham_query;
import dbHelpers.loai_san_pham_cha_query;
import java.util.ArrayList;
import model.m_san_pham;
import model.m_loai_san_pham_cha;
import model.m_loai_san_pham;
import dbHelpers.loai_san_pham_query;
import dbHelpers.loai_san_pham_cha_query;
import java.util.ArrayList;
import model.m_san_pham;
import model.m_loai_san_pham_cha;
import model.m_loai_san_pham;
import java.util.ArrayList;
import java.util.ArrayList;
import model.m_loai_san_pham_cha;
import model.m_loai_san_pham;
import java.util.ArrayList;
import java.util.ArrayList;
import model.m_loai_san_pham_cha;
import model.m_loai_san_pham;
import dbHelpers.loai_san_pham_query;
import dbHelpers.loai_san_pham_cha_query;
import java.util.ArrayList;
import model.m_san_pham;
import model.m_loai_san_pham;
import dbHelpers.loai_san_pham_query;
import dbHelpers.loai_san_pham_cha_query;
import java.util.ArrayList;
import model.m_san_pham;
import model.m_loai_san_pham_cha;
import model.m_loai_san_pham;
import dbHelpers.loai_san_pham_query;
import dbHelpers.loai_san_pham_cha_query;
import java.util.ArrayList;
import model.m_san_pham;
import model.m_loai_san_pham_cha;
import model.m_loai_san_pham;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.ArrayList;
import model.m_khach_hang;
import model.m_khach_hang;
import model.m_loai_san_pham;
import java.util.ArrayList;
import model.m_san_pham;
import java.util.ArrayList;
import model.m_khach_hang;
import model.m_khach_hang;
import dbHelpers.khach_hang_query;
import model.m_hoa_don;
import model.m_loai_san_pham;
import dbHelpers.loai_san_pham_query;
import dbHelpers.loai_san_pham_cha_query;
import java.util.ArrayList;
import model.m_san_pham;
import dbHelpers.san_pham_query;
import model.m_chi_tiet_hoa_don;
import model.m_loai_san_pham;
import dbHelpers.loai_san_pham_query;
import dbHelpers.loai_san_pham_cha_query;
import java.util.ArrayList;
import model.m_san_pham;
import model.m_khach_hang;
import dbHelpers.khach_hang_query;
import model.m_hoa_don;
import model.m_loai_san_pham;
import dbHelpers.loai_san_pham_query;
import dbHelpers.loai_san_pham_cha_query;
import java.util.ArrayList;
import model.m_san_pham;
import model.m_nguoi_dung;
import java.util.ArrayList;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(24);
    _jspx_dependants.add("/include/layout_admin.jsp");
    _jspx_dependants.add("/include/head_admin.jsp");
    _jspx_dependants.add("/include/navbar_top_admin.jsp");
    _jspx_dependants.add("/include/menu_admin.jsp");
    _jspx_dependants.add("/include/content_admin.jsp");
    _jspx_dependants.add("/include/../views/san_pham_admin/v_san_pham.jsp");
    _jspx_dependants.add("/include/../views/san_pham_admin/v_them_san_pham.jsp");
    _jspx_dependants.add("/include/../views/san_pham_admin/v_sua_san_pham.jsp");
    _jspx_dependants.add("/include/../views/san_pham_admin/v_search_san_pham.jsp");
    _jspx_dependants.add("/include/../views/loai_san_pham_admin/v_loai_san_pham.jsp");
    _jspx_dependants.add("/include/../views/loai_san_pham_admin/v_them_loai_san_pham.jsp");
    _jspx_dependants.add("/include/../views/loai_san_pham_admin/v_sua_loai_san_pham.jsp");
    _jspx_dependants.add("/include/../views/loai_san_pham_admin/v_search_loai_san_pham.jsp");
    _jspx_dependants.add("/include/../views/loai_san_pham_admin/v_ds_san_pham.jsp");
    _jspx_dependants.add("/include/../views/loai_san_pham_cha_admin/v_loai_san_pham_cha.jsp");
    _jspx_dependants.add("/include/../views/loai_san_pham_cha_admin/v_them_loai_san_pham_cha.jsp");
    _jspx_dependants.add("/include/../views/khach_hang_admin/v_khach_hang.jsp");
    _jspx_dependants.add("/include/../views/khach_hang_admin/v_sua_khach_hang.jsp");
    _jspx_dependants.add("/include/../views/khach_hang_admin/v_search_khach_hang.jsp");
    _jspx_dependants.add("/include/../views/hoa_don_admin/v_hoa_don.jsp");
    _jspx_dependants.add("/include/../views/hoa_don_admin/v_chi_tiet_hoa_don.jsp");
    _jspx_dependants.add("/include/../views/hoa_don_admin/v_search_hoa_don.jsp");
    _jspx_dependants.add("/include/../views/nguoi_dung/v_nguoi_dung.jsp");
    _jspx_dependants.add("/include/footer_admin.jsp");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> \n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Mạnh Cường</title>\n");
      out.write("    <!-- Core CSS - Include with every page -->\n");
      out.write("    <link href=\"public/plugins/bootstrap/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"public/font-awesome/css/font-awesome.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"public/plugins/pace/pace-theme-big-counter.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"public/css/style_admin.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"public/css/main-style.css\" rel=\"stylesheet\" />\n");
      out.write("    <!-- Page-Level CSS -->\n");
      out.write("    <link href=\"public/plugins/morris/morris-0.4.3.min.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"public/plugins/dataTables/dataTables.bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("   </head>\n");
      out.write("<body>\n");
      out.write("    <!--  wrapper -->\n");
      out.write("    <div id=\"wrapper\">");
      out.write('\n');
      out.write('\n');
      out.write("<nav class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\" id=\"navbar\">\n");
      out.write("            <!-- navbar-header -->\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".sidebar-collapse\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.html\">\n");
      out.write("                    <img src=\"public/img/logo.png\" alt=\"\" />\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <!-- end navbar-header -->\n");
      out.write("            <!-- navbar-top-links -->\n");
      out.write("            <ul class=\"nav navbar-top-links navbar-right\">\n");
      out.write("                <!-- main dropdown -->\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                        <span class=\"top-label label label-danger\">3</span><i class=\"fa fa-envelope fa-3x\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <!-- dropdown-messages -->\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-messages\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div>\n");
      out.write("                                    <strong><span class=\" label label-danger\">Andrew Smith</span></strong>\n");
      out.write("                                    <span class=\"pull-right text-muted\">\n");
      out.write("                                        <em>Yesterday</em>\n");
      out.write("                                    </span>\n");
      out.write("                                </div>\n");
      out.write("                                <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div>\n");
      out.write("                                    <strong><span class=\" label label-info\">Jonney Depp</span></strong>\n");
      out.write("                                    <span class=\"pull-right text-muted\">\n");
      out.write("                                        <em>Yesterday</em>\n");
      out.write("                                    </span>\n");
      out.write("                                </div>\n");
      out.write("                                <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div>\n");
      out.write("                                    <strong><span class=\" label label-success\">Jonney Depp</span></strong>\n");
      out.write("                                    <span class=\"pull-right text-muted\">\n");
      out.write("                                        <em>Yesterday</em>\n");
      out.write("                                    </span>\n");
      out.write("                                </div>\n");
      out.write("                                <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a class=\"text-center\" href=\"#\">\n");
      out.write("                                <strong>Read All Messages</strong>\n");
      out.write("                                <i class=\"fa fa-angle-right\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <!-- end dropdown-messages -->\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                        <span class=\"top-label label label-success\">4</span>  <i class=\"fa fa-tasks fa-3x\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <!-- dropdown tasks -->\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-tasks\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div>\n");
      out.write("                                    <p>\n");
      out.write("                                        <strong>Task 1</strong>\n");
      out.write("                                        <span class=\"pull-right text-muted\">40% Complete</span>\n");
      out.write("                                    </p>\n");
      out.write("                                    <div class=\"progress progress-striped active\">\n");
      out.write("                                        <div class=\"progress-bar progress-bar-success\" role=\"progressbar\" aria-valuenow=\"40\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 40%\">\n");
      out.write("                                            <span class=\"sr-only\">40% Complete (success)</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div>\n");
      out.write("                                    <p>\n");
      out.write("                                        <strong>Task 2</strong>\n");
      out.write("                                        <span class=\"pull-right text-muted\">20% Complete</span>\n");
      out.write("                                    </p>\n");
      out.write("                                    <div class=\"progress progress-striped active\">\n");
      out.write("                                        <div class=\"progress-bar progress-bar-info\" role=\"progressbar\" aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 20%\">\n");
      out.write("                                            <span class=\"sr-only\">20% Complete</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div>\n");
      out.write("                                    <p>\n");
      out.write("                                        <strong>Task 3</strong>\n");
      out.write("                                        <span class=\"pull-right text-muted\">60% Complete</span>\n");
      out.write("                                    </p>\n");
      out.write("                                    <div class=\"progress progress-striped active\">\n");
      out.write("                                        <div class=\"progress-bar progress-bar-warning\" role=\"progressbar\" aria-valuenow=\"60\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 60%\">\n");
      out.write("                                            <span class=\"sr-only\">60% Complete (warning)</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div>\n");
      out.write("                                    <p>\n");
      out.write("                                        <strong>Task 4</strong>\n");
      out.write("                                        <span class=\"pull-right text-muted\">80% Complete</span>\n");
      out.write("                                    </p>\n");
      out.write("                                    <div class=\"progress progress-striped active\">\n");
      out.write("                                        <div class=\"progress-bar progress-bar-danger\" role=\"progressbar\" aria-valuenow=\"80\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 80%\">\n");
      out.write("                                            <span class=\"sr-only\">80% Complete (danger)</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a class=\"text-center\" href=\"#\">\n");
      out.write("                                <strong>See All Tasks</strong>\n");
      out.write("                                <i class=\"fa fa-angle-right\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <!-- end dropdown-tasks -->\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                        <span class=\"top-label label label-warning\">5</span>  <i class=\"fa fa-bell fa-3x\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <!-- dropdown alerts-->\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-alerts\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div>\n");
      out.write("                                    <i class=\"fa fa-comment fa-fw\"></i>New Comment\n");
      out.write("                                    <span class=\"pull-right text-muted small\">4 minutes ago</span>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div>\n");
      out.write("                                    <i class=\"fa fa-twitter fa-fw\"></i>3 New Followers\n");
      out.write("                                    <span class=\"pull-right text-muted small\">12 minutes ago</span>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div>\n");
      out.write("                                    <i class=\"fa fa-envelope fa-fw\"></i>Message Sent\n");
      out.write("                                    <span class=\"pull-right text-muted small\">4 minutes ago</span>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div>\n");
      out.write("                                    <i class=\"fa fa-tasks fa-fw\"></i>New Task\n");
      out.write("                                    <span class=\"pull-right text-muted small\">4 minutes ago</span>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div>\n");
      out.write("                                    <i class=\"fa fa-upload fa-fw\"></i>Server Rebooted\n");
      out.write("                                    <span class=\"pull-right text-muted small\">4 minutes ago</span>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a class=\"text-center\" href=\"#\">\n");
      out.write("                                <strong>See All Alerts</strong>\n");
      out.write("                                <i class=\"fa fa-angle-right\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <!-- end dropdown-alerts -->\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                        <i class=\"fa fa-user fa-3x\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <!-- dropdown user-->\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-user\">\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-user fa-fw\"></i>User Profile</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-gear fa-fw\"></i>Settings</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li><a href=\"login.html\"><i class=\"fa fa-sign-out fa-fw\"></i>Logout</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <!-- end dropdown-user -->\n");
      out.write("                </li>\n");
      out.write("                <!-- end main dropdown -->\n");
      out.write("            </ul>\n");
      out.write("            <!-- end navbar-top-links -->\n");
      out.write("\n");
      out.write("        </nav>");
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");

    m_nguoi_dung nd = null;
    if(session.getAttribute("nd")!=null)
    {
        nd = (m_nguoi_dung)session.getAttribute("nd");
    }

      out.write("\n");
      out.write("<nav class=\"navbar-default navbar-static-side\" role=\"navigation\">\n");
      out.write("            <!-- sidebar-collapse -->\n");
      out.write("            <div class=\"sidebar-collapse\">\n");
      out.write("                <!-- side-menu -->\n");
      out.write("                <ul class=\"nav\" id=\"side-menu\">\n");
      out.write("                    <li>\n");
      out.write("                        <!-- user image section-->\n");
      out.write("                        <div class=\"user-section\">\n");
      out.write("                            <div class=\"user-section-inner\">\n");
      out.write("                                <img src=\"public/img/user.jpg\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"user-info\">\n");
      out.write("                                ");
 if(nd!=null){
      out.write("\n");
      out.write("                                <div>");
      out.print( nd.getHo_ten());
      out.write("</div>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                                <div class=\"user-text-online\">\n");
      out.write("                                    <span class=\"user-circle-online btn btn-success btn-circle \"></span>&nbsp;Online\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--end user image section-->\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"sidebar-search\">\n");
      out.write("                        <!-- search section-->\n");
      out.write("                        <div class=\"input-group custom-search-form\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Search...\">\n");
      out.write("                            <span class=\"input-group-btn\">\n");
      out.write("                                <button class=\"btn btn-default\" type=\"button\">\n");
      out.write("                                    <i class=\"fa fa-search\"></i>\n");
      out.write("                                </button>\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("                        <!--end search section-->\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"selected\">\n");
      out.write("                        <a href=\"index.html\"><i class=\"fa fa-dashboard fa-fw\"></i>Danh mục</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-bar-chart-o fa-fw\"></i> Sản Phẩm<span class=\"fa arrow\"></span></a>\n");
      out.write("                        <ul class=\"nav nav-second-level\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"san_phams_admin?pages=1\">Danh sách sản phẩm</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"form_them?command=san_pham\">Thêm sản phẩm</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <!-- second-level-items -->\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-bar-chart-o fa-fw\"></i> Loại sản phẩm<span class=\"fa arrow\"></span></a>\n");
      out.write("                        <ul class=\"nav nav-second-level\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"loai_san_pham_admin?pages=1\">Danh sách loại sản phẩm</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"form_them?command=loai_san_pham\">Thêm loại sản phẩm</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <!-- second-level-items -->\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-bar-chart-o fa-fw\"></i>Loại sản phẩm cha <span class=\"fa arrow\"></span></a>\n");
      out.write("                        <ul class=\"nav nav-second-level\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"loai_san_pham_cha\">Danh sách loại sản phẩm cha</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"form_them?command=loai_san_pham_cha\">Thêm loại sản phẩm cha</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <!-- second-level-items -->\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"khach_hang_admin\"><i class=\"fa fa-edit fa-fw\"></i>Khach hang</a>\n");
      out.write("                    </li>\n");
      out.write("                     <li>\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-bar-chart-o fa-fw\"></i>Người Dùng <span class=\"fa arrow\"></span></a>\n");
      out.write("                        <ul class=\"nav nav-second-level\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"nguoi_dung_admin\">Danh sách người dùng</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"form_them?command=nguoi_dung\">Thêm người dùng</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <!-- second-level-items -->\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"hoa_don_admin\"><i class=\"fa fa-edit fa-fw\"></i>Hóa đơn</a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                       \n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <!-- end side-menu -->\n");
      out.write("            </div>\n");
      out.write("            <!-- end sidebar-collapse -->\n");
      out.write("        </nav>");
      out.write('\n');
      out.write('\n');
      out.write('\n');
 String view = (String) request.getAttribute("view");
if(view == "views/san_pham_admin/v_san_pham.jsp")
{

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
//   ArrayList<m_san_pham> list = new ArrayList<>();
//    if(request.getAttribute("san_phams")!=null)
//        list = (ArrayList) request.getAttribute("san_phams");
    
    ArrayList<m_san_pham> list = (ArrayList) request.getAttribute("san_phams");

    
    
   
String thongbao ="";
   if(request.getAttribute("thongbao")!=null)
       thongbao = (String)request.getAttribute("thongbao");
   
   if(thongbao.equals("error"))
   {
    
    

      out.write('\n');
      out.print( "<script> alert('Đã có HÓA ĐƠN chưa SẢN PHẨM NÀY') </script>");
      out.write('\n');

   }

      out.write("\n");
      out.write("\n");
      out.write("<div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                 <!--  page header -->\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h1 class=\"page-header\">Danh sách sản phẩm</h1>\n");
      out.write("                </div>\n");
      out.write("                 <!-- end  page header -->\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <!-- Advanced Tables -->\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                             <form method=\"post\" action=\"search\">\n");
      out.write("                                <input type=\"hidden\" name=\"command\" value=\"san_pham\">\n");
      out.write("                                <input type=\"text\" name=\"tim\" value=\"\">\n");
      out.write("                                <input type=\"submit\" value=\"Tim\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"table-responsive\">\n");
      out.write("                                <table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Mã sản phẩm</th>\n");
      out.write("                                            <th>Tên sản phẩm</th>\n");
      out.write("                                            <th>Ten loai</th>\n");
      out.write("                                            <th>Mô tả tóm tắt</th>\n");
      out.write("                                            <th>Đơn giá</th>\n");
      out.write("                                            <th></th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        ");
 for(m_san_pham sp:list){ 
                                            loai_san_pham_query lq = new loai_san_pham_query();
                                            m_loai_san_pham lsp = lq.Doc_loai_san_pham_theo_ma_loai(sp.getMa_loai());
                                            
                                        
      out.write("\n");
      out.write("                                        <tr class=\"odd gradeX\">\n");
      out.write("                                            <td>");
      out.print( sp.getMa_san_pham());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( sp.getTen_san_pham());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( lsp.getTen_loai());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( sp.getMo_ta_tom_tat());
      out.write("</td>\n");
      out.write("                                            \n");
      out.write("                                            <td class=\"center\">");
      out.print((sp.getDon_gia()));
      out.write("</td>\n");
      out.write("                                                          \n");
      out.write("                                            <td class=\"center\">\n");
      out.write("                                               \n");
      out.write("\n");
      out.write("                                                <a href=\"form_sua?ma_san_pham=");
      out.print( sp.getMa_san_pham());
      out.write("&command=san_pham\" title=\"Edit\" >\n");
      out.write("                                                <img src=\"public/images/icons/pencil.png\" alt=\"Edit\" />\n");
      out.write("                                                </a> \n");
      out.write("                                                <a href=\"javaScript:void(0)\" title=\"Delete\" onclick=\"Xoasanpham(");
      out.print( sp.getMa_san_pham());
      out.write(")\"> \n");
      out.write("                                                <img src=\"public/images/icons/cross.png\" alt=\"Delete\" />\n");
      out.write("                                                </a>                     \n");
      out.write("                                                \n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        ");
 }
      out.write("\n");
      out.write("                                       \n");
      out.write("                                    </tbody>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                </table>\n");
      out.write("                                 \n");
      out.write("                                ");
 if(String.valueOf(request.getAttribute("count"))!=null){
      out.write(" \n");
      out.write("                                ");
 int count = Integer.parseInt(String.valueOf(request.getAttribute("count")));
      out.write("        \n");
      out.write("                                <ul class=\"pagination\">\n");
      out.write("                                     ");
 
                                    int dem = 0;
                                    if(count%5 == 0)
                                    {
                                        dem = count/5;
                                    }
                                    else
                                        dem = count/5 + 1;
                                    for(int i = 1; i <= dem ; i++) {
      out.write("\n");
      out.write("                                    <li><a href=\"san_phams_admin?pages=");
      out.print( i);
      out.write('"');
      out.write('>');
      out.print( i);
      out.write("</a></li>\n");
      out.write("                                   \n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                  </ul>\n");
      out.write("                                 ");

                                }
                                 
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--End Advanced Tables -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>");
      out.write('\n');
      out.write('\n');

    
}

else if(view == "views/san_pham_admin/v_them_san_pham.jsp")
{

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("            \n");
      out.write("    <div class=\"row\">\n");
      out.write("         <!--  page header -->\n");
      out.write("        <div class=\"col-lg-12\">\n");
      out.write("            <h1 class=\"page-header\">Thêm sản phẩm</h1>\n");
      out.write("        </div>\n");
      out.write("         <!-- end  page header -->\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-12\">\n");
      out.write("            <!-- Advanced Tables -->\n");
      out.write("            <div class=\"panel panel-default\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                     Advanced Tables\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("    <form method=\"post\"  action=\"them_san_pham\">\n");
      out.write("        <fieldset>\n");
      out.write("          \n");
      out.write("          <p>\n");
      out.write("              <label class=\"alert\">Tên sản phẩm</label>\n");
      out.write("            <input class=\"text-input small-input kiemtra\" type=\"text\" id=\"ten_san_pham\" name=\"ten_san_pham\" />\n");
      out.write("          </p>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          <p>\n");
      out.write("            <label class=\"alert\">Mã loại</label>\n");
      out.write("            \n");
      out.write("            ");
 ArrayList<m_loai_san_pham> loai_san_phams = (ArrayList) request.getAttribute("list"); 
      out.write("\n");
      out.write("            \n");
      out.write("             <select class=\"form-control\" id=\"form-field-select-1\" name=\"ma_loai\">\n");
      out.write("                 \n");
      out.write("             ");
 for(m_loai_san_pham l:loai_san_phams){
      out.write("\n");
      out.write("                \n");
      out.write("            <option value=\"");
      out.print( l.getMa_loai());
      out.write("\"> ");
      out.print( l.getTen_loai());
      out.write(" </option>\n");
      out.write("            ");

            }
            
      out.write("\n");
      out.write("            </select>\n");
      out.write("          </p>\n");
      out.write("          \n");
      out.write("          <p>\n");
      out.write("            <label class=\"alert\">Nội dung tóm tắt</label>\n");
      out.write("            <textarea name=\"noi_dung_tom_tat\" cols=\"50\" rows=\"3\" class=\"text-input textarea wysiwyg \" id=\"medium-input\"></textarea>\n");
      out.write("          </p>\n");
      out.write("          <p>\n");
      out.write("            <label class=\"alert\">Nội dung chi tiết</label>\n");
      out.write("            <textarea name=\"noi_dung_chi_tiet\" cols=\"50\" rows=\"5\" class=\"text-input large-input ckeditor\" id=\"large-input\"></textarea>\n");
      out.write("          </p>\n");
      out.write("          \n");
      out.write("          <p>\n");
      out.write("            <label class=\"alert\">Đơn giá</label>\n");
      out.write("            <input class=\"text-input small-input kiemtra\"  type=\"text\" id=\"don_gia\" name=\"don_gia\" />\n");
      out.write("          </p>\n");
      out.write("          \n");
      out.write("          <p>\n");
      out.write("            <label class=\"alert\">Hình </label>\n");
      out.write("            <input type=\"file\" name=\"hinh\" id=\"hinh\" />\n");
      out.write("            <div class=\"image-holder\" id=\"image-holder\"></div>\n");
      out.write("          <p>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("            \n");
      out.write("          <p>\n");
      out.write("            <input class=\"button btn btn-primary\" type=\"submit\" value=\"Cập nhật\" name=\"btnCapnhat\"  />\n");
      out.write("            <input class=\"button btn btn-default\" type=\"button\" value=\"Bỏ qua\" onclick=\"window.location='san_phams_admin'\" />\n");
      out.write("          </p>\n");
      out.write("        </fieldset>\n");
      out.write("        <div class=\"clear\"></div>\n");
      out.write("        <!-- End .clear -->\n");
      out.write("        \n");
      out.write("    </form>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--End Advanced Tables -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write('\n');
      out.write('\n');

    
}
else if(view == "views/san_pham_admin/v_sua_san_pham.jsp")
{

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"page-wrapper\">\n");
      out.write("\n");
m_san_pham sp = (m_san_pham) request.getAttribute("sp");
      out.write("      \n");
ArrayList<m_loai_san_pham> loai_san_phams = (ArrayList) request.getAttribute("loai_san_phams");
      out.write("  \n");
      out.write("   \n");
      out.write("    <div class=\"row\">\n");
      out.write("         <!--  page header -->\n");
      out.write("        <div class=\"col-lg-12\">\n");
      out.write("            <h1 class=\"page-header\">Sua san pham</h1>\n");
      out.write("        </div>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("         <!-- end  page header -->\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-12\">\n");
      out.write("            <!-- Advanced Tables -->\n");
      out.write("            <div class=\"panel panel-default\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                     Advanced Tables\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("    <form method=\"post\"  action=\"sua_san_pham\">\n");
      out.write("        <fieldset>\n");
      out.write("            <input type=\"hidden\" name=\"ma_san_pham\" value=\"");
      out.print( sp.getMa_san_pham() );
      out.write("\">\n");
      out.write("          <p>\n");
      out.write("              <label class=\"alert\">Tên sản phẩm</label>\n");
      out.write("              <input class=\"text-input small-input kiemtra\" type=\"text\" id=\"ten_san_pham\" name=\"ten_san_pham\" value=\"");
      out.print( sp.getTen_san_pham() );
      out.write("\" />\n");
      out.write("          </p>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          <p>\n");
      out.write("            <label class=\"alert\">Mã loại</label>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("             <select class=\"form-control\" id=\"form-field-select-1\" name=\"ma_loai\">\n");
      out.write("                 \n");
      out.write("            ");
 for(m_loai_san_pham l:loai_san_phams){
      out.write("\n");
      out.write("                \n");
      out.write("            <option value=\"");
      out.print( l.getMa_loai());
      out.write('"');
      out.write(' ');
      out.print( (sp.getMa_loai()==l.getMa_loai()?"selected":null));
      out.write(" > ");
      out.print( l.getTen_loai());
      out.write(" </option>\n");
      out.write("            ");

            }
            
      out.write("\n");
      out.write("           \n");
      out.write("            </select>\n");
      out.write("          </p>\n");
      out.write("          \n");
      out.write("          <p>\n");
      out.write("            <label class=\"alert\">Nội dung tóm tắt</label>\n");
      out.write("            <textarea name=\"noi_dung_tom_tat\" cols=\"50\" rows=\"3\" class=\"text-input textarea wysiwyg \" id=\"medium-input\">");
      out.print( sp.getMo_ta_tom_tat() );
      out.write("</textarea>\n");
      out.write("          </p>\n");
      out.write("          <p>\n");
      out.write("            <label class=\"alert\">Nội dung chi tiết</label>\n");
      out.write("            <textarea name=\"noi_dung_chi_tiet\" cols=\"50\" rows=\"5\" class=\"text-input large-input ckeditor\" id=\"large-input\">");
      out.print( sp.getMo_ta_chi_tiet() );
      out.write("</textarea>\n");
      out.write("          </p>\n");
      out.write("          \n");
      out.write("          <p>\n");
      out.write("            <label class=\"alert\">Đơn giá</label>\n");
      out.write("            <input class=\"text-input small-input kiemtra\"  type=\"text\" id=\"don_gia\" name=\"don_gia\" value=\"");
      out.print( sp.getDon_gia() );
      out.write("\" />\n");
      out.write("          </p>\n");
      out.write("          \n");
      out.write("          <p>\n");
      out.write("            <label class=\"alert\">Hình </label>\n");
      out.write("            <input type=\"file\" name=\"hinh\" id=\"hinh\" />\n");
      out.write("            <img src=\"public/images/");
      out.print( sp.getHinh() );
      out.write("\">\n");
      out.write("            <div class=\"image-holder\" id=\"image-holder\"></div>\n");
      out.write("          <p>\n");
      out.write("              <br>\n");
      out.write("          <p>\n");
      out.write("              <label>San Pham Moi: </label>\n");
      out.write("              <input type=\"checkbox\" name=\"san_pham_moi\" ");
      out.print( (sp.getSan_pham_moi()==1)?"checked":null);
      out.write(" >\n");
      out.write("          </p>\n");
      out.write("          \n");
      out.write("          <br>\n");
      out.write("          \n");
      out.write("            \n");
      out.write("          <p>\n");
      out.write("            <input class=\"button btn btn-primary\" type=\"submit\" value=\"Cập nhật\" name=\"btnCapnhat\"  />\n");
      out.write("            <input class=\"button btn btn-default\" type=\"button\" value=\"Bỏ qua\" onclick=\"window.location='san_phams_admin'\" />\n");
      out.write("          </p>\n");
      out.write("        </fieldset>\n");
      out.write("        <div class=\"clear\"></div>\n");
      out.write("        <!-- End .clear -->\n");
      out.write("        \n");
      out.write("    </form>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--End Advanced Tables -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>");
      out.write('\n');
      out.write('\n');

    
}
else if(view == "views/san_pham_admin/v_search_san_pham.jsp")
{

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 

    
    ArrayList<m_san_pham> list = (ArrayList) request.getAttribute("san_phams");
    
    String tim = "";
    tim = (String)request.getAttribute("tim");
    
    

    

    

      out.write("\n");
      out.write("\n");
      out.write("<div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                 <!--  page header -->\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h1 class=\"page-header\">Danh sách sản phẩm</h1>\n");
      out.write("                </div>\n");
      out.write("                 <!-- end  page header -->\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <!-- Advanced Tables -->\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                             <form method=\"post\" action=\"search\">\n");
      out.write("                                <input type=\"hidden\" name=\"command\" value=\"san_pham\">\n");
      out.write("                                <input type=\"text\" name=\"tim\" value=\"");
      out.print( (tim != "")?tim:"");
      out.write("\">\n");
      out.write("                                <input type=\"submit\" value=\"Tim\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"table-responsive\">\n");
      out.write("                                <table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Mã sản phẩm</th>\n");
      out.write("                                            <th>Tên sản phẩm</th>\n");
      out.write("                                            <th>Ten loai</th>\n");
      out.write("                                            <th>Mô tả tóm tắt</th>\n");
      out.write("                                            <th>Đơn giá</th>\n");
      out.write("                                            <th></th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        ");
 for(m_san_pham sp:list){ 
                                            loai_san_pham_query lq = new loai_san_pham_query();
                                            m_loai_san_pham lsp = lq.Doc_loai_san_pham_theo_ma_loai(sp.getMa_loai());
                                            
                                        
      out.write("\n");
      out.write("                                        <tr class=\"odd gradeX\">\n");
      out.write("                                            <td>");
      out.print( sp.getMa_san_pham());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( sp.getTen_san_pham());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( lsp.getTen_loai());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( sp.getMo_ta_tom_tat());
      out.write("</td>\n");
      out.write("                                            \n");
      out.write("                                            <td class=\"center\">");
      out.print((sp.getDon_gia()));
      out.write("</td>\n");
      out.write("                                                          \n");
      out.write("                                            <td class=\"center\">\n");
      out.write("                                               \n");
      out.write("\n");
      out.write("                                                <a href=\"form_sua?ma_san_pham=");
      out.print( sp.getMa_san_pham());
      out.write("&command=san_pham\" title=\"Edit\" >\n");
      out.write("                                                <img src=\"public/images/icons/pencil.png\" alt=\"Edit\" />\n");
      out.write("                                                </a> \n");
      out.write("                                                <a href=\"javaScript:void(0)\" title=\"Delete\" onclick=\"Xoasanpham(");
      out.print( sp.getMa_san_pham());
      out.write(")\"> \n");
      out.write("                                                <img src=\"public/images/icons/cross.png\" alt=\"Delete\" />\n");
      out.write("                                                </a>                     \n");
      out.write("                                                \n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        ");
 }
      out.write("\n");
      out.write("                                       \n");
      out.write("                                    </tbody>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                </table>\n");
      out.write("                                 \n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--End Advanced Tables -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>");
      out.write('\n');
      out.write('\n');

    
}
else if(view == "views/loai_san_pham_admin/v_loai_san_pham.jsp")
{

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
//   ArrayList<m_san_pham> list = new ArrayList<>();
//    if(request.getAttribute("san_phams")!=null)
//        list = (ArrayList) request.getAttribute("san_phams");
    
    ArrayList<m_loai_san_pham> list = (ArrayList) request.getAttribute("loai_san_phams");

    
    
   String thongbao ="";
   if(request.getAttribute("thongbao")!=null)
       thongbao = (String)request.getAttribute("thongbao");
   
   if(thongbao.equals("error"))
   {
    
    

      out.write('\n');
      out.print( "<script> alert('Da co san pham thuoc loai san pham nay') </script>");
      out.write('\n');

   }

      out.write("\n");
      out.write("\n");
      out.write("<div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                 <!--  page header -->\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h1 class=\"page-header\">Danh sách sản phẩm</h1>\n");
      out.write("                </div>\n");
      out.write("                 <!-- end  page header -->\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <!-- Advanced Tables -->\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                             <form method=\"post\" action=\"search\">\n");
      out.write("                                <input type=\"hidden\" name=\"command\" value=\"loai_san_pham\">\n");
      out.write("                                <input type=\"text\" name=\"tim\" value=\"\">\n");
      out.write("                                <input type=\"submit\" value=\"Tim\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"table-responsive\">\n");
      out.write("                                <table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Ma loai</th>\n");
      out.write("                                            <th>Ten loai</th>\n");
      out.write("                                            <th>Ten loai cha</th>\n");
      out.write("                                           \n");
      out.write("                                            <th></th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        ");
 for(m_loai_san_pham lsp:list){ 
                                            loai_san_pham_cha_query lq = new loai_san_pham_cha_query();
                                            m_loai_san_pham_cha lc = lq.Doc_loai_san_pham_cha_phan_trang(lsp.getMa_loai_cha());
                                            
                                        
      out.write("\n");
      out.write("                                        <tr class=\"odd gradeX\">\n");
      out.write("                                            <td>");
      out.print( lsp.getMa_loai());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( lsp.getTen_loai());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( lc.getTen_loai());
      out.write("</td>\n");
      out.write("                                            \n");
      out.write("                                                          \n");
      out.write("                                            <td class=\"center\">\n");
      out.write("                                               \n");
      out.write("\n");
      out.write("                                                <a href=\"form_sua?ma_loai=");
      out.print( lsp.getMa_loai());
      out.write("&command=loai_san_pham\" title=\"Edit\" >\n");
      out.write("                                                <img src=\"public/images/icons/pencil.png\" alt=\"Edit\" />\n");
      out.write("                                                </a> \n");
      out.write("                                                <a href=\"javaScript:void(0)\" title=\"Delete\" onclick=\"Xoaloaisanpham(");
      out.print( lsp.getMa_loai());
      out.write(")\"> \n");
      out.write("                                                <img src=\"public/images/icons/cross.png\" alt=\"Delete\" />\n");
      out.write("                                                </a>                     \n");
      out.write("                                                <a href=\"Ds_san_pham_theo_ma_loai?ma_loai=");
      out.print( lsp.getMa_loai());
      out.write("\" title=\"Xem danh sach san pham\" >\n");
      out.write("                                                <img src=\"public/images/icons/search.png\" alt=\"Seach_more\" />\n");
      out.write("                                                </a>\n");
      out.write("                                                \n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        ");
 }
      out.write("\n");
      out.write("                                       \n");
      out.write("                                    </tbody>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                </table>\n");
      out.write("                                 \n");
      out.write("                                ");
 if(String.valueOf(request.getAttribute("count"))!=null){
      out.write(" \n");
      out.write("                                ");
 int count = Integer.parseInt(String.valueOf(request.getAttribute("count")));
      out.write("        \n");
      out.write("                                <ul class=\"pagination\">\n");
      out.write("                                     ");
 
                                    int dem = 0;
                                    if(count%2 == 0)
                                    {
                                        dem = count/2;
                                    }
                                    else
                                        dem = count/2 + 1;
                                    for(int i = 1; i <= dem ; i++) {
      out.write("\n");
      out.write("                                    <li><a href=\"loai_san_pham_admin?pages=");
      out.print( i);
      out.write('"');
      out.write('>');
      out.print( i);
      out.write("</a></li>\n");
      out.write("                                   \n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                  </ul>\n");
      out.write("                                 ");

                                }
                                 
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--End Advanced Tables -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>");
      out.write('\n');
      out.write('\n');

    
}
else if(view == "views/loai_san_pham_admin/v_them_loai_san_pham.jsp")
{

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("            \n");
      out.write("    <div class=\"row\">\n");
      out.write("         <!--  page header -->\n");
      out.write("        <div class=\"col-lg-12\">\n");
      out.write("            <h1 class=\"page-header\">Thêm Loai San Pham</h1>\n");
      out.write("        </div>\n");
      out.write("         <!-- end  page header -->\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-12\">\n");
      out.write("            <!-- Advanced Tables -->\n");
      out.write("            <div class=\"panel panel-default\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                     Advanced Tables\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("    <form method=\"post\"  action=\"them_loai_san_pham\">\n");
      out.write("        <fieldset>\n");
      out.write("          \n");
      out.write("          <p>\n");
      out.write("              <label class=\"alert\">Tên loai</label>\n");
      out.write("            <input class=\"text-input small-input kiemtra\" type=\"text\" id=\"ten_loai_san_pham\" name=\"ten_loai\" />\n");
      out.write("          </p>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          <p>\n");
      out.write("            <label class=\"alert\">Mã loại</label>\n");
      out.write("            \n");
      out.write("            ");
 ArrayList<m_loai_san_pham_cha> loai_san_pham_chas = (ArrayList) request.getAttribute("list"); 
      out.write("\n");
      out.write("            \n");
      out.write("             <select class=\"form-control\" id=\"form-field-select-1\" name=\"ma_loai_cha\">\n");
      out.write("                 \n");
      out.write("             ");
 for(m_loai_san_pham_cha c:loai_san_pham_chas){
      out.write("\n");
      out.write("                \n");
      out.write("            <option value=\"");
      out.print( c.getMa_loai_cha());
      out.write("\"> ");
      out.print( c.getTen_loai());
      out.write(" </option>\n");
      out.write("            ");

            }
            
      out.write("\n");
      out.write("            </select>\n");
      out.write("          \n");
      out.write("            \n");
      out.write("          <p>\n");
      out.write("            <input class=\"button btn btn-primary\" type=\"submit\" value=\"Cập nhật\" name=\"btnCapnhat\"  />\n");
      out.write("            <input class=\"button btn btn-default\" type=\"button\" value=\"Bỏ qua\" onclick=\"window.location='loai_san_pham_admin'\" />\n");
      out.write("          </p>\n");
      out.write("        </fieldset>\n");
      out.write("        <div class=\"clear\"></div>\n");
      out.write("        <!-- End .clear -->\n");
      out.write("        \n");
      out.write("    </form>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--End Advanced Tables -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write('\n');
      out.write('\n');

    
}
else if(view == "views/loai_san_pham_admin/v_sua_loai_san_pham.jsp")
{

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
    m_loai_san_pham lsp = (m_loai_san_pham)request.getAttribute("loai_san_pham");


      out.write("\n");
      out.write("<div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("            \n");
      out.write("    <div class=\"row\">\n");
      out.write("         <!--  page header -->\n");
      out.write("        <div class=\"col-lg-12\">\n");
      out.write("            <h1 class=\"page-header\">Thêm Loai San Pham</h1>\n");
      out.write("        </div>\n");
      out.write("         <!-- end  page header -->\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-12\">\n");
      out.write("            <!-- Advanced Tables -->\n");
      out.write("            <div class=\"panel panel-default\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                     Advanced Tables\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("    <form method=\"post\"  action=\"sua_loai_san_pham\">\n");
      out.write("        <fieldset>\n");
      out.write("          \n");
      out.write("            <p>\n");
      out.write("              <label class=\"alert\">Ma loai</label>\n");
      out.write("              <input class=\"text-input small-input kiemtra\" readonly type=\"text\" id=\"ten_loai_san_pham\" name=\"ma_loai\" value=\"");
      out.print( lsp.getMa_loai() );
      out.write("\" />\n");
      out.write("          </p>\n");
      out.write("          \n");
      out.write("          <p>\n");
      out.write("              <label class=\"alert\">Tên loai</label>\n");
      out.write("              <input class=\"text-input small-input kiemtra\" type=\"text\" id=\"ten_loai_san_pham\" name=\"ten_loai\" value=\"");
      out.print( lsp.getTen_loai() );
      out.write("\" />\n");
      out.write("          </p>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          <p>\n");
      out.write("            <label class=\"alert\">Mã loại</label>\n");
      out.write("            \n");
      out.write("            ");
 ArrayList<m_loai_san_pham_cha> loai_san_pham_chas = (ArrayList) request.getAttribute("list"); 
      out.write("\n");
      out.write("            \n");
      out.write("             <select class=\"form-control\" id=\"form-field-select-1\" name=\"ma_loai_cha\">\n");
      out.write("                 \n");
      out.write("             ");
 for(m_loai_san_pham_cha c:loai_san_pham_chas){
      out.write("\n");
      out.write("                \n");
      out.write("            <option value=\"");
      out.print( c.getMa_loai_cha());
      out.write('"');
      out.write(' ');
      out.print( (lsp.getMa_loai_cha()==c.getMa_loai_cha())?"selected":"" );
      out.write(" > ");
      out.print( c.getTen_loai());
      out.write(" </option>\n");
      out.write("            ");

            }
            
      out.write("\n");
      out.write("            </select>\n");
      out.write("          \n");
      out.write("            \n");
      out.write("          <p>\n");
      out.write("            <input class=\"button btn btn-primary\" type=\"submit\" value=\"Cập nhật\" name=\"btnCapnhat\"  />\n");
      out.write("            <input class=\"button btn btn-default\" type=\"button\" value=\"Bỏ qua\" onclick=\"window.location='loai_san_pham_admin'\" />\n");
      out.write("          </p>\n");
      out.write("        </fieldset>\n");
      out.write("        <div class=\"clear\"></div>\n");
      out.write("        <!-- End .clear -->\n");
      out.write("        \n");
      out.write("    </form>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--End Advanced Tables -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write('\n');
      out.write('\n');

    
}
else if(view == "views/loai_san_pham_admin/v_search_loai_san_pham.jsp")
{

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 

    
    m_loai_san_pham lsp = (m_loai_san_pham) request.getAttribute("lsp");
    
    
    
    int ma_loai = Integer.parseInt(String.valueOf(request.getAttribute("ma_loai")));
    
    loai_san_pham_cha_query cq = new loai_san_pham_cha_query();
    m_loai_san_pham_cha lc = cq.Doc_loai_san_pham_cha_phan_trang(lsp.getMa_loai_cha());
   

      out.write("\n");
      out.write("\n");
      out.write("<div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                 <!--  page header -->\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h1 class=\"page-header\">Danh sách sản phẩm</h1>\n");
      out.write("                </div>\n");
      out.write("                 <!-- end  page header -->\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <!-- Advanced Tables -->\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                             <form method=\"post\" action=\"search\">\n");
      out.write("                                <input type=\"hidden\" name=\"command\" value=\"loai_san_pham\">\n");
      out.write("                                <input type=\"text\" name=\"tim\" value=\"\">\n");
      out.write("                                <input type=\"submit\" value=\"Tim\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"table-responsive\">\n");
      out.write("                                <table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Ma loai</th>\n");
      out.write("                                            <th>Ten loai</th>\n");
      out.write("                                            <th>Ten loai cha</th>\n");
      out.write("                                           \n");
      out.write("                                            <th></th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                       \n");
      out.write("                                        <tr class=\"odd gradeX\">\n");
      out.write("                                            <td>");
      out.print( lsp.getMa_loai());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( lsp.getTen_loai());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( lc.getTen_loai());
      out.write("</td>\n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("                                                          \n");
      out.write("                                            <td class=\"center\">\n");
      out.write("                                               \n");
      out.write("\n");
      out.write("                                                <a href=\"form_sua?ma_loai=");
      out.print( lsp.getMa_loai());
      out.write("&command=loai_san_pham\" title=\"Edit\" >\n");
      out.write("                                                <img src=\"public/images/icons/pencil.png\" alt=\"Edit\" />\n");
      out.write("                                                </a> \n");
      out.write("                                                <a href=\"javaScript:void(0)\" title=\"Delete\" onclick=\"Xoaloaisanpham(");
      out.print( lsp.getMa_loai());
      out.write(")\"> \n");
      out.write("                                                <img src=\"public/images/icons/cross.png\" alt=\"Delete\" />\n");
      out.write("                                                </a>                     \n");
      out.write("                                                \n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                       \n");
      out.write("                                       \n");
      out.write("                                    </tbody>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                </table>\n");
      out.write("                                 \n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--End Advanced Tables -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>");
      out.write('\n');
      out.write('\n');

    
}
else if(view == "views/loai_san_pham_admin/v_ds_san_pham.jsp")
{

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
//   ArrayList<m_san_pham> list = new ArrayList<>();
//    if(request.getAttribute("san_phams")!=null)
//        list = (ArrayList) request.getAttribute("san_phams");
    
    ArrayList<m_san_pham> list = (ArrayList) request.getAttribute("san_phams");

    int ma_loai = Integer.parseInt(String.valueOf(request.getAttribute("ma_loai")));
    
   
    
    

      out.write("\n");
      out.write("\n");
      out.write("<div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                 <!--  page header -->\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h1 class=\"page-header\">Danh sách sản phẩm</h1>\n");
      out.write("                </div>\n");
      out.write("                 <!-- end  page header -->\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <!-- Advanced Tables -->\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                             <form method=\"post\" action=\"search\">\n");
      out.write("                                <input type=\"hidden\" name=\"command\" value=\"san_pham\">\n");
      out.write("                                <input type=\"text\" name=\"tim\" value=\"\">\n");
      out.write("                                <input type=\"submit\" value=\"Tim\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"table-responsive\">\n");
      out.write("                                <table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Mã sản phẩm</th>\n");
      out.write("                                            <th>Tên sản phẩm</th>\n");
      out.write("                                            <th>Ten loai</th>\n");
      out.write("                                            <th>Mô tả tóm tắt</th>\n");
      out.write("                                            <th>Đơn giá</th>\n");
      out.write("                                            <th></th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        ");
 for(m_san_pham sp:list){ 
                                            loai_san_pham_query lq = new loai_san_pham_query();
                                            m_loai_san_pham lsp = lq.Doc_loai_san_pham_theo_ma_loai(sp.getMa_loai());
                                            
                                        
      out.write("\n");
      out.write("                                        <tr class=\"odd gradeX\">\n");
      out.write("                                            <td>");
      out.print( sp.getMa_san_pham());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( sp.getTen_san_pham());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( lsp.getTen_loai());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( sp.getMo_ta_tom_tat());
      out.write("</td>\n");
      out.write("                                            \n");
      out.write("                                            <td class=\"center\">");
      out.print((sp.getDon_gia()));
      out.write("</td>\n");
      out.write("                                                          \n");
      out.write("                                            <td class=\"center\">\n");
      out.write("                                               \n");
      out.write("\n");
      out.write("                                                <a href=\"form_sua?ma_san_pham=");
      out.print( sp.getMa_san_pham());
      out.write("&command=san_pham\" title=\"Edit\" >\n");
      out.write("                                                <img src=\"public/images/icons/pencil.png\" alt=\"Edit\" />\n");
      out.write("                                                </a> \n");
      out.write("                                                <a href=\"javaScript:void(0)\" title=\"Delete\" onclick=\"Xoasanpham(");
      out.print( sp.getMa_san_pham());
      out.write(")\"> \n");
      out.write("                                                <img src=\"public/images/icons/cross.png\" alt=\"Delete\" />\n");
      out.write("                                                </a>                     \n");
      out.write("                                                \n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        ");
 }
      out.write("\n");
      out.write("                                       \n");
      out.write("                                    </tbody>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                </table>\n");
      out.write("                                 \n");
      out.write("                                ");
 if(String.valueOf(request.getAttribute("count"))!=null){
      out.write(" \n");
      out.write("                                ");
 int count = Integer.parseInt(String.valueOf(request.getAttribute("count")));
      out.write("        \n");
      out.write("                                <ul class=\"pagination\">\n");
      out.write("                                     ");
 
                                    int dem = 0;
                                    if(count%5 == 0)
                                    {
                                        dem = count/5;
                                    }
                                    else
                                        dem = count/5 + 1;
                                    for(int i = 1; i <= dem ; i++) {
      out.write("\n");
      out.write("                                    <li><a href=\"Ds_san_pham_theo_ma_loai?ma_loai=");
      out.print( ma_loai);
      out.write("&pages=");
      out.print( i);
      out.write('"');
      out.write('>');
      out.print( i);
      out.write("</a></li>\n");
      out.write("                                   \n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                  </ul>\n");
      out.write("                                 ");

                                }
                                 
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--End Advanced Tables -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>");
      out.write('\n');
      out.write('\n');

    
}
else if(view == "views/loai_san_pham_cha_admin/v_loai_san_pham_cha.jsp")
{

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
    
    ArrayList<m_loai_san_pham_cha> list = (ArrayList) request.getAttribute("lcs");

    
    
   String thongbao ="";
   if(request.getAttribute("thongbao")!=null)
       thongbao = (String)request.getAttribute("thongbao");
   
   if(thongbao.equals("error"))
   {
    
    

      out.write('\n');
      out.print( "<script> alert('Da co LOAI SAN PHAM thuoc LOAI SAN PHAM CHA nay') </script>");
      out.write('\n');

   }

      out.write("\n");
      out.write("\n");
      out.write("<div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                 <!--  page header -->\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h1 class=\"page-header\">Danh sách loai san pham cha</h1>\n");
      out.write("                </div>\n");
      out.write("                 <!-- end  page header -->\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <!-- Advanced Tables -->\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                             <form method=\"post\" action=\"search\">\n");
      out.write("                                <input type=\"hidden\" name=\"command\" value=\"loai_san_pham\">\n");
      out.write("                                <input type=\"text\" name=\"tim\" value=\"\">\n");
      out.write("                                <input type=\"submit\" value=\"Tim\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"table-responsive\">\n");
      out.write("                                <table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Ma loai cha</th>\n");
      out.write("                                            <th>Ten loai</th>\n");
      out.write("                                            \n");
      out.write("                                           \n");
      out.write("                                            <th></th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        ");
 for(m_loai_san_pham_cha lc:list){ 
                                            loai_san_pham_cha_query lq = new loai_san_pham_cha_query();
                                            
                                            
                                        
      out.write("\n");
      out.write("                                        <tr class=\"odd gradeX\">\n");
      out.write("                                            <td>");
      out.print( lc.getMa_loai_cha());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( lc.getTen_loai());
      out.write("</td>\n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("                                                          \n");
      out.write("                                            <td class=\"center\">\n");
      out.write("                                               \n");
      out.write("\n");
      out.write("                                                <a href=\"form_sua?ma_loai=");
      out.print( lc.getMa_loai_cha());
      out.write("&command=loai_san_pham\" title=\"Edit\" >\n");
      out.write("                                                <img src=\"public/images/icons/pencil.png\" alt=\"Edit\" />\n");
      out.write("                                                </a> \n");
      out.write("                                                <a href=\"javaScript:void(0)\" title=\"Delete\" onclick=\"Xoaloaisanphamcha(");
      out.print( lc.getMa_loai_cha());
      out.write(")\"> \n");
      out.write("                                                <img src=\"public/images/icons/cross.png\" alt=\"Delete\" />\n");
      out.write("                                                </a>                     \n");
      out.write("                                               \n");
      out.write("                                                \n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        ");
 }
      out.write("\n");
      out.write("                                       \n");
      out.write("                                    </tbody>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                </table>\n");
      out.write("                                  \n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--End Advanced Tables -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>");
      out.write('\n');
      out.write('\n');

    
}
else if(view == "views/loai_san_pham_cha_admin/v_them_loai_san_pham_cha.jsp")
{

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("            \n");
      out.write("    <div class=\"row\">\n");
      out.write("         <!--  page header -->\n");
      out.write("        <div class=\"col-lg-12\">\n");
      out.write("            <h1 class=\"page-header\">Thêm Loai San Pham</h1>\n");
      out.write("        </div>\n");
      out.write("         <!-- end  page header -->\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-12\">\n");
      out.write("            <!-- Advanced Tables -->\n");
      out.write("            <div class=\"panel panel-default\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                     Advanced Tables\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("    <form method=\"post\"  action=\"them_loai_san_pham_cha\">\n");
      out.write("        <fieldset>\n");
      out.write("          \n");
      out.write("          <p>\n");
      out.write("              <label class=\"alert\">Tên loai cha</label>\n");
      out.write("            <input class=\"text-input small-input kiemtra\" type=\"text\" id=\"ten_loai_san_pham\" name=\"ten_loai\" />\n");
      out.write("          </p>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("         \n");
      out.write("            \n");
      out.write("           \n");
      out.write("                \n");
      out.write("           \n");
      out.write("          \n");
      out.write("            \n");
      out.write("          <p>\n");
      out.write("            <input class=\"button btn btn-primary\" type=\"submit\" value=\"Cập nhật\" name=\"btnCapnhat\"  />\n");
      out.write("            <input class=\"button btn btn-default\" type=\"button\" value=\"Bỏ qua\" onclick=\"window.location='loai_san_pham_cha'\" />\n");
      out.write("          </p>\n");
      out.write("        </fieldset>\n");
      out.write("        <div class=\"clear\"></div>\n");
      out.write("        <!-- End .clear -->\n");
      out.write("        \n");
      out.write("    </form>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--End Advanced Tables -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write('\n');
      out.write('\n');

    
}
else if(view == "views/khach_hang_admin/v_khach_hang.jsp")
{

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
//   ArrayList<m_san_pham> list = new ArrayList<>();
//    if(request.getAttribute("san_phams")!=null)
//        list = (ArrayList) request.getAttribute("san_phams");
    
    ArrayList<m_khach_hang> list = (ArrayList) request.getAttribute("list");

    
    
   
    
    

      out.write("\n");
      out.write("\n");
      out.write("<div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                 <!--  page header -->\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h1 class=\"page-header\">Danh sách sản phẩm</h1>\n");
      out.write("                </div>\n");
      out.write("                 <!-- end  page header -->\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <!-- Advanced Tables -->\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                             <form method=\"post\" action=\"search\">\n");
      out.write("                                <input type=\"hidden\" name=\"command\" value=\"khach_hang\">\n");
      out.write("                                <input type=\"text\" name=\"tim\" value=\"\">\n");
      out.write("                                <input type=\"submit\" value=\"Tim\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"table-responsive\">\n");
      out.write("                                <table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Mã khach hang</th>\n");
      out.write("                                            <th>Tên khach hang</th> \n");
      out.write("                                            <th>Dia chi</th>\n");
      out.write("                                            <th>Dien thoai</th>\n");
      out.write("                                            <th>Email</th>\n");
      out.write("                                            \n");
      out.write("                                            <th></th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        ");
 for(m_khach_hang kh:list){ 
                                            
                                            
                                        
      out.write("\n");
      out.write("                                        <tr class=\"odd gradeX\">\n");
      out.write("                                            <td>");
      out.print( kh.getMa_khach_hang());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( kh.getTen_khach_hang());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( kh.getDia_chi());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( kh.getDien_thoai());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( kh.getEmail());
      out.write("</td>\n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("                                                          \n");
      out.write("                                            <td class=\"center\">\n");
      out.write("                                               \n");
      out.write("                                                <a href=\"form_sua?ma_khach_hang=");
      out.print( kh.getMa_khach_hang());
      out.write("&command=khach_hang\" title=\"Edit\" >\n");
      out.write("                                                <img src=\"public/images/icons/pencil.png\" alt=\"Edit\" />\n");
      out.write("                                                </a> \n");
      out.write("                                               \n");
      out.write("                                                <a href=\"javaScript:void(0)\" title=\"Delete\" onclick=\"Xoasanpham(");
      out.print( kh.getMa_khach_hang());
      out.write(")\"> \n");
      out.write("                                                <img src=\"public/images/icons/cross.png\" alt=\"Delete\" />\n");
      out.write("                                                </a>                     \n");
      out.write("                                                \n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        ");
 }
      out.write("\n");
      out.write("                                       \n");
      out.write("                                    </tbody>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                </table>\n");
      out.write("                                 \n");
      out.write("                                ");
 if(String.valueOf(request.getAttribute("count"))!=null){
      out.write(" \n");
      out.write("                                ");
 int count = Integer.parseInt(String.valueOf(request.getAttribute("count")));
      out.write("        \n");
      out.write("                                <ul class=\"pagination\">\n");
      out.write("                                     ");
 
                                    int dem = 0;
                                    if(count%5 == 0)
                                    {
                                        dem = count/5;
                                    }
                                    else
                                        dem = count/5 + 1;
                                    for(int i = 1; i <= dem ; i++) {
      out.write("\n");
      out.write("                                    <li><a href=\"khach_hang_admin?pages=");
      out.print( i);
      out.write('"');
      out.write('>');
      out.print( i);
      out.write("</a></li>\n");
      out.write("                                   \n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                  </ul>\n");
      out.write("                                 ");

                                }
                                 
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--End Advanced Tables -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>");
      out.write('\n');
      out.write('\n');

    
}
else if(view == "views/khach_hang_admin/v_sua_khach_hang.jsp")
{

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"page-wrapper\">\n");
      out.write("\n");
m_khach_hang kh = (m_khach_hang) request.getAttribute("kh");
      out.write("      \n");
      out.write("\n");
      out.write("   \n");
      out.write("    <div class=\"row\">\n");
      out.write("         <!--  page header -->\n");
      out.write("        <div class=\"col-lg-12\">\n");
      out.write("            <h1 class=\"page-header\">Sua khach hang</h1>\n");
      out.write("        </div>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("         <!-- end  page header -->\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-12\">\n");
      out.write("            <!-- Advanced Tables -->\n");
      out.write("            <div class=\"panel panel-default\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                     Advanced Tables\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("    <form method=\"post\"  action=\"sua_khach_hang\">\n");
      out.write("        <fieldset>\n");
      out.write("            <input type=\"hidden\" name=\"ma_khach_hang\" value=\"");
      out.print( kh.getMa_khach_hang() );
      out.write("\">\n");
      out.write("          <p>\n");
      out.write("              <label class=\"alert\">Tên khach hang</label>\n");
      out.write("              <input class=\"text-input small-input kiemtra\" type=\"text\" id=\"ten_khach_hang\" name=\"ten_khach_hang\" value=\"");
      out.print( kh.getTen_khach_hang() );
      out.write("\" />\n");
      out.write("          </p>\n");
      out.write("          \n");
      out.write("          <p>\n");
      out.write("              <label class=\"alert\">Email</label>\n");
      out.write("              <input class=\"text-input small-input kiemtra\" readonly=\"readonly\" type=\"text\" id=\"email\" name=\"email\" value=\"");
      out.print( kh.getEmail() );
      out.write("\" />\n");
      out.write("          </p>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          <p>\n");
      out.write("              <label class=\"alert\">Mat khau</label>\n");
      out.write("              <input class=\"text-input small-input kiemtra\" type=\"password\" id=\"ten_khach_hang\" name=\"mat_khau\" readonly=\"readonly\" value=\"");
      out.print( kh.getMat_khau() );
      out.write("\" />\n");
      out.write("          </p>\n");
      out.write("          \n");
      out.write("         <p>\n");
      out.write("              <label class=\"alert\">Dien thoai</label>\n");
      out.write("              <input class=\"text-input small-input kiemtra\"  type=\"text\" id=\"dien_thoai\" name=\"dien_thoai\" value=\"");
      out.print( kh.getDien_thoai() );
      out.write("\" />\n");
      out.write("          </p>\n");
      out.write("          \n");
      out.write("         \n");
      out.write("          <br>\n");
      out.write("          \n");
      out.write("            \n");
      out.write("          <p>\n");
      out.write("            <input class=\"button btn btn-primary\" type=\"submit\" value=\"Cập nhật\" name=\"btnCapnhat\"  />\n");
      out.write("            <input class=\"button btn btn-default\" type=\"button\" value=\"Bỏ qua\" onclick=\"window.location='khach_hang_admin'\" />\n");
      out.write("          </p>\n");
      out.write("        </fieldset>\n");
      out.write("        <div class=\"clear\"></div>\n");
      out.write("        <!-- End .clear -->\n");
      out.write("        \n");
      out.write("    </form>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--End Advanced Tables -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>");
      out.write('\n');
      out.write('\n');

    
}
else if(view == "views/khach_hang_admin/v_search_khach_hang.jsp")
{

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
//   ArrayList<m_san_pham> list = new ArrayList<>();
//    if(request.getAttribute("san_phams")!=null)
//        list = (ArrayList) request.getAttribute("san_phams");
    
    ArrayList<m_khach_hang> list = (ArrayList) request.getAttribute("list");
    
    String tim = "";
    tim = (String)request.getAttribute("tim");

    
    
   
    
    

      out.write("\n");
      out.write("\n");
      out.write("<div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                 <!--  page header -->\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h1 class=\"page-header\">Danh sách sản phẩm</h1>\n");
      out.write("                </div>\n");
      out.write("                 <!-- end  page header -->\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <!-- Advanced Tables -->\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                             <form method=\"post\" action=\"search\">\n");
      out.write("                                <input type=\"hidden\" name=\"command\" value=\"khach_hang\">\n");
      out.write("                                <input type=\"text\" name=\"tim\" value=\"");
      out.print( (tim!="")?tim:"");
      out.write("\">\n");
      out.write("                                <input type=\"submit\" value=\"Tim\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"table-responsive\">\n");
      out.write("                                <table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Mã khach hang</th>\n");
      out.write("                                            <th>Tên khach hang</th> \n");
      out.write("                                            <th>Dia chi</th>\n");
      out.write("                                            <th>Dien thoai</th>\n");
      out.write("                                            <th>Email</th>\n");
      out.write("                                            \n");
      out.write("                                            <th></th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        ");
 for(m_khach_hang kh:list){ 
                                            
                                            
                                        
      out.write("\n");
      out.write("                                        <tr class=\"odd gradeX\">\n");
      out.write("                                            <td>");
      out.print( kh.getMa_khach_hang());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( kh.getTen_khach_hang());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( kh.getDia_chi());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( kh.getDien_thoai());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( kh.getEmail());
      out.write("</td>\n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("                                                          \n");
      out.write("                                            <td class=\"center\">\n");
      out.write("                                               \n");
      out.write("                                                <a href=\"form_sua?ma_khach_hang=");
      out.print( kh.getMa_khach_hang());
      out.write("&command=khach_hang\" title=\"Edit\" >\n");
      out.write("                                                <img src=\"public/images/icons/pencil.png\" alt=\"Edit\" />\n");
      out.write("                                                </a> \n");
      out.write("                                               \n");
      out.write("                                                <a href=\"javaScript:void(0)\" title=\"Delete\" onclick=\"Xoasanpham(");
      out.print( kh.getMa_khach_hang());
      out.write(")\"> \n");
      out.write("                                                <img src=\"public/images/icons/cross.png\" alt=\"Delete\" />\n");
      out.write("                                                </a>                     \n");
      out.write("                                                \n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        ");
 }
      out.write("\n");
      out.write("                                       \n");
      out.write("                                    </tbody>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                </table>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--End Advanced Tables -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>");
      out.write('\n');
      out.write('\n');

    
}
else if(view == "views/hoa_don_admin/v_hoa_don.jsp")
{

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
//   ArrayList<m_san_pham> list = new ArrayList<>();
//    if(request.getAttribute("san_phams")!=null)
//        list = (ArrayList) request.getAttribute("san_phams");
    
    ArrayList<m_hoa_don> list = (ArrayList) request.getAttribute("hd");

    
    
   
    
    

      out.write("\n");
      out.write("\n");
      out.write("<div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                 <!--  page header -->\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h1 class=\"page-header\">Danh sách sản phẩm</h1>\n");
      out.write("                </div>\n");
      out.write("                 <!-- end  page header -->\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <!-- Advanced Tables -->\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                             <form method=\"post\" action=\"search\">\n");
      out.write("                                <input type=\"hidden\" name=\"command\" value=\"hoa_don\">\n");
      out.write("                                <input type=\"text\" name=\"tim\" value=\"\">\n");
      out.write("                                <input type=\"submit\" value=\"Tim\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"table-responsive\">\n");
      out.write("                                <table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Ngay in</th>\n");
      out.write("                                            <th>Tên khach hang</th>\n");
      out.write("                                            <th>Tri gia</th>\n");
      out.write("                                            <th>Tinh trang</th>\n");
      out.write("                                            \n");
      out.write("                                            <th></th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        ");
 for(m_hoa_don hd:list){ 
                                            khach_hang_query kq = new khach_hang_query();
                                            m_khach_hang kh = kq.doc_khach_hang_theo_ma_khach_hang(hd.getMa_khach_hang());
                                            
                                        
      out.write("\n");
      out.write("                                        <tr class=\"odd gradeX\">\n");
      out.write("                                            <td>");
      out.print( hd.getNgay_in());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( kh.getTen_khach_hang());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( hd.getTri_gia());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( (hd.getTinh_trang()==1)?"Da thanh toan":"Chua thanh toan");
      out.write("</td>\n");
      out.write("                                            \n");
      out.write("                                           \n");
      out.write("                                                          \n");
      out.write("                                            <td class=\"center\">\n");
      out.write("                                               \n");
      out.write("                                                <a href=\"chi_tiet_hoa_don?ma_hoa_don=");
      out.print( hd.getMa_hoa_don());
      out.write("\" title=\"Xem chi tiet hoa don\" >\n");
      out.write("                                                <img src=\"public/images/icons/search.png\" alt=\"Edit\" />\n");
      out.write("                                                </a> \n");
      out.write("                                                \n");
      out.write("<!--                                                <a href=\"javaScript:void(0)\" title=\"Delete\" onclick=\"Xoahoadon()\"> \n");
      out.write("                                                <img src=\"public/images/icons/cross.png\" alt=\"Delete\" />\n");
      out.write("                                                </a>                     -->\n");
      out.write("                                                \n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        ");
 }
      out.write("\n");
      out.write("                                       \n");
      out.write("                                    </tbody>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                </table>\n");
      out.write("                                 \n");
      out.write("                                ");
 if(String.valueOf(request.getAttribute("count"))!=null){
      out.write(" \n");
      out.write("                                ");
 int count = Integer.parseInt(String.valueOf(request.getAttribute("count")));
      out.write("        \n");
      out.write("                                <ul class=\"pagination\">\n");
      out.write("                                     ");
 
                                    int dem = 0;
                                    if(count%5 == 0)
                                    {
                                        dem = count/5;
                                    }
                                    else
                                        dem = count/5 + 1;
                                    for(int i = 1; i <= dem ; i++) {
      out.write("\n");
      out.write("                                    <li><a href=\"hoa_don_admin?pages=");
      out.print( i);
      out.write('"');
      out.write('>');
      out.print( i);
      out.write("</a></li>\n");
      out.write("                                   \n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                  </ul>\n");
      out.write("                                 ");

                                }
                                 
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--End Advanced Tables -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>");
      out.write('\n');
      out.write('\n');

    
}
else if(view == "views/hoa_don_admin/v_chi_tiet_hoa_don.jsp")
{

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
//   ArrayList<m_san_pham> list = new ArrayList<>();
//    if(request.getAttribute("san_phams")!=null)
//        list = (ArrayList) request.getAttribute("san_phams");
    
    ArrayList<m_chi_tiet_hoa_don> list = (ArrayList) request.getAttribute("ct_hoa_don");

    
    
   
    
    

      out.write("\n");
      out.write("\n");
      out.write("<div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                 <!--  page header -->\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h1 class=\"page-header\">Danh sách sản phẩm</h1>\n");
      out.write("                </div>\n");
      out.write("                 <!-- end  page header -->\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <!-- Advanced Tables -->\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                             <form method=\"post\" action=\"search\">\n");
      out.write("                                <input type=\"hidden\" name=\"command\" value=\"hoa_don\">\n");
      out.write("                                <input type=\"text\" name=\"tim\" value=\"\">\n");
      out.write("                                <input type=\"submit\" value=\"Tim\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"table-responsive\">\n");
      out.write("                                <table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Tên sản phẩm</th>\n");
      out.write("                                            <th>Số lượng</th>\n");
      out.write("                                            <th>Đơn giá</th>\n");
      out.write("                                           \n");
      out.write("                                            <th></th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        ");
 for(m_chi_tiet_hoa_don ct:list){ 
                                            
                                            m_san_pham sp = new m_san_pham();
                                            san_pham_query sq = new san_pham_query();
                                            
                                            sp = sq.doc_san_pham_theo_ma_san_pham(ct.getMa_san_pham());
                                        
      out.write("\n");
      out.write("                                        <tr class=\"odd gradeX\">\n");
      out.write("                                            <td>");
      out.print( sp.getTen_san_pham());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( ct.getSo_luong());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( ct.getDon_gia());
      out.write("</td>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("                                        ");
 }
      out.write("\n");
      out.write("                                       \n");
      out.write("                                    </tbody>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                </table>\n");
      out.write("                                 \n");
      out.write("                              <input class=\"button btn btn-default\" type=\"button\" value=\"Bỏ qua\" onclick=\"window.location='hoa_don_admin'\" />\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--End Advanced Tables -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>");
      out.write('\n');
      out.write('\n');

    
}
else if(view == "views/hoa_don_admin/v_search_hoa_don.jsp")
{

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
//   ArrayList<m_san_pham> list = new ArrayList<>();
//    if(request.getAttribute("san_phams")!=null)
//        list = (ArrayList) request.getAttribute("san_phams");
    
    ArrayList<m_hoa_don> list = (ArrayList) request.getAttribute("ct_hoa_don");

    
    
   
    
    

      out.write("\n");
      out.write("\n");
      out.write("<div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                 <!--  page header -->\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h1 class=\"page-header\">Danh sách sản phẩm</h1>\n");
      out.write("                </div>\n");
      out.write("                 <!-- end  page header -->\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <!-- Advanced Tables -->\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                             <form method=\"post\" action=\"search\">\n");
      out.write("                                <input type=\"hidden\" name=\"command\" value=\"hoa_don\">\n");
      out.write("                                <input type=\"text\" name=\"tim\" value=\"\">\n");
      out.write("                                <input type=\"submit\" value=\"Tim\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"table-responsive\">\n");
      out.write("                                <table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Ngay in</th>\n");
      out.write("                                            <th>Tên khach hang</th>\n");
      out.write("                                            <th>Tri gia</th>\n");
      out.write("                                            <th>Tinh trang</th>\n");
      out.write("                                            \n");
      out.write("                                            <th></th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        ");
 for(m_hoa_don hd:list){ 
                                            khach_hang_query kq = new khach_hang_query();
                                            m_khach_hang kh = kq.doc_khach_hang_theo_ma_khach_hang(hd.getMa_khach_hang());
                                            
                                        
      out.write("\n");
      out.write("                                        <tr class=\"odd gradeX\">\n");
      out.write("                                            <td>");
      out.print( hd.getNgay_in());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( kh.getTen_khach_hang());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( hd.getTri_gia());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( (hd.getTinh_trang()==1)?"Da thanh toan":"Chua thanh toan");
      out.write("</td>\n");
      out.write("                                            \n");
      out.write("                                           \n");
      out.write("                                                          \n");
      out.write("                                            <td class=\"center\">\n");
      out.write("                                               \n");
      out.write("                                                <a href=\"chi_tiet_hoa_don?ma_hoa_don=");
      out.print( hd.getMa_hoa_don());
      out.write("\" title=\"Xem chi tiet hoa don\" >\n");
      out.write("                                                <img src=\"public/images/icons/search.png\" alt=\"Edit\" />\n");
      out.write("                                                </a> \n");
      out.write("                                                \n");
      out.write("<!--                                                <a href=\"javaScript:void(0)\" title=\"Delete\" onclick=\"Xoahoadon()\"> \n");
      out.write("                                                <img src=\"public/images/icons/cross.png\" alt=\"Delete\" />\n");
      out.write("                                                </a>                     -->\n");
      out.write("                                                \n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        ");
 }
      out.write("\n");
      out.write("                                       \n");
      out.write("                                    </tbody>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                </table>\n");
      out.write("                                 \n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--End Advanced Tables -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>");
      out.write('\n');
      out.write('\n');

    
}
else if(view == "views/nguoi_dung/v_nguoi_dung.jsp")
{

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
//   ArrayList<m_san_pham> list = new ArrayList<>();
//    if(request.getAttribute("san_phams")!=null)
//        list = (ArrayList) request.getAttribute("san_phams");
    
    ArrayList<m_nguoi_dung> list = (ArrayList) request.getAttribute("nd");

    
    
   
String thongbao ="";
   if(request.getAttribute("thongbao")!=null)
       thongbao = (String)request.getAttribute("thongbao");
   
   if(thongbao.equals("error"))
   {
    
    

      out.write('\n');
      out.print( "<script> alert('Đã có HÓA ĐƠN chưa SẢN PHẨM NÀY') </script>");
      out.write('\n');

   }

      out.write("\n");
      out.write("\n");
      out.write("<div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                 <!--  page header -->\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h1 class=\"page-header\">Danh sách sản phẩm</h1>\n");
      out.write("                </div>\n");
      out.write("                 <!-- end  page header -->\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <!-- Advanced Tables -->\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                             <form method=\"post\" action=\"search\">\n");
      out.write("                                <input type=\"hidden\" name=\"command\" value=\"san_pham\">\n");
      out.write("                                <input type=\"text\" name=\"tim\" value=\"\">\n");
      out.write("                                <input type=\"submit\" value=\"Tim\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"table-responsive\">\n");
      out.write("                                <table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Mã nguoi dung</th>\n");
      out.write("                                            <th>Ho ten</th>\n");
      out.write("                                            <th>Ten dang nhap</th>\n");
      out.write("                                            <th>Email</th>\n");
      out.write("                                            <th>Ngay dang nhap cuoi</th>\n");
      out.write("                                            <th></th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        ");
 for(m_nguoi_dung nguoi_dung:list){ 
                                            
                                            
                                        
      out.write("\n");
      out.write("                                        <tr class=\"odd gradeX\">\n");
      out.write("                                            <td>");
      out.print( nguoi_dung.getMa_nguoi_dung());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( nguoi_dung.getHo_ten());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( nguoi_dung.getTen_dang_nhap());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( nguoi_dung.getEmail());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( nguoi_dung.getNgay_dang_nhap_cuoi());
      out.write("</td>\n");
      out.write("                                            \n");
      out.write("                                           \n");
      out.write("                                                          \n");
      out.write("                                            <td class=\"center\">\n");
      out.write("                                               \n");
      out.write("\n");
      out.write("                                                <a href=\"form_sua?ma_nguoi_dung=");
      out.print( nguoi_dung.getMa_nguoi_dung());
      out.write("&command=nguoi_dung\" title=\"Edit\" >\n");
      out.write("                                                <img src=\"public/images/icons/pencil.png\" alt=\"Edit\" />\n");
      out.write("                                                </a> \n");
      out.write("                                                <a href=\"javaScript:void(0)\" title=\"Delete\" onclick=\"Xoanguoidung");
      out.print( nguoi_dung.getMa_nguoi_dung());
      out.write(")\"> \n");
      out.write("                                                <img src=\"public/images/icons/cross.png\" alt=\"Delete\" />\n");
      out.write("                                                </a>                     \n");
      out.write("                                                \n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        ");
 }
      out.write("\n");
      out.write("                                       \n");
      out.write("                                    </tbody>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                </table>\n");
      out.write("                                 \n");
      out.write("                               \n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--End Advanced Tables -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>");
      out.write('\n');
      out.write('\n');

    
}

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
      out.write('\n');
      out.write("</div>\n");
      out.write("    <!-- end wrapper -->\n");
      out.write("\n");
      out.write("    <!-- Core Scripts - Include with every page -->\n");
      out.write("    <script src=\"public/plugins/jquery-1.10.2.js\"></script>\n");
      out.write("    <script src=\"public/plugins/bootstrap/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"public/plugins/metisMenu/jquery.metisMenu.js\"></script>\n");
      out.write("    <script src=\"public/plugins/pace/pace.js\"></script>\n");
      out.write("    <script src=\"public/js/siminta.js\"></script>\n");
      out.write("    <!-- Page-Level Plugin Scripts-->\n");
      out.write("    <script src=\"public/plugins/morris/raphael-2.1.0.min.js\"></script>\n");
      out.write("    <script src=\"public/plugins/morris/morris.js\"></script>\n");
      out.write("    <script src=\"public/js/dashboard-demo.js\"></script>\n");
      out.write("    <script src=\"public/js/kiemtra.js\"></script>\n");
      out.write("    \n");
      out.write("    <script src=\"public/plugins/dataTables/jquery.dataTables.js\"></script>\n");
      out.write("    <script src=\"public/plugins/dataTables/dataTables.bootstrap.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            $('#dataTables-example').dataTable();\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
