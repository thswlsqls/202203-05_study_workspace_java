select * from follow_list;
select * from bookmark;
select * from board;
select * from emotion;
select * from reaction;
select * from suggestion;
select * from picture;
select * from Empathy;
select * from app_user;

/** 회원 테이블 샘플 데이터 */
insert into app_user(user_id, name, pen_name, user_pw, email, tel) values('test1','테스트1','pen_test1','1234','test1@naver.com','01011112222');
insert into app_user(user_id, name, pen_name, user_pw, email, tel) values('test2','테스트2','pen_test2','1234','test2@naver.com','01011112222');
insert into app_user(user_id, name, pen_name, user_pw, email, tel) values('test3','테스트3','pen_test3','1234','test3@naver.com','01011112222');

/** 공감 테이블 샘플 데이터 */
insert into empathy values(empathy_no_seq.nextval,'test1','840',sysdate);

/** 감정, 제시어 테이블 샘플 데이터 */
insert into emotion values('110', '기쁨', '즐거워요');
insert into suggestion values('111', '110', '사랑');
insert into suggestion values('112', '110', '고기');
insert into suggestion values('113', '110', '노래');
insert into suggestion values('114', '110', '축제');
insert into suggestion values('115', '110', '은퇴');
insert into suggestion values('116', '110', '데이트');

insert into emotion values('120', '기쁨', '감사해요');
insert into suggestion values('121', '120', '슬픔');
insert into suggestion values('122', '120', '그녀');
insert into suggestion values('123', '120', '반전');
insert into suggestion values('124', '120', '생일');
insert into suggestion values('125', '120', '음악');
insert into suggestion values('126', '120', '행운');

insert into emotion values('130', '기쁨', '따스해요');
insert into suggestion values('131', '130', '감기');
insert into suggestion values('132', '130', '촉촉한');
insert into suggestion values('133', '130', '견디다');
insert into suggestion values('134', '130', '겨울');
insert into suggestion values('135', '130', '잔잔');
insert into suggestion values('136', '130', '풍성');

insert into emotion values('140', '기쁨', '사랑스러워요');
insert into suggestion values('141', '140', '고독');
insert into suggestion values('142', '140', '하소연');
insert into suggestion values('143', '140', '옹알이');
insert into suggestion values('144', '140', '닮다');
insert into suggestion values('145', '140', '마음');
insert into suggestion values('146', '140', '향수');

insert into emotion values('150', '기쁨', '감동하다');
insert into suggestion values('151', '150', '공감');
insert into suggestion values('152', '150', '아픔');
insert into suggestion values('153', '150', '마음');
insert into suggestion values('154', '150', '즐거움');
insert into suggestion values('155', '150', '도전');
insert into suggestion values('156', '150', '반딧불이');



insert into emotion values('210', '행복', '희망차요');
insert into suggestion values('211', '210', '꿈');
insert into suggestion values('212', '210', '소망');
insert into suggestion values('213', '210', '행복');
insert into suggestion values('214', '210', '젊음');
insert into suggestion values('215', '210', '그리움');
insert into suggestion values('216', '210', '추억');

insert into emotion values('220', '행복', '유쾌해요');
insert into suggestion values('221', '220', '조용');
insert into suggestion values('222', '220', '친절');
insert into suggestion values('223', '220', '소소');
insert into suggestion values('224', '220', '상쾌');
insert into suggestion values('225', '220', '달콤');
insert into suggestion values('226', '220', '솔직');

insert into emotion values('230', '행복', '똑똑해요');
insert into suggestion values('231', '230', '몰입');
insert into suggestion values('232', '230', '단순');
insert into suggestion values('233', '230', '극대화');
insert into suggestion values('234', '230', '기약');
insert into suggestion values('235', '230', '비례');
insert into suggestion values('236', '230', '덧셈');

insert into emotion values('240', '행복', '안정적이다');
insert into suggestion values('241', '240', '합리적');
insert into suggestion values('242', '240', '잠재적');
insert into suggestion values('243', '240', '규칙');
insert into suggestion values('244', '240', '긍정');
insert into suggestion values('245', '240', '연속');
insert into suggestion values('246', '240', '문화');

