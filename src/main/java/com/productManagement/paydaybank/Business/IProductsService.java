package com.productManagement.paydaybank.Business;

import java.util.List;

import com.productManagement.paydaybank.Entities.Products;

public interface IProductsService {
	List<Products> getAllProducts();
	Products getProductsById(int id);
	void updateProduct(Products product);
}
