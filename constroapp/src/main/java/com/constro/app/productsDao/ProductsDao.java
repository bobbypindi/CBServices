package com.constro.app.productsDao;

import java.util.List;

import com.constro.app.bo.Products;

public interface ProductsDao {

	int products(Products bo);

	List<Products> getProductsDetails(String status);

	List<Products> getEditList(Integer id);

	int updatedDetails(Products bo);

	int deleteDetails(Integer id);


}
