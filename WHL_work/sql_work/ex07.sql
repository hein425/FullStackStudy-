-- 정규화: 중복제거(참조 통해 사용),
-- 이상현상: 삽입시, 삭제시, 수정시  <== 설계가 잘못돼서 그럼.

create database realestate;
drop database realestate;

-- <<단독소유 하는 경우>>
-- create table 부동산소유(
--  필지번호
--  주소
--  공시지가
--  주민등록번호
--  );

-- create table 소유자(
--  주민번호
--  이름
--  전화번호
-- );

-- <<공동소유 하는 경우>>
-- create table 부동산소유(필지번호 주민번호) -- 맨끝에 만들고 포린키로 참조

-- create table 부동산필지(필지번호 주소 공시지가)

-- create table 소유자(주민번호 이름 전화번호)

show databases;

-- 유저 만들기
use mysql;
show tables;
desc user;

select * from user;

create user hein@localhost identified by "12345678"; 
      			-- '%' 이건 외부접속 아이디.

create user guest@localhost identified by "12345678"; 
drop user guest@localhost; -- 계정삭제

create user guest2 identified by "12345678";

-- 권한허가 grant
 
grant all privileges on university.* to hein@localhost; -- 그랜트는 커밋 같은 느낌 플러쉬가 푸시 같은 느낌
						-- *.* :모든db 모든 테이블
flush privileges;

show grants for hein@localhost;

grant select on madangdb.book to hein@localhost;
flush privileges;

select * from user;


