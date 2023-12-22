package com.kh.board.model.vo;

import oracle.sql.DATE;

public class Attachment {
//	FILE_NO	NUMBER
	int fileNo;
//	REF_BNO	NUMBER
	int refBno;
//	ORIGIN_NAME	VARCHAR2(255 BYTE)
	String originName;
//	CHANGE_NAME	VARCHAR2(255 BYTE)
	String changeName;
//	FILE_PATH	VARCHAR2(1000 BYTE)
	String filePath;
//	UPLOAD_DATE	DATE
	DATE uploadDate;
//	FILE_LEVEL	NUMBER
	int fileLevel;
//	STATUS	VARCHAR2(1 BYTE)
	String status;
	
	
	public Attachment() {
		super();
	}

	public Attachment(int fileNo, int refBno, String originName, String changeName, String filePath, DATE uploadDate,
			int fileLevel, String status) {
		super();
		this.fileNo = fileNo;
		this.refBno = refBno;
		this.originName = originName;
		this.changeName = changeName;
		this.filePath = filePath;
		this.uploadDate = uploadDate;
		this.fileLevel = fileLevel;
		this.status = status;
	}


	@Override
	public String toString() {
		return "Attachment [fileNo=" + fileNo + ", refBno=" + refBno + ", originName=" + originName + ", changeName="
				+ changeName + ", filePath=" + filePath + ", uploadDate=" + uploadDate + ", fileLevel=" + fileLevel
				+ ", status=" + status + "]";
	}

	public int getFileNo() {
		return fileNo;
	}

	public int getRefBno() {
		return refBno;
	}

	public String getOriginName() {
		return originName;
	}

	public String getChangeName() {
		return changeName;
	}

	public String getFilePath() {
		return filePath;
	}

	public DATE getUploadDate() {
		return uploadDate;
	}

	public int getFileLevel() {
		return fileLevel;
	}

	public String getStatus() {
		return status;
	}

	public void setFileNo(int fileNo) {
		this.fileNo = fileNo;
	}

	public void setRefBno(int refBno) {
		this.refBno = refBno;
	}

	public void setOriginName(String originName) {
		this.originName = originName;
	}

	public void setChangeName(String changeName) {
		this.changeName = changeName;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public void setUploadDate(DATE uploadDate) {
		this.uploadDate = uploadDate;
	}

	public void setFileLevel(int fileLevel) {
		this.fileLevel = fileLevel;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
