-- 수강신청
DROP TABLE IF EXISTS REQUESTS RESTRICT;

-- 강사
DROP TABLE IF EXISTS TRAINERS RESTRICT;

-- 강좌
DROP TABLE IF EXISTS LECTURES RESTRICT;

-- 매니저
DROP TABLE IF EXISTS MANAGERS RESTRICT;

-- 학생
DROP TABLE IF EXISTS STUDENTS RESTRICT;

-- 강의실
DROP TABLE IF EXISTS CLASSES RESTRICT;

-- 주소
DROP TABLE IF EXISTS ADDRESSES RESTRICT;

-- 사진
DROP TABLE IF EXISTS PHOTOES RESTRICT;

-- 강사배정
DROP TABLE IF EXISTS LEC_TRAIN RESTRICT;

-- 최종학력
DROP TABLE IF EXISTS GRAD_CODE RESTRICT;

-- 직급
DROP TABLE IF EXISTS LVL_CODE RESTRICT;

-- 분류
DROP TABLE IF EXISTS CAT_CODE RESTRICT;

-- 수강신청
CREATE TABLE REQUESTS (
  RNO    INTEGER  NOT NULL COMMENT '수강신청번호', -- 수강신청번호
  LNO    INTEGER  NOT NULL COMMENT '강좌번호', -- 강좌번호
  SNO    INTEGER  NOT NULL COMMENT '학생번호', -- 학생번호
  REG_DT DATETIME NOT NULL COMMENT '신청일' -- 신청일
)
COMMENT '수강신청';

-- 수강신청
ALTER TABLE REQUESTS
  ADD CONSTRAINT PK_REQUESTS -- 수강신청 기본키
    PRIMARY KEY (
      RNO -- 수강신청번호
    );

-- 강사
CREATE TABLE TRAINERS (
  TNO   INTEGER      NOT NULL COMMENT '강사일련번호', -- 강사일련번호
  NAME  VARCHAR(50)  NOT NULL COMMENT '강사명', -- 강사명
  PHOT  VARCHAR(255) NOT NULL COMMENT '사진', -- 사진
  EMAIL VARCHAR(60)  NOT NULL COMMENT '이메일', -- 이메일
  TEL   VARCHAR(30)  NOT NULL COMMENT '전화' -- 전화
)
COMMENT '강사';

-- 강사
ALTER TABLE TRAINERS
  ADD CONSTRAINT PK_TRAINERS -- 강사 기본키
    PRIMARY KEY (
      TNO -- 강사일련번호
    );

-- 강사 유니크 인덱스
CREATE UNIQUE INDEX UIX_TRAINERS
  ON TRAINERS ( -- 강사
    EMAIL ASC -- 이메일
  );

-- 강좌
CREATE TABLE LECTURES (
  LNO     INTEGER      NOT NULL COMMENT '강좌번호', -- 강좌번호
  TITLE   VARCHAR(255) NOT NULL COMMENT '강좌명', -- 강좌명
  DETL    TEXT         NOT NULL COMMENT '상세설명', -- 상세설명
  CAPA    INTEGER      NOT NULL COMMENT '수용인원', -- 수용인원
  ST_DT   DATE         NULL     COMMENT '강의시작일', -- 강의시작일
  ED_DT   DATE         NULL     COMMENT '강의종료일', -- 강의종료일
  HOURS   INTEGER      NOT NULL COMMENT '전체강의시간', -- 전체강의시간
  CATEG   CHAR(5)      NOT NULL COMMENT '분류코드', -- 분류코드
  FRE_CST CHAR(1)      NULL     DEFAULT 'N' COMMENT '국비지원여부', -- 국비지원여부
  COST    INTEGER      NULL     COMMENT '강의료', -- 강의료
  CID     CHAR(5)      NULL     COMMENT '강의실번호', -- 강의실번호
  MNO     INTEGER      NULL     COMMENT '매니저번호' -- 매니저번호
)
COMMENT '강좌';

-- 강좌
ALTER TABLE LECTURES
  ADD CONSTRAINT PK_LECTURES -- 강좌 기본키
    PRIMARY KEY (
      LNO -- 강좌번호
    );

-- 매니저
CREATE TABLE MANAGERS (
  MNO   INTEGER      NOT NULL COMMENT '매니저번호', -- 매니저번호
  NAME  VARCHAR(50)  NOT NULL COMMENT '매니저명', -- 매니저명
  PHOT  VARCHAR(255) NOT NULL COMMENT '사진', -- 사진
  EMAIL VARCHAR(60)  NOT NULL COMMENT '이메일', -- 이메일
  TEL   VARCHAR(30)  NOT NULL COMMENT '전화', -- 전화
  LEVEL CHAR(5)      NULL     COMMENT '직급코드', -- 직급코드
  DEPT  VARCHAR(50)  NULL     COMMENT '부서' -- 부서
)
COMMENT '매니저';

