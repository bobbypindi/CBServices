package com.constro.app.productsService;

import java.util.List;

import com.constro.app.bo.Contact;
import com.constro.app.bo.Products;

public interface ProductsService {

	String products(Products bo);

	List<Products> getProductsDetails(String status);

	Products getEditResult(Integer id);

	String updateProductsandServicesDetails(Products bo);

	String deleteProductsandServicesDetails(Integer id);

}
