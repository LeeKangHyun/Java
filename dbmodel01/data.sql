/* 직급 코드 등록 */
insert into LVL_CODE values('LC001', '사원'); 
insert into LVL_CODE values('LC002', '주임'); 
insert into LVL_CODE values('LC003', '대리'); 
insert into LVL_CODE values('LC004', '과장'); 
insert into LVL_CODE values('LC005', '차장'); 
insert into LVL_CODE values('LC006', '부장'); 

/* 매니저 등록 */
insert into MANAGERS(NAME,PHOT,EMAIL,TEL,LEVEL)
  values('홍길동','temp.png','hong@test.com','111-1111','LC001');
insert into MANAGERS(NAME,PHOT,EMAIL,TEL,LEVEL)
  values('임꺽정','temp.png','leem@test.com','111-1112','LC001');
insert into MANAGERS(NAME,PHOT,EMAIL,TEL,LEVEL)
  values('유관순','temp.png','yoo@test.com','111-1113','LC002');
insert into MANAGERS(NAME,PHOT,EMAIL,TEL,LEVEL)
  values('안중근','temp.png','ahn@test.com','111-1114','LC002');

/* 강의 분류 코드 등록 */
insert into CAT_CODE values('CT-JA', 'JAVA');
insert into CAT_CODE values('CT-C0', 'C');
insert into CAT_CODE values('CT-CP', 'C++');
insert into CAT_CODE values('CT-C#', 'C#');
insert into CAT_CODE values('CT-LI', 'LINUX');
insert into CAT_CODE values('CT-AN', 'ANDROID');

/* 강의실 등록 */
insert into CLASSES values('KN301', '강남301호');
insert into CLASSES values('KN302', '강남302호');
insert into CLASSES values('KN303', '강남303호');
insert into CLASSES values('KN401', '강남401호');
insert into CLASSES values('KN402', '강남402호');
insert into CLASSES values('KN403', '강남403호');
insert into CLASSES values('KN501', '강남501호');
insert into CLASSES values('KN502', '강남502호');
insert into CLASSES values('KN503', '강남503호');
insert into CLASSES values('JR701', '종로701호');
insert into CLASSES values('JR702', '종로702호');
insert into CLASSES values('JR703', '종로703호');

/* 강의실 사진 */
insert into PHOTOES(CID,PHOT) values('KN301','kn301_1.png');
insert into PHOTOES(CID,PHOT) values('KN301','kn301_2.png');
insert into PHOTOES(CID,PHOT) values('KN302','kn302_1.png');
insert into PHOTOES(CID,PHOT) values('KN303','kn303_1.png');
insert into PHOTOES(CID,PHOT) values('KN303','kn303_2.png');
insert into PHOTOES(CID,PHOT) values('KN303','kn303_3.png');
insert into PHOTOES(CID,PHOT) values('JR701','jr701_1.png');
insert into PHOTOES(CID,PHOT) values('JR702','jr701_1.png');
insert into PHOTOES(CID,PHOT) values('JR703','jr701_1.png');

/* 강의 정보 등록 */
insert into LECTURES(TITLE,DETL,CAPA,HOURS,CATEG)
  values('자바프로그래밍-100기','정부지원 자바 개발자 양성 과정',30,800,'CT-JA');
insert into LECTURES(TITLE,DETL,CAPA,HOURS,CATEG)
  values('자바프로그래밍-101기','정부지원 자바 개발자 양성 과정',30,800,'CT-JA');
insert into LECTURES(TITLE,DETL,CAPA,HOURS,CATEG)
  values('윈도우 프로그래밍-80기','정부지원 윈도우 개발자 양성 과정',25,600,'CT-CP');
insert into LECTURES(TITLE,DETL,CAPA,HOURS,CATEG)
  values('윈도우 프로그래밍-81기','정부지원 윈도우 개발자 양성 과정',25,600,'CT-CP');
insert into LECTURES(TITLE,DETL,CAPA,HOURS,CATEG)
  values('리눅스 관리','정부지원 리눅스 관리자 양성 과정',30,400,'CT-LI');

/* 강사 등록 */
insert into TRAINERS(NAME,PHOT,EMAIL,TEL)
  values('홍강사','hong.png','hongt@test.com','222-1111');
insert into TRAINERS(NAME,PHOT,EMAIL,TEL)
  values('김강사','kim.png','kimt@test.com','222-1112');
insert into TRAINERS(NAME,PHOT,EMAIL,TEL)
  values('박강사','park.png','parkt@test.com','222-1113');  

/* 강의에 강사 배정 */
insert into LEC_TRAIN(LNO,TNO) values(1, 1);
insert into LEC_TRAIN(LNO,TNO) values(1, 2);
insert into LEC_TRAIN(LNO,TNO) values(2, 1);
insert into LEC_TRAIN(LNO,TNO) values(2, 2);
insert into LEC_TRAIN(LNO,TNO) values(3, 3);

  
  
  
  
  
  

