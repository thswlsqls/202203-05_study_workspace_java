select * from follow_list;
select * from bookmark;
select * from board;
select * from emotion;
select * from reaction;
select * from suggestion;
select * from picture;
select * from Empathy;
select * from app_user;

/** ȸ�� ���̺� ���� ������ */
insert into app_user(user_id, name, pen_name, user_pw, email, tel) values('test1','�׽�Ʈ1','pen_test1','1234','test1@naver.com','01011112222');
insert into app_user(user_id, name, pen_name, user_pw, email, tel) values('test2','�׽�Ʈ2','pen_test2','1234','test2@naver.com','01011112222');
insert into app_user(user_id, name, pen_name, user_pw, email, tel) values('test3','�׽�Ʈ3','pen_test3','1234','test3@naver.com','01011112222');

/** ���� ���̺� ���� ������ */
insert into empathy values(empathy_no_seq.nextval,'test1','840',sysdate);

/** ����, ���þ� ���̺� ���� ������ */
insert into emotion values('110', '���', '��ſ���');
insert into suggestion values('111', '110', '���');
insert into suggestion values('112', '110', '���');
insert into suggestion values('113', '110', '�뷡');
insert into suggestion values('114', '110', '����');
insert into suggestion values('115', '110', '����');
insert into suggestion values('116', '110', '����Ʈ');

insert into emotion values('120', '���', '�����ؿ�');
insert into suggestion values('121', '120', '����');
insert into suggestion values('122', '120', '�׳�');
insert into suggestion values('123', '120', '����');
insert into suggestion values('124', '120', '����');
insert into suggestion values('125', '120', '����');
insert into suggestion values('126', '120', '���');

insert into emotion values('130', '���', '�����ؿ�');
insert into suggestion values('131', '130', '����');
insert into suggestion values('132', '130', '������');
insert into suggestion values('133', '130', '�ߵ��');
insert into suggestion values('134', '130', '�ܿ�');
insert into suggestion values('135', '130', '����');
insert into suggestion values('136', '130', 'ǳ��');

insert into emotion values('140', '���', '�����������');
insert into suggestion values('141', '140', '��');
insert into suggestion values('142', '140', '�ϼҿ�');
insert into suggestion values('143', '140', '�˾���');
insert into suggestion values('144', '140', '���');
insert into suggestion values('145', '140', '����');
insert into suggestion values('146', '140', '���');

insert into emotion values('150', '���', '�����ϴ�');
insert into suggestion values('151', '150', '����');
insert into suggestion values('152', '150', '����');
insert into suggestion values('153', '150', '����');
insert into suggestion values('154', '150', '��ſ�');
insert into suggestion values('155', '150', '����');
insert into suggestion values('156', '150', '�ݵ�����');



insert into emotion values('210', '�ູ', '�������');
insert into suggestion values('211', '210', '��');
insert into suggestion values('212', '210', '�Ҹ�');
insert into suggestion values('213', '210', '�ູ');
insert into suggestion values('214', '210', '����');
insert into suggestion values('215', '210', '�׸���');
insert into suggestion values('216', '210', '�߾�');

insert into emotion values('220', '�ູ', '�����ؿ�');
insert into suggestion values('221', '220', '����');
insert into suggestion values('222', '220', 'ģ��');
insert into suggestion values('223', '220', '�Ҽ�');
insert into suggestion values('224', '220', '����');
insert into suggestion values('225', '220', '����');
insert into suggestion values('226', '220', '����');

insert into emotion values('230', '�ູ', '�ȶ��ؿ�');
insert into suggestion values('231', '230', '����');
insert into suggestion values('232', '230', '�ܼ�');
insert into suggestion values('233', '230', '�ش�ȭ');
insert into suggestion values('234', '230', '���');
insert into suggestion values('235', '230', '���');
insert into suggestion values('236', '230', '����');

insert into emotion values('240', '�ູ', '�������̴�');
insert into suggestion values('241', '240', '�ո���');
insert into suggestion values('242', '240', '������');
insert into suggestion values('243', '240', '��Ģ');
insert into suggestion values('244', '240', '����');
insert into suggestion values('245', '240', '����');
insert into suggestion values('246', '240', '��ȭ');

