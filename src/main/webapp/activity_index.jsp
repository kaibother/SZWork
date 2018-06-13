<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>活动主页</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!-- bootstrap-css -->
    <link href="<%= basePath%>css/activity_css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
    <!--// bootstrap-css -->
    <!-- css -->
    <link rel="stylesheet" href="<%= basePath%>css/activity_css/style.css" type="text/css" media="all" />
    <!--// css -->
    <link rel="stylesheet" href="<%= basePath%>css/activity_css/ken-burns.css">
    <!-- font-awesome icons -->
    <link href="<%= basePath%>css/activity_css/font-awesome.css" rel="stylesheet">
    <!-- //font-awesome icons -->
    <!-- font -->
    <link href='https://fonts.googleapis.com/css?family=Oswald:400,700,300' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Pacifico' rel='stylesheet' type='text/css'>
    <!-- //font -->
    <script src="<%= basePath%>js/activity_js/jquery-1.11.1.min.js"></script>
    <script src="<%= basePath%>js/activity_js/bootstrap.js"></script>
</head>
<body>
<!-- banner -->
<div class="banner">
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
                    <a href="activity_index.jsp"><img src="<%= basePath%>images/activity_images/logo.png"/></a>
                </h1>
            </div>
            <div class="top-nav">
                <nav class="navbar navbar-default">

                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav">
                            <li><a class="active" href="<%= basePath%>activity_index.jsp">活动首页</a></li>
                            <li><a href="activity_signup.jsp">活动详情</a></li>
                            <li><a href="index.jsp">返回主页</a></li>
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
<!-- //banner -->
<div id="kb" class="carousel kb_elastic animate_text kb_wrapper" data-ride="carousel" data-interval="6000" data-pause="hover">
    <!-- Wrapper for Slides -->
    <div class="carousel-inner" role="listbox">
        <!-- First Slide -->
        <div class="item active">
            <div class="slider">
                <div class="carousel-caption kb_caption slider-grid">
                    <h3>游泳</h3>
                    <p>我是天生的游泳健将！</p>
                </div>
            </div>
        </div>

        <!-- Second Slide -->
        <div class="item">
            <div class="slider slider1">
                <div class="carousel-caption kb_caption kb_caption_right slider-grid">
                    <h3>接飞盘</h3>
                    <p>这个飞盘我接了！</p>
                </div>
            </div>
        </div>

        <!-- Third Slide -->
        <div class="item">
            <div class="slider slider2">
                <div class="carousel-caption kb_caption kb_caption_center slider-grid">
                    <h3>赛跑</h3>
                    <p>赛跑是我的最爱</p>
                </div>
            </div>
        </div>
    </div>
    <!-- Navigation Buttons -->
    <!-- Left Button -->
    <a class="left carousel-control kb_control_left" href="#kb" role="button" data-slide="prev">
        <span class="fa fa-angle-left kb_icons" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <!-- Right Button -->
    <a class="right carousel-control kb_control_right" href="#kb" role="button" data-slide="next">
        <span class="fa fa-angle-right kb_icons" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>
<!-- about -->
<div class="about">
    <div class="container">
        <div class="w3l-about-heading">
            <h2>最佳时刻</h2>
            <p>这里记录每场狗狗们在活动中的出色表现</P>
        </div>

        <div class="about-grids">
            <div class="col-md-3 about-grid">
                <div class="about-grid-info effect-1">
                    <h4>汪汪</h4>
                </div>
            </div>
            <div class="col-md-3 about-grid">
                <div class="about-grid-info about-grid-info1 effect-1">
                    <h4>布鲁托</h4>
                </div>
            </div>
            <div class="col-md-3 about-grid">
                <div class="about-grid-info about-grid-info2 effect-1">
                    <h4>捷瑞</h4>
                </div>
            </div>
            <div class="col-md-3 about-grid">
                <div class="about-grid-info about-grid-info3 effect-1">
                    <h4>奇才</h4>
                </div>
            </div>
            <div class="clearfix"> </div>
        </div>
    </div>
</div>
<div class="offer">
    <div class="container">
        <div class="wthree-offer-grid">
            <h4>活动专栏</h4>
            <p>这里有很多适合狗狗的活动，诚邀您的加入</p>
            <div class="click-button">
                <a href="<%= basePath%>selectActivity.action">进去看看</a>
            </div>
        </div>
    </div>
</div>
<!-- //offer -->
<!-- news -->
<div class="news">
    <div class="container">
        <div class="news-heading">
            <h3>关于我们的场地</h3>
        </div>
        <div class="news-grids">
            <div class="col-md-4 news-grid">
                <div class="agile-news-grid-info">
                    <div class="news-grid-info-img">
                        <a href="activity_area1.html"><img src="images/activity_images/n1.jpg" alt="" /></a>
                    </div>
                    <div class="news-grid-info-bottom">
                        <div class="date-grid">
                            <div class="admin">
                                <a href="#"><i class="fa fa-user" aria-hidden="true"></i>场地负责人：罗凯</a>
                            </div>
                            <div class="clearfix"> </div>
                        </div>
                        <div class="news-grid-info-bottom-text">
                            <a href="activity_area1.html">崇明岛狗狗乐园</a>
                            <p>地处长江三角洲的冲积岛屿，景色宜人</p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-4 news-grid">
                <div class="agile-news-grid-info">
                    <div class="news-grid-info-img">
                        <a href="activity_area2.html"><img src="images/activity_images/n2.jpg" alt="" /></a>
                    </div>
                    <div class="news-grid-info-bottom">
                        <div class="date-grid">
                            <div class="admin">
                                <a href="#"><i class="fa fa-user" aria-hidden="true"></i> 场地负责人：李建</a>
                            </div>
                            <div class="clearfix"> </div>
                        </div>
                        <div class="news-grid-info-bottom-text">
                            <a href="activity_area2.html">独墅湖狗狗乐园</a>
                            <p>这里场地宽广辽阔，也是乐园场地中最大的一所</p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-4 news-grid">
                <div class="agile-news-grid-info">
                    <div class="news-grid-info-img">
                        <a href="activity_area3.html"><img src="images/activity_images/n3.jpg" alt="" /></a>
                    </div>
                    <div class="news-grid-info-bottom">
                        <div class="date-grid">
                            <div class="admin">
                                <a href="#"><i class="fa fa-user" aria-hidden="true"></i> 场地负责人：刘平伟</a>
                            </div>
                            <div class="clearfix"> </div>
                        </div>
                        <div class="news-grid-info-bottom-text">
                            <a href="activity_area3.html">太湖之光狗狗乐园</a>
                            <p>气候湿润，场地辽阔</p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="clearfix"> </div>
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
<script src="<%= basePath%>js/activity_js/SmoothScroll.min.js"></script>
</body>
</html>
