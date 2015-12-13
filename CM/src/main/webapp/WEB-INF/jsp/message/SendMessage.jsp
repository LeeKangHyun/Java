<%@page import="java76.cms.domain.Customer"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>회원 검색</title>
<link rel="stylesheet" type="text/css" href="../css/common.css">
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

<style>
  .divstyle {
    margin-left: 41%;
  }
</style>
</head>
<body class="home page page-id-2 page-template-default">
 <div class="divstyle">
   <br/><br/><br/><br/>
   <h2 class="ppb_title">
     <span class="ppb_title_first">메세지 보내기</span>
   </h2>
   <div id="reponse_msg">
     <ul></ul>
   </div>
  <form action='add.do' method='post' enctype="multipart/form-data">
  <table border='1'>
   <tr>
     <th>받는이</th>
     <td><input type='text' name='dearid'></td>
   </tr>
   <tr>
     <th>보낸이</th>
     <td><input type='text' name='byid' value='<%=((Customer)session.getAttribute("loginUser")).getId()%>' size='20' readonly></td>
     
   </tr>
   <tr>
     <th>내용</th>
     <td><textarea name='content' cols="30" rows="20"></textarea></td>
   </tr>
  </table>
  <p>
    <button type='submit'>보내기</button>
  </p>
</form>
</div>
</body>
</html>