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
    <title>房屋详情</title>

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
    <link href="css/hostel_css/cloud-zoom.css"  rel="stylesheet" type="text/css">
    <link href="css/hostel_css/main.css"  rel="stylesheet" type="text/css">
    <script src="js/hostel_js/jquery.js" type="text/javascript"></script>
    <script src="js/hostel_js/cloud-zoom.1.0.2.min.js" type="text/javascript"></script>
    <style type="text/css">
        .container .text2{
            float:left;
            margin-left:200px;
            margin-top:-240px;
            line-height:31px;
        }
        .container .text2 ul{
            list-style:none;
            padding-top:85px;
        }
        .container .text2 ul li{
            margin:4px;
        }
    </style>
    <script>
        function select(doghousegradeid) {
            //去数据库查询 用户名是否在数据库里存在    ajax,异步处理
            $.ajax(
                {
                    type:"post",
//                     请求的url
                    url:"${pageContext.request.contextPath}/selectHostelDetailMoney.action",
//                      参数
                    data:"doghousegradeid="+doghousegradeid,
                    success:function (money) {
                            $("#vailability-submit").html(""+money);

                    }
                }
            );
        }

    </script>
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
                        <li><a href="hostel_index.html">旅店主页</a></li>
                        <li><a href="hostel_about.html">旅店介绍</a></li>
                        <li><a href="#">返回主页</a></li>
                    </ul>
                </nav>
                <!-- END / HEADER MENU -->

                <!-- MENU BAR -->
                <span class="menu-bars">
                        <span></span>
                    </span>
                <!-- END / MENU BAR -->

            </div>
        </div>
        <!-- END / HEADER LOGO & MENU -->

    </header>
    <!-- END / HEADER -->

    <!-- SUB BANNER -->
    <section class="section-sub-banner bg-1">
        <div class="sub-banner">
            <div class="container">
                <div class="text text-center">
                    <h2>房屋详情</h2>
                    <p>每只狗狗都应该拥有一个好的睡眠</p>
                </div>
            </div>

        </div>

    </section>
    <!-- END / SUB BANNER -->
    <section class="section-restaurant-1 bg-white">
        <div class="container">
            <div class="restaurant_content">

                <!-- HEADING -->
                <div class="restaurant_title text-center">
                    <h2 class="heading">${doghouse.doghousename}</h2><br/>
                </div>
                <!-- END / HEADING -->
                <a class="cloud-zoom" id="zoom1" href="<%=basePath%>${doghouse.doghousebig}" rel="adjustX: 10, adjustY:-4, softFocus:true">
                    <img src="<%=basePath%>${doghouse.doghouseimg}" title="${doghouse.doghousename}" alt="" />
                </a>
                <br/>
                <a href='<%=basePath%>${doghouse.doghousebig}' class='cloud-zoom-gallery' title='Thumbnail 1' rel="useZoom: 'zoom1', smallImage: '<%=basePath%>${doghouse.doghouseimg}' ">
                    <img src="<%=basePath%>${doghouse.doghousetiny}" alt = "Thumbnail 1"/>
                </a>
            </div>

        </div>
    </section>
    <!-- CONTACT -->
    <section class="section-contact">
        <div class="container">
            <div class="contact">
                <div class="row">
                    <div class="col-md-6 col-lg-5">
                        <div class="text">
                            <h2>小屋详情</h2>
                            <p>${doghouse.doghousename}特别温馨</p>
                            <form id="ajax-form-search-room" action="search_step_2.php" method="post">
                                <ul>
                                    <li>房屋户型：1室</li>
                                    <li>建筑面积：1平方米</li>
                                    <li>建筑类型：木房</li>
                                    <li>户型结构：平层</li>
                                    <li></li>
                                </ul>
                            </form>
                        </div>

                        <div class="text2">

                            <form id="ajax-form-search-room1" action="search_step_2.php" method="post">
                                <ul>
                                    <li>装修情况：精装</li>
                                    <li>供暖方式：集中供暖</li>
                                    <li>产权年限：70年</li>
                                    <li>房屋年限：未满两年</li>
                                    <li></li>
                                </ul>
                            </form>
                        </div>
                    </div>

                    <div class="col-md-6 col-lg-6 col-lg-offset-1">
                        <div class="text">
                            <h2>小屋详情</h2>
                            <form id="ajax-form-search-room" action="search_step_2.php" method="post">
                                <ul>
                                    <li><input type="text" name="arrive" class="awe-calendar from" placeholder="入住日期"></li>
                                    <li><input type="text" name="departure" class="awe-calendar to" placeholder="离开日期"></li>
                                    <li><select class="form-control" style="width: 45%;border: solid 1px"  name="dog">
                                        <option>狗狗</option>
                                        <option>旺财</option>
                                        <option>奇才</option>
                                        <option>布鲁托</option>
                                    </select></li>
                                    <li><div class="vailability-submit">
                                        <button class="awe-btn awe-btn-13">提交</button>
                                    </div></li>
                                </ul>

                            </form>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </section>
    <!-- END / CONTACT -->

    <!-- MAP -->
    <section class="section-map">
        <h1 class="element-invisible">Map</h1>
        <div class="contact-map">
            <div id="map" data-locations="39.0926986,-94.5747324--39.0912284,-94.5743515" data-center="39.0926986,-94.5747324"></div>
        </div>
    </section>
    <!-- END / MAP -->

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
<script src="/maps.google.com/maps/api/js?key=AIzaSyAb2lfsiytHD7rMhBaAvJz2CKhk05uiIuE"></script>
<script src="http://ditu.google.cn/maps/api/js?v=3.exp&amp;signed_in=true"></script>
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
