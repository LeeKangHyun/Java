create table board ( 
  bno int auto_increment primary key,
  title varchar(20) not null,
  content varchar(255) not null,
  views int defalut 0,
  cre_dt datetime not null,
  pwd varchar(20)
);