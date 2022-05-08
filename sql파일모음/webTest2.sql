/* 사용자들 */
CREATE TABLE USERS (
	id VARCHAR2(20) NOT NULL, /* 아이디 */
	student_id VARCHAR2(20) NOT NULL, /* 학번 */
	password VARCHAR2(20) NOT NULL, /* 비밀번호 */
	name VARCHAR2(20) NOT NULL, /* 이름 */
	email VARCHAR2(40) NOT NULL, /* 이메일 */
	phone_number VARCHAR2(20) NOT NULL, /* 전화번호 */
	gender VARCHAR2(10) NOT NULL, /* 성별 */
	birthday VARCHAR2(20) NOT NULL, /* 생년월일 */
	hobby VARCHAR2(80) NOT NULL /* 취미 */
);

ALTER TABLE users MODIFY (password NOT NULL);
ALTER TABLE users MODIFY (name NOT NULL);
ALTER TABLE users MODIFY (email NOT NULL);
ALTER TABLE users MODIFY (phone_number NOT NULL);
ALTER TABLE users MODIFY (gender NOT NULL);
ALTER TABLE users MODIFY (birthday NOT NULL);
ALTER TABLE users MODIFY (hobby NOT NULL);
ALTER TABLE users MODIFY (name NOT NULL);

ALTER TABLE users RENAME COLUMN id TO user_id;
delete from USERS;
ALTER TABLE users MODIFY birthday DATE;

SELECT * FROM users;



COMMENT ON TABLE USERS IS '사용자들';

COMMENT ON COLUMN USERS.id IS '아이디';

COMMENT ON COLUMN USERS.student_id IS '학번';

COMMENT ON COLUMN USERS.password IS '비밀번호';

COMMENT ON COLUMN USERS.name IS '이름';

COMMENT ON COLUMN USERS.email IS '이메일';

COMMENT ON COLUMN USERS.phone_number IS '전화번호';

COMMENT ON COLUMN USERS.gender IS '성별';

COMMENT ON COLUMN USERS.birthday IS '생년월일';

COMMENT ON COLUMN USERS.hobby IS '취미';

CREATE UNIQUE INDEX PK_USERS
	ON USERS (
		id ASC
	);

ALTER TABLE USERS
	ADD
		CONSTRAINT PK_USERS
		PRIMARY KEY (
			id
		);
    
SELECT * FROM USERS;
DELETE FROM USERS where ID = 'aaa';
commit;
SELECT name FROM users WHERE id ='aaaa' AND password='bbbb';

INSERT INTO USERS(user_id, password, name, student_id, email, phone_number, gender, hobby, birthday)
VALUES('aaaa', '1234', '박학생', '202201001', 'studentKim@naver.com', '010-0001-0001', 'female', 'reading watchingMovie exercise', '1998/03/09');

commit;

SELECT * FROM STUDENTS;
SELECT * FROM lectures;
SELECT * FROM enrollments;
SELECT * FROM professors;

create table guest(
 id varchar2(20),
foreign key(id) references users(id),
title varchar2(30),
content varchar2(100),
in_date date
);
create table guest(
guest_no NUMBER(3) NOT NULL,
user_id varchar2(20) not null,
foreign key(user_id) references users(user_id),
title varchar2(30) not null,
content varchar2(100) not null,
in_date date not null
);

select * FROM guest_books;
DROP TABLE guest;

CREATE SEQUENCE guest_seq 
	INCREMENT BY 1;

INSERT INTO guest_books(guest_no, user_id, title, content, in_date)
VALUES(guest_seq.NEXTVAL, ?, ?, ?, sysdate);


INSERT INTO guest_books(guest_no, user_id, title, content, in_date)
VALUES(guest_seq.NEXTVAL, 'studentKim', '제목입니다.', '내용입니다.', sysdate);

INSERT INTO guest_books(guest_no, user_id, title, content, in_date)
VALUES(guest_seq.NEXTVAL, 'studentKim', '제목입니다.222', '내용입니다.222', sysdate);

INSERT INTO guest_books(guest_no, user_id, title, content, in_date)
VALUES(guest_seq.NEXTVAL, 'studentKim', '제목입니다.333', '내용입니다.333', sysdate);

commit;

DROP SEQUENCE guest_seq;
DELETE FROM guest_books;

SELECT guest_no, user_id, title, content, in_date
FROM guest_books ORDER BY guest_no;
commit;

ALTER TABLE users ADD PRIMARY KEY (id); 

ALTER TABLE guest MODIFY guest_no NUMBER;
ALTER TABLE guest MODIFY title varchar2(100);
ALTER TABLE guest MODIFY content varchar2(1000);
ALTER TABLE guest RENAME TO guest_books;

create table user_list(user_id varchar2(20) primary key,
pw varchar2(20) not null,
name varchar2(20) not null,
in_date date not null
);
insert into user_list values('jjeon','12345','전혜영',sysdate);
commit;
select name from user_list where user_id='jjeon' and pw='12345';

DELETE FROM user_list;

SELECT guest_no, user_id, title, content, in_date
FROM guest_books;

SELECT guest_no, user_id, title, content, in_date
FROM guest_books WHERE guest_no='3';

UPDATE guest_books SET title='수정한 제목입니다.', content='수정한 내용입니다.' WHERE guest_no = '1';
UPDATE guest_books SET (title) = ('수정한 제목입니다.') WHERE guest_no = '1';

create table MEMBER(
user_id varchar2(20) primary key,
pw varchar2(20) not null,
name varchar2(20) not null,
phone_number varchar2(20) not null,
gender varchar2(5) not null,
hobby varchar2(50) not null,
birthday date not null
);

SELECT * FROM member;
DELETE FROM member;


commit;

INSERT INTO member(user_id, pw, name, phone_number, gender, hobby, birthday) VALUES('studentKim', '1234', '김학생', '01000010001', '남', '독서 영화감상 운동', '1999/09/23');




