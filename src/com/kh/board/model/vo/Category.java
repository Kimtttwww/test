package com.kh.board.model.vo;

public class Category {
	private int categoryNo;
	private String categoryName;
	
	
	public Category() {
		super();
	}


	public Category(int categoryNo, String categoryName) {
		super();
		this.categoryNo = categoryNo;
		this.categoryName = categoryName;
	}


	@Override
	public String toString() {
		return "Category [categoryNo=" + categoryNo + ", categoryName=" + categoryName + "]";
	}

	public int getCategoryNo() {
		return categoryNo;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryNo(int categoryNo) {
		this.categoryNo = categoryNo;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}