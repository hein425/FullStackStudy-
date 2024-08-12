select bookname
from book
where price=(select max(price) from book);

-- <<<어제까지 했던거>>>
-- insert into table_name values(1,'정해인','대한민국 대구','010-0000-0000');
-- select* from table_name where custid-1;
-- update table_name set 변경내용 where 조건;
-- create database 데이터베이스이름;
-- drop table 테이블이름;
-- drop database ㄷㅂ이름;
-- delete from 테이블이름 where 조건;

select name
from customer
where custid in (select custid from orders);

-- 어제 7번 문제
select distinct book.bookname
from book,customer,orders
where (customer.custid=orders.custid) and(book.bookid=orders.bookid)and
	  customer.name !='박지성';
--  = customer.name <>'박지성';
-- 	= customer.name NOT in('박지성');

-- 대한미디어에서 출판한 도서를 구매한 고객의 이름을 출력하세요(서브쿼리 사용)
select name publisher
from customer
where custid in (
	select custid
    from orders
    where bookid in(
		select bookid
        from book
        where publisher='대한미디어')
    );
-- 어제 15번
select name, sum(saleprice) as 총구매액
from customer, orders
where (customer.custid=orders.custid)
group by customer.name
order by customer.name;

-- Union 유니온은 세로로 붙임 )))))))))))))))))))))))))))))))))))
-- 대한민국에 거주하는 고객리스트 출력
select address, name
from customer
where address like '%대한민국%';

-- 도서를 주문한 고객리스트 출력(서브쿼리로)
select name
from customer
where custid in(select custid from orders);

-- 대한민국에 거주하는 고객의 이름과 도서를 주문한 고객의 이름을 출력하세요
select name
from customer
where address like '대한민국%'
union
select name
from customer
where custid in(select custid from orders);

-- 주문이 있는 고객의 이름과 주소를 나타내시오(조인 , exists)

select name, address
from customer cs
where exists(select* from orders od where cs.custid=od.custid);

-- 새 테이블 만들기))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))) 테이블 수정은 얼터테이블로 수정
CREATE TABLE newbook(
 bookid INTEGER primary key,
 bookname VARCHAR(20),
 publisher VARCHAR(20),
 price INTEGER,
 primary key (bookname, publisher)  -- 복합키  
 );
 
-- 복합키, 생각보다 많이 씀 예) 모든 메시지를 관리하는 코드 테이블면
-- id_1 대분류(0:회원관련)
-- id_2 중분류(0:회원관련 1:로그인/로그아웃)
-- id_3 소분류(0:가입성공) 
-- msg 출력내용

-- 	code table
--  create table tblCode(
--  id_1 char(2) not null,
--  id_2 char(2) not null,
--  id_3 char(3) not null,
--  msg varchar(60) not null,
--  primary key (id_1, id_2, id_3)  <=위에 1,2,3이 합쳐져야 하나가 됨
--  );
--  insert into tblCode ('00','00','000','회원가입을 환영합니다.')
--  insert into tblCode ('00','01','001','로그인 되었습니다.')
--  insert into tblCode ('00','01','002','로그아웃 되었습니다.')
--  insert into tblCode ('00','00','001','중복된 아이디 입니다.')
									  
create table newcustomer(
	custid integer primary key,
    name varchar(40),
    address varchar(40),
    phone varchar(30)
);

create table neworders(
	orderid integer primary key,
	custid integer not null,
    bookid integer not null,
    saleprice integer,
    orderdate date,
    FOREIGN KEY(custid) REFERENCES newcustomer(custid) on delete cascade -- 연쇄삭제.//on update cascade: 변경돼면 같이 변경되는거
    );
    
    alter table newbook add isbn varchar(13);
    
    describe newbook;
    
    alter table newbook modify isbn integer;

    alter table newbook drop isbn;
    
    alter table newbook modify bookname varchar(20) not null;
    
    alter table newbook add primary  key (bookname,publisher);
        
    alter table newbook add primary key( bookname, publisher );

    drop table newbook;
    
    -- 업데이트, 딜리트는 웨어 반드시 적기
    update newbook set bookname='하하' where bookid = '2'; 
    delete from newbook where bookid='1';
    
    INSERT INTO Book(bookid,bookname,publisher,price) VALUES(11,'스포츠의학','한솔의학서적',90000);
    
    
-- <<<<<<<<<<<>><<<<<<<<<<<<<<<<<< 문제풀기 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        
-- 1)박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 이름
 select name , publisher
 from customer , book , orders
 where (customer.custid = orders.custid) and (book.bookid = orders.bookid) and
       publisher in ('굿스포츠','나무수','대한미디어');
        
-- 2)두개 이상의 서로다른 출판사에서 도서를 구매한 고객의 이름
 select C.name, count(B.publisher)
 from customer C, book B, orders O
 where (C.custid=O.custid) and (B.bookid=O.bookid)
 group by name
 having count( distinct B.publisher ) >= 2;

-- 3)전체 고객의 30% 이상이 구매한 도서
 select B.bookname , count(O.bookid) as 판매량
 from customer C, book B, orders O
 where (C.custid=O.custid) and (B.bookid=O.bookid)
 group by bookname
 having ((count( O.bookid )/ max(O.custid))*100) >= 30;






