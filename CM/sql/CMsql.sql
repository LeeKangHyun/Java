create table customer (
  id varchar(255) not null primary key,
  pwd varchar(255) not null,
  name varchar(255) not null, 
  age int not null,
  address varchar(255),
  gender boolean not null,
  photo varchar(255) 
);