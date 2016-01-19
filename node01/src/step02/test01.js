// databased에 연결하기

// 1) 라이브러리 가져오기
// 프로젝트 폴더에서 다음 명령을 실행하여 nodejs 라이브러리를 가져온다.
// => npm install mysql
var mysql      = require('mysql'); // mysql 연동 라이브러리 객체 준비

var connection = mysql.createConnection({
  host     : 'localhost',
  user     : 'java76',
  password : '1111',
  database : 'java76db'
});

connection.connect();
console.log("연결 되었음.");
/*
connection.query('SELECT 1 + 1 AS solution', function(err, rows, fields) {
  if (err) throw err;

  console.log('The solution is: ', rows[0].solution);
});
*/

connection.end();
console.log("연결 끊었음.");