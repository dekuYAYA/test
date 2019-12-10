package com.example.entity;

public class User {
	private String Member_Name;
	private String Contact_Phone;
	private Double Member_Points;
	private String Member_Grade;
	private Double Amount_Trade;
	private Double Refund_Amount;

	public String getMember_Name() {
		return Member_Name;
	}

	public void setMember_Name(String member_Name) {
		Member_Name = member_Name;
	}

	public String getContact_Phone() {
		return Contact_Phone;
	}

	public void setContact_Phone(String contact_Phone) {
		Contact_Phone = contact_Phone;
	}

	public Double getMember_Points() {
		return Member_Points;
	}

	public void setMember_Points(Double member_Points) {
		Member_Points = member_Points;
	}

	public String getMember_Grade() {
		return Member_Grade;
	}

	public void setMember_Grade(String member_Grade) {
		Member_Grade = member_Grade;
	}

	public Double getAmount_Trade() {
		return Amount_Trade;
	}

	public void setAmount_Trade(Double amount_Trade) {
		Amount_Trade = amount_Trade;
	}

	public Double getRefund_Amount() {
		return Refund_Amount;
	}

	public void setRefund_Amount(Double refund_Amount) {
		Refund_Amount = refund_Amount;
	}

	@Override
	public String toString() {
		return "User [Member_Name=" + Member_Name + ", Contact_Phone=" + Contact_Phone + ", Member_Points="
				+ Member_Points + ", Member_Grade=" + Member_Grade + ", Amount_Trade=" + Amount_Trade
				+ ", Refund_Amount=" + Refund_Amount + "]";
	}
}