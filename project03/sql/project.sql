/* 수강 신청 테이블 */
drop table cour_enroll;
create table cour_enroll (
  email   varchar(100) not null,
  name    varchar(20) not null,
  tel     varchar(20) not null,
  status  int default 0,
  reg_dt  DATETIME,
  constraint cour_enroll_pk primary key (email)
);

insert into cour_enroll(email,name,tel,reg_dt)
values ('st001@test.com', 'st001', '111-1111', now());
insert into cour_enroll(email,name,tel,reg_dt)
values ('st002@test.com', 'st002', '111-1112', now());
insert into cour_enroll(email,name,tel,reg_dt)
values ('st003@test.com', 'st003', '111-1113', now());
insert into cour_enroll(email,name,tel,reg_dt)
values ('st004@test.com', 'st004', '111-1114', now());
insert into cour_enroll(email,name,tel,reg_dt)
values ('st005@test.com', 'st005', '111-1115', now());
insert into cour_enroll(email,name,tel,reg_dt)
values ('st006@test.com', 'st006', '111-1116', now());