insert into emotion values('250', '행복', '보람차요');
insert into suggestion values('251', '250', '성과');
insert into suggestion values('252', '250', '마음');
insert into suggestion values('253', '250', '신뢰');
insert into suggestion values('254', '250', '하루');
insert into suggestion values('255', '250', '표현');
insert into suggestion values('256', '250', '만족');



insert into emotion values('310', '설렘', '설레요');
insert into suggestion values('311', '310', '정거장');
insert into suggestion values('312', '310', '독백');
insert into suggestion values('313', '310', '가을빛');
insert into suggestion values('314', '310', '미움');
insert into suggestion values('315', '310', '봄비');
insert into suggestion values('316', '310', '여행');

insert into emotion values('320', '설렘', '기다려져요');
insert into suggestion values('321', '320', '향기');
insert into suggestion values('322', '320', '삶');
insert into suggestion values('323', '320', '고백');
insert into suggestion values('324', '320', '햇살');
insert into suggestion values('325', '320', '친구');
insert into suggestion values('326', '320', '이별');

insert into emotion values('330', '설렘', '두근거려요');
insert into suggestion values('331', '330', '뺨');
insert into suggestion values('332', '330', '흉터');
insert into suggestion values('333', '330', '증상');
insert into suggestion values('334', '330', '첫사랑');
insert into suggestion values('335', '330', '감정');
insert into suggestion values('336', '330', '순간');

insert into emotion values('340', '설렘', '떨려요');
insert into suggestion values('341', '340', '기억');
insert into suggestion values('342', '340', '외로움');
insert into suggestion values('343', '340', '상상');
insert into suggestion values('344', '340', '카메라');
insert into suggestion values('345', '340', '길');
insert into suggestion values('346', '340', '남녀');

insert into emotion values('350', '설렘', '애틋해요');
insert into suggestion values('351', '350', '단호');
insert into suggestion values('352', '350', '은밀');
insert into suggestion values('353', '350', '지독');
insert into suggestion values('354', '350', '담백');
insert into suggestion values('355', '350', '냄새');
insert into suggestion values('356', '350', '여름');



insert into emotion values('410', '흥미', '지겨워요');
insert into suggestion values('411', '410', '하품');
insert into suggestion values('412', '410', '연습');
insert into suggestion values('413', '410', '반복');
insert into suggestion values('414', '410', '인색');
insert into suggestion values('415', '410', '아픔');
insert into suggestion values('416', '410', '적막');

insert into emotion values('420', '흥미', '부러워요');
insert into suggestion values('421', '420', '노래');
insert into suggestion values('422', '420', '삶');
insert into suggestion values('423', '420', '선물');
insert into suggestion values('424', '420', '질투');
insert into suggestion values('425', '420', '태도');
insert into suggestion values('426', '420', '시간');

insert into emotion values('430', '흥미', '궁금해요');
insert into suggestion values('431', '430', '알고싶다');
insert into suggestion values('432', '430', '답');
insert into suggestion values('433', '430', '당신');
insert into suggestion values('434', '430', '안전');
insert into suggestion values('435', '430', '인생');
insert into suggestion values('436', '430', '오늘');

insert into emotion values('440', '흥미', '흥미로워요');
insert into suggestion values('441', '440', '특징');
insert into suggestion values('442', '440', '오류');
insert into suggestion values('443', '440', '모호함');
insert into suggestion values('444', '440', '섬세');
insert into suggestion values('445', '440', '기사');
insert into suggestion values('446', '440', '공원');

insert into emotion values('450', '흥미', '의심스러워요');
insert into suggestion values('451', '450', '엇갈림');
insert into suggestion values('452', '450', '진실');
insert into suggestion values('453', '450', '확신');
insert into suggestion values('454', '450', '부정');
insert into suggestion values('455', '450', '소설');
insert into suggestion values('456', '450', '호기심');



insert into emotion values('510', '슬픔', '공허해요');
insert into suggestion values('511', '510', '허무');
insert into suggestion values('512', '510', '고독');
insert into suggestion values('513', '510', '나약');
insert into suggestion values('514', '510', '허망');
insert into suggestion values('515', '510', '망각');
insert into suggestion values('516', '510', '채움');

