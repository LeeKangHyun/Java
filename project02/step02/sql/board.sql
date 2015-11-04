drop table board;
create table board ( 
  bno int not null auto_increment,
  title varchar(255) not null,
  content text not null,
  views int default 0,
  cre_dt datetime not null,
  pwd varchar(20),
  constraint board_pk primary key (bno)
);
