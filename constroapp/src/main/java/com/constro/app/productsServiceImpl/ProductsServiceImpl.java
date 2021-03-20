package com.constro.app.productsServiceImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.constro.app.bo.Contact;
import com.constro.app.bo.Products;
import com.constro.app.dao.ContactDao;
import com.constro.app.productsDao.ProductsDao;
import com.constro.app.productsService.ProductsService;
@Service
public class ProductsServiceImpl implements ProductsService {

	
	

	@Autowired
     private ProductsDao productsDao;
	@Override
	public String products(Products bo) {
		// TODO Auto-generated method stub
	
			int cnt = productsDao.products(bo);
			if (cnt != 0)
				return "success";
			else
				return "failure";
	}
	@Override
	public List<Products> getProductsDetails(String status) {
		// TODO Auto-generated method stub
		List<Products> productsList = new ArrayList<Products>();
		List<Products> list = productsDao.getProductsDetails(status);
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Products cgp = (Products) itr.next();
			productsList.add(cgp);
		}
		
		return productsList;
	}
	@Override
	public Products getEditResult(Integer id) {
	
		

		
			Products cgp = new Products();
			List<Products> list = productsDao.getEditList(id);
			Iterator itr = list.iterator();
			while (itr.hasNext()) {
				cgp = (Products) itr.next();

			}
			return cgp;	}
	@Override
	public String updateProductsandServicesDetails(Products bo) {
			int cnt = productsDao.updatedDetails(bo);
			if (cnt != 0)
				return "success";
			else
				return "failure";
		}
	@Override
	public String deleteProductsandServicesDetails(Integer id) {
		int res = productsDao.deleteDetails(id);
		if (res == 0)
			return "Order Not Cancel";
		else
			return "Order Cancel";
	}
	}

