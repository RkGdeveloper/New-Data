package com.cg.rechargeapplication.bean;

public class RechargeData {

	private int rechTransId;
	private int rechId;
	private long mobileNo;
	private String couponCode;
	public int getRechTransId() {
		return rechTransId;
	}
	public void setRechTransId(int rechTransId) {
		this.rechTransId = rechTransId;
	}
	public int getRechId() {
		return rechId;
	}
	public void setRechId(int rechId) {
		this.rechId = rechId;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	@Override
	public String toString() {
		return "RechargeData [rechTransId=" + rechTransId + ", rechId="
				+ rechId + ", mobileNo=" + mobileNo + ", couponCode="
				+ couponCode + "]";
	}
	
	
}
