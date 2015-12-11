drop table customer;
create table customer (
  cno int not null auto_increment,
  name varchar(255) not null, 
  id varchar(255) not null,
  pwd varchar(255) not null,
  age int not null,
  address varchar(255),
  gender varchar(100) not null,
  photo varchar(255),
  nature varchar(255) not null,
  ideal varchar(255) not null,
  primary key(cno, id)
);

