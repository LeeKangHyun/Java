drop table student;
create table student (
  name varchar(20) not null,
  email varchar(100) not null,
  tel varchar(20),
  cid varchar(20),
  constraint student_pk primary key (email)
);

