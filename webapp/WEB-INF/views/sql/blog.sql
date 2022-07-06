-- 삭제 --
drop table blog;
drop sequence seq_blog_no;

-- 테이블 생성 --
create table blog (
    id 				varchar2(50) ,
    blogTitle 		varchar2(200) not null,
    logoFile 		varchar2(200),
    primary key(id)
);

-- 인서트 --
insert into blog
values('zoe', '김수빈블로그', 'blogfile');

-- 조회 --
select * from blog;

-- 커밋 --
commit;

-- 롤백 --
rollback;