insert into emotion values('520', '슬픔', '먹먹해요');
insert into suggestion values('521', '520', '움추려져');
insert into suggestion values('522', '520', '콧물');
insert into suggestion values('523', '520', '아련한');
insert into suggestion values('524', '520', '눈물');
insert into suggestion values('525', '520', '비참');
insert into suggestion values('526', '520', '수수께끼');

insert into emotion values('530', '슬픔', '사무쳐요');
insert into suggestion values('531', '530', '구멍난');
insert into suggestion values('532', '530', '떠남');
insert into suggestion values('533', '530', '뼈');
insert into suggestion values('534', '530', '썩은');
insert into suggestion values('535', '530', '가슴');
insert into suggestion values('536', '530', '운명');

insert into emotion values('540', '슬픔', '초라해요');
insert into suggestion values('541', '540', '혼자');
insert into suggestion values('542', '540', '이별');
insert into suggestion values('543', '540', '과거');
insert into suggestion values('544', '540', '무기력');
insert into suggestion values('545', '540', '연약');
insert into suggestion values('546', '540', '우주');

insert into emotion values('550', '슬픔', '간절해요');
insert into suggestion values('551', '550', '응어리');
insert into suggestion values('552', '550', '돈');
insert into suggestion values('553', '550', '기도');
insert into suggestion values('554', '550', '절박함');
insert into suggestion values('555', '550', '꿈');
insert into suggestion values('556', '550', '변화');

insert into emotion values('610', '분노', '미워요');
insert into suggestion values('611', '610', '원망');
insert into suggestion values('612', '610', '이별');
insert into suggestion values('613', '610', '추억');
insert into suggestion values('614', '610', '상처');
insert into suggestion values('615', '610', '지워지지않는');
insert into suggestion values('616', '610', '애정');

insert into emotion values('620', '분노', '불만이에요');
insert into suggestion values('621', '620', '불편함');
insert into suggestion values('622', '620', '악감정');
insert into suggestion values('623', '620', '열등감');
insert into suggestion values('624', '620', '앙심');
insert into suggestion values('625', '620', '의구심');
insert into suggestion values('626', '620', '반감');

insert into emotion values('630', '분노', '화나요');
insert into suggestion values('631', '630', '억울함');
insert into suggestion values('632', '630', '감정');
insert into suggestion values('633', '630', '참는방법');
insert into suggestion values('634', '630', '냉수');
insert into suggestion values('635', '630', '창피함');
insert into suggestion values('636', '630', '불');

insert into emotion values('640', '분노', '섭섭해요');
insert into suggestion values('641', '640', '서운함');
insert into suggestion values('642', '640', '교만');
insert into suggestion values('643', '640', '횡포');
insert into suggestion values('644', '640', '관심');
insert into suggestion values('645', '640', '부족한것');
insert into suggestion values('646', '640', '의아');

insert into emotion values('650', '분노', '짜증나요');
insert into suggestion values('651', '650', '싫증');
insert into suggestion values('652', '650', '욕심');
insert into suggestion values('653', '650', '조바심');
insert into suggestion values('654', '650', '되짚다');
insert into suggestion values('655', '650', '초콜릿');
insert into suggestion values('656', '650', '친구');



insert into emotion values('710', '지루함', '답답해요');
insert into suggestion values('711', '710', '명상');
insert into suggestion values('712', '710', '일거리');
insert into suggestion values('713', '710', '지루하다');
insert into suggestion values('714', '710', '외출');
insert into suggestion values('715', '710', '무기력');
insert into suggestion values('716', '710', '다이어트');

insert into emotion values('720', '지루함', '싫증나요');
insert into suggestion values('721', '720', '환멸');
insert into suggestion values('722', '720', '위기의식');
insert into suggestion values('723', '720', '회의감');
insert into suggestion values('724', '720', '음식');
insert into suggestion values('725', '720', '반복');
insert into suggestion values('726', '720', '똑같다');