-- 매니저
ALTER TABLE MANAGERS
  ADD CONSTRAINT PK_MANAGERS -- 매니저 기본키
    PRIMARY KEY (
      MNO -- 매니저번호
    );

-- 매니저 유니크 인덱스
CREATE UNIQUE INDEX UIX_MANAGERS
  ON MANAGERS ( -- 매니저
    EMAIL ASC -- 이메일
  );

-- 학생
CREATE TABLE STUDENTS (
  SNO      INTEGER      NOT NULL COMMENT '학생번호', -- 학생번호
  NAME     VARCHAR(50)  NOT NULL COMMENT '학생명', -- 학생명
  PHOT     VARCHAR(255) NULL     COMMENT '사진', -- 사진
  EMAIL    VARCHAR(60)  NOT NULL COMMENT '이메일', -- 이메일
  TEL      VARCHAR(30)  NOT NULL COMMENT '전화', -- 전화
  GRADE    CHAR(5)      NOT NULL COMMENT '최종학력코드', -- 최종학력코드
  SCHL     VARCHAR(50)  NULL     COMMENT '최종학교', -- 최종학교
  WORK     CHAR(1)      NOT NULL COMMENT '재직자여부', -- 재직자여부
  JUMIN    VARCHAR(13)  NULL     COMMENT '주민번호', -- 주민번호
  ANO      INTEGER      NULL     COMMENT '주소번호', -- 주소번호
  DET_ADDR VARCHAR(255) NULL     COMMENT '상세주소' -- 상세주소
)
COMMENT '학생';

-- 학생
ALTER TABLE STUDENTS
  ADD CONSTRAINT PK_STUDENTS -- 학생 기본키
    PRIMARY KEY (
      SNO -- 학생번호
    );

-- 학생 유니크 인덱스
CREATE UNIQUE INDEX UIX_STUDENTS
  ON STUDENTS ( -- 학생
    EMAIL ASC -- 이메일
  );

-- 학생 유니크 인덱스2
CREATE UNIQUE INDEX UIX_STUDENTS2
  ON STUDENTS ( -- 학생
    TEL ASC -- 전화
  );

-- 학생 유니크 인덱스3
CREATE UNIQUE INDEX UIX_STUDENTS3
  ON STUDENTS ( -- 학생
    JUMIN ASC -- 주민번호
  );

-- 학생 인덱스
CREATE INDEX IX_STUDENTS
  ON STUDENTS( -- 학생
    NAME ASC -- 학생명
  );

-- 강의실
CREATE TABLE CLASSES (
  CID  CHAR(5)     NOT NULL COMMENT '강의실번호', -- 강의실번호
  NAME VARCHAR(50) NOT NULL COMMENT '강의실' -- 강의실
)
COMMENT '강의실';

-- 강의실
ALTER TABLE CLASSES
  ADD CONSTRAINT PK_CLASSES -- 강의실 기본키
    PRIMARY KEY (
      CID -- 강의실번호
    );

-- 주소
CREATE TABLE ADDRESSES (
  ANO      INTEGER      NOT NULL COMMENT '주소번호', -- 주소번호
  PST_NO   CHAR(5)      NOT NULL COMMENT '우편번호', -- 우편번호
  BAS_ADDR VARCHAR(255) NOT NULL COMMENT '기본주소' -- 기본주소
)
COMMENT '주소';

-- 주소
ALTER TABLE ADDRESSES
  ADD CONSTRAINT PK_ADDRESSES -- 주소 기본키
    PRIMARY KEY (
      ANO -- 주소번호
    );

-- 사진
CREATE TABLE PHOTOES (
  PNO  INTEGER      NOT NULL COMMENT '사진번호', -- 사진번호
  CID  CHAR(5)      NOT NULL COMMENT '강의실번호', -- 강의실번호
  PHOT VARCHAR(255) NOT NULL COMMENT '사진' -- 사진
)
COMMENT '사진';

-- 사진
ALTER TABLE PHOTOES
  ADD CONSTRAINT PK_PHOTOES -- 사진 기본키
    PRIMARY KEY (
      PNO -- 사진번호
    );

-- 강사배정
CREATE TABLE LEC_TRAIN (
  LNO   INTEGER NOT NULL COMMENT '강좌번호', -- 강좌번호
  TNO   INTEGER NOT NULL COMMENT '강사일련번호', -- 강사일련번호
  ST_DT DATE    NULL     COMMENT '강의시작일', -- 강의시작일
  ED_DT DATE    NULL     COMMENT '강의종료일' -- 강의종료일
)
COMMENT '강사배정';

-- 강사배정
ALTER TABLE LEC_TRAIN
  ADD CONSTRAINT PK_LEC_TRAIN -- 강사배정 기본키
    PRIMARY KEY (
      LNO, -- 강좌번호
      TNO  -- 강사일련번호
    );

-- 최종학력
CREATE TABLE GRAD_CODE (
  GID  CHAR(5)     NOT NULL COMMENT '최종학력코드', -- 최종학력코드
  NAME VARCHAR(50) NOT NULL COMMENT '최종학력명' -- 최종학력명
)
COMMENT '최종학력';

