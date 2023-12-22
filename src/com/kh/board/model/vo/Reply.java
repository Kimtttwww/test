package com.kh.board.model.vo;

import java.sql.Date;

public class Reply {
//	REPLY_NO	NUMBER
	private int replyNo;
//	REPLY_CONTENT	VARCHAR2(400 BYTE)
	private String replyContent;
//	REF_BNO	NUMBER
	private int refBoardNo;
//	REPLY_WRITER	NUMBER
	private int replyWriter;
//	CREATE_DATE	DATE
	private Date createDate;
//	STATUS	VARCHAR2(1 BYTE)
	private String status;
	private String userId;
	
	
	public Reply() {
		super();
	}

	public Reply(int replyNo, String replyContent, int refBoardNo, int replyWriter, Date createDate, String status,
			String userId) {
		super();
		this.replyNo = replyNo;
		this.replyContent = replyContent;
		this.refBoardNo = refBoardNo;
		this.replyWriter = replyWriter;
		this.createDate = createDate;
		this.status = status;
		this.userId = userId;
	}

	
	@Override
	public String toString() {
		return "Reply [replyNo=" + replyNo + ", replyContent=" + replyContent + ", refBoardNo=" + refBoardNo
				+ ", replyWriter=" + replyWriter + ", createDate=" + createDate + ", status=" + status + ", userId="
				+ userId + "]";
	}

	public int getReplyNo() {
		return replyNo;
	}
	public String getReplyContent() {
		return replyContent;
	}
	public int getRefBoardNo() {
		return refBoardNo;
	}
	public int getReplyWriter() {
		return replyWriter;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public String getStatus() {
		return status;
	}
	public String getUserId() {
		return userId;
	}

	public void setReplyNo(int replyNo) {
		this.replyNo = replyNo;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
	public void setRefBoardNo(int refBoardNo) {
		this.refBoardNo = refBoardNo;
	}
	public void setReplyWriter(int replyWriter) {
		this.replyWriter = replyWriter;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
}