insert into emotion values('250', '�ູ', '��������');
insert into suggestion values('251', '250', '����');
insert into suggestion values('252', '250', '����');
insert into suggestion values('253', '250', '�ŷ�');
insert into suggestion values('254', '250', '�Ϸ�');
insert into suggestion values('255', '250', 'ǥ��');
insert into suggestion values('256', '250', '����');



insert into emotion values('310', '����', '������');
insert into suggestion values('311', '310', '������');
insert into suggestion values('312', '310', '����');
insert into suggestion values('313', '310', '������');
insert into suggestion values('314', '310', '�̿�');
insert into suggestion values('315', '310', '����');
insert into suggestion values('316', '310', '����');

insert into emotion values('320', '����', '��ٷ�����');
insert into suggestion values('321', '320', '���');
insert into suggestion values('322', '320', '��');
insert into suggestion values('323', '320', '���');
insert into suggestion values('324', '320', '�޻�');
insert into suggestion values('325', '320', 'ģ��');
insert into suggestion values('326', '320', '�̺�');

insert into emotion values('330', '����', '�αٰŷ���');
insert into suggestion values('331', '330', '��');
insert into suggestion values('332', '330', '����');
insert into suggestion values('333', '330', '����');
insert into suggestion values('334', '330', 'ù���');
insert into suggestion values('335', '330', '����');
insert into suggestion values('336', '330', '����');

insert into emotion values('340', '����', '������');
insert into suggestion values('341', '340', '���');
insert into suggestion values('342', '340', '�ܷο�');
insert into suggestion values('343', '340', '���');
insert into suggestion values('344', '340', 'ī�޶�');
insert into suggestion values('345', '340', '��');
insert into suggestion values('346', '340', '����');

insert into emotion values('350', '����', '��ƶ�ؿ�');
insert into suggestion values('351', '350', '��ȣ');
insert into suggestion values('352', '350', '����');
insert into suggestion values('353', '350', '����');
insert into suggestion values('354', '350', '���');
insert into suggestion values('355', '350', '����');
insert into suggestion values('356', '350', '����');



insert into emotion values('410', '���', '���ܿ���');
insert into suggestion values('411', '410', '��ǰ');
insert into suggestion values('412', '410', '����');
insert into suggestion values('413', '410', '�ݺ�');
insert into suggestion values('414', '410', '�λ�');
insert into suggestion values('415', '410', '����');
insert into suggestion values('416', '410', '����');

insert into emotion values('420', '���', '�η�����');
insert into suggestion values('421', '420', '�뷡');
insert into suggestion values('422', '420', '��');
insert into suggestion values('423', '420', '����');
insert into suggestion values('424', '420', '����');
insert into suggestion values('425', '420', '�µ�');
insert into suggestion values('426', '420', '�ð�');

insert into emotion values('430', '���', '�ñ��ؿ�');
insert into suggestion values('431', '430', '�˰�ʹ�');
insert into suggestion values('432', '430', '��');
insert into suggestion values('433', '430', '���');
insert into suggestion values('434', '430', '����');
insert into suggestion values('435', '430', '�λ�');
insert into suggestion values('436', '430', '����');

insert into emotion values('440', '���', '��̷ο���');
insert into suggestion values('441', '440', 'Ư¡');
insert into suggestion values('442', '440', '����');
insert into suggestion values('443', '440', '��ȣ��');
insert into suggestion values('444', '440', '����');
insert into suggestion values('445', '440', '���');
insert into suggestion values('446', '440', '����');

insert into emotion values('450', '���', '�ǽɽ�������');
insert into suggestion values('451', '450', '������');
insert into suggestion values('452', '450', '����');
insert into suggestion values('453', '450', 'Ȯ��');
insert into suggestion values('454', '450', '����');
insert into suggestion values('455', '450', '�Ҽ�');
insert into suggestion values('456', '450', 'ȣ���');



insert into emotion values('510', '����', '�����ؿ�');
insert into suggestion values('511', '510', '�㹫');
insert into suggestion values('512', '510', '��');
insert into suggestion values('513', '510', '����');
insert into suggestion values('514', '510', '���');
insert into suggestion values('515', '510', '����');
insert into suggestion values('516', '510', 'ä��');

