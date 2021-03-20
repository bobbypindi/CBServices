package com.constro.app.daoconstrans;

public class DaoConstrains {

	public static final String SQL_CONTACT_CUSTOMER ="insert into CustomerContact(CustomerName,CustomerMobileNo,CustomerAddress,CustomerPincode,CustomerSubject,CustomerMessage,Status,CustomerContactCreateDate)values(?,?,?,?,?,?,?,?)";
	public static final String SQL_CBELOGING_LOGIN ="select count(*) from CBDataDetails where UserName=? and PassWord=?";
	
	public static final String SQL_CONTACT_DATA ="select * from customercontact where Status=?";
	
	public static final String SQL_EDIT_DATA ="select * from customercontact where id=?";
	
	public static final String SQL_CONTACT_PRODUCTS ="insert into Products(Product,CustomerName,CustomerMobileNo,CustomerAddress,CustomerPincode,CustomerSubject,CustomerMessage,Status,CustomerContactCreateDate)values(?,?,?,?,?,?,?,?,?)";
	
	public static final String SQL_PRODUCTS_DATA ="select * from Products where Status=?";
	
	public static final String SQL_CONTACT_UPDATE ="update customercontact set Status=? where  id =?";
	
	
	public  static final String SQL_CUSTOMER_DELETE ="delete from customercontact where id=?";
	
	public static final String SQL_PRODUCTSANDSERVICES_DATA ="select * from Products where id=?";
	
	public static final String SQL_PRODUCTSANDSERVICES_UPDATE ="update Products set Status=? where  id =?";
	
	public  static final String SQL_PRODUCTSANDSERVICES_DELETE ="delete from Products where id=?";
	
}
