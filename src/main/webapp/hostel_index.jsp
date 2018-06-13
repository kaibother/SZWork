<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <!-- TITLE -->
    <title>狗狗旅店</title>

    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="format-detection" content="telephone=no">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <link rel="shortcut icon" href="images/hostel_images/favicon.png">

    <!-- GOOGLE FONT -->
    <link href='http://fonts.googleapis.com/css?family=Hind:400,300,500,600%7cMontserrat:400,700' rel='stylesheet' type='text/css'>

    <!-- CSS LIBRARY -->
    <link rel="stylesheet" type="text/css" href="css/hostel_css/lib/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="css/hostel_css/lib/font-lotusicon.css">
    <link rel="stylesheet" type="text/css" href="css/hostel_css/lib/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/hostel_css/lib/owl.carousel.css">
    <link rel="stylesheet" type="text/css" href="css/hostel_css/lib/jquery-ui.min.css">
    <link rel="stylesheet" type="text/css" href="css/hostel_css/lib/magnific-popup.css">
    <link rel="stylesheet" type="text/css" href="css/hostel_css/lib/settings.css">
    <link rel="stylesheet" type="text/css" href="css/hostel_css/lib/bootstrap-select.min.css">

    <!-- MAIN STYLE -->
    <link rel="stylesheet" type="text/css" href="css/hostel_css/style.css">

    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script>
    <![endif]-->
</head>
<!--[if IE 7]> <body class="ie7 lt-ie8 lt-ie9 lt-ie10"> <![endif]-->
<!--[if IE 8]> <body class="ie8 lt-ie9 lt-ie10"> <![endif]-->
<!--[if IE 9]> <body class="ie9 lt-ie10"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <body> <!--<![endif]-->

<!-- PRELOADER -->
<div id="preloader">
    <span class="preloader-dot"></span>
</div>
<!-- END / PRELOADER -->

