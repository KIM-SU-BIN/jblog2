-- 삭제 --
drop table comments;
drop sequence seq_comments_no;

-- 테이블 생성 --
create table comments (
    cmtNo 			number,
    postNo          number,
    no              number,
    cmtContent 		varchar2(1000) not null,
    regDate 		date not null,
    primary key(cmtNo)
);


-- 시퀀스 생성 --
create sequence seq_comments_no
increment by 1
start with 1
nocache;

-- 인서트 --
insert into comments
values('cmtNo', 'postNo', seq_users_no.nextval, 'cmtContent', sysdate);

-- 조회 --
select * from comments;

-- 커밋 --
commit;

-- 롤백 --
rollback;

-- fk --
ALTER TABLE comments
ADD CONSTRAINT fk_postfk foreign KEY(postNo) references post(postNo);

ALTER TABLE comments
ADD CONSTRAINT fk_usersfk foreign KEY(no) references users(no);
