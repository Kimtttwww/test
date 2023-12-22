package com.kh.common;

import java.io.File;
import java.text.SimpleDateFormat;

import com.oreilly.servlet.multipart.FileRenamePolicy;


public class MyFileRenamePolicy implements FileRenamePolicy {

//	인터페이스를 구현해야함
	@Override
	public File rename(File originFile) {
//		기존의 파일을 매개변수로 전달받아서(arg0) 파일명 수정작업 후에 수정된 파일을 반환해주는 메서드
		
//		원본파일명("aaa.jpg")
		String originName = originFile.getName();
		
//		수정 파일명 : 파일 업로드된 시간(년월일시분초) + 5자리 랜덤값 => 최대한 안겹치게 함
//		확장자 : 원본파일 확장자 그대로 사용
//		1. 파일 업로드된 시간(년월일시분초)
		String currentTime = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
		
//		2. 5자리 랜덤값 -> int ranNum
		int ranNum = (int)(Math.random() * 90000 + 10000);
		
//		3. 원본파일 확장자
		String ext = originName.substring(originName.lastIndexOf("."));
		
		String changeName = currentTime + ranNum + ext;
		return new File(originFile.getParent(), changeName);
	}
}