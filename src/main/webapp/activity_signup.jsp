<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<script language="javascript">
    var popup_dragging = false;
    var popup_target;
    var popup_mouseX;
    var popup_mouseY;
    var popup_mouseposX;
    var popup_mouseposY;
    var popup_oldfunction;
    function popup_display(x)
    {
        var win = window.open();
        for (var i in x) win.document.write(i+' = '+x[i]+'<br>');
    }
    // ----- popup_mousedown -------------------------------------------------------
    function popup_mousedown(e)
    {
        var ie = navigator.appName == "Microsoft Internet Explorer";
        if ( ie  &&  window.event.button != 1) return;
        if (!ie  &&  e.button            != 0) return;
        popup_dragging = true;
        popup_target   = this['target'];
        popup_mouseX   = ie ? window.event.clientX : e.clientX;
        popup_mouseY   = ie ? window.event.clientY : e.clientY;
        if (ie)
            popup_oldfunction      = document.onselectstart;
        else popup_oldfunction      = document.onmousedown;
        if (ie)
            document.onselectstart = new Function("return false;");
        else document.onmousedown   = new Function("return false;");
    }
    // ----- popup_mousemove -------------------------------------------------------
    function popup_mousemove(e)
    {
        if (!popup_dragging) return;
        var ie      = navigator.appName == "Microsoft Internet Explorer";
        var element = document.getElementById(popup_target);
        var mouseX = ie ? window.event.clientX : e.clientX;
        var mouseY = ie ? window.event.clientY : e.clientY;
        element.style.left = (element.offsetLeft+mouseX-popup_mouseX)+'px';
        element.style.top  = (element.offsetTop +mouseY-popup_mouseY)+'px';
        popup_mouseX = ie ? window.event.clientX : e.clientX;
        popup_mouseY = ie ? window.event.clientY : e.clientY;
    }
    // ----- popup_mouseup ---------------------------------------------------------
    function popup_mouseup(e)
    {
        if (!popup_dragging) return;
        popup_dragging = false;
        var ie      = navigator.appName == "Microsoft Internet Explorer";
        var element = document.getElementById(popup_target);
        if (ie)
            document.onselectstart = popup_oldfunction;
        else document.onmousedown   = popup_oldfunction;
    }
    // ----- popup_exit ------------------------------------------------------------
    function popup_exit(e)
    {
        var ie      = navigator.appName == "Microsoft Internet Explorer";
        var element = document.getElementById(popup_target);
        popup_mouseup(e);
        element.style.visibility = 'hidden';
        element.style.display    = 'none';
    }
    // ----- popup_show ------------------------------------------------------------
    function popup_show()
    {
        element      = document.getElementById('popup');
        drag_element = document.getElementById('popup_drag');
        exit_element = document.getElementById('popup_exit');
        element.style.position   = "absolute";
        element.style.visibility = "visible";
        element.style.display    = "block";
        element.style.left = (document.documentElement.scrollLeft+popup_mouseposX-10)+'px';
        element.style.top  = (document.documentElement.scrollTop +popup_mouseposY-10)+'px';
        drag_element['target']   = 'popup';
        drag_element.onmousedown = popup_mousedown;
        exit_element.onclick     = popup_exit;
    }
    // ----- popup_mousepos --------------------------------------------------------
    function popup_mousepos(e)
    {
        var ie = navigator.appName == "Microsoft Internet Explorer";
        popup_mouseposX = ie ? window.event.clientX : e.clientX;
        popup_mouseposY = ie ? window.event.clientY : e.clientY;
    }
    // ----- Attach Events ---------------------------------------------------------
    if (navigator.appName == "Microsoft Internet Explorer")
        document.attachEvent('onmousedown', popup_mousepos);
    else document.addEventListener('mousedown', popup_mousepos, false);
    if (navigator.appName == "Microsoft Internet Explorer")
        document.attachEvent('onmousemove', popup_mousemove);
    else document.addEventListener('mousemove', popup_mousemove, false);
    if (navigator.appName == "Microsoft Internet Explorer")
        document.attachEvent('onmouseup', popup_mouseup);
    else document.addEventListener('mouseup', popup_mouseup, false);
</script>

