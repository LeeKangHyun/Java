<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
          <div id="logo_normal" class="logo_container">
            <div class="logo_align">
              <a id="custom_logo" class="logo_wrapper hidden"
                href="../menubar/main.do"> <img
                src="../img/bit.png"
                alt="Grand Restaurant | Restaurant Theme" width="101"
                height="34" style="width: 101px; height: 34px;" />
              </a>
            </div>
          </div>
          <div id="logo_transparent" class="logo_container">
            <div class="logo_align">
              <a id="custom_logo_transparent" class="logo_wrapper default"
                href="../menubar/main.do"> <img
                src="../img/bit.png"
                alt="Grand Restaurant | Restaurant Theme" width="101"
                height="34" style="width: 101px; height: 34px;" />
              </a>
            </div>
          </div>
          <div id="nav_wrapper">
            <div class="nav_wrapper_inner">
              <div id="menu_border_wrapper">
                <div class="menu-main-menu-container">
                  <ul id="main_menu" class="nav">
                    <li id="menu-item-2773"
                      class="menu-item menu-item-type-custom menu-item-object-custom current-menu-item current_page_item menu-item-home current-menu-ancestor current-menu-parent menu-item-has-children arrow menu-item-2773"><a
                      href="#">회원</a>
                      <ul class="sub-menu">
                        <li id="menu-item-3282"
                          class="menu-item menu-item-type-post_type menu-item-object-page current-menu-item page_item page-item-2 current_page_item menu-item-3282"><a
                          href="../customer/detail.do?id=${loginUser.id}">My Page</a></li>
                        <li id="menu-item-3896"
                          class="menu-item menu-item-type-post_type menu-item-object-page menu-item-3896"><a
                          href="../customer/recent.do">오늘의 신규 회원</a></li>
                        <li id="menu-item-3896"
                          class="menu-item menu-item-type-post_type menu-item-object-page menu-item-3896"><a
                          href="../customer/recent.do">추천 회원</a></li>
                      </ul>
                    </li>
                    <li id="menu-item-3350"
                      class="menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children arrow menu-item-3350"><a
                      href="#">소개팅</a>
                      <ul class="sub-menu">
                        <li id="menu-item-3341"
                          class="menu-item menu-item-type-post_type menu-item-object-page menu-item-3341"><a
                          href="#">장소 추천 리스트</a></li>
                        <li id="menu-item-3281"
                          class="menu-item menu-item-type-post_type menu-item-object-page menu-item-3281"><a
                          href="#">맛집 추천 리스트</a></li>
                      </ul></li>

                    <li id="menu-item-3852"
                      class="menu-item menu-item-type-post_type menu-item-object-page menu-item-3852"><a
                      href="#">커뮤니티</a>
                      <ul class="sub-menu">
                        <li id="menu-item-2827"
                          class="menu-item menu-item-type-post_type menu-item-object-page menu-item-2827"><a
                          href="#">소개팅후기</a></li>
                        <li id="menu-item-2831"
                          class="menu-item menu-item-type-post_type menu-item-object-page menu-item-2831"><a
                          href="#">질문과 답변</a></li>
                        <li id="menu-item-2838"
                          class="menu-item menu-item-type-post_type menu-item-object-page menu-item-2838"><a
                          href="../menubar/map.do">찾아오시는 길</a></li>
                      </ul>
                    </li>

                    <li id="menu-item-2817"
                      class="menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children arrow menu-item-2817"><a
                      href="#">운영자</a>
                      <ul class="sub-menu">
                        <li id="menu-item-2827"
                          class="menu-item menu-item-type-post_type menu-item-object-page menu-item-2827"><a
                          href="../customer/list.do" onclick="onAdmin()">회원 관리</a></li>
                        <li id="menu-item-2831"
                          class="menu-item menu-item-type-post_type menu-item-object-page menu-item-2831"><a
                          href="#">운영 현황</a></li>
                      </ul></li>

                  </ul>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>