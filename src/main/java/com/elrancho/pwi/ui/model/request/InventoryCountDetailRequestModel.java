package com.elrancho.pwi.ui.model.request;

public class InventoryCountDetailRequestModel {

	private long storeId;
	private long departmentId;
	// ------------------Second phase Enhancement: Adding Areas: Code begin------------------//
	private long areaId;
	// ------------------Second phase Enhancement: Adding Areas: Code // end------------------//
	private String userId;
	private long vendorItem;
	private double cost;
	private double quantity;
	private String unitOfMeasure;

	public long getStoreId() {
		return storeId;
	}

	public void setStoreId(long storeId) {
		this.storeId = storeId;
	}

	public long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}

	// ------------------Second phase Enhancement: Adding Areas: Code begin------------------//
	public long getAreaId() {
		return areaId;
	}

	public void setAreaId(long areaId) {
		this.areaId = areaId;
	}
	// ------------------Second phase Enhancement: Adding Areas: Code end------------------//

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public long getVendorItem() {
		return vendorItem;
	}

	public void setVendorItem(long vendorItem) {
		this.vendorItem = vendorItem;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

}
