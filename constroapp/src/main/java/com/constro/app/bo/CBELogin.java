package com.constro.app.bo;

public class CBELogin {

	
	private String userName;
	private String passWord;
	private String mobileNo;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "CBELogin [userName=" + userName + ", passWord=" + passWord + ", mobileNo=" + mobileNo + "]";
	}

	
	
	
	
	
	
}
