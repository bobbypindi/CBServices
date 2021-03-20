package com.constro.app.service;

import java.util.List;

import com.constro.app.bo.Contact;

public interface ContactService {

	String contactCustomer(Contact bo);

//	List<Contact> getContactDetails(String status);


	public List<Contact> getContactDetails(String status);

	Contact getEditResult(int id);

	String updatedDetails(Contact bo);

	String deleteCustomer(Integer id);


}
