-- 삭제 --
drop table users;
drop sequence seq_users_no;

-- 테이블 생성 --
create table users (
    no 			    number,
    id 				varchar2(50) unique not null,
    name 			varchar2(100) not null,
    password 		varchar2(50) not null,
    joinDate 		date not null,
    primary key(no)
);

-- 시퀀스 생성 --
create sequence seq_users_no
increment by 1
start with 1
nocache;

-- 인서트 --
insert into users
values(seq_users_no.nextval, 'zoe', '김수빈', '1111', sysdate);

-- 조회 --
select * from users;

select no
        ,id
        ,name
        ,password
        ,to_char(joinDate, 'YYYY-MM-DD HH:MI:SS') "joinDate"
from users;

-- 커밋 --
commit;

-- 롤백 --
rollback;

--fk--
ALTER TABLE users
ADD CONSTRAINT fk_userfk foreign KEY(id) references blog(id);