create database university;
use university;

drop table  professor;

create table professor( -- 교수 테이블
p_ssn varchar(15) not null primary key,
p_name varchar(30) not null,
p_age char(3) not null,
p_rank varchar(5) not null,
p_speciality varchar(20) not null
);

create table department( -- 학과
 dno varchar(15) not null primary key,
 dname varchar(30) not null,
 office varchar(10) not null,
 runner varchar(15) not null, -- 학과장
 foreign key(runner) references professor(p_ssn)
);

create table graduate( -- 대학원생
 g_ssn varchar(15) not null primary key,
 g_name varchar(30) not null,
 g_age integer null,
 deg_prog varchar(3) not null,
 major varchar(15) not null, -- 전공
 foreign key(major) references department(dno),
 advisor varchar(13) null,
 foreign key(advisor) references graduate(g_ssn)
);

create table project( -- 과제
 pid varchar(15) not null primary key, -- 과제번호
 sponsor varchar(30) null,
 start_date date not null,
 end_date date not null,
 budget varchar(30) not null,
 manage varchar(15) not null,
 foreign key(manage) references professor(p_ssn)
 );

-- create table runner( -- 학과장   이거 그냥 학과에다 넣어버려
-- p_ssn integer not null,
-- dno integer null,
-- primary key (p_ssn, dno),
-- foreign key(p_ssn) references professor(p_ssn),
-- foreign key(dno) references department(dno)
-- );

create table work_dept( -- 여러과 근무자(맵핑 해주는 릴레이션 테이블)
p_ssn varchar(15) not null,
dno varchar(15) not null,
pct_time varchar(3) null default'0',
primary key (p_ssn, dno),
foreign key(p_ssn) references professor(p_ssn),
foreign key(dno) references department(dno)
);

-- create table major( -- 전공
--  g_ssn integer not null,
--  dno integer null,
--  primary key (g_ssn, dno),
--  foreign key(g_ssn) references graduate(g_ssn),
--  foreign key(dno) references department(dno)
-- );

-- create table works( -- 과제 수행 테이블
-- p_ssn integer not null,
-- g_ssn integer not null,
-- pid integer not null,
-- primary key(p_ssn, g_ssn, pid),
-- foreign key(p_ssn) references professor(p_ssn),
-- foreign key(g_ssn) references graduate(g_ssn),
-- foreign key(pid) references project(pid)
-- );

create table work_in( -- 과제 수행 테이블
p_ssn varchar(15) not null,
pid varchar(15) not null,
primary key(p_ssn, pid),
foreign key(p_ssn) references professor(p_ssn),
foreign key(pid) references project(pid)
);

create table work_prog( -- 과제 수행 테이블
g_ssn varchar(15) not null, -- 연구조교
pid varchar(15) not null,
primary key(g_ssn, pid),
foreign key(g_ssn) references graduate(g_ssn),
foreign key(pid) references project(pid)
);