<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>찾아오시는 길</title>
</head>
<body>
  <div id="map" style="width:750px;height:350px;"></div>

  <script src="http://apis.daum.net/maps/maps3.js?apikey=0a2f0f7013546e16c4d1e8c2c3880c27"></script>
  <script>
    var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
        mapOption = {
            center: new daum.maps.LatLng(37.49463, 127.02774), // 지도의 중심좌표
            level: 2, // 지도의 확대 레벨
            mapTypeId : daum.maps.MapTypeId.ROADMAP // 지도종류
        }; 

    // 지도를 생성한다 
    var map = new daum.maps.Map(mapContainer, mapOption); 

    // 지도 타입 변경 컨트롤을 생성한다
    var mapTypeControl = new daum.maps.MapTypeControl();

    // 지도의 상단 우측에 지도 타입 변경 컨트롤을 추가한다
    map.addControl(mapTypeControl, daum.maps.ControlPosition.TOPRIGHT); 

    // 지도에 확대 축소 컨트롤을 생성한다
    var zoomControl = new daum.maps.ZoomControl();

    // 지도의 우측에 확대 축소 컨트롤을 추가한다
    map.addControl(zoomControl, daum.maps.ControlPosition.RIGHT);

    // 지도에 마커를 생성하고 표시한다
    var marker = new daum.maps.Marker({
        position: new daum.maps.LatLng(37.49463, 127.02774), // 마커의 좌표
        map: map // 마커를 표시할 지도 객체
    });

  </script>
</body>
</html>
