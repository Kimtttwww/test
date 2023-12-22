package com.kh.board.model.vo;

import java.sql.Date;

public class Board {
//	BOARD_NO	NUMBER
	private int boardNo;
//	BOARD_TYPE	NUMBER
	private int boardType;
//	CATEGORY_NO	NUMBER
	private int categoryNo;
//	BOARD_TITLE	VARCHAR2(100 BYTE)
	private String boardTitle;
//	BOARD_CONTENT	VARCHAR2(4000 BYTE)
	private String boardContent;
//	BOARD_WRITER	NUMBER
	private String boardWriter;
//	쿼리문으로 join시에는 회원번호를 활용하여 join 할 것이
//	COUNT	NUMBER
	private int count;
//	CREATE_DATE	DATE
	private Date createDate;
//	STATUS	VARCHAR2(1 BYTE)
	private char status;
	private String categoryName; // Board 테이블에는 존재하지 않는 컬럼
	private Attachment attachment; // Board 테이블에는 존재하지 않는 컬럼

	public Board() {
		super();
	}

	public static class Builder {
		private int boardNo;
		private int boardType;
		private int categoryNo;
		private String boardTitle;
		private String boardContent;
		private String boardWriter;
		private int count;
		private Date createDate;
		private char status;
		private String categoryName;
		private Attachment attachment;

		public Builder boardNo(int boardNo) {
			this.boardNo = boardNo;
			return this;
		}

		public Builder boardType(int boardType) {
			this.boardType = boardType;
			return this;
		}

		public Builder categoryNo(int categoryNo) {
			this.categoryNo = categoryNo;
			return this;
		}

		public Builder boardTitle(String boardTitle) {
			this.boardTitle = boardTitle;
			return this;
		}

		public Builder boardContent(String boardContent) {
			this.boardContent = boardContent;
			return this;
		}

		public Builder boardWriter(String boardWriter) {
			this.boardWriter = boardWriter;
			return this;
		}

		public Builder count(int count) {
			this.count = count;
			return this;
		}

		public Builder createDate(Date createDate) {
			this.createDate = createDate;
			return this;
		}

		public Builder status(char status) {
			this.status = status;
			return this;
		}

		public Builder categoryName(String categoryName) {
			this.categoryName = categoryName;
			return this;
		}

		public Builder attachment(Attachment attachment) {
			this.attachment = attachment;
			return this;
		}

		public Board build() {
			Board b = new Board();
			b.boardNo = boardNo;
			b.boardType = boardType;
			b.categoryNo = categoryNo;
			b.boardTitle = boardTitle;
			b.boardContent = boardContent;
			b.boardWriter = boardWriter;
			b.count = count;
			b.createDate = createDate;
			b.status = status;
			b.categoryName = categoryName;
			b.attachment = attachment;

			return b;
		}
	}

	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", boardType=" + boardType + ", categoryNo=" + categoryNo + ", boardTitle="
				+ boardTitle + ", boardContent=" + boardContent + ", boardWriter=" + boardWriter + ", count=" + count
				+ ", createDate=" + createDate + ", status=" + status + ", categoryName=" + categoryName
				+ ", attachment=" + attachment + "]";
	}

	public int getBoardNo() {
		return boardNo;
	}

	public int getBoardType() {
		return boardType;
	}

	public int getCategoryNo() {
		return categoryNo;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public String getBoardWriter() {
		return boardWriter;
	}

	public int getCount() {
		return count;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public char getStatus() {
		return status;
	}

	public String getCategoryName() {
		return categoryName;
	}
	
	public Attachment getAttachment() {
		return attachment;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public void setBoardType(int boardType) {
		this.boardType = boardType;
	}

	public void setCategoryNo(int categoryNo) {
		this.categoryNo = categoryNo;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}
}