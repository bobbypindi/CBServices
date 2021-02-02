package com.constro.app.daoconstrans;

public class DaoConstrains {

	public static final String SQL_CONTACT_CUSTOMER ="insert into CustomerContact(CustomerName,CustomerMobileNo,CustomerAddress,CustomerPincode,CustomerSubject,CustomerMessage,Ststus,CustomerContactCreateDate)values(?,?,?,?,?,?,?,?)";
	public static final String SQL_CBELOGING_LOGIN ="select count(*) from CBDataDetails where UserName=? and PassWord=?";
	
	public static final String SQL_CONTACT_DATA ="select * from CustomerContact where Ststus=?";
	
}
