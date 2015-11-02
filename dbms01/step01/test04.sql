/* 주제: 여러 개 컬럼을 PK로 지정하는 방법
 */
-- 다음 문법으로는 두 개 이상의 컬럼을 묶어서 PK로 지정할 수 없다.
CREATE TABLE test06 (
  name VARCHAR(20) primary key, 
  tel  VARCHAR(20) primary key,
  age  INT
);

-- constraint 조건을 사용하라!
CREATE TABLE test06 (
  name VARCHAR(20), 
  tel  VARCHAR(20),
  age  INT,
  constraint test06_pk primary key (name, tel)
);

-- name과 tel이 PK로 지정되었는지 확인해보자!
desc test06;

-- 두 개 이상의 컬럼이 PK일 경우, 두 개 값 모두 일치하는 데이터를 넣을 수 없다.
insert into test06(name, tel, age) values('aaa', '111', 20);
insert into test06(name, tel, age) values('aaa', '111', 20); -- 중복 오류!
insert into test06(name, tel, age) values('aaa', '222', 20); -- OK
insert into test06(name, tel, age) values('aaa2', '111', 20); -- OK


-- 물론, 테이블 생성 후에 PK를 지정할 수 있다.
CREATE TABLE test07 (
  name VARCHAR(20), 
  tel  VARCHAR(20),
  age  INT
);

alter table test07
  add constraint test07_pk primary key (name, tel);



