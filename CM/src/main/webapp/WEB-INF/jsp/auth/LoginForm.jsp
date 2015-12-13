<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>로그인</title>
  
  <style>
  .button {
    outline: none;
    background: rgba(51, 0, 51, 0.6);
    width: 100%;
    border: 0;
    border-radius: 4px;
    padding: 12px 20px;
    color: #FFFFFF;
    font-family: inherit;
    font-size: 20px;
    font-weight: 500;
    line-height: inherit;
    text-transform: uppercase;
    cursor: pointer;
  }
  </style>
  
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <link rel="stylesheet" href="../css/bootstrap.min.css">
  

<script>
//bubble script
var WIDTH;
var HEIGHT;
var canvas;
var con;
var g;
var pxs = [];
var rint = 60;
$(document).ready(function(){
  WIDTH = window.innerWidth;
  HEIGHT = window.innerHeight;
  $('#container').width(WIDTH).height(HEIGHT);
  canvas = document.getElementById('bg_bubble');
  $(canvas).attr('width', WIDTH).attr('height',HEIGHT);
  con = canvas.getContext('2d');
  for(var i = 0; i < 100; i++) {
    pxs[i] = new Circle();
    pxs[i].reset();
  }
  setInterval(draw,rint);
});
function draw() {
  con.clearRect(0,0,WIDTH,HEIGHT);
  for(var i = 0; i < pxs.length; i++) {
    pxs[i].fade();
    pxs[i].move();
    pxs[i].draw();
  }
}
function Circle() {
  this.s = {ttl:15000, xmax:3, ymax:2, rmax:200, rt:1, xdef:960, ydef:540, xdrift:2, ydrift: 2, random:true, blink:true};
  // fill vars
  var crFill = [
    ['rgba(255,170,170,0)', 'rgba(255,170,170,1)'],
    ['rgba(212,106,106,0)', 'rgba(212,106,106,1)'],
    ['rgba(226,123,142,0)', 'rgba(226,123,142,1)'],
    ['rgba(249,185,184,0)', 'rgba(249,185,184,1)']
  ];
  // opacity var
  var opacityFill = "." + Math.floor(Math.random() * 5) + 1;
  this.reset = function() {
    this.x = (this.s.random ? WIDTH*Math.random() : this.s.xdef);
    this.y = (this.s.random ? HEIGHT*Math.random() : this.s.ydef);
    this.r = ((this.s.rmax-1)*Math.random()) + 1;
    this.dx = (Math.random()*this.s.xmax) * (Math.random() < 0.5 ? -1 : 1);
    this.dy = (Math.random()*this.s.ymax) * (Math.random() < 0.5 ? -1 : 1);
    this.hl = (this.s.ttl/rint)*(this.r/this.s.rmax);
    this.rt = Math.random()*this.hl;
    this.s.rt = Math.random()+1;
    this.stop = Math.random()*0.2+0.4;
    this.s.xdrift *= Math.random() * (Math.random() < 0.5 ? -1 : 1);
    this.s.ydrift *= Math.random() * (Math.random() < 0.5 ? -1 : 1);
    this.opacityFill = opacityFill;
    this.currentColor = Math.floor(Math.random()*crFill.length);
  };
  this.fade = function() {
    this.rt += this.s.rt;
  };
  this.draw = function() {
    if(this.s.blink && (this.rt <= 0 || this.rt >= this.hl)){
      this.s.rt = this.s.rt*-1;
    }
    else if(this.rt >= this.hl){
      this.reset();
    }
    con.beginPath();
    con.arc(this.x,this.y,this.r,0,Math.PI*2,true);
    con.globalAlpha = opacityFill;
    var newo = 1-(this.rt/this.hl);
    var cr = this.r*newo;
    gradient = con.createRadialGradient(this.x,this.y,0,this.x,this.y,(cr <= 0 ? 1 : cr));
    gradient.addColorStop(0.0, crFill[(this.currentColor)][1]);
    gradient.addColorStop(0.7, crFill[(this.currentColor)][1]);
    gradient.addColorStop(1.0, crFill[(this.currentColor)][0]);
    con.fillStyle = gradient;
    con.fill();
    con.closePath();
  };
  this.move = function() {
    this.x += (this.rt/this.hl)*this.dx;
    this.y += (this.rt/this.hl)*this.dy;
    if(this.x > WIDTH || this.x < 0){
      this.dx *= -1;
    }
    if(this.y > HEIGHT || this.y < 0){
      this.dy *= -1;
    }
  };
  this.getX = function() { return this.x; };
  this.getY = function() { return this.y; };
}
</script>

  <style>
  html, body {
    height: 100%;
  } 
  body {
    background: url("../img/loginview.jpg");
    background-repeat: no-repeat;
      background-position: center center;
      background-attachment: fixed;
      -webkit-background-size: cover;
      -moz-background-size: cover;
      -o-background-size: cover;
      background-size: cover;
      overflow-y:hidden;
  
  }
  
  .vertical-center {
    min-height: 100%;  /* Fallback for browsers do NOT support vh unit */
    min-height: 100vh; /* These two lines are counted as one           */
    display: flex;
    align-items: center;
  }
  #intro-wrap {
    width:100%;
    height:100%;
  }
  .input {
    width: 95%;
    margin-bottom: 10px;
    background: rgba(255,255,255,0.3);
    border: none;
    outline: none;
    padding: 10px;
    font-size: 18px;
    color: #000;
    text-shadow: 1px 1px 1px rgba(0,0,0,0.3);
    border-radius: 4px;
    box-shadow: inset 0 -5px 45px rgba(100,100,100,0.2), 0 1px 1px rgba(255,255,255,0.2);
    -webkit-transition: box-shadow .5s ease;
    -moz-transition: box-shadow .5s ease;
    -o-transition: box-shadow .5s ease;
    -ms-transition: box-shadow .5s ease;
    transition: box-shadow .5s ease;
  }
  
  input:focus { 
    box-shadow: inset 0 -5px 45px rgba(100,100,100,0.4), 0 1px 1px rgba(255,255,255,0.2); 
  }
  .loginBox {
    width: 300px;
    height: 400px;
    position: fixed;
    top: 250px;
    left: 630px;
    
  }
</style>
</head>
<body>
  <div id="intro-wrap" class="row text-center vertical-center">
    <div class=:col-xs-12">
      <canvas id='bg_bubble'></canvas>
    </div>
      <div class="loginBox">
        <form action="login.do" method="post">
        <strong>ID:</strong> <input type="text" id="id" name="id" value="${cookie.id.value}" class="input"><br><br>
        <strong>Password:</strong> <input type="password" name="password" class="input"><br>
        <br/><br/>
        <input type="submit" value="로그인" class="button"><br><br>
        <input type="checkbox" name="saveId"
          ${(empty cookie.id)?"":"checked"}>ID 저장<br>
        </form>
    </div>
  </div>
  <script type="text/javascript">
  $(document).ready(function(){
    var RegexId = /^[a-z0-9_-]{3,16}$/; //아이디 유효성 검사 316자 사이
    $("form").submit(function(){
  
      if ( !RegexId.test($.trim($("#id").val())) )
      {
        alert("id형식이 맞지 않습니다.")
        $("#id").focus();
        return false;
      }
  
    });
  
  });
  </script>
</body>
</html>