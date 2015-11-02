/* 주제: candidate key 지정하기
 * => 비록 pk는 아니지만 pk처럼 중복되어서는 안되는 컬럼을 설정하는 방법
 * => unique 옵션!
 */

-- 1) 테이블 생성
CREATE TABLE test12 (
  email VARCHAR(100),
  name VARCHAR(20) not null default '홍길동',
  age INT default 20,
  tel VARCHAR(20),
  constraint test12_pk primary key (email),
  constraint test12_uq unique (tel)
);

-- 데이터 입력
insert into test12(email, tel) values('aaa@test.com', '1111');
insert into test12(email, tel) values('bbb@test.com', '2222');

create table test13 (
email varchar(100),
name varchar(20) not null default '홍길동',
age int default 20,
tel varchar(20) unique,
constraint test13_pk primary key (email)
);

drop table test01;
drop table test02;
drop table test03;
drop table test04;
drop table test05;
drop table test06;
drop table test07;
drop table test08;
drop table test09;
drop table test10;
drop table test11;
drop table test12;
drop table test13;