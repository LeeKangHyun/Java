/* 
 * 주제: primary key를 지정하는 다양한 방법
 */
-- 1) 컬럼 선언할 때 primary key를 지정한다.
CREATE TABLE test03 (
  name VARCHAR(20) primary key, 
  tel  VARCHAR(20),
  age  INT
);

-- pk 지정 확인!
insert into test03(name, tel, age) values('aaa', '111', 20);

-- name 컬럼 값이 같은 데이터를 다시 넣으려 하면 오류 발생!
insert into test03(name, tel, age) values('aaa', '111', 20);

-- test03 테이블 정보 확인 
desc test03;

--> primary key 컬럼은 자동으로 null 값 불가로 설정된다.
insert into test03(name, tel, age) values(null, '111', 20); -- 오류!
insert into test03(name, tel, age) values('bbb', null, null);  -- 실행 ok

-- 2) 컬럼 선언 후에 제약 조건으로 지정한다.

CREATE TABLE test04 (
  name VARCHAR(20), 
  tel  VARCHAR(20),
  age  INT,
  constraint test04_pk /*제약조건명*/
             primary key (name/*컬럼명*/)
);
insert into test04(name, tel, age) values('aaa', '111', 20);

-- 3) 테이블 생성 후에 테이블 변경 문법을 사용하여 pk조건을 
CREATE TABLE test05 (
  name VARCHAR(20), 
  tel  VARCHAR(20),
  age  INT
);

alter table test05
  add constraint test05_pk /*제약조건명*/
             primary key (name/*컬럼명*/)





