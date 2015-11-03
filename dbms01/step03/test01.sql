-- 게시판 테이블 생성
create table board(
  bno     int not null,
  title   varchar(255) not null,
  content text not null,
  views   int default 0,
  cre_dt  datetime not null,
  pwd     varchar(20)
);

alter table board
add constraint board_pk primary key (bno);

alter table board
modify column bno int auto_increment;