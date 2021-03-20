package com.constro.app.daoimpl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.constro.app.bo.Contact;
import com.constro.app.dao.ContactDao;
import com.constro.app.daoconstrans.DaoConstrains;
@Repository
public class ContactDaoImpl implements ContactDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int contactCustomer(Contact bo) { 
		bo.setStatus("No");
		int count=jdbcTemplate.update(DaoConstrains.SQL_CONTACT_CUSTOMER, bo.getCustomerName(),bo.getCustomerMobileNo(),bo.getCustomerAddress(),bo.getCustomerPincode(),bo.getCustomerSubject(),bo.getCustomerMessage(),bo.getStatus(),bo.getCustomerContactCreateDate());
		return count;
	}
	@Override
	public List<Contact> getContactDetails(String status) {
		List<Contact> list = jdbcTemplate.query(
				DaoConstrains.SQL_CONTACT_DATA,
				new BeanPropertyRowMapper<>(Contact.class), status);
		return list;
	}
	@Override
	public List<Contact> getEditList(int id) {

		List<Contact> list=jdbcTemplate.query(DaoConstrains.SQL_EDIT_DATA, new BeanPropertyRowMapper(Contact.class),id);
		return list;
	}
	@Override
	public int updatedDetails(Contact bo) {
		int count=jdbcTemplate.update(DaoConstrains.SQL_CONTACT_UPDATE,bo.getStatus(),bo.getId());
		return count;
	}
	@Override
	public int deleteCustomer(Integer id) {
		int count=jdbcTemplate.update(DaoConstrains.SQL_CUSTOMER_DELETE, id);
		return count;
	}
	

}
