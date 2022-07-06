
-- 삭제 --
drop table post;
drop sequence seq_post_no;

-- 테이블 생성 --
create table post (
    postNo          number,
    cateNo          number,
    postTitle 		varchar2(300) not null,
    postContent     varchar2(4000),
    regDate 		date not null,
    primary key(postNo)
);


-- 시퀀스 생성 --
create sequence seq_post_no
increment by 1
start with 1
nocache;

-- 인서트 --
insert into post
values('postNo', 'cateNo', 'postTitle', 'postContent', sysdate);

-- 조회 --
select * from post;

-- 커밋 --
commit;

-- 롤백 --
rollback;

--fk--
ALTER TABLE comments
ADD CONSTRAINT fk_commentsfk2 foreign KEY(postNo) references post(postNo);