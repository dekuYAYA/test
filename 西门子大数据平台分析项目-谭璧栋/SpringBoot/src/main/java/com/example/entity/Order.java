package com.example.entity;

//entity：实体类
public class Order {
	private String member_Name;
	private String orderID;
	private String baby_Title;
	private String storeId;
	private Double price;
	private String buy_Quantity;
	private String orderState;

	public String getMember_Name() {
		return member_Name;
	}

	public void setMember_Name(String member_Name) {
		this.member_Name = member_Name;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getBaby_Title() {
		return baby_Title;
	}

	public void setBaby_Title(String baby_Title) {
		this.baby_Title = baby_Title;
	}

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getBuy_Quantity() {
		return buy_Quantity;
	}

	public void setBuy_Quantity(String buy_Quantity) {
		this.buy_Quantity = buy_Quantity;
	}

	public String getOrderState() {
		return orderState;
	}

	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}

	@Override
	public String toString() {
		return "User2 [member_Name=" + member_Name + ", orderID=" + orderID + ", baby_Title=" + baby_Title
				+ ", storeId=" + storeId + ", price=" + price + ", buy_Quantity=" + buy_Quantity + ", orderState="
				+ orderState + "]";
	}

}