<!-- PAGE WRAP -->
<div id="page-wrap">

    <!-- HEADER -->
    <header id="header">

        <!-- HEADER TOP -->
        <div class="header_top">
            <div class="container">
                <div class="header_left float-left">
                    <span><i class="lotus-icon-cloud"></i> 18 °C</span>
                    <span><i class="lotus-icon-location"></i> 225 Beach Street, Australian</span>
                    <span><i class="lotus-icon-phone"></i> 1-548-854-8898</span>
                </div>
                <div class="header_right float-right">

                        <span class="login-register">
                            <a href="#">Login</a>
                            <a href="#">register</a>
                        </span>
                </div>
            </div>
        </div>
        <!-- END / HEADER TOP -->

        <!-- HEADER LOGO & MENU -->
        <div class="header_content" id="header_content">

            <div class="container">
                <!-- HEADER LOGO -->
                <div class="header_logo">
                    <a href="#"><img src="images/hostel_images/logo-header.png" alt=""></a>
                </div>
                <!-- END / HEADER LOGO -->

                <!-- HEADER MENU -->
                <nav class="header_menu">
                    <ul class="menu">
                        <li><a href="hostel_index.jsp">旅店主页</a></li>
                        <li><a href="hostel_about.html">旅店介绍</a></li>
                        <li><a href="#">返回主页</a></li>
                    </ul>
                </nav>
                <!-- END / HEADER MENU -->


                <!-- END / MENU BAR -->

            </div>
        </div>
        <!-- END / HEADER LOGO & MENU -->

    </header>
    <!-- END / HEADER -->

    <!-- BANNER SLIDER -->
    <section class="section-slider">
        <h1 class="element-invisible">Slider</h1>
        <div id="slider-revolution">
            <ul>
                <li data-transition="fade">
                    <img src="images/hostel_images/slider/img-1.jpg" data-bgposition="left center" data-duration="14000" data-bgpositionend="right center" alt="">

                    <div class="tp-caption sft fadeout slider-caption-sub slider-caption-1" data-x="center" data-y="100" data-speed="700" data-start="1500" data-easing="easeOutBack">
                    </div>

                    <div class="tp-caption sft fadeout slider-caption-sub slider-caption-1" data-x="center" data-y="240" data-speed="700" data-start="1500" data-easing="easeOutBack">
                        欢迎来到
                    </div>

                    <div class="tp-caption sfb fadeout slider-caption slider-caption-sub-1" data-x="center" data-y="280" data-speed="700" data-easing="easeOutBack"  data-start="2000">狗狗旅店</div>

                    <a href="#" class="tp-caption sfb fadeout awe-btn awe-btn-12 awe-btn-slider" data-x="center" data-y="380" data-easing="easeOutBack" data-speed="700" data-start="2200">查看详情</a>
                </li>

                <li data-transition="fade">
                    <img src="images/hostel_images/slider/img-1.jpg" data-bgposition="left center" data-duration="14000" data-bgpositionend="right center" alt="">

                    <div class="tp-caption sft fadeout" data-x="center" data-y="195" data-speed="700" data-start="1300" data-easing="easeOutBack">
                        <img src="images/hostel_images/icon-slider-1.png" alt="">
                    </div>

                    <div class="tp-caption sft fadeout slider-caption-sub slider-caption-sub-3" data-x="center" data-y="220" data-speed="700" data-start="1500" data-easing="easeOutBack">
                        狗狗旅店
                    </div>

                    <div class="tp-caption sfb fadeout slider-caption slider-caption-3" data-x="center" data-y="260" data-speed="700" data-easing="easeOutBack"  data-start="2000">
                        温馨舒适
                    </div>

                    <div class="tp-caption sfb fadeout slider-caption-sub slider-caption-sub-3" data-x="center" data-y="365" data-easing="easeOutBack" data-speed="700" data-start="2200">只为狗狗</div>

                    <div class="tp-caption sfb fadeout slider-caption-sub slider-caption-sub-3" data-x="center" data-y="395" data-easing="easeOutBack" data-speed="700" data-start="2400"><img src="images/hostel_images/icon-slider-2.png" alt=""></div>
                </li>

            </ul>
        </div>

    </section>
    <!-- END / BANNER SLIDER -->

    <!-- CHECK AVAILABILITY -->
    <section class="section-check-availability">
        <div class="container">
            <div class="check-availability">
                <div class="row">
                    <div class="col-lg-3">
                        <h2>快速旅店预定</h2>
                    </div>
                    <div class="col-lg-9">
                        <form id="ajax-form-search-room" action="search_step_2.php" method="post">
                            <div class="availability-form">
                                <input type="text" name="arrive" class="awe-calendar from" placeholder="入住日期">
                                <input type="text" name="departure" class="awe-calendar to" placeholder="离开日期">

                                <select class="awe-select" name="dog">
                                    <option>狗狗</option>
                                    <option>旺财</option>
                                    <option>奇才</option>
                                    <option>布鲁托</option>
                                </select>
                                <select class="awe-select" name="doghouse">
                                    <c:forEach items="${doghouselist}" var="doghouse">
                                    <option value="${doghouse.dogHouseGrade.doghousegradeid}">${doghouse.doghousename}</option>
                                    </c:forEach>
                                </select>
                                <div class="vailability-submit">
                                    <button class="awe-btn awe-btn-13">提交</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- END / CHECK AVAILABILITY -->

    <!-- ACCOMD ODATIONS -->
    <section class="section-accomd awe-parallax bg-14">
        <div class="container">
            <div class="accomd-modations">
                <div class="row">
                    <div class="col-md-12">
                        <div class="accomd-modations-header">
                            <h2 class="heading">狗狗房间</h2>
                            <img src="images/hostel_images/icon-accmod.png" alt="icon">
                            <p>各种样式的狗狗房屋，只为让狗狗更舒适</p>
                        </div>
                    </div>
                    <div class="col-md-12">
                        <div class="accomd-modations-content owl-single">

                            <div class="row">

                                <!-- ITEM -->
                            <c:forEach items="${doghouselist}" var="doghouse" begin="0" end="5" varStatus="varStatus">
                                <form method="get" action="<%=basePath%>selectHostelDetail.action">
                                    <input type="hidden" value="${doghouse.doghouseid}" name="doghouseid"/>
                                <div class="col-xs-4">
                                    <div class="accomd-modations-room">
                                        <div class="img">
                                            <a href="javascript:void(0)"><img src="<%=basePath%>${doghouse.doghousepic}" alt=""></a>
                                        </div>
                                            <div class="text">
                                            <h2><a href="javascript:void(0)">${doghouse.doghousename}</a></h2>
                                            <p class="price">
                                                <span class="amout">￥${doghouse.dogHouseGrade.doghouseprice}</span>/天
                                            </p>
                                                <button type="submit" style="margin-left: 15%" class="btn btn-default">查看</button>
                                        </div>
                                    </div>
                                </div>
                                </form>
                            </c:forEach>
                                <!-- END / ITEM -->
                            </div>
                            <div class="row">

                                <!-- ITEM -->
                                <c:forEach items="${doghouselist}" var="doghouse" begin="6" end="11" varStatus="varStatus">
                                    <form action="<%=basePath%>selectHostelDetail.action"  method="get">
                                        <input type="hidden" value="${doghouse.doghouseid}" name="doghouseid"/>
                                    <div class="col-xs-4">
                                        <div class="accomd-modations-room">
                                            <div class="img">
                                                <a href="javascript:void (0)"><img src="<%=basePath%>${doghouse.doghousepic}" alt=""></a>
                                            </div>
                                            <div class="text">
                                                <h2><a href="javascript:void(0)">${doghouse.doghousename}</a></h2>
                                                <p class="price">
                                                    <span class="amout">￥${doghouse.dogHouseGrade.doghouseprice}</span>/天
                                                </p>
                                                <button type="submit" style="margin-left: 15%" class="btn btn-default">查看</button>
                                            </div>
                                        </div>
                                    </div>
                                    </form>
                                </c:forEach>
                                <!-- END / ITEM -->
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>
</section>
<!-- END / ACCOMD ODATIONS -->





