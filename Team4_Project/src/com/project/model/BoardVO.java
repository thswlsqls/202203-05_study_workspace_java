package com.project.model;

import java.sql.Date;

/** WriterDAO */

public class BoardVO {

	public BoardVO(String suggestionName
			, String contents
			, String penName
			, Date writeDate
			, String emotionCode){
		this(null, null, penName, contents, writeDate, emotionCode, suggestionName, null);
	}
	
	public BoardVO(String writeNo
			, String writerId
			, String penName
			, String contents
			, Date writeDate
			, String emotionCode
			, String suggestionName
			, String shareStatus) {
		super();
		setWriteNo(writeNo);
		setWriterId(writerId);
		setPenName(penName);
		setContents(contents);
		setWriteDate(writeDate);
		setEmotionCode(emotionCode);
		setSuggestionName(suggestionName);
		setShareStatus(shareStatus);
	}
	
	/**게시글 조회
	 * select s.suggestion_name, b.contents, a.pen_name, b.write_date, e.emotion_code
		from app_user a, board b, suggestion s, emotion e
		where b.writer_id = a.user_id and b.suggestion_code = s.suggestion_code and e.emotion_code = s.emotion_code
		and e.emotion_code = ? ;
	 *  */
//	public BoardVO(String suggestionName
//			, String contents
//			, String penName
//			, Date writeDate
//			, String emotionCode) {
//		setSuggestionName(suggestionName);
//		setContents(contents);
//		setPenName(penName);
//		setWriteDate(writeDate);
//		setEmotionCode(emotionCode);
//	}
	
	/**새로운 게시물 목록 조회 
	 * select s.suggestion_name, b.contents, a.pen_name, b.write_date
		from app_user a, board b, suggestion s 
		where b.writer_id = a.user_id and b.suggestion_code = s.suggestion_code
		and rownum<=10
		order by b.write_date desc;
	 * */
	public BoardVO(String suggestionName
			, String contents
			, String penName
			, Date writeDate) {
		setSuggestionName(suggestionName);
		setContents(contents);
		setPenName(penName);
		setWriteDate(writeDate);
	}
	
	/**실시간 추천글 조회 
	 * 
	  SELECT (SElECT count(*) 
        FROM reaction 
        WHERE write_no = b.write_no) AS rCnt ,
       (SElECT count(*) 
        FROM bookmark 
        WHERE write_no = b.write_no) AS bmCnt ,
        b.write_no, b.contents, b.write_date, b.share_status, b.writer_id, b.suggestion_code
	    FROM board b, bookmark bm, reaction r
	    WHERE b.write_no = bm.write_no AND b.write_no = r.write_no AND rownum <= 10
	    ORDER BY b.write_date desc, rCnt, bmCnt desc;
	 * 
	 * */

	public BoardVO(
			int rCnt
			, int bmCnt
			, String writeNo
			, String contents
			, Date writeDate
			, String shareStatus
			, String writerId
			, String suggestionCode
			) {
		setrCnt(rCnt);
		setBmCnt(bmCnt);
		setWriteNo(writeNo);
		setContents(contents);
		setWriteDate(writeDate);
		setShareStatus(shareStatus);
		setWriterId(writerId);
		setSuggestionCode(suggestionCode);
	}
	
	public BoardVO(
			int rCnt
			, String writeNo
			, String contents
			, Date writeDate
			, String shareStatus
			, String writerId
			, String suggestionCode
			) {
		setrCnt(rCnt);
		setWriteNo(writeNo);
		setContents(contents);
		setWriteDate(writeDate);
		setShareStatus(shareStatus);
		setWriterId(writerId);
		setSuggestionCode(suggestionCode);
	}

	
	
	
	private String suggestionName;

	private String contents;
	private String penName;
	private Date writeDate;
	private String emotionCode;
	
	private String writeNo;
	private String shareStatus;
	private String writerId;
	private String suggestionCode;
	
	private int rCnt;
	private int bmCnt;
	
	
	public int getrCnt() {
		return rCnt;
	}

	public void setrCnt(int rCnt) {
		this.rCnt = rCnt;
	}

	public int getBmCnt() {
		return bmCnt;
	}

	public void setBmCnt(int bmCnt) {
		this.bmCnt = bmCnt;
	}

	public String getSuggestionName() {
		return suggestionName;
	}

	public void setSuggestionName(String suggestionName) {
		this.suggestionName = suggestionName;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getPenName() {
		return penName;
	}

	public void setPenName(String penName) {
		this.penName = penName;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

	public String getEmotionCode() {
		return emotionCode;
	}

	public void setEmotionCode(String emotionCode) {
		this.emotionCode = emotionCode;
	}

	public String getWriteNo() {
		return writeNo;
	}

	public void setWriteNo(String writeNo) {
		this.writeNo = writeNo;
	}

	public String getShareStatus() {
		return shareStatus;
	}

	public void setShareStatus(String shareStatus) {
		this.shareStatus = shareStatus;
	}

	public String getWriterId() {
		return writerId;
	}

	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}

	public String getSuggestionCode() {
		return suggestionCode;
	}

	public void setSuggestionCode(String suggestionCode) {
		this.suggestionCode = suggestionCode;
	}

	@Override
	public String toString() {
		return "BoardVO [suggestionName=" + suggestionName + ", contents=" + contents + ", penName=" + penName
				+ ", writeDate=" + writeDate + ", emotionCode=" + emotionCode + ", writeNo=" + writeNo
				+ ", shareStatus=" + shareStatus + ", writerId=" + writerId + ", suggestionCode=" + suggestionCode
				+ "]\n";
	}
	
	
	
	
}
