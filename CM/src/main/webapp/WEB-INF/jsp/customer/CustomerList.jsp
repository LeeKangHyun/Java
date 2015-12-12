<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en-US" data-menu="">
<head>
<meta charset="UTF-8" />
<meta name="viewport"
  content="width=device-width, initial-scale=1, maximum-scale=1" />
<meta name="format-detection" content="telephone=no">
<link rel="profile" href="http://gmpg.org/xfn/11" />
<link rel="pingback"
  href="http://themes.themegoods2.com/grandrestaurant/xmlrpc.php" />
<link rel="shortcut icon"
  href="http://themes.themegoods2.com/grandrestaurant/wp-content/uploads/2015/06/TG-Thumb.png" />
<title>회원 목록</title>
<meta name='robots' content='noindex,follow' />
<link rel="alternate" type="application/rss+xml"
  title="Grand Restaurant | Restaurant Theme &raquo; Feed"
  href="http://themes.themegoods2.com/grandrestaurant/feed/" />
<link rel="alternate" type="application/rss+xml"
  title="Grand Restaurant | Restaurant Theme &raquo; Comments Feed"
  href="http://themes.themegoods2.com/grandrestaurant/comments/feed/" />
<link rel="alternate" type="application/rss+xml"
  title="Grand Restaurant | Restaurant Theme &raquo; Home 1 Comments Feed"
  href="http://themes.themegoods2.com/grandrestaurant/home1/feed/" />
<link rel='stylesheet' id='jquery.timepicker-css'
  href='http://themes.themegoods2.com/grandrestaurant/wp-content/themes/grandrestaurant/functions/jquery.timepicker.css'
  type='text/css' media='all' />
<link rel='stylesheet' id='datepicker-css'
  href='http://themes.themegoods2.com/grandrestaurant/wp-content/themes/grandrestaurant/css/datepicker.css'
  type='text/css' media='all' />
<link rel='stylesheet' id='rs-plugin-settings-css'
  href='http://themes.themegoods2.com/grandrestaurant/wp-content/plugins/revslider/rs-plugin/css/settings.css'
  type='text/css' media='all' />



<link rel='stylesheet' id='tp-kristi-css'
  href='http://fonts.googleapis.com/css?family=Kristi' type='text/css'
  media='all' />
<link rel='stylesheet' id='woocommerce-layout-css'
  href='//themes.themegoods2.com/grandrestaurant/wp-content/plugins/woocommerce/assets/css/woocommerce-layout.css'
  type='text/css' media='all' />
<link rel='stylesheet' id='woocommerce-smallscreen-css'
  href='//themes.themegoods2.com/grandrestaurant/wp-content/plugins/woocommerce/assets/css/woocommerce-smallscreen.css'
  type='text/css' media='only screen and (max-width: 768px)' />
<link rel='stylesheet' id='woocommerce-general-css'
  href='//themes.themegoods2.com/grandrestaurant/wp-content/plugins/woocommerce/assets/css/woocommerce.css'
  type='text/css' media='all' />
<link rel='stylesheet' id='combined_css-css'
  href='http://themes.themegoods2.com/grandrestaurant/wp-content/uploads/grand-restaurant/combined.css'
  type='text/css' media='all' />
<link rel='stylesheet' id='fontawesome-css'
  href='http://themes.themegoods2.com/grandrestaurant/wp-content/themes/grandrestaurant/css/font-awesome.min.css'
  type='text/css' media='all' />
<link rel='stylesheet' id='custom_css-css'
  href='http://themes.themegoods2.com/grandrestaurant/wp-content/themes/grandrestaurant/templates/custom-css.php'
  type='text/css' media='all' />
<link rel='stylesheet' id='google_font_default-css'
  href='http://fonts.googleapis.com/css?family=Playfair+Display%3A400%2C700%2C400italic&#038;subset=latin%2Ccyrillic-ext%2Cgreek-ext%2Ccyrillic'
  type='text/css' media='all' />