insert into emotion values('520', '����', '�Ը��ؿ�');
insert into suggestion values('521', '520', '���߷���');
insert into suggestion values('522', '520', '�๰');
insert into suggestion values('523', '520', '�Ʒ���');
insert into suggestion values('524', '520', '����');
insert into suggestion values('525', '520', '����');
insert into suggestion values('526', '520', '��������');

insert into emotion values('530', '����', '�繫�Ŀ�');
insert into suggestion values('531', '530', '���۳�');
insert into suggestion values('532', '530', '����');
insert into suggestion values('533', '530', '��');
insert into suggestion values('534', '530', '����');
insert into suggestion values('535', '530', '����');
insert into suggestion values('536', '530', '���');

insert into emotion values('540', '����', '�ʶ��ؿ�');
insert into suggestion values('541', '540', 'ȥ��');
insert into suggestion values('542', '540', '�̺�');
insert into suggestion values('543', '540', '����');
insert into suggestion values('544', '540', '�����');
insert into suggestion values('545', '540', '����');
insert into suggestion values('546', '540', '����');

insert into emotion values('550', '����', '�����ؿ�');
insert into suggestion values('551', '550', '���');
insert into suggestion values('552', '550', '��');
insert into suggestion values('553', '550', '�⵵');
insert into suggestion values('554', '550', '������');
insert into suggestion values('555', '550', '��');
insert into suggestion values('556', '550', '��ȭ');

insert into emotion values('610', '�г�', '�̿���');
insert into suggestion values('611', '610', '����');
insert into suggestion values('612', '610', '�̺�');
insert into suggestion values('613', '610', '�߾�');
insert into suggestion values('614', '610', '��ó');
insert into suggestion values('615', '610', '���������ʴ�');
insert into suggestion values('616', '610', '����');

insert into emotion values('620', '�г�', '�Ҹ��̿���');
insert into suggestion values('621', '620', '������');
insert into suggestion values('622', '620', '�ǰ���');
insert into suggestion values('623', '620', '���');
insert into suggestion values('624', '620', '�ӽ�');
insert into suggestion values('625', '620', '�Ǳ���');
insert into suggestion values('626', '620', '�ݰ�');

insert into emotion values('630', '�г�', 'ȭ����');
insert into suggestion values('631', '630', '�����');
insert into suggestion values('632', '630', '����');
insert into suggestion values('633', '630', '���¹��');
insert into suggestion values('634', '630', '�ü�');
insert into suggestion values('635', '630', 'â����');
insert into suggestion values('636', '630', '��');

insert into emotion values('640', '�г�', '�����ؿ�');
insert into suggestion values('641', '640', '������');
insert into suggestion values('642', '640', '����');
insert into suggestion values('643', '640', 'Ⱦ��');
insert into suggestion values('644', '640', '����');
insert into suggestion values('645', '640', '�����Ѱ�');
insert into suggestion values('646', '640', '�Ǿ�');

insert into emotion values('650', '�г�', '¥������');
insert into suggestion values('651', '650', '����');
insert into suggestion values('652', '650', '���');
insert into suggestion values('653', '650', '���ٽ�');
insert into suggestion values('654', '650', '��¤��');
insert into suggestion values('655', '650', '���ݸ�');
insert into suggestion values('656', '650', 'ģ��');



insert into emotion values('710', '������', '����ؿ�');
insert into suggestion values('711', '710', '���');
insert into suggestion values('712', '710', '�ϰŸ�');
insert into suggestion values('713', '710', '�����ϴ�');
insert into suggestion values('714', '710', '����');
insert into suggestion values('715', '710', '�����');
insert into suggestion values('716', '710', '���̾�Ʈ');

insert into emotion values('720', '������', '��������');
insert into suggestion values('721', '720', 'ȯ��');
insert into suggestion values('722', '720', '�����ǽ�');
insert into suggestion values('723', '720', 'ȸ�ǰ�');
insert into suggestion values('724', '720', '����');
insert into suggestion values('725', '720', '�ݺ�');
insert into suggestion values('726', '720', '�Ȱ���');

