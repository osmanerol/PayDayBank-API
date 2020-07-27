package com.productManagement.paydaybank.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productManagement.paydaybank.DataAccess.IProductsDal;
import com.productManagement.paydaybank.Entities.Products;

@Service
public class ProductsService implements IProductsService {

	private IProductsDal productsDal;
	
	@Autowired
	public ProductsService(IProductsDal productsDal) {
		super();
		this.productsDal = productsDal;
	}

	@Override
	public List<Products> getAllProducts() {
		return this.productsDal.getAllProducts();
	}

	@Override
	public Products getProductsById(int id) {
		return this.productsDal.getProductsById(id);
	}

	@Override
	public void updateProduct(Products product) {
		this.productsDal.updateProduct(product);
	}

}