<style type="text/css">
    /* <style> */
    div.sample_popup { z-index: +1; }
    div.menu_form_header{
        cursor:move
    }
    div.sample_popup div.menu_form_header
    {
        border: 1px solid black;
        border-bottom: 0px;
        cursor: default;
        width: 300px;
        height:      30px;
        line-height: 19px;
        vertical-align: middle;
        background-color: #898989;
       /* background: url('images/activity_images/bg3.png') no-repeat;*/
        text-decoration: none;
        font-family: "Times New Roman", Serif;
        font-weight: 900;
        font-size: 13px;
        color: #206040;
    }
    div.sample_popup div.menu_form_body
    {
        border: 1px solid black;
        width: 300px;
        height:300px;
        background-color: white;
        /*background: url('images/activity_images/bg2.png') no-repeat left bottom;*/
    }
    div.sample_popup img.menu_form_exit
    {
        float: right;
        margin: 4px 5px 0px 0px;
        cursor: pointer;
    }
    div.sample_popup table
    {
        border-collapse: collapse;
        width: 100%;
    }
    div.sample_popup th
    {
        width: 10%;
        padding: 0px 0px 0px 0px;
        text-align: right;
        font-weight: 900;
        font-size: 13px;
        color: #004060;
    }
    div.sample_popup td
    {
        width: 99%;
        padding: 0px 0px 1px 0px;
    }
    div.sample_popup form
    {
        margin: 0px;
        padding: 8px 10px 10px 10px;
    }
    div.sample_popup input.field
    {
        border: 2px solid #808080;
        width: 95%;
        font-family: Arial, Sans-Serif;
        font-size: 12px;
    }
    div.sample_popup input.btn
    {
        margin-top: 2px;
        border: 1px solid #808080;
        background-color: #DDFFDD;
        font-family: Verdana, Sans-Serif;
        font-size: 11px;
    }

</style>
<html>
<head>
    <title>signup</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!-- bootstrap-css -->
    <link href="css/activity_css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
    <!--// bootstrap-css -->
    <!-- css -->
    <link rel="stylesheet" href="css/activity_css/style.css" type="text/css" media="all" />
    <!--// css -->
    <link rel="stylesheet" href="css/activity_css/ken-burns.css">
    <!-- font-awesome icons -->
    <link href="css/activity_css/font-awesome.css" rel="stylesheet">
    <!-- //font-awesome icons -->
    <!-- font -->
    <link href='https://fonts.googleapis.com/css?family=Oswald:400,700,300' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Pacifico' rel='stylesheet' type='text/css'>
    <!-- //font -->
    <script src="js/activity_js/jquery-1.11.1.min.js"></script>
    <script src="js/activity_js/bootstrap.js"></script>
    <!--特效控件-->
    <script src="js/activity_js/layer/layer.js"></script>
</head>
<body>
<!-- banner -->
<div class="banner about-bg">
    <div class="top-banner">
        <div class="container">
            <div class="top-banner-left">
                <ul>
                    <li><i class="fa fa-phone" aria-hidden="true"></i> +1 234 567 8901</li>
                    <li><a href="mailto:example@email.com"><i class="fa fa-envelope" aria-hidden="true"></i> mail@example.com</a></li>
                </ul>
            </div>
            <div class="top-banner-right">
                <ul>
                    <li><a class="facebook" href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
                    <li><a class="facebook" href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
                    <li><a class="facebook" href="#"><i class="fa fa-dribbble" aria-hidden="true"></i></a></li>
                    <li><a class="facebook" href="#"><i class="fa fa-google-plus" aria-hidden="true"></i></a></li>
                </ul>
            </div>
            <div class="clearfix"> </div>
        </div>
    </div>
    <div class="header">
        <div class="container">
            <div class="logo">
                <h1>
                    <a href="activity_index.html"><img src="images/activity_images/logo.png"/></a>
                </h1>
            </div>
            <div class="top-nav">
                <nav class="navbar navbar-default">

                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav">
                            <li><a class="active" href="activity_index.html">活动首页</a></li>
                            <li><a href="">活动详情</a></li>
                            <li><a href="">返回主页</a></li>
                            <li><a href="">联系我们</a></li>
                            <div class="clearfix"> </div>
                        </ul>
                    </div>
                </nav>
            </div>
            <div class="clearfix"> </div>
        </div>
    </div>
</div>
<c:if test="${param.flag eq '1' }">
    <script>
        alert("报名成功");
    </script>
</c:if>
<c:if test="${param.flag eq '0' }">
    <script>
        alert("日期已过");
    </script>
