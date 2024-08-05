-- 수행평가 관리 데이터베이스 만들어보자

create database highschool;
use highschool;

drop table teacher;

CREATE TABLE student( -- 학생테이블: 나이스에서 받아오는 정보
-- school VARCHAR(40), 어차피 정해짐
s_id integer auto_increment primary key,
s_name varchar(30) not null,
s_year char(4) not null,
s_grade varchar(5) not null,
s_class varchar(5) not null,
s_no varchar(2) not null,
s_pass varchar(20) not null default'1234' 
);

CREATE TABLE teacher( -- 선생님테이블
t_id varchar(20) not null primary key,
t_pass varchar(20) not null,
t_name varchar(30) not null,
t_subject varchar(20) not null,
t_type int(1) null default 4
);

create table lesson( -- 수업 테이블
l_id integer not null auto_increment primary key,
t_id varchar(20) not null,
l_name varchar(20) not null,
l_year char(4) not null,
l_grade varchar(2) not null,
l_semester char(1) not null,
l_class varchar(2) null,
l_day char(1) not null,
l_time varchar(2) not null,
l_room varchar(20) null,
foreign key(t_id) references teacher(t_id)
);

create table chul( -- 출석부 ( 수업 듣는 학생)
 s_id integer not null,
 foreign key(s_id) references student(s_year,s_grade,s_class,s_no),
 l_id integer not null,
 foreign key(l_id) references lesson(l_id),
 foreign key(s_id) references study(s_id),
 primary key(l_id, s_id)
);

create table perform( -- 수행평가 
p_id integer auto_increment primary key,
p_title varchar(50) not null,
p_type char(1) null,
p_content tinytext not null,
p_kijun varchar(100) null,
p_start date not null,
p_end date not null,
l_id integer not null,
foreign key(l_id) references lesson(l_id)
);

create table mark(
s_id integer not null,
p_id integer not null,
m_score integer not null,
m_check char(1) null,
m_checkdate date null,
primary key(s_id, p_id),
foreign key(p_id) references perform(p_id),
foreign key(s_id) references student(s_id)
);


