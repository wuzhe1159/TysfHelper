/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-04-19 22:41:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.teacher;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class releasehomework_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title></title>\r\n");
      out.write("<link href=\"https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/webuploader.css\" />\r\n");
      out.write("<link rel=\"stylesheet\"href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/bootstrap-datetimepicker.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/bootstrap-multiselect.css\" />\r\n");
      out.write("<script src=\"https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/bootstrap-datetimepicker.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/bootstrap-datetimepicker.zh-CN.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/bootstrap-multiselect.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/webuploader.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.jsp", out, false);
      out.write("\r\n");
      out.write("\t<div class=\"main-right  col-md-10 col-md-offset-2\">\r\n");
      out.write("\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t<div class=\"panel panel-primary\">\r\n");
      out.write("\t\t\t\t<div class=\"panel-heading\">发布作业</div>\r\n");
      out.write("\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-2\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t<form role=\"form\" class=\"form-horizontal\" id=\"Hfrom\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"title\" class=\"control-label\">作业标题</label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"text\" class=\"form-control\" id=\"htitle\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"请输入作业标题\" name=\"title\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"sumbitdate\" class=\"control-label\">提交日期</label> \r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"datetime\" class=\"form-control\" id=\"datetimepicker\"name=\"sumbitdate\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"input-group-addon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-calendar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"name\">通知班级</label> <select id=\"usertype\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tmultiple=\"multiple\" class=\"form-control\" name=\"schoolclass\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"name\">作业要求 </label> <span><a id=\"picker\">添加附件</a></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<textarea class=\"form-control\" rows=\"3\" placeholder=\"请输入作业要求\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"hcontent\" name=\"content\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul id=\"thelist\" class=\"list-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-success col-md-12\" id=\"ctlBtn\">发布作业</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$().ready(\r\n");
      out.write("\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\t\t\ttype : \"post\",\r\n");
      out.write("\t\t\t\t\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/teacher/querySchoolClass.do\",\r\n");
      out.write("\t\t\t\t\t\t\tsuccess : function(json) {\r\n");
      out.write("\t\t\t\t\t\t\t\t$.each($.parseJSON(json), function(i, val) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#usertype\").append(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\"<option value='\"+val.cid+\"'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ val.cname + \"</option>\");\r\n");
      out.write("\t\t\t\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t\t\t\t$('#usertype').multiselect({\r\n");
      out.write("\t\t\t\t\t\t\t\t\tnonSelectedText : \"请选择需要通知的班级\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\tnSelectedText : \"个班级\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\tallSelectedText : \"全部班级\",\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t\t$('#datetimepicker').datetimepicker({\r\n");
      out.write("\t\t\t\t\t\t\tformat: 'yyyy-mm-dd',\r\n");
      out.write("\t\t\t\t\t        language: 'zh-CN',\r\n");
      out.write("\t\t\t\t\t        minView: \"month\",\r\n");
      out.write("\t\t\t\t\t        autoclose:true,\r\n");
      out.write("\t\t\t\t\t        todayBtn:true\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\tvar uploader = WebUploader.create({\r\n");
      out.write("\t\t\t\t\t\t\tauto : true,\r\n");
      out.write("\t\t\t\t\t\t\t// swf文件路径\r\n");
      out.write("\t\t\t\t\t\t\tswf : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/Uploader.swf',\r\n");
      out.write("\t\t\t\t\t\t\t// 文件接收服务端。\r\n");
      out.write("\t\t\t\t\t\t\tserver : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/Uploadfile.do',\r\n");
      out.write("\t\t\t\t\t\t\t// 选择文件的按钮。可选。\r\n");
      out.write("\t\t\t\t\t\t\t// 内部根据当前运行是创建，可能是input元素，也可能是flash.\r\n");
      out.write("\t\t\t\t\t\t\tpick : '#picker',\r\n");
      out.write("\t\t\t\t\t\t\t// 不压缩image, 默认如果是jpeg，文件上传前会压缩一把再上传！\r\n");
      out.write("\t\t\t\t\t\t\tresize : false,\r\n");
      out.write("\t\t\t\t\t\t\tmultiple : false\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\tuploader\r\n");
      out.write("\t\t\t\t\t\t\t\t.on(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t'uploadProgress',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfunction(file, percentage) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"#ctlBtn\").attr(\"disabled\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\"disabled\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvar $li = $('#' + file.id), $percent = $li\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t.find('.progress .progress-bar');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t// 避免重复创建\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tif (!$percent.length) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$percent = $(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t'<div class=\"progress progress-striped active\">'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ '<div class=\"progress-bar\" role=\"progressbar\" style=\"width: 0%\">'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ '</div>'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ '</div>')\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.appendTo($li)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.find('.progress-bar');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$li.find('p.state').text('上传中');\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$percent.css('width', percentage\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t* 100 + '%');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t// 当有文件被添加进队列的时候\r\n");
      out.write("\t\t\t\t\t\tuploader.on('fileQueued', function(file) {\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#thelist\").append(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t'<li id=\"' + file.id + '\" class=\"item list-group-item\">'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t+ '<h4 class=\"info\">' + file.name\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t+ '</h4>'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t+ '<p class=\"state\">等待上传...</p>'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t+ '</li>');\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\tuploader.on('uploadSuccess',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfunction(file, data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"#ctlBtn\").attr(\"disabled\", null);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tif (data._raw == 0) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$('#' + file.id).find('p.state').text('服务器上传出错');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$(\"#\" + file.id).append(\"<input type='checkbox' name='file' value='\"+data._raw+\"' checked='checked' hidden='hidden'>\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$('#' + file.id).find('p.state').text('已上传');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tuploader.on('uploadError', function(file) {\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#ctlBtn\").attr(\"disabled\", null);\r\n");
      out.write("\t\t\t\t\t\t\t$('#' + file.id).find('p.state').text('上传出错');\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tuploader.on('uploadComplete', function(file) {\r\n");
      out.write("\t\t\t\t\t\t\t$('#' + file.id).find('.progress').fadeOut();\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t$(\"#ctlBtn\").on('click', function() {\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#sumbitdate\").val();\r\n");
      out.write("\t\t\t\t\t\t\tuploader.upload();\r\n");
      out.write("\t\t\t\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\t\t\t\ttype : \"post\",\r\n");
      out.write("\t\t\t\t\t\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/teacher/releasehomework.do\",\r\n");
      out.write("\t\t\t\t\t\t\t\tdata : $(\"#Hfrom\").serialize(),\r\n");
      out.write("\t\t\t\t\t\t\t\tsuccess:function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t\talert('发布成功')\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t})\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t})\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/jsp/teacher/releasehomework.jsp(4,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/teacher/releasehomework.jsp(4,0) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/teacher/releasehomework.jsp(4,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("path");
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }
}
