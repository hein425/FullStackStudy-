-- 프로시져 만들기!! 

use madangdb;

select * from book;

delimiter //
create PROCEDURE dorepeat(p1 int)
	begin
		set @x=0;
        repeat set @x = @x + 1; 
        UNTIL @x > p1 END REPEAT;
        end//
        
call dorepeat(1000);

select @x


drop procedure insertbook;

delimiter //
create procedure insertbook(
	IN mybookid integer,
    IN mybookname varchar(40),
    IN mypublisher varchar(40),
    IN myprice integer)
begin
	insert into book(bookid, bookname, publisher, price)
		values(mybookid, mybookname, mypublisher, myprice);
END;
//
delimiter ;

call insertbook(13, '스포츠과학', '마당과학서적', 25000);
select*from book;

-- 도서 명 점검 후 삽입하는 프로시져
delimiter //
create procedure bookinsertorupdate(
	 mybookid integer,
     mybookname varchar(40),
     mypublisher varchar(40),
     myprice integer)
begin
	declare mycount integer;
    select count(*) into mycount from book where bookname like mybookname;
    if mycount !=0 then
     set SQL_SAFE_UPDATES=0;   -- 딜릿, 업뎃 할때 필요한 설정문
        update book set price = myprice
		where bookname like mybookname;
	else
		insert into book(bookid, bookname, publisher, price)
		values(mybookid, mybookname, mypublisher, myprice);
    END if;
end;
//
delimiter ;

call bookinsertorupdate(15,'스포츠의즐거움','마당과학서적',25000);
select * from book;
call bookinsertorupdate(15,'스포츠의즐거움','마당과학서적',20000);


-- 위에 잇던 in 은 반환, out은 아웃풋
-- 평균가격 반환 프로시저

delimiter //
create procedure averageprice(
 OUT averageval integer
)
begin
 select avg(price) into averageval
 from book where price is not null;
end;
//
delimiter ;

call averageprice(@myvalue);
select @myvalue;



set global log_bin_trust_function_creators=ON;

create table book_log(
 bookid_l integer,
 bookname_l varchar(40),
 publisher_l varchar(40),
 price_l integer);

delimiter //
create trigger afterinsertbook
	after insert on book for each row
begin
	declare average integer;
    insert into book_log
    values(new.bookid,new.bookname,new.publisher,new.price);
end;
//
delimiter ;

drop trigger afterinsertbook;


insert into book values(14,'스포츠과학1', '이상미디어', 25000);
select * from book_log;
select * from book where bookid=14;
select * from book_log where bookid_l=14;


-- 푸드코트 DB 만들어 보기 

create database food_court;

use food_court;

create table corner(
c_id varchar(3) primary key,
c_name VARCHAR(20) not null,
c_owner VARCHAR(20) not null
);

create table menu(
m_id varchar(3) primary key,
c_id varchar(3) not null,
foreign key(c_id) references corner(c_id),
m_name varchar(10) not null,
price integer not null
);

create table orders(
o_id varchar(3) not null,
c_id varchar(3) not null,
m_id varchar(3) not null,
cnt integer not null,
o_date datetime not null,
status char(1) null, --
saleprice integer,
foreign key(c_id) references corner(c_id),
foreign key(m_id) references corner(m_id),
primary key(o_id,m_id,o_date)
);

-- <<<<<<<<<<<<<<<<<<<<0809 수업내용: RDB,인덱스,트랜젝션>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

-- 트랜젝션

-- 백업은 ㅈㄴ 중요

-- 동시성제어
-- :예를 들어 동시에 두 유저가 동시에 게시판 이름을 바꾸면(완벽한 동시에는 없긴 한거같음) 락 걸어야함
--  
-- ◆비동기처리(약속표를 주고 바로 처리하는척 하는 느낌)
-- ◇동기처리(회원가입이나 로그인은 이걸로 (기다려야 되는거)) 

-- 검증? 텍스트박스에 뭐 집어넣고 해보는거  숫자드가야 되는데 한글 드가나? 이런거 확인

-- 고립



-- <<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>


-- --- 병원업무관리 ERD - 요구사항

-- >>>>>>>>>>>>>>1. 의사 한 명은 여러 명의 환자를 맡고, 환자 1명은 1명의 의사에게 진료를 받는다. 
-- >>>>>>>>>>>>>>또한 의사는 환자에 대한 모든 정보를 검색할 수 있다.
-- >>>>>>>>>>>>>>2. 환자는 진료내용 등의 정보를 검색할 수 있으며 담당 의사에 대해서도 조회할 수 있다.
-- 3. 간호사는 병원 진료 차트 정보를 검색할 수 있으며, 의사와 더불어 환자를 관리한다.
-- 간호사의 업무는 여러 환자의 진료접수, 환자관리, 차크관리 등이다.
-- >>>>>>>>>>>>>>>4. 모든 의사는 의사ID를 부여하여 식별하며 담당진료과목, 성명, 성별, 연락처, 이메일, 직급을 가진다.
-- >>>>>>>>>>>>>>>5. 모든 환자는 환자ID를 부여하여 식별하며 담당의사, 담당간호사, 환자성명, 주민번호, 성별, 주소, 연락처, 이메일, 직업을 가진다.
-- >>>>>>>>>>>>>>>6. 모든 간호사는 간호사ID를 부여하여 식별하며 담당업무, 성명, 성별, 전화번호, 이메일, 직급을 가진다.
-- >>>>>>>>>>>>>>>7. 진료ID는 날짜+진료순번으로 부여하고 진료한 의사ID, 환자ID, 진료내용, 진료날짜를 포함한다.
-- .....8. 진료받은 환자에 대한 내용은 차트에 기록하고, 차트는 차트번호를 부여하여 식별하며 
-- .....담당 의사ID, 간호사ID, 환자ID와 진료ID 그리고 의사 소견을 차트내용에 기록한다.





