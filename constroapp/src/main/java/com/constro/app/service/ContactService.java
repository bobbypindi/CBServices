package com.constro.app.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.constro.app.bo.Contact;

public interface ContactService {

	String contactCustomer(Contact bo);

//	List<Contact> getContactDetails(String status);


	public Contact getContactDetails(String status);

}