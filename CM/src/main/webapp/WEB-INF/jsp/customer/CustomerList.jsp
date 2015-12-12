<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>회원 목록</title>
</head>
<body>
<jsp:include page="/Header.jsp"/>

<h1>회원 목록</h1>

<form id='form' action='search.do' method='post' enctype="multipart/form-data" >
<select name="selectgender">
  <option value="남자">남자</option>
  <option value="여자">여자</option>
</select>
<input id='txtselectgender' type="hidden" name='gender' size='10'>

<select name="selectage">
  <option value="2">20대</option>
  <option value="3">30대</option>
  <option value="4">40대</option>
  <option value="5">50대</option>
</select>
<input id='txtselectage' type="hidden" name='age' size='10'>

<select name="selectaddress">
  <option value="서울특별시" >서울특별시</option>
  <option value="경기도">경기도</option>
  <option value="전라도">전라도</option>
  <option value="강원도">강원도</option>
  <option value="경상도">경상도</option>
  <option value="충청도">충청도</option>
  <option value="제주도">제주도</option>
</select>
<input id='txtselectaddress' type="hidden" name='address' size='10'>

<input type='text' name='id' size='20' placeholder="ID 입력">
  <p>
  <button type='submit' onclick="getSelectValue(this.form);">검색</button>
  </p>
</form>


<a href="add.do">회원 추가</a>
<a href="recent.do">최신</a>
<a href="map.do">지도</a>
<table border='1'>
<tr>
<th>이름</th>
<th>나이</th>
<th>id</th>
<th>주소</th>
<th>성별</th>
</tr>
<c:forEach var="customer" items="${customers}">
<tr>
<td>${customer.name}</td>
<td>${customer.age}</td>
<td><a href='detail.do?id=${customer.id}'>${customer.id}</a></td>
<td>${customer.address}</td>
<td>${customer.gender}</td>
</tr>
</c:forEach>
</table>

<a href="../message/add.do">메세지 보내기</a>
<a href="../message/list.do">메세지 보관함</a>

<jsp:include page="../menubar/GoMap.jsp"/>

<script>
function getSelectValue(frm)
{
  frm.txtselectgender.value = frm.selectgender.options[frm.selectgender.selectedIndex].value;
  frm.txtselectage.value = frm.selectage.options[frm.selectage.selectedIndex].value;
  frm.txtselectaddress.value = frm.selectaddress.options[frm.selectaddress.selectedIndex].value;
}
</script>

</body>
</html>