insert into emotion values('730', '������', '�ɽ��ؿ�');
insert into suggestion values('731', '730', '������');
insert into suggestion values('732', '730', '�̰ſ�');
insert into suggestion values('733', '730', '�۶���');
insert into suggestion values('734', '730', '����ã��');
insert into suggestion values('735', '730', '�ɽ���');
insert into suggestion values('736', '730', 'ų��Ÿ��');

insert into emotion values('740', '������', '�����ƿ�');
insert into suggestion values('741', '740', '�ܼҸ�');
insert into suggestion values('742', '740', '���');
insert into suggestion values('743', '740', '����');
insert into suggestion values('744', '740', '�����');
insert into suggestion values('745', '740', '����');
insert into suggestion values('746', '740', '�̺ҹ��� ������');

insert into emotion values('750', '������', '����ؿ�');
insert into suggestion values('751', '750', '�ڽŰ�');
insert into suggestion values('752', '750', '����');
insert into suggestion values('753', '750', '���');
insert into suggestion values('754', '750', '�ü�');
insert into suggestion values('755', '750', '������');
insert into suggestion values('756', '750', '�̹�');



insert into emotion values('810', '���', '�⸷����');
insert into suggestion values('811', '810', '�ο�');
insert into suggestion values('812', '810', '������');
insert into suggestion values('813', '810', '����������');
insert into suggestion values('814', '810', '����');
insert into suggestion values('815', '810', 'Ȩ��');
insert into suggestion values('816', '810', '���ݴ�');

insert into emotion values('820', '���', '������');
insert into suggestion values('821', '820', '�����');
insert into suggestion values('822', '820', '��¦����');
insert into suggestion values('823', '820', '����');
insert into suggestion values('824', '820', '����');
insert into suggestion values('825', '820', '������');
insert into suggestion values('826', '820', '��ȭ');

insert into emotion values('830', '���', '��Ȳ��������');
insert into suggestion values('831', '830', '���');
insert into suggestion values('832', '830', '����');
insert into suggestion values('833', '830', '���');
insert into suggestion values('834', '830', '���');
insert into suggestion values('835', '830', '����');
insert into suggestion values('836', '830', '�����ĺ�');

insert into emotion values('840', '���', '�����ؿ�');
insert into suggestion values('841', '840', '��ȣ��');
insert into suggestion values('842', '840', '����');
insert into suggestion values('843', '840', '�޽�');
insert into suggestion values('844', '840', '����');
insert into suggestion values('845', '840', '�������');
insert into suggestion values('846', '840', '�о��');

insert into emotion values('850', '���', '�η�����');
insert into suggestion values('851', '850', '������ȭ');
insert into suggestion values('852', '850', '�ͽ�');
insert into suggestion values('853', '850', '��Ű�');
insert into suggestion values('854', '850', '����');
insert into suggestion values('855', '850', '�ҾȰ�');
insert into suggestion values('856', '850', 'Ʈ��츶');

SELECT * FROM board;
SELECT * FROM suggestion;

select s.suggestion_name, b.contents, a.pen_name, b.write_date
		from app_user a, board b, suggestion s 
		where b.writer_id = a.user_id and b.suggestion_code = s.suggestion_code
		and rownum<=10
		order by b.write_date desc;

/**�Խñ� ���̺� ���õ����� */
INSERT INTO 
board(WRITE_NO, WRITER_ID, SUGGESTION_CODE, CONTENTS, SHARE_STATUS, WRITE_DATE)
VALUES(WRITE_NO_SEQ.nextval, 'test1', '112', '����� ���þ�� �ۼ�', '��ü', sysdate);

INSERT INTO 
board(WRITE_NO, WRITER_ID, SUGGESTION_CODE, CONTENTS, SHARE_STATUS, WRITE_DATE)
VALUES(WRITE_NO_SEQ.nextval, 'test1', '113', '�뷡��� ���þ�� �ۼ�', '��ü', sysdate);

INSERT INTO 
board(WRITE_NO, WRITER_ID, SUGGESTION_CODE, CONTENTS, SHARE_STATUS, WRITE_DATE)
VALUES(WRITE_NO_SEQ.nextval, 'test1', '114', '������� ���þ�� �ۼ�', '��ü', sysdate);


/** ���׼� ���̺� ���� ������ */
insert into reaction values('test1','1',sysdate);

commit;
















