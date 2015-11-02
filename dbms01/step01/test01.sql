-- mysql 클라이언트 프로그램 실행
명령창> mysql -u 사용자 -p 
암호: 

-- 사용한 DB 선택
mysql> use 스키마명;
mysql> connect 스키마명;

-- 예)
mysql> use java76db;
mysql> connect java76db;

-- 사용자가 사용할 수 있는 스키마 목록
mysql> show databases;

-- 현재 스키마의 테이블 목록
mysql> show tables;

-- 테이블 생성 문법
/*
create table 테이블명 (
  컬럼명 타입 옵션,
  컬럼명 타입 옵션,
  ...
);
*/
--예) 테이블 생성
CREATE TABLE test01 (
  name VARCHAR(10),
  age INT
);

/* 테이블 내용 출력
mysql> desc[ribe] 테이블명;
*/

-- 예)
mysql> desc test01;

/* 테이블 삭제 - 물론, 테이블에 들어있는 모든 데이터 삭제된다.
 * drop table 테이블명;
 */
-- 예)
mysql> drop table test01;

/* 테이블에 데이터 입력
 * insert into 테이블명(컬럼명, 컬럼명, ...) values('값', '값', ...);
 */

-- 예) 모든 컬럼 값 입력
insert into test01(name, age) values('홍길동', 20);
insert into test01(name, age) values('임꺽정', 30);
insert into test01(name, age) values('유관순', 17);

-- 예) 일부 컬럼 값 입력
insert into test01(name, age) values('사용자1', null);
insert into test01(name, age) values(null, 50);
insert into test01(name) values('사용자2');
insert into test01(age) values(60);

/* 데이터 조회
 * select * from 테이블명;
 */
예) 모든 컬럼 출력하기
select * from test01;

예) 출력할 항목을 선택한다.
select name from test01;
select age from test01;

/* 용어 정리
데이터)
홍길동 10    <- row, record
임꺽정 20
유관순 30
 ^
column, attribute
 */

/* SQL 데이터 타입
 * => DBMS전용 데이터 타입이 있다.
 * => SQL은 표준이지만, 각 DBMS마다 자신만의 고유 문법을 추가적으로 제공하고 있다.
 * [숫자]
 * tinyint(1), bool(1), boolean(1)
 * smallint(2)
 * medium(3)
 * int,integer(4)
 * bigint(8)
 * float(4)
 * double,real(8)
 * decimal(M,D), numeric(M,D)
 * 
 * [날짜 및 시간]
 * year(1)
 * date(3) - 날짜만
 * time(3) - 시간만
 * datetime(8) - 날짜와 시간
 * timestamp(4)
 * 
 * [문자열]
 * char(M)          - 0 <= M <=255 (고정형. 무조건 256자) -> 1자를 저장하더라도 256칸을 점유
 * varchar(M)       - 0 ~ 255      (가변형. 최대 256자) -> 1자를 저장하면 1칸을 점
 * tinyblob, tinytext        - 최대 256자 저장 (가변형)
 * blob(binary), text(텍스트)  - 최대 65536자 (가변형)
 * mediumblob,mediumtext     - 최대 약 16만 자 (가변형)
 * longblob, longtext        - 최대 약 42억 자 (가변형)
 */

/* 문제:
 * Student와 Project를 저장할 테이블을 정의하시오!
 */

-- Student 객체 정보를 저장할 테이블
CREATE TABLE student(
  name VARCHAR(20),
  email VARCHAR(100),
  tel VARCHAR(20),
  cid VARCHAR(50)
);

-- Project 객체 정보를 저장할 테이블
CREATE TABLE project(
  title VARCHAR(255),
  start_dt DATETIME,
  end_dt DATETIME,
  member VARCHAR(10)
);







