package com.productManagement.paydaybank.DataAccess;

import java.util.List;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.productManagement.paydaybank.Entities.Products;

@Repository
public class ProductsDal implements IProductsDal {

	private EntityManager entityManager;
	
	@Autowired
	public ProductsDal(EntityManager entityManager) {
		this.entityManager=entityManager;
	}
	
	@Override
	@Transactional
	public List<Products> getAllProducts() {
		Session session=entityManager.unwrap(Session.class);
		List<Products> products=session.createQuery("from Products").getResultList();
		return products;
	}

	@Override
	@Transactional
	public Products getProductsById(int id) {
		Session session=entityManager.unwrap(Session.class);
		Products product=session.get(Products.class, id);
		return product;
	}

	@Override
	@Transactional
	public void updateProduct(Products product) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(product);
	}

}
