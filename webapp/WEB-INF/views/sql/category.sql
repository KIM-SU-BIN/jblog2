-- 삭제 --
drop table category;
drop sequence seq_category_no;

-- 테이블 생성 --
create table category (
    cateNo 			number,
    id 				varchar2(50),
    cateName 		varchar2(200) not null,
    description 	varchar2(500),
    regDate 		date not null,
    primary key(cateNo)
);

-- 시퀀스 생성 --
create sequence seq_category_no
increment by 1
start with 1
nocache;

-- 인서트 --
insert into category
values(seq_category_no.nextval, 'zoe', '김수빈', 'description', sysdate);

-- 조회 --
select * from category;

select no
        ,id
        ,cateName
        ,description
        ,to_char(regDate, 'YYYY-MM-DD HH:MI:SS') "regDate"
from category;

-- 커밋 --
commit;

-- 롤백 --
rollback;

--fk--
ALTER TABLE post
ADD CONSTRAINT fk_postfk foreign KEY(cateNo) references category(cateNo);