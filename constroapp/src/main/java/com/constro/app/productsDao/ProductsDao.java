package com.constro.app.productsDao;

import java.util.List;

import com.constro.app.bo.Products;

public interface ProductsDao {

	int products(Products bo);

	List<Products> getProductsDetails(String status);

}
