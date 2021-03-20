package com.constro.app.serviceimpl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
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
	public List<Contact> getContactDetails(String status) {
		List<Contact> cgpList = new ArrayList<Contact>();
		List<Contact> list = contactDao.getContactDetails(status);
//		
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Contact cgp = (Contact) itr.next();
			cgpList.add(cgp);
		}
		
		return cgpList;
	}
	
	
	
	
	@Override
	public Contact getEditResult(int id) {
		Contact cgp = new Contact();
		List<Contact> list = contactDao.getEditList(id);
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			cgp = (Contact) itr.next();

		}
		return cgp;	}
	@Override
	public String updatedDetails(Contact bo) {
		int cnt = contactDao.updatedDetails(bo);
		if (cnt != 0)
			return "success";
		else
			return "failure";
	}
	@Override
	public String deleteCustomer(Integer id) {
		int res = contactDao.deleteCustomer(id);
		if (res == 0)
			return "Order Not Cancel";
		else
			return "Order Cancel";
	}
}
