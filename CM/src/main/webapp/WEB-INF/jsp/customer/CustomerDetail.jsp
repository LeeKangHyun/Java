<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>마이 페이지</title>
<link rel="stylesheet" type="text/css" href="../css/common.css">
</head>
<body>
  <h1>회원 상세정보</h1>
  <c:if test='${not empty customer}'>
  <form id='form1' action='update.do' method='post'
        enctype="multipart/form-data">
  <table border='1'>
    <tr>
      <th>이름</th>
      <td><input type='text' name='name' value='${customer.name}' size='20' readonly></td>
    </tr>
    <tr>
      <th>나이</th>
      <td><input type='text' name='age' value='${customer.age}' size='20' readonly></td>
    </tr>
    <tr>
      <th>id</th>
      <td><input type='text' name='id' value='${customer.id}' size='20' readonly></td>
    </tr>
    <tr>
      <th>password</th>
      <td><input id='inputPassword' type='password' name='password' size='20'></td>
    </tr>
    <tr>
      <th>주소</th>
      <td><input type='text' name='address' value='${customer.address}' size='20'></td>
    </tr>
    <tr>
      <th>성별</th>
      <td><input type='text' name='gender' value='${customer.gender}' size='20' readonly></td>
    </tr>
    <tr>
      <th>성격</th>
      <td><input type='text' name='nature' value='${customer.nature}' size='20' readonly></td>
    </tr>
    <tr>
      <th>이상형</th>
      <td><input type='text' name='ideal' value='${customer.ideal}' size='20' readonly></td>
    </tr>
    <tr>
      <th colspan='2'>프로필 사진</th>
    </tr>
    <tr>
      <td colspan='2'><img 
      src="../attachfile/${(empty customer.photo) ? 'default.jpg' : customer.photo}" style='size:313px'></td>
    </tr>
    <tr>
      <th>프로필 변경</th>
      <td><input type='file' name='photofile' value='사진 변경'><!-- 변경 -->
          <input type='hidden' name='photo' value='${customer.photo}'></td><!-- 기존 -->
    </tr>
  </table>
  <button name="update" type="submit" class='button1'>변경</button>
  <a id='aDelete' href='delete.do?id=${customer.id}' 
  class='button2' onclick='deleteCustomer()'>삭제</a>
  </form>
  </c:if>
  
  <c:if test='${empty customer}'>
    <p>없는 학생</p>
  </c:if>


  <script>
  function deleteCustomer() {
    var password = document.getElementById('inputPassword').value;
    var href = document.getElementById('aDelete').href 
               + "&password=" + password;
    
    document.getElementById('aDelete').href = href;
  }
  </script>


</body>
</html>