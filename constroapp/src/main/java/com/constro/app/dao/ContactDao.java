package com.constro.app.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.constro.app.bo.Contact;

public interface ContactDao {

	int contactCustomer(Contact bo);

	List<Contact> getContactDetails(String status);


}