<link rel='stylesheet' id='google_font0-css'
  href='http://fonts.googleapis.com/css?family=Lato%3A100%2C200%2C300%2C400%2C600%2C700%2C800%2C900%2C400italic&#038;subset=latin%2Ccyrillic-ext%2Cgreek-ext%2Ccyrillic'
  type='text/css' media='all' />
<link rel='stylesheet' id='kirki-styles-css'
  href='http://themes.themegoods2.com/grandrestaurant/wp-content/themes/grandrestaurant/modules/kirki/assets/css/kirki-styles.css'
  type='text/css' media='all' />
<link rel='stylesheet' id='responsive-css'
  href='http://themes.themegoods2.com/grandrestaurant/wp-content/themes/grandrestaurant/templates/responsive-css.php'
  type='text/css' media='all' />
<script type='text/javascript'
  src='http://themes.themegoods2.com/grandrestaurant/wp-includes/js/jquery/jquery.js'></script>
<script type='text/javascript'
  src='http://themes.themegoods2.com/grandrestaurant/wp-includes/js/jquery/jquery-migrate.min.js'></script>
<script type='text/javascript'
  src='http://themes.themegoods2.com/grandrestaurant/wp-content/plugins/revslider/rs-plugin/js/jquery.themepunch.tools.min.js'></script>
<script type='text/javascript'
  src='http://themes.themegoods2.com/grandrestaurant/wp-content/plugins/revslider/rs-plugin/js/jquery.themepunch.revolution.min.js'></script>
<link rel="EditURI" type="application/rsd+xml" title="RSD"
  href="http://themes.themegoods2.com/grandrestaurant/xmlrpc.php?rsd" />
<link rel="wlwmanifest" type="application/wlwmanifest+xml"
  href="http://themes.themegoods2.com/grandrestaurant/wp-includes/wlwmanifest.xml" />
<meta name="generator" content="WordPress 4.2.5" />
<meta name="generator" content="WooCommerce 2.3.13" />
<link rel='canonical'
  href='http://themes.themegoods2.com/grandrestaurant/' />
<link rel='shortlink'
  href='http://themes.themegoods2.com/grandrestaurant/' />

<link rel="stylesheet"
  href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel='stylesheet' type="text/css" href="../css/memberInfo.css">
<link rel='stylesheet' type="text/css" href="../css/main.css">
<script
  src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../js/jquery.js"></script>
<script type="text/javascript" src="../js/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="../js/jquery-ui-1.8.23.custom.min.js"></script>
<script type="text/javascript" src="../js/jquery-migrate-1.2.1.min.js"></script>
<script
  src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>


