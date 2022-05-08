drop sequence mem_visi_seq;
drop table member_visitor;
drop table member_list;

create table member_list
(member_id varchar2(20) primary key,
name varchar2(20) not null,
pw varchar2(20) not null,
gender char(1) not null,
hobby varchar2(30) not null,
blood char(2) not null
);

INSERT INTO member_list(member_id, name, pw, gender, hobby, blood) 
VALUES('kim', '김학생', '1234', 'm', 'reading cooking watchingMovie', 'A');
SELECT * FROM member_list;
DELETE FROM member_list;
commit;
SELECT name FROM member_list WHERE member_id = 'kim' AND pw = '1234';

SELECT member_id, name, pw, gender, hobby, blood 
FROM member_list WHERE member_id = 'kim' AND pw = '1234';

SELECT count(member_id) FROM member_list WHERE member_id='choi';



CREATE TABLE member_visitor (
	visitor_seq NUMBER NOT NULL,
	member_id VARCHAR2(20), 
	pw VARCHAR2(20), 
	contents VARCHAR2(100), 
	writer_date DATE 
);

SELECT * FROM member_list;
SELECT * FROM member_visitor;

SELECT visitor_seq, member_id, pw, contents, writer_date 
FROM member_visitor ORDER BY visitor_seq;

INSERT INTO member_visitor(visitor_seq, member_id, pw, contents, writer_date)
VALUES(mem_visi_seq.nextval, 'kim', 'w123', '내용입니다', sysdate);

UPDATE member_visitor SET contents='수정한내용입니다' WHERE visitor_seq='3';

DELETE FROM member_visitor WHERE visitor_seq = 4;

SELECT visitor_seq, member_id, pw, contents, writer_date 
FROM member_visitor WHERE visitor_seq='1';

SELECT pw 
FROM member_visitor WHERE visitor_seq='1';
commit;

SELECT visitor_seq, member_id, pw, contents, writer_date 
FROM member_visitor WHERE member_id LIKE '%kim%';


create sequence mem_visi_seq;

ALTER TABLE member_visitor
	ADD
		CONSTRAINT PK_member_visitor
		PRIMARY KEY (
			visitor_seq
		);

ALTER TABLE member_visitor
	ADD
		CONSTRAINT FK_members_TO_MV
		FOREIGN KEY (
			member_id
		)
		REFERENCES member_list (
			member_id
		);

SELECT * FROM user_list;