-- 최종학력
ALTER TABLE GRAD_CODE
  ADD CONSTRAINT PK_GRAD_CODE -- 최종학력 기본키
    PRIMARY KEY (
      GID -- 최종학력코드
    );

-- 직급
CREATE TABLE LVL_CODE (
  LID  CHAR(5)     NOT NULL COMMENT '직급코드', -- 직급코드
  NAME VARCHAR(50) NOT NULL COMMENT '직급명' -- 직급명
)
COMMENT '직급';

-- 직급
ALTER TABLE LVL_CODE
  ADD CONSTRAINT PK_LVL_CODE -- 직급 기본키
    PRIMARY KEY (
      LID -- 직급코드
    );

-- 분류
CREATE TABLE CAT_CODE (
  CTID CHAR(5)     NOT NULL COMMENT '분류코드', -- 분류코드
  NAME VARCHAR(50) NOT NULL COMMENT '분류명' -- 분류명
)
COMMENT '분류';

-- 분류
ALTER TABLE CAT_CODE
  ADD CONSTRAINT PK_CAT_CODE -- 분류 기본키
    PRIMARY KEY (
      CTID -- 분류코드
    );

-- 수강신청
ALTER TABLE REQUESTS
  ADD CONSTRAINT FK_LECTURES_TO_REQUESTS -- 강좌 -> 수강신청
    FOREIGN KEY (
      LNO -- 강좌번호
    )
    REFERENCES LECTURES ( -- 강좌
      LNO -- 강좌번호
    );

-- 수강신청
ALTER TABLE REQUESTS
  ADD CONSTRAINT FK_STUDENTS_TO_REQUESTS -- 학생 -> 수강신청
    FOREIGN KEY (
      SNO -- 학생번호
    )
    REFERENCES STUDENTS ( -- 학생
      SNO -- 학생번호
    );

-- 강좌
ALTER TABLE LECTURES
  ADD CONSTRAINT FK_CLASSES_TO_LECTURES -- 강의실 -> 강좌
    FOREIGN KEY (
      CID -- 강의실번호
    )
    REFERENCES CLASSES ( -- 강의실
      CID -- 강의실번호
    );

-- 강좌
ALTER TABLE LECTURES
  ADD CONSTRAINT FK_MANAGERS_TO_LECTURES -- 매니저 -> 강좌
    FOREIGN KEY (
      MNO -- 매니저번호
    )
    REFERENCES MANAGERS ( -- 매니저
      MNO -- 매니저번호
    );

-- 강좌
ALTER TABLE LECTURES
  ADD CONSTRAINT FK_CAT_CODE_TO_LECTURES -- 분류 -> 강좌
    FOREIGN KEY (
      CATEG -- 분류코드
    )
    REFERENCES CAT_CODE ( -- 분류
      CTID -- 분류코드
    );

-- 매니저
ALTER TABLE MANAGERS
  ADD CONSTRAINT FK_LVL_CODE_TO_MANAGERS -- 직급 -> 매니저
    FOREIGN KEY (
      LEVEL -- 직급코드
    )
    REFERENCES LVL_CODE ( -- 직급
      LID -- 직급코드
    );

-- 학생
ALTER TABLE STUDENTS
  ADD CONSTRAINT FK_ADDRESSES_TO_STUDENTS -- 주소 -> 학생
    FOREIGN KEY (
      ANO -- 주소번호
    )
    REFERENCES ADDRESSES ( -- 주소
      ANO -- 주소번호
    );

-- 학생
ALTER TABLE STUDENTS
  ADD CONSTRAINT FK_GRAD_CODE_TO_STUDENTS -- 최종학력 -> 학생
    FOREIGN KEY (
      GRADE -- 최종학력코드
    )
    REFERENCES GRAD_CODE ( -- 최종학력
      GID -- 최종학력코드
    );

-- 사진
ALTER TABLE PHOTOES
  ADD CONSTRAINT FK_CLASSES_TO_PHOTOES -- 강의실 -> 사진
    FOREIGN KEY (
      CID -- 강의실번호
    )
    REFERENCES CLASSES ( -- 강의실
      CID -- 강의실번호
    );

-- 강사배정
ALTER TABLE LEC_TRAIN
  ADD CONSTRAINT FK_LECTURES_TO_LEC_TRAIN -- 강좌 -> 강사배정
    FOREIGN KEY (
      LNO -- 강좌번호
    )
    REFERENCES LECTURES ( -- 강좌
      LNO -- 강좌번호
    );

-- 강사배정
ALTER TABLE LEC_TRAIN
  ADD CONSTRAINT FK_TRAINERS_TO_LEC_TRAIN -- 강사 -> 강사배정
    FOREIGN KEY (
      TNO -- 강사일련번호
    )
    REFERENCES TRAINERS ( -- 강사
      TNO -- 강사일련번호
    );