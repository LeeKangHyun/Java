/* 주제: 자동증가 칼럼 설정
 */

-- 1) 테이블 생성
-- unique 컬럼은 자동으로 not null로 설정되지 않는다.
CREATE TABLE test14 (
  no    int primary key auto_increment,
  email VARCHAR(100) not null unique,
  name VARCHAR(20) not null default '홍길동',
  age INT default 20,
  tel VARCHAR(20) unique
);

-- 데이터 입력
insert into test14(email) values('aaa@test.com');
insert into test14(email) values('bbb@test.com');

-- 테이블 정의2  
CREATE TABLE test15 (
  no    int,
  email VARCHAR(100) not null,
  name VARCHAR(20) not null default '홍길동',
  age INT default 20,
  tel VARCHAR(20)
);

alter table test15
add constraint test15_pk primary key (no);

alter table test15
add constraint test15_uq1 unique (email);

alter table test15
add constraint test15_uq2 unique (tel);

alter table test15
modify column no int auto_increment;

insert into test15(email) values('aaa@test.com');
insert into test15(email) values('bbb@test.com');
insert into test15(email) values('ccc@test.com');
delete from test15 delete where no=2;
insert into test15(email) values('ddd@test.com');
delete from test15 delete where no=4;
insert into test15(email) values('eee@test.com');