<!-- HOME GUEST BOOK -->
<div class="section-home-guestbook awe-parallax bg-2">
    <div class="container">
        <div class="home-guestbook">
            <div class="row">
                <div class="col-md-12 col-lg-12">
                    <div class="guestbook-content owl-single">

                        <!-- ITEM -->
                        <div class="guestbook-item">
                            <div class="img">
                                <img src="images/hostel_images/avatar/img-6.jpg" alt="">
                            </div>

                            <div class="text">
                                <p>在这家店里，我的狗狗睡得特别舒服，狗狗很喜欢这里的环境，以后常来</p>
                                <span><strong>罗志祥</strong></span><br>
                                <span>中国，china</span>
                            </div>
                        </div>
                        <!-- ITEM -->

                        <!-- ITEM -->
                        <div class="guestbook-item">
                            <div class="img">
                                <img src="images/hostel_images/avatar/img-5.jpg" alt="">
                            </div>

                            <div class="text">
                                <p>在这家店里，我的狗狗睡得特别舒服，狗狗很喜欢这里的环境，以后常来</p>
                                <span><strong>王力宏</strong></span><br>
                                <span>美国，US</span>
                            </div>
                        </div>
                        <!-- ITEM -->

                    </div>
                </div>
            </div>

        </div>
    </div>

</div>
<!-- END / HOME GUEST BOOK -->
<!-- OUR BEST -->
<section class="section-our-best bg-white">
    <div class="container">

        <div class="our-best">
            <div class="row">

                <div class="col-md-6 col-md-push-6">
                    <div class="img">
                        <img src="images/hostel_images/home/ourbest/img-1.jpg" alt="">
                    </div>
                </div>

                <div class="col-md-6 col-md-pull-6 ">
                    <div class="text">
                        <h2 class="heading">为什么选择我们</h2>
                        <p>我们致力于满足狗狗的各种服务，狗狗的舒适是我们前进的动力，一个网站只做一件事</p>
                        <ul>
                            <li><img src="images/hostel_images/home/ourbest/icon-3.png" alt="icon">五星级狗狗旅店</li>
                            <li><img src="images/hostel_images/home/ourbest/icon-4.png" alt="icon">双螺旋狗狗浴缸</li>
                            <li><img src="images/hostel_images/home/ourbest/icon-1.png" alt="icon">特可口狗狗口粮</li>
                            <li><img src="images/hostel_images/home/ourbest/icon-6.png" alt="icon">优越的地理环境</li>
                        </ul>
                    </div>
                </div>

            </div>
        </div>

    </div>
</section>
<!-- END / OUR BEST -->




