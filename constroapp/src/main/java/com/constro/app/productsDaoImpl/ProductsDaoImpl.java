package com.constro.app.productsDaoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.constro.app.bo.Contact;
import com.constro.app.bo.Products;
import com.constro.app.daoconstrans.DaoConstrains;
import com.constro.app.productsDao.ProductsDao;
@Repository
public class ProductsDaoImpl implements ProductsDao {

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int products(Products bo) {
		bo.setStatus("No");
		int count=jdbcTemplate.update(DaoConstrains.SQL_CONTACT_PRODUCTS,bo.getProduct(), bo.getCustomerName(),bo.getCustomerMobileNo(),bo.getCustomerAddress(),bo.getCustomerPincode(),bo.getCustomerSubject(),bo.getCustomerMessage(),bo.getStatus(),bo.getCustomerContactCreateDate());
		return count;
	}
	@Override
	public List<Products> getProductsDetails(String status) {
		List<Products> list = jdbcTemplate.query(
				DaoConstrains.SQL_PRODUCTS_DATA,
				new BeanPropertyRowMapper<>(Products.class), status);
		return list;
	}
	@Override
	public List<Products> getEditList(Integer id) {
		List<Products> list=jdbcTemplate.query(DaoConstrains.SQL_PRODUCTSANDSERVICES_DATA, new BeanPropertyRowMapper(Products.class),id);
		return list;
	}
	@Override
	public int updatedDetails(Products bo) {
		int count=jdbcTemplate.update(DaoConstrains.SQL_PRODUCTSANDSERVICES_UPDATE,bo.getStatus(),bo.getId());
		return count;
	}
	@Override
	public int deleteDetails(Integer id) {
		int count=jdbcTemplate.update(DaoConstrains.SQL_PRODUCTSANDSERVICES_DELETE, id);
		return count;
	}

}
