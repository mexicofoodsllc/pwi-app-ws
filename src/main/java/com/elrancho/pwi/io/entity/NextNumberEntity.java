package com.elrancho.pwi.io.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="nextnumber")
public class NextNumberEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="tablename", length = 50)
	private String tableName;
	
	@Column(name="nextnumber")
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