</c:if>
<!-- news -->
<div class="news">
    <div class="container">
        <div class="news-heading">
            <h3>报名中心</h3>
        </div>
        <div class="news-grids">
            <c:forEach items="${activetypelist}" var="activetype" varStatus="varStatus">
            <c:if test="${varStatus.count!=0}">
                <c:if test="${(varStatus.count)%4==0}"><div class="clearfix"> </div><br/></c:if>
            </c:if>
            <form action="<%=basePath%>activesign.action" method="get">
            <div class="col-md-4 news-grid">
                <div class="agile-news-grid-info">
                    <div class="news-grid-info-img">
                        <input type="hidden" value="${activetype.activename}" name="activename"/>
                        <a href="activity_area1.html"><img src="<%=basePath%>${activetype.activetypepic}" alt="" /></a>
                    </div>
                    <div class="news-grid-info-bottom">
                        <div class="date-grid">
                            <div class="admin">
                                <a href="#"><i class="fa fa-user" aria-hidden="true"></i>${activetype.admin}</a>
                            </div>
                            <div class="time">
                                <p><i class="fa fa-calendar" aria-hidden="true"></i><fmt:formatDate value='${activetype.createtime}' pattern='yyyy-MM-dd'/>
                                </p>
                            </div>
                            <div class="clearfix"> </div>
                        </div>
                        <div class="news-grid-info-bottom-text">
                            <a href="activity_area1.html">${activetype.activename}</a>
                            <p>活动等级：
                                <select class="form-control" name="selectedGrade" style="width: 100px;margin-left: 150px;margin-top: -30px">
                                    <c:forEach items="${activegradelist}" var="grade">
                                        <option value="${grade.activegrade}">${grade.activegrade}</option>
                                    </c:forEach>
                                </select>

                            </p>
                        </div>
                        <div class="click-button" align="center">
                        <%--//获得地址栏参数比较--%>
                            <c:set var="f" value="0"></c:set>
                            <c:forEach items="${pageContext.session.getAttribute('activesigns')}" var="activesign">
                                <c:if test="${activetype.activetypeid eq activesign}">
                                    <c:set var="f" value="1"></c:set>
                                </c:if>


                            </c:forEach>
                            <c:if test="${f eq '1'}">
                            <%--<c:if test="${activetype.activetypeid eq param.activetypeid}">--%>
                                <button type="submit" class="btn btn-default"  onclick="return false">已报名</button>
                            </c:if>
                            <c:if test="${f eq '0'}">
                            <%--<c:if test="${activetype.activetypeid ne param.activetypeid}">--%>
                                <button type="submit" class="btn btn-default">报名</button>
                            </c:if>
                        </div>
                    </div>
                </div>
            </div>
            </form>
            </c:forEach>
        </div>
    </div>
</div>
<!-- //news -->
<!-- footer -->
<div class="footer">
    <div class="container">
        <div class="footer-grids">
            <div class="col-md-3 footer-grid">
                <div class="footer-grid-heading">
                    <h4>Address</h4>
                </div>
                <div class="footer-grid-info">
                    <p>Eiusmod Tempor inc
                        <span>St Dolore Place,Kingsport 56777.</span>
                    </p>
                    <p class="phone">Phone : +1 123 456 789
                        <span>Email : <a href="mailto:example@email.com">mail@example.com</a></span>
                    </p>
                </div>
            </div>
            <div class="col-md-3 footer-grid">
                <div class="footer-grid-heading">
                    <h4>Navigation</h4>
                </div>
                <div class="footer-grid-info">
                    <ul>
                        <li><a href="about.html">About</a></li>
                        <li><a href="services.html">Services</a></li>
                        <li><a href="gallery.html">Gallery</a></li>
                        <li><a href="contact.html">Contact</a></li>
                    </ul>
                </div>
            </div>
            <div class="col-md-3 footer-grid">
                <div class="footer-grid-heading">
                    <h4>Follow</h4>
                </div>
                <div class="social">
                    <ul>
                        <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                        <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                        <li><a href="#"><i class="fa fa-rss"></i></a></li>
                        <li><a href="#"><i class="fa fa-vk"></i></a></li>
                    </ul>
                </div>
            </div>
            <div class="col-md-3 footer-grid">
                <div class="footer-grid-heading">
                    <h4>Newsletter</h4>
                </div>
                <div class="footer-grid-info">
                    <form action="#" method="post">
                        <input type="email" id="mc4wp_email" name="EMAIL" placeholder="Enter your email here" required>
                        <input type="submit" value="Subscribe">
                    </form>
                </div>
            </div>
            <div class="clearfix"> </div>
        </div>
        <div class="copyright">
            <p>Copyright &copy; 2016.Company name All rights reserved.More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>
        </div>
    </div>
</div>
<!-- //footer -->
<script src="js/activity_js/SmoothScroll.min.js"></script>
</body>
</html>