insert into emotion values('730', '지루함', '심심해요');
insert into suggestion values('731', '730', '무료함');
insert into suggestion values('732', '730', '싱거움');
insert into suggestion values('733', '730', '멍때림');
insert into suggestion values('734', '730', '지뢰찾기');
insert into suggestion values('735', '730', '심심이');
insert into suggestion values('736', '730', '킬링타임');

insert into emotion values('740', '지루함', '귀찮아요');
insert into suggestion values('741', '740', '잔소리');
insert into suggestion values('742', '740', '출근');
insert into suggestion values('743', '740', '공부');
insert into suggestion values('744', '740', '상냥함');
insert into suggestion values('745', '740', '말투');
insert into suggestion values('746', '740', '이불밖은 위험해');

insert into emotion values('750', '지루함', '어색해요');
insert into suggestion values('751', '750', '자신감');
insert into suggestion values('752', '750', '긴장');
insert into suggestion values('753', '750', '잡담');
insert into suggestion values('754', '750', '시선');
insert into suggestion values('755', '750', '수줍음');
insert into suggestion values('756', '750', '미묘');



insert into emotion values('810', '놀람', '기막혀요');
insert into suggestion values('811', '810', '싸움');
insert into suggestion values('812', '810', '엉뚱함');
insert into suggestion values('813', '810', '서프라이즈');
insert into suggestion values('814', '810', '어이');
insert into suggestion values('815', '810', '홈런');
insert into suggestion values('816', '810', '같잖다');

insert into emotion values('820', '놀람', '놀라워요');
insert into suggestion values('821', '820', '우습다');
insert into suggestion values('822', '820', '깜짝등장');
insert into suggestion values('823', '820', '역사');
insert into suggestion values('824', '820', '위인');
insert into suggestion values('825', '820', '적절함');
insert into suggestion values('826', '820', '변화');

insert into emotion values('830', '놀람', '당황스러워요');
insert into suggestion values('831', '830', '사과');
insert into suggestion values('832', '830', '공감');
insert into suggestion values('833', '830', '경악');
insert into suggestion values('834', '830', '방심');
insert into suggestion values('835', '830', '낙담');
insert into suggestion values('836', '830', '도망쳐봐');

insert into emotion values('840', '놀람', '초조해요');
insert into suggestion values('841', '840', '심호흡');
insert into suggestion values('842', '840', '쓸쓸');
insert into suggestion values('843', '840', '휴식');
insert into suggestion values('844', '840', '수면');
insert into suggestion values('845', '840', '비워내다');
insert into suggestion values('846', '840', '털어내다');

insert into emotion values('850', '놀람', '두려워요');
insert into suggestion values('851', '850', '공포영화');
insert into suggestion values('852', '850', '귀신');
insert into suggestion values('853', '850', '배신감');
insert into suggestion values('854', '850', '실패');
insert into suggestion values('855', '850', '불안감');
insert into suggestion values('856', '850', '트라우마');

SELECT * FROM board;
SELECT * FROM suggestion;

select s.suggestion_name, b.contents, a.pen_name, b.write_date
		from app_user a, board b, suggestion s 
		where b.writer_id = a.user_id and b.suggestion_code = s.suggestion_code
		and rownum<=10
		order by b.write_date desc;

/**게시글 테이블 샘플데이터 */
INSERT INTO 
board(WRITE_NO, WRITER_ID, SUGGESTION_CODE, CONTENTS, SHARE_STATUS, WRITE_DATE)
VALUES(WRITE_NO_SEQ.nextval, 'test1', '112', '고기라는 제시어로 작성', '전체', sysdate);

INSERT INTO 
board(WRITE_NO, WRITER_ID, SUGGESTION_CODE, CONTENTS, SHARE_STATUS, WRITE_DATE)
VALUES(WRITE_NO_SEQ.nextval, 'test1', '113', '노래라는 제시어로 작성', '전체', sysdate);

INSERT INTO 
board(WRITE_NO, WRITER_ID, SUGGESTION_CODE, CONTENTS, SHARE_STATUS, WRITE_DATE)
VALUES(WRITE_NO_SEQ.nextval, 'test1', '114', '축제라는 제시어로 작성', '전체', sysdate);


/** 리액션 테이블 샘플 데이터 */
insert into reaction values('test1','1',sysdate);

commit;
















