-- 김연아 핸드폰 번호를 나타내시오   
select name,phone from customer
where name like'%김연아%';

-- 만원 이상인 책들과 출판사를 나타내시오
select bookname,publisher,price from book
where price >= 10000;

-- 만원이상 이만원이하인 책들과 출판사를 나타내시오
select bookname, publisher,price from book
where 10000<= price and price <=20000;
-- where between 10000 and 20000; 이렇게 적어도 위꺼랑 같음

-- distinct 쓰면 중복 제거
select distinct publisher
from book;

-- 전화번호 null인 사람 이름찾기
select name, phone from customer
where phone is null;

-- 전화번호 null이 아닌 사람 이름찾기
select name, phone from customer
where phone is not null;

-- 출판사가 굿스포츠 가격이 10000이상 20000미만
select bookname, publisher, price from book
where (price between 10000 and 19999) and (publisher like '굿스포츠');
									      -- (publisher = '굿스포츠')
                                          
-- 출판사가 굿스포츠 혹은 대한미디어인 도서 검색 
select bookname , publisher 
from book
where (publisher like'대한미디어')or(publisher like '굿스포츠') ; 

-- 출판사가 굿스포츠 혹은 대한미디어인 도서 검색( in 사용하기~~)
select bookname , publisher 
from book
where publisher in ('대한미디어','굿스포츠');

-- 출판사가 굿스포츠 혹은 대한미디어가 아닌 도서 검색 
select bookname , publisher bookid
from book
where publisher NOT IN ('대한미디어','굿스포츠') ; 

-- 두번째 글자가 '구'로 시작하는 책 찾기
-- 첫번째 글자 상관하지 않고 두번째 글자가 구 인 모든책
select *
from Book
where bookname LIKE '_구%';

-- 데이터 수정하기
update book
set bookname='그 여자의 축구'
where bookid=2;

 -- 데이터 삭제하기
 -- 딜리트는 잘 쓰지 않고 업데이트를 쓰면서 태그를 붙이는 식으로 함
 -- 테이블 유지, 보수를 위해 갈라서 씀. 플래그 잘 안씀. 히스토리는 잘 건들일 없음 
delete from book
where bookid=12;

-- 정렬하기
-- 별말 안붙이면 asc
-- desc(역
select *
from book
order by bookname desc;

-- 가격순으로 정렬하고 같은가격에선 이름순으로 정렬하기
select *
from book
order by price desc, bookname;

-- 집계함수의 종류
select SUM(saleprice)
from Orders;

select AVG(saleprice)
from Orders;

select price as '판매가격'
from book;

select count(saleprice)
from Orders;

select MAX(saleprice)
from Orders;

select MIN(saleprice)
from Orders;                   

select sum(saleprice) as total,
	   AVG(saleprice) as Average,
       min(saleprice) as Minimum,
       max(saleprice) as Maximum
from orders;

select count(*)
from orders;

-- 고객별(group by)로 주문한 총수량(count)과 총 판매액(sum)을 구하시오
select custid,count(*) as'총수량',sum(saleprice)as'총판매액'
from orders
group by custid;

-- 가격이 8천 이상인 도서를 구매한 고객에 대하여  고객별 주문 도서의 총수량을 구하세용
-- 단, 두권 이상 구매한 고객에 대해서만 구하세요 
select custid,count(*)
from orders
where (saleprice >=8000)
group by custid
having count(*) >= 2 ;

-- 커스터머 테이블의 cudtid와 오더 테이블의 custid 합치기
select *
from customer,orders
WHERE customer.custid=orders.custid
order by customer.custid;

-- 고객별롲 ㅜ문한 도서 총판매액, 고객별로 정렬
select name,sum(saleprice)
from customer,orders
where customer.custid=orders.custid
group by customer.name
order by customer.name;

-- 8000이상 구매고객에 대해 고객별 주문도서 총 수량 구하기. 고객번호 말고 입력으로 표시
select name, count(*)
from customer,orders
where (customer.custid=orders.custid) and (orders.saleprice >= 8000)
group by customer.name
order by customer.name;

-- 고객의 이름과 고객이 주문한 도서의 이름을 구하시오
select customer.name , book.bookname
from book,customer,orders
where (book.bookid=orders.bookid) and (customer.custid=orders.custid)
order by book.bookname;

-- 가격이 2만원 이상인 책을 주문한 고객의 이름과 주문한 도서의 이름을 구하세용
select customer.name , book.bookname, book.price
from book,customer,orders
where (book.bookid=orders.bookid) and (customer.custid=orders.custid) and (price >= 20000)
order by book.bookname;


 -- 연습문제)))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))
-- 1)도서번호가 1인 도서 이름
select bookid, bookname
from  book
where bookid = 1;

-- 2)가격이 2만원 이상인 도서의 이름
select price,bookname
from book
where price >= 20000;

-- 3)박지성의 총 구매금액
select name, sum(saleprice)
from orders,customer
where (customer.custid=orders.custid) and (name='박지성');

-- 4)박지성이 구매한 도서의 수
select name, count(*)
from orders,customer
where (customer.custid=orders.custid) and (name='박지성');

-- 5)박지성이 구매한 도서의 출판사 수
select name, count(publisher)
from orders,customer,book
where (customer.custid=orders.custid) and(book.bookid=orders.bookid)and (name='박지성');

-- 6)박지성이 구매한 도서의 이름,가격,정가와 판매가의 차이
select name , bookname, price,(price-saleprice) as '차이'
from orders,customer,book
where (customer.custid=orders.custid) and(book.bookid=orders.bookid)and (name='박지성');

-- 7)박지성이 구매하지 않은 도서의 이름
select distinct book.bookname
from book,customer,orders
where (customer.custid=orders.custid) and(book.bookid=orders.bookid)and
	  orders.custid NOT IN (1) ;
      
-- 8)마당서점 도서의 총 갯수
select count(*)
from orders;

-- 9)마당서점에 도서를 납품하는 출판사의 총 개수
select  count(distinct publisher) as '납품하는 출판사 총'
from book;

-- 10)모든 고객의 이름, 주소
select name, address
from customer;

-- 11)2024년 7월 4일 부터 7월7일 사이에 주문된 도서 목록
select orderdate, bookname
from orders, book
where (orders.bookid=book.bookid) and 
	  (orderdate between '2024-07-04' and '2024-07-07');
      
-- 12)성이 김씨인 고객의 이름과 주소
select name, address
from customer
where name like '김%';

-- 13)성이 김씨, 이름이 아로 끝나는 고객의 이름과 주소
select name, address
from customer
where (name like '김%')and (name like '%아');

-- 14)주문 금액의 총액과 평균금액
select sum(saleprice), avg(saleprice)
from orders;

-- 15)고객의 이름과 고객별 구매액
select name, sum(saleprice) as 고객별구매액
from customer, orders
where (customer.custid=orders.custid)
group by name;

-- 16)고객의 이름과 고객이 구매한 도서 목록
select customer.name, book.bookname
from customer, book, orders
where (customer.custid=orders.custid) and (book.bookid=orders.bookid)
order by name;
-- )))))))))))))))))))))))))))))))))))))))))))))))))))))))))

-- 가장 비싼 도서의 이름은?  sql 안에 sql이 또 잇는 서브쿼리
select bookname, price
from book
where price = (select max(price)from book); 

-- 도서를 구매한 이력이 있는 고객명

select distinct name
from customer,orders
where customer.custid=orders.custid;

-- 서브쿼리 사용 
select name
from customer
where custid in (select distinct custid from orders);


