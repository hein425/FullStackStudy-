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

-- insert: create : 회원가입, 글쓰기, 리뷰쓰기
-- form input 데이터 최소한의 암호화, 보안
-- 주소창에 데이터가 노출되지 않음
-- <form method="post"></form>

-- select : read : 게시물 목록, 검색결과, 회원정보
-- 주소창에 검색하고자 하는 키워드: 제목 구인 
-- selelct * form board where title like '%구인%';
-- <form method="get" action=""></form>

-- U:update 데이터수정, 방식 post:
-- <form method="patch" action=""></form>

-- D: delete 데이터삭제, 게시글삭제, 리뷰삭제, 회원탈되(? 는 애미)
-- <form method="delete" action=""></form>
-- 기술면접에 많이나옴