</head>
<body class="home page page-id-2 page-template-default">
  <input type="hidden" id="pp_menu_layout" name="pp_menu_layout" />
  <input type="hidden" id="pp_enable_right_click"
    name="pp_enable_right_click" />
  <input type="hidden" id="pp_enable_dragging" name="pp_enable_dragging" />
  <input type="hidden" id="pp_image_path" name="pp_image_path"
    value="http://themes.themegoods2.com/grandrestaurant/wp-content/themes/grandrestaurant/images/" />
  <input type="hidden" id="pp_homepage_url" name="pp_homepage_url"
    value="http://themes.themegoods2.com/grandrestaurant" />
  <input type="hidden" id="pp_ajax_search" name="pp_ajax_search"
    value="1" />
  <input type="hidden" id="pp_fixed_menu" name="pp_fixed_menu" value="1" />
  <input type="hidden" id="pp_topbar" name="pp_topbar" value="1" />
  <input type="hidden" id="post_client_column" name="post_client_column"
    value="4" />
  <input type="hidden" id="pp_back" name="pp_back" value="Back" />
  <input type="hidden" id="pp_page_title_img_blur"
    name="pp_page_title_img_blur" value="1" />
  <input type="hidden" id="tg_project_filterable_link"
    name="tg_project_filterable_link" />
  <input type="hidden" id="pp_footer_style" name="pp_footer_style"
    value="4" />

  <div class="mobile_menu_wrapper">
    <a id="close_mobile_menu" href="javascript:;"><i
      class="fa fa-close"></i></a>
    <form role="search" method="get" name="searchform" id="searchform"
      action="http://themes.themegoods2.com/grandrestaurant/">
      <div>
        <input type="text" name="s" id="s" autocomplete="off"
          placeholder="Search..." />
        <button>
          <i class="fa fa-search"></i>
        </button>
      </div>
      <div id="autocomplete"></div>
    </form>
    <div class="menu-side-menu-container">
      <ul id="mobile_main_menu" class="mobile_main_nav">
        <li id="menu-item-2885"
          class="menu-item menu-item-type-custom menu-item-object-custom current-menu-item current_page_item menu-item-home current-menu-ancestor current-menu-parent menu-item-has-children menu-item-2885"><a
          href="#">Menu1</a>
          <ul class="sub-menu">
            <li id="menu-item-3247"
              class="menu-item menu-item-type-post_type menu-item-object-page current-menu-item page_item page-item-2 current_page_item menu-item-3247"><a
              href="#">Menu0101</a></li>
            <li id="menu-item-3956"
              class="menu-item menu-item-type-post_type menu-item-object-page menu-item-3956"><a
              href="#">Menu0102</a></li>
            <li id="menu-item-3955"
              class="menu-item menu-item-type-post_type menu-item-object-page menu-item-3955"><a
              href="#">Menu0103</a></li>
            <li id="menu-item-3957"
              class="menu-item menu-item-type-post_type menu-item-object-page menu-item-3957"><a
              href="#">Menu0104</a></li>
          </ul></li>
        <li id="menu-item-3351"
          class="menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-3351"><a
          href="#">Menu2</a>
          <ul class="sub-menu">
            <li id="menu-item-3342"
              class="menu-item menu-item-type-post_type menu-item-object-page menu-item-3342"><a
              href="#">Menu0201</a></li>
            <li id="menu-item-3252"
              class="menu-item menu-item-type-post_type menu-item-object-page menu-item-3252"><a
              href="#">Menu0202</a></li>
            <li id="menu-item-3294"
              class="menu-item menu-item-type-post_type menu-item-object-page menu-item-3294"><a
              href="#">Menu0203</a></li>
            <li id="menu-item-3322"
              class="menu-item menu-item-type-post_type menu-item-object-page menu-item-3322"><a
              href="#">Menu0204</a></li>
          </ul></li>
        <li id="menu-item-3962"
          class="menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-3962"><a
          href="#">Menu3</a>
          <ul class="sub-menu">
            <li id="menu-item-3958"
              class="menu-item menu-item-type-post_type menu-item-object-page menu-item-3958"><a
              href="#">Menu0301</a></li>
            <li id="menu-item-3959"
              class="menu-item menu-item-type-post_type menu-item-object-page menu-item-3959"><a
              href="#">Menu0302</a></li>
            <li id="menu-item-3960"
              class="menu-item menu-item-type-post_type menu-item-object-page menu-item-3960"><a
              href="#">Menu0303</a></li>
          </ul></li>

      </ul>


    </div>
    <a href="javascript:;" id="tg_sidemenu_reservation" class="button">Reservation</a>
    <div class="page_content_wrapper">
      <div class="sidebar_wrapper">
        <div class="sidebar">
          <div class="content">
            <ul class="sidebar_widget">
              <li id="custom_flickr-7" class="widget Custom_Flickr"><h2
                  class="widgettitle">Gallery On Flickr</h2>
                <ul class="flickr">
                  <li><a class="img_frame" target="_blank"
                    href="http://farm6.staticflickr.com/5807/22911138319_bb5503efeb_b.jpg"
                    title="rosemary and garlic butter biscuits"><img
                      src="http://farm6.staticflickr.com/5807/22911138319_bb5503efeb_s.jpg"
                      alt="rosemary and garlic butter biscuits" width="75"
                      height="75" /></a></li>
                  <li><a class="img_frame" target="_blank"
                    href="http://farm6.staticflickr.com/5682/22344147714_3e0565bec3_b.jpg"
                    title="the glass roof of Kogod cpurtyard at Smithsonian American Art Museum and the National Portrait Gallery"><img
                      src="http://farm6.staticflickr.com/5682/22344147714_3e0565bec3_s.jpg"
                      alt="the glass roof of Kogod cpurtyard at Smithsonian American Art Museum and the National Portrait Gallery"
                      width="75" height="75" /></a></li>
                  <li><a class="img_frame" target="_blank"
                    href="http://farm1.staticflickr.com/648/22785534545_5077980b76_b.jpg"
                    title="The West Concourse of Santiago Calatrava&#039;s PATH station at the World Trade Center"><img
                      src="http://farm1.staticflickr.com/648/22785534545_5077980b76_s.jpg"
                      alt="The West Concourse of Santiago Calatrava&#039;s PATH station at the World Trade Center"
                      width="75" height="75" /></a></li>
                  <li><a class="img_frame" target="_blank"
                    href="http://farm1.staticflickr.com/563/22140299986_aee823181a_b.jpg"
                    title="wild"><img
                      src="http://farm1.staticflickr.com/563/22140299986_aee823181a_s.jpg"
                      alt="wild" width="75" height="75" /></a></li>
                  <li><a class="img_frame" target="_blank"
                    href="http://farm6.staticflickr.com/5810/21665302921_841d9052d0_b.jpg"
                    title="rainy day baking- blueberry cake"><img
                      src="http://farm6.staticflickr.com/5810/21665302921_841d9052d0_s.jpg"
                      alt="rainy day baking- blueberry cake" width="75" height="75" /></a></li>
                  <li><a class="img_frame" target="_blank"
                    href="http://farm1.staticflickr.com/757/21255035669_cb44244cfe_b.jpg"
                    title="a little gathering"><img
                      src="http://farm1.staticflickr.com/757/21255035669_cb44244cfe_s.jpg"
                      alt="a little gathering" width="75" height="75" /></a></li>
                  <li><a class="img_frame" target="_blank"
                    href="http://farm1.staticflickr.com/383/20132796029_06ea5cbc84_b.jpg"
                    title="a morning like this"><img
                      src="http://farm1.staticflickr.com/383/20132796029_06ea5cbc84_s.jpg"
                      alt="a morning like this" width="75" height="75" /></a></li>
                  <li><a class="img_frame" target="_blank"
                    href="http://farm1.staticflickr.com/275/19929405628_f6cdd4f54c_b.jpg"
                    title="on the table"><img
                      src="http://farm1.staticflickr.com/275/19929405628_f6cdd4f54c_s.jpg"
                      alt="on the table" width="75" height="75" /></a></li>
                </ul> <br class="clear" /></li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div id="wrapper" class="hasbg">
    <div class="header_style_wrapper">
      <div class="above_top_bar">
        <div class="page_content_wrapper">

          <div class="menu-top-menu-container">
            <ul id="top_menu" class="top_nav">
              <c:if test="${not empty loginUser}">
                <li id="menu-item-3998"
                  class="menu-item menu-item-type-post_type menu-item-object-page menu-item-3998">
                  ${loginUser.name}님 <a
                  href="${pageContext.request.contextPath}/auth/logout.do">로그아웃</a>
                </li>
              </c:if>
              <c:if test="${empty loginUser}">
                <li id="menu-item-4001"
                  class="menu-item menu-item-type-post_type menu-item-object-page menu-item-4001"><a
                  href="../auth/login.do">로그인</a></li>
                <li id="menu-item-4000"
                  class="menu-item menu-item-type-custom menu-item-object-custom menu-item-4000"><a
                  href="../customer/add.do">회원가입</a></li>
              </c:if>
            </ul>
          </div>
          <div class="extend_top_contact_info top_contact_info"></div>
        </div>
      </div>
      <div class="top_bar hasbg">
        <div id="menu_wrapper">
          <div id="logo_transparent" class="logo_container">
            <div class="logo_align">
              <a id="custom_logo_transparent" class="logo_wrapper default"
                href="../customer/list.do"> <img
                src="http://themes.themegoods2.com/grandrestaurant/wp-content/uploads/2015/06/logo@2x_white.png"
                alt="Grand Restaurant | Restaurant Theme" width="101"
                height="34" style="width: 101px; height: 34px;" />
              </a>
            </div>
          </div>
          <div class="menu_buttons_container">
            <div class="menu_buttons_content">
              <a href="javascript:;" id="tg_reservation" class="button">Reservation</a>
              <a href="#" id="mobile_nav_icon"></a>
            </div>
          </div>
          <div id="nav_wrapper">
            <div class="nav_wrapper_inner">
              <div id="menu_border_wrapper">
                <div class="menu-main-menu-container">
                  <ul id="main_menu" class="nav">
                    <li id="menu-item-2773"
                      class="menu-item menu-item-type-custom menu-item-object-custom current-menu-item current_page_item menu-item-home current-menu-ancestor current-menu-parent menu-item-has-children arrow menu-item-2773"><a
                      href="#">M</a>
                      <ul class="sub-menu">
                        <li id="menu-item-3282"
                          class="menu-item menu-item-type-post_type menu-item-object-page current-menu-item page_item page-item-2 current_page_item menu-item-3282"><a
                          href="#">Menu0101</a></li>
                        <li id="menu-item-3896"
                          class="menu-item menu-item-type-post_type menu-item-object-page menu-item-3896"><a
                          href="#">Menu0102</a></li>
                        <li id="menu-item-3912"
                          class="menu-item menu-item-type-post_type menu-item-object-page menu-item-3912"><a
                          href="#">Menu0103</a></li>
                        <li id="menu-item-3916"
                          class="menu-item menu-item-type-post_type menu-item-object-page menu-item-3916"><a
                          target="_blank" href="#">Menu0104</a></li>

                      </ul></li>
                    <li id="menu-item-3350"
                      class="menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children arrow menu-item-3350"><a
                      href="#">Menu2</a>
                      <ul class="sub-menu">
                        <li id="menu-item-3341"
                          class="menu-item menu-item-type-post_type menu-item-object-page menu-item-3341"><a
                          href="#">Menu0201</a></li>
                        <li id="menu-item-3281"
                          class="menu-item menu-item-type-post_type menu-item-object-page menu-item-3281"><a
                          href="#">Menu0202</a></li>
                        <li id="menu-item-3293"
                          class="menu-item menu-item-type-post_type menu-item-object-page menu-item-3293"><a
                          href="#">Menu0203</a></li>
                        <li id="menu-item-3321"
                          class="menu-item menu-item-type-post_type menu-item-object-page menu-item-3321"><a
                          href="#">Menu0204</a></li>

                      </ul></li>

                    <li id="menu-item-3852"
                      class="menu-item menu-item-type-post_type menu-item-object-page menu-item-3852"><a
                      href="#">Menu3</a>
                      <ul class="sub-menu">
                        <li id="menu-item-2827"
                          class="menu-item menu-item-type-post_type menu-item-object-page menu-item-2827"><a
                          href="#">Menu0301</a></li>
                        <li id="menu-item-2831"
                          class="menu-item menu-item-type-post_type menu-item-object-page menu-item-2831"><a
                          href="#">Menu0302</a></li>
                        <li id="menu-item-2838"
                          class="menu-item menu-item-type-post_type menu-item-object-page menu-item-2838"><a
                          href="#">Menu0303</a></li>
                        <li id="menu-item-2842"
                          class="menu-item menu-item-type-post_type menu-item-object-page menu-item-2842"><a
                          href="#">Menu0304</a></li>

                      </ul></li>

                    <li id="menu-item-2817"
                      class="menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children arrow menu-item-2817"><a
                      href="#">Menu4</a>
                      <ul class="sub-menu">
                        <li id="menu-item-2827"
                          class="menu-item menu-item-type-post_type menu-item-object-page menu-item-2827"><a
                          href="#">Menu0401</a></li>
                        <li id="menu-item-2831"
                          class="menu-item menu-item-type-post_type menu-item-object-page menu-item-2831"><a
                          href="#">Menu0402</a></li>
                        <li id="menu-item-2838"
                          class="menu-item menu-item-type-post_type menu-item-object-page menu-item-2838"><a
                          href="#">Menu0403</a></li>
                        <li id="menu-item-2842"
                          class="menu-item menu-item-type-post_type menu-item-object-page menu-item-2842"><a
                          href="#">Menu0404</a></li>

                      </ul></li>

                  </ul>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>


      <div class="info">

        <div id="page_caption">
          <div class="page_title_wrapper">
            <div class="page_title_inner">
              <h1>Member List</h1>
            </div>
            <br class="clear">
          </div>
        </div>

      </div>

      <div id="container">
        <div
          class="xans-element- xans-board xans-board-listpackage-4 xans-board-listpackage xans-board-4 "
          style="padding-left: 400px;">
          <div
            class="xans-element- xans-board xans-board-title-4 xans-board-title xans-board-4 ">
            <div class="path"></div>
            <div class="title">
              <h2>
                <font color="#2e2e2e">회원 목록</font>
              </h2>

            </div>
          </div>
          <div class="boardSort">
            <span
              class="xans-element- xans-board xans-board-replysort-4 xans-board-replysort xans-board-4 "></span>
          </div>
          <div class="boardList">
            <table border="1" summary="">
              <colgroup
                class="xans-element- xans-board xans-board-listheader-4 xans-board-listheader xans-board-4 ">
                <col style="width: auto;">
                <col style="width: auto;">
                <col style="width: auto;">
                <col style="width: auto;">
                <col style="width: auto;">
                <col style="width: 80px;" class="">
                <col style="width: 55px;" class="">
                <col style="width: 55px;" class="displaynone">
                <col style="width: 80px;" class="displaynone">
              </colgroup>
              <thead
                class="xans-element- xans-board xans-board-listheader-4 xans-board-listheader xans-board-4 ">
                <tr style="">
                  <th scope="col">id</th>
                  <th scope="col">이름</th>
                  <th scope="col">성별</th>
                  <th scope="col">나이</th>
                  <th scope="col">사는곳</th>
                </tr>
              </thead>
              <tbody
                class="xans-element- xans-board xans-board-list-4 xans-board-list xans-board-4">
                <c:forEach var="customer" items="${customers}">
                <tr style="background-color: #FFFFFF; color: #555555;"
                  class="xans-record-">
                  <td><a href="detail.do?id=${customer.id}">${customer.id}</a></td>
                  <td>${customer.name}</td>
                  <td>${customer.gender}</td>
                  <td>${customer.age}</td>
                  <td>${customer.address}</td>
                </tr>
                </c:forEach>
              </tbody>
            </table>
          </div>
          <div
            class="xans-element- xans-board xans-board-empty-4 xans-board-empty xans-board-4 boardListEmpty displaynone ">
            <p></p>
          </div>
        </div>




      </div>



      <div class="one"
        style="padding: 50px 0 70px 0 !important; position: relative; padding: 40px 0 40px 0;">
        <div class="standard_wrapper">
          <div class="page_content_wrapper"></div>
        </div>
      </div>




    </div>

  <div class="footer_bar ">

    <div class="footer_bar_wrapper ">
      <div id="copyright">© Copyright Couple Manager</div>
      <br class="clear" /> <a id="toTop"><img alt="up"
        src="../img/up.gif"></a>
    </div>
  </div>
  <div id="overlay_background"></div>

  <script type='text/javascript'>
    /* <![CDATA[ */
    var wc_add_to_cart_params = {
      "ajax_url" : "\/grandrestaurant\/wp-admin\/admin-ajax.php",
      "i18n_view_cart" : "View Cart",
      "cart_url" : "http:\/\/themes.themegoods2.com\/grandrestaurant\/cart\/",
      "is_cart" : "",
      "cart_redirect_after_add" : "no"
    };
    /* ]]> */
  </script>
  <script type='text/javascript'
    src='//themes.themegoods2.com/grandrestaurant/wp-content/plugins/woocommerce/assets/js/frontend/add-to-cart.min.js'></script>
  <script type='text/javascript'
    src='//themes.themegoods2.com/grandrestaurant/wp-content/plugins/woocommerce/assets/js/jquery-blockui/jquery.blockUI.min.js'></script>
  <script type='text/javascript'>
    /* <![CDATA[ */
    var woocommerce_params = {
      "ajax_url" : "\/grandrestaurant\/wp-admin\/admin-ajax.php"
    };
    /* ]]> */
  </script>
  <script type='text/javascript'
    src='//themes.themegoods2.com/grandrestaurant/wp-content/plugins/woocommerce/assets/js/frontend/woocommerce.min.js'></script>
  <script type='text/javascript'
    src='//themes.themegoods2.com/grandrestaurant/wp-content/plugins/woocommerce/assets/js/jquery-cookie/jquery.cookie.min.js'></script>
  <script type='text/javascript'>
    /* <![CDATA[ */
    var wc_cart_fragments_params = {
      "ajax_url" : "\/grandrestaurant\/wp-admin\/admin-ajax.php",
      "fragment_name" : "wc_fragments"
    };
    /* ]]> */
  </script>
  <script type='text/javascript'
    src='//themes.themegoods2.com/grandrestaurant/wp-content/plugins/woocommerce/assets/js/frontend/cart-fragments.min.js'></script>
  <script type='text/javascript'
    src='http://themes.themegoods2.com/grandrestaurant/wp-content/uploads/grand-restaurant/combined.js'></script>
  <script type='text/javascript'
    src='http://themes.themegoods2.com/grandrestaurant/wp-includes/js/jquery/ui/core.min.js'></script>
  <script type='text/javascript'
    src='http://themes.themegoods2.com/grandrestaurant/wp-includes/js/jquery/ui/datepicker.min.js'></script>
  <script type='text/javascript'
    src='http://themes.themegoods2.com/grandrestaurant/wp-content/themes/grandrestaurant/js/custom-date.js'></script>
  <script type='text/javascript'
    src='http://themes.themegoods2.com/grandrestaurant/wp-content/themes/grandrestaurant/functions/jquery.timepicker.js'></script>
  <script type='text/javascript'
    src='http://themes.themegoods2.com/grandrestaurant/wp-content/themes/grandrestaurant/js/custom-time.js'></script>
  <script type='text/javascript'
    src='http://themes.themegoods2.com/grandrestaurant/wp-content/themes/grandrestaurant/js/jquery.validate.js'></script>
  <script type='text/javascript'>
    /* <![CDATA[ */
    var tgAjax = {
      "ajaxurl" : "http:\/\/themes.themegoods2.com\/grandrestaurant\/wp-admin\/admin-ajax.php",
      "ajax_nonce" : "763dd29d0d"
    };
    /* ]]> */
  </script>
  <script type='text/javascript'
    src='http://themes.themegoods2.com/grandrestaurant/wp-content/themes/grandrestaurant/templates/script-reservation-form.php'></script>
  <script type='text/javascript'
    src='http://themes.themegoods2.com/grandrestaurant/wp-content/themes/grandrestaurant/js/jquery.cookie.js'></script>
  <script type='text/javascript'
    src='http://themes.themegoods2.com/grandrestaurant/wp-content/themes/grandrestaurant/templates/script-demo.php'></script>
  <script type='text/javascript'
    src='http://themes.themegoods2.com/grandrestaurant/wp-content/themes/grandrestaurant/js/custom_onepage.js'></script>


  <a href="../message/add.do">메세지 보내기</a>
  <a href="../message/list.do">메세지 보관함</a>


</body>
</html>