<!-- FOOTER -->
<footer id="footer">

    <!-- FOOTER TOP -->
    <div class="footer_top">
        <div class="container">
            <div class="row">

                <!-- WIDGET MAILCHIMP -->
                <div class="col-lg-9">
                    <div class="mailchimp">
                        <h4>News &amp; Offers</h4>
                        <div class="mailchimp-form">
                            <form action="#" method="POST">
                                <input type="text" name="email" placeholder="Your email address" class="input-text">
                                <button class="awe-btn">SIGN UP</button>
                            </form>
                        </div>
                    </div>
                </div>
                <!-- END / WIDGET MAILCHIMP -->

                <!-- WIDGET SOCIAL -->
                <div class="col-lg-3">
                    <div class="social">
                        <div class="social-content">
                            <a href="#"><i class="fa fa-pinterest"></i></a>
                            <a href="#"><i class="fa fa-facebook"></i></a>
                            <a href="#"><i class="fa fa-twitter"></i></a>
                            <a href="#"><i class="fa fa-google-plus"></i></a>
                            <a href="#"><i class="fa fa-instagram"></i></a>
                        </div>
                    </div>
                </div>
                <!-- END / WIDGET SOCIAL -->

            </div>
        </div>
    </div>
    <!-- END / FOOTER TOP -->

    <!-- FOOTER CENTER -->
    <div class="footer_center">
        <div class="container">
            <div class="row">

                <div class="col-xs-12 col-lg-5">
                    <div class="widget widget_logo">
                        <div class="widget-logo">
                            <div class="img">
                                <a href="#"><img src="images/hostel_images/logo-footer.png" alt=""></a>
                            </div>
                            <div class="text">
                                <p><i class="lotus-icon-location"></i> 225 Beach Street, Australian</p>
                                <p><i class="lotus-icon-phone"></i> 1-548-854-8898</p>
                                <p><i class="fa fa-envelope-o"></i> <a href="mailto:hello@thelotushotel.com">hello@thelotushotel.com</a></p>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-xs-4 col-lg-2">
                    <div class="widget">
                        <h4 class="widget-title">Page site</h4>
                        <ul>
                            <li><a href="#">Guest Book</a></li>
                            <li><a href="#">Gallery</a></li>
                            <li><a href="#">Restaurant</a></li>
                            <li><a href="#">Event</a></li>
                        </ul>
                    </div>
                </div>

                <div class="col-xs-4 col-lg-2">
                    <div class="widget">
                        <h4 class="widget-title">ABOUT</h4>
                        <ul>
                            <li><a href="">About</a></li>
                            <li><a href="">Blog</a></li>
                            <li><a href="">Contact Us</a></li>
                            <li><a href="">Comming Soon</a></li>
                        </ul>
                    </div>
                </div>

                <div class="col-xs-4 col-lg-3">
                    <div class="widget widget_tripadvisor">
                        <h4 class="widget-title">Tripadvisor</h4>
                        <div class="tripadvisor">
                            <p>Now with hotel reviews by</p>
                            <img src="images/hostel_images/tripadvisor.png" alt="">
                            <span class="tripadvisor-circle">
                                        <i></i>
                                        <i></i>
                                        <i></i>
                                        <i></i>
                                        <i class="part"></i>
                                    </span>
                        </div>
                    </div>
                </div>


            </div>
        </div>
    </div>
    <!-- END / FOOTER CENTER -->

    <!-- FOOTER BOTTOM -->
    <div class="footer_bottom">
        <div class="container">
            <p>Copyright &copy; 2018.Company name All rights reserved.<a target="_blank" href="http://sc.chinaz.com/moban/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>
        </div>
    </div>
    <!-- END / FOOTER BOTTOM -->

</footer>
<!-- END / FOOTER -->

</div>
<!-- END / PAGE WRAP -->


<!-- LOAD JQUERY -->
<script type="text/javascript" src="js/hostel_js/lib/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="js/hostel_js/lib/jquery-ui.min.js"></script>
<script type="text/javascript" src="js/hostel_js/lib/bootstrap.min.js"></script>
<script type="text/javascript" src="js/hostel_js/lib/bootstrap-select.js"></script>
<!---<script src="http://ditu.google.cn/maps/api/js?v=3.exp&amp;signed_in=true"></script>--->
<script type="text/javascript" src="js/hostel_js/lib/isotope.pkgd.min.js"></script>
<script type="text/javascript" src="js/hostel_js/lib/jquery.themepunch.revolution.min.js"></script>
<script type="text/javascript" src="js/hostel_js/lib/jquery.themepunch.tools.min.js"></script>
<script type="text/javascript" src="js/hostel_js/lib/owl.carousel.js"></script>
<script type="text/javascript" src="js/hostel_js/lib/jquery.appear.min.js"></script>
<script type="text/javascript" src="js/hostel_js/lib/jquery.countTo.js"></script>
<script type="text/javascript" src="js/hostel_js/lib/jquery.countdown.min.js"></script>
<script type="text/javascript" src="js/hostel_js/lib/jquery.parallax-1.1.3.js"></script>
<script type="text/javascript" src="js/hostel_js/lib/jquery.magnific-popup.min.js"></script>
<script type="text/javascript" src="js/hostel_js/lib/SmoothScroll.js"></script>
<!-- validate -->
<script type="text/javascript" src="js/hostel_js/lib/jquery.form.min.js"></script>
<script type="text/javascript" src="js/hostel_js/lib/jquery.validate.min.js"></script>
<!-- Custom jQuery -->
<script type="text/javascript" src="js/hostel_js/scripts.js"></script>
</body>
</html>
