/* ����ڵ� */
CREATE TABLE USERS (
	id VARCHAR2(20) NOT NULL, /* ���̵� */
	student_id VARCHAR2(20) NOT NULL, /* �й� */
	password VARCHAR2(20) NOT NULL, /* ��й�ȣ */
	name VARCHAR2(20) NOT NULL, /* �̸� */
	email VARCHAR2(40) NOT NULL, /* �̸��� */
	phone_number VARCHAR2(20) NOT NULL, /* ��ȭ��ȣ */
	gender VARCHAR2(10) NOT NULL, /* ���� */
	birthday VARCHAR2(20) NOT NULL, /* ������� */
	hobby VARCHAR2(80) NOT NULL /* ��� */
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



COMMENT ON TABLE USERS IS '����ڵ�';

COMMENT ON COLUMN USERS.id IS '���̵�';

COMMENT ON COLUMN USERS.student_id IS '�й�';

COMMENT ON COLUMN USERS.password IS '��й�ȣ';

COMMENT ON COLUMN USERS.name IS '�̸�';

COMMENT ON COLUMN USERS.email IS '�̸���';

COMMENT ON COLUMN USERS.phone_number IS '��ȭ��ȣ';

COMMENT ON COLUMN USERS.gender IS '����';

COMMENT ON COLUMN USERS.birthday IS '�������';

COMMENT ON COLUMN USERS.hobby IS '���';

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
VALUES('aaaa', '1234', '���л�', '202201001', 'studentKim@naver.com', '010-0001-0001', 'female', 'reading watchingMovie exercise', '1998/03/09');

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
VALUES(guest_seq.NEXTVAL, 'studentKim', '�����Դϴ�.', '�����Դϴ�.', sysdate);

INSERT INTO guest_books(guest_no, user_id, title, content, in_date)
VALUES(guest_seq.NEXTVAL, 'studentKim', '�����Դϴ�.222', '�����Դϴ�.222', sysdate);

INSERT INTO guest_books(guest_no, user_id, title, content, in_date)
VALUES(guest_seq.NEXTVAL, 'studentKim', '�����Դϴ�.333', '�����Դϴ�.333', sysdate);

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
insert into user_list values('jjeon','12345','������',sysdate);
commit;
select name from user_list where user_id='jjeon' and pw='12345';

DELETE FROM user_list;

SELECT guest_no, user_id, title, content, in_date
FROM guest_books;

SELECT guest_no, user_id, title, content, in_date
FROM guest_books WHERE guest_no='3';

UPDATE guest_books SET title='������ �����Դϴ�.', content='������ �����Դϴ�.' WHERE guest_no = '1';
UPDATE guest_books SET (title) = ('������ �����Դϴ�.') WHERE guest_no = '1';

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

INSERT INTO member(user_id, pw, name, phone_number, gender, hobby, birthday) VALUES('studentKim', '1234', '���л�', '01000010001', '��', '���� ��ȭ���� �', '1999/09/23');




