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

CREATE TABLE member_visitor (
	visitor_seq NUMBER NOT NULL,
	member_id VARCHAR2(20), 
	pw VARCHAR2(20), 
	contents VARCHAR2(100), 
	writer_date DATE 
);

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
		REFERENCES members (
			member_id
		);



