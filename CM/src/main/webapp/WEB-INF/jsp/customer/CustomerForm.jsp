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
        <th>I  D</th>
        <td><input type='text' name='id' placeholder="ID를 넣으세요."></td>
      </tr>
      <tr>
        <th>PWD</th>
        <td><input type='password' name='password' placeholder="비밀번호를 넣으세요."></td>
      </tr>
      <tr>
        <th>나이</th>
        <td><input type='text' name='age'></td>
      </tr>
      <tr>
        <th>주소</th>
        <td><input type='text' name='address' placeholder="ex) 서울시, 의정부시, 고양시.."></td>
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
        <td>
        <input type="radio" value="착함" name='nature' checked="checked">착함
        <input type="radio" value="능청" name='nature'>능청
        <input type="radio" value="긍정" name='nature'>긍정
        </td>
      </tr>
      <tr>
        <th>이상형</th>
        <td>
        <input type="radio" value="착함" name='ideal' checked="checked">착함
        <input type="radio" value="능청" name='ideal'>능청
        <input type="radio" value="긍정" name='ideal'>긍정
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
