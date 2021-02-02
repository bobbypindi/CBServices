package com.constro.app.serviceimpl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.constro.app.bo.Contact;
import com.constro.app.dao.ContactDao;
import com.constro.app.service.ContactService;
@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
     private ContactDao contactDao;
	@Override
	public String contactCustomer(Contact bo) {
		int cnt = contactDao.contactCustomer(bo);
		if (cnt != 0)
			return "success";
		else
			return "failure";
	}
	@Override
	public Contact getContactDetails(String status) {
		Contact cgp = new Contact();
		List<Contact> list = contactDao.getContactDetails(status);
//		
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			cgp = (Contact) itr.next();

		}
		
//		Contact cgp = new Contact();
//		List<Contact> list = contactDao.getContactDetails(status);
//		Iterator itr = list.iterator();
//		while (itr.hasNext()) {
//			cgp = (CustomerGroseryPage) itr.next();
//
//		}
		return cgp;
	}
}
