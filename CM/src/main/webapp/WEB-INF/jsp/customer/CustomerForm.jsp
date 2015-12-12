<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset='UTF-8'>
<title>회원 추가</title>
</head>

<body>
  <h1>회원 추가</h1>
  <form action='add.do' method='post' enctype="multipart/form-data">
    <table border='1'>
      <tr>
        <th>이름</th>
        <td><input type='text' name='name' placeholder="회원 이름을 넣으세요."></td>
      </tr>
      <tr>
        <th>id</th>
        <td><input type='text' name='id' size='20'></td>
      </tr>
      <tr>
        <th>password</th>
        <td><input type='password' name='password' size='20'></td>
      </tr>
      <tr>
        <th>나이</th>
        <td><input type='text' name='age' size='20'></td>
      </tr>
      <tr>
        <th>주소</th>
        <td><input type='text' name='address' size='20'></td>
      </tr>
      <tr>
        <th>성별</th>
        <td>
        <input type="radio" value="남자" name='gender' checked>남자
        <input type="radio" value="여자" name='gender'>여자
        </td>
      </tr>
      <tr>
        <th>성격</th>
        <td><input type="radio" value="긍정" name="nature" checked>긍정
            <input type="radio" value="착함" name="nature">착함
            <input type="radio" value="활발" name="nature" >활발
        </td>
      </tr>
      <tr>
        <th>성격</th>
        <td><input type="radio" value="긍정" name="ideal" >긍정
            <input type="radio" value="착함" name="ideal" >착함
            <input type="radio" value="활발" name="ideal" checked>활발
        </td>
      </tr>
      <tr>
        <th>사진</th>
        <td><input type="file" name="photofile"></td>
      </tr>
    </table>
    <p>
      <button type='submit'>등록</button>
    </p>
  </form>

</body>

</html>
