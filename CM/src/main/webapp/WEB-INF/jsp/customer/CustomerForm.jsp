<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset='UTF-8'>
<title>회원 추가</title>
<script type="text/javascript" src="../js/jquery.js"></script>
<script type="text/javascript" src="../js/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="../js/jquery-ui-1.8.23.custom.min.js"></script>
<script type="text/javascript" src="../js/jquery-migrate-1.2.1.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script type="text/javascript" src="../js/js_jq.js"></script>
<script
  src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <link rel='stylesheet' type="text/css" href="../css/reset.css">
  <link rel='stylesheet' type="text/css" href="../css/log.css">
</head>

<body>
<div id="reservation_wrapper" style="display: block;">
    <div class="reservation_content">
      <div class="reservation_form">
        <div class="reservation_form_wrapper">
          <a id="reservation_cancel_btn" href="javascript:;"><i
            class="fa fa-close"></i></a>
          <h2 class="ppb_title">
            <span class="ppb_title_first">회원가입</span>
          </h2>
          <div id="reponse_msg">
            <ul></ul>
          </div>
          
            <h1 class="hidden">회원 추가</h1>
                <form id="tg_reservation_form" action='add.do' method='post' enctype="multipart/form-data">
                  <table border='1' class="add_box">
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
                      <th>사는 지역</th>
                      <td>
                        <select name="address">
                          <option value="서울특별시" >서울특별시</option>
                          <option value="경기도">경기도</option>
                          <option value="전라도">전라도</option>
                          <option value="강원도">강원도</option>
                          <option value="경상도">경상도</option>
                          <option value="충청도">충청도</option>
                          <option value="제주도">제주도</option>
                        </select>
                      </td>
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
                        <select name="nature">
                          <option value="긍정" selected="selected">긍정</option>
                          <option value="활발">착함</option>
                          <option value="능청">활발</option>
                        </select>
                      </td>
                    </tr>
                    <tr>
                      <th>이상형</th>
                      <td>
                        <select name="ideal">
                          <option value="긍정" selected="selected">긍정</option>
                          <option value="활발">착함</option>
                          <option value="능청">활발</option>
                        </select>
                      </td>
                    </tr>
                    <tr>
                      <th>사진</th>
                      <td><input type="file" name="photofile" class="btn btn-info"></td>
                    </tr>
                  </table>
                    <button type='submit' class="btn btn-default">등록</button>
                </form>
          
        </div>
      </div>
    </div>
    <div class="parallax_overlay_header"></div>
  
  </div>


</body>

</html>
