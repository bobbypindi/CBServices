package com.constro.app.bo;

public class Contact {
	private int id;
private String customerName;
private String customerMobileNo;
private String customerAddress;
private String customerPincode;
private String customerSubject;
private String customerMessage;
private String status;
private String customerContactCreateDate;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerMobileNo() {
	return customerMobileNo;
}
public void setCustomerMobileNo(String customerMobileNo) {
	this.customerMobileNo = customerMobileNo;
}
public String getCustomerAddress() {
	return customerAddress;
}
public void setCustomerAddress(String customerAddress) {
	this.customerAddress = customerAddress;
}
public String getCustomerPincode() {
	return customerPincode;
}
public void setCustomerPincode(String customerPincode) {
	this.customerPincode = customerPincode;
}
public String getCustomerSubject() {
	return customerSubject;
}
public void setCustomerSubject(String customerSubject) {
	this.customerSubject = customerSubject;
}
public String getCustomerMessage() {
	return customerMessage;
}
public void setCustomerMessage(String customerMessage) {
	this.customerMessage = customerMessage;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getCustomerContactCreateDate() {
	return customerContactCreateDate;
}
public void setCustomerContactCreateDate(String customerContactCreateDate) {
	this.customerContactCreateDate = customerContactCreateDate;
}
@Override
public String toString() {
	return "Contact [customerName=" + customerName + ", customerMobileNo=" + customerMobileNo + ", customerAddress="
			+ customerAddress + ", customerPincode=" + customerPincode + ", customerSubject=" + customerSubject
			+ ", customerMessage=" + customerMessage + ", status=" + status + ", customerContactCreateDate="
			+ customerContactCreateDate + "]";
}







}
