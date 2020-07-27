package com.productManagement.paydaybank.DataAccess;

import java.util.List;

import com.productManagement.paydaybank.Entities.Products;

public interface IProductsDal {
	List<Products> getAllProducts();
	Products getProductsById(int id);
	void updateProduct(Products product);
}