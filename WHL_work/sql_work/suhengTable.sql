-- 수행평가 관리 데이터베이스 만들어보자


CREATE TABLE student( -- 학생테이블: 나이스에서 받아오는 정보
-- school VARCHAR(40), 어차피 정해짐
sno integer,
sname varchar(40),
입학년도 date,
s학년 integer,
s학반 integer,
s학번 integer,
비번 varchar(20),
primary key (입학년도+s학년+s학반+s학번)
);

CREATE TABLE teacher( -- 선생님테이블
ID varchar(20) primary key,
비번 varchar(20),
이름 varchar(40),
과목 varchar(10),
상태 char(1)

);