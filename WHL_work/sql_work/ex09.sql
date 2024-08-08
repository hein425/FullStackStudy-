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




 



