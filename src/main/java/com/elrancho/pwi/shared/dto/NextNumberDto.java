package com.elrancho.pwi.shared.dto;

public class NextNumberDto {

	private String tableName;
	private long nextNumber;
	
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public long getNextNumber() {
		return nextNumber;
	}
	public void setNextNumber(long nextNumber) {
		this.nextNumber = nextNumber;
	}
	
}
