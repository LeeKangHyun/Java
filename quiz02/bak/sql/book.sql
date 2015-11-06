drop table book;
create table book ( 
  bno int auto_increment primary key,
  title varchar(255) not null,
  authors varchar(20) not null,
  press varchar(20) not null,
  tag varchar(20) not null
);

insert into book(title,authors,press,tag) 
values('DBMS', 'Mr.Eom', 'BIT', 'DB, DBMS');

insert into book(title,authors,press,tag)
values('JDBC', 'Mrs.Lee', 'BOT', 'Java, JDBC');