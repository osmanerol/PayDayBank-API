package com.productManagement.paydaybank.DataAccess;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.productManagement.paydaybank.Entities.Manager;

@Repository
public class ManagerDal implements IManagerDal {

	private EntityManager entityManager;
	
	@Autowired
	public ManagerDal(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public void addManager(Manager manager) {
		Session session=entityManager.unwrap(Session.class);
		session.save(manager);
	}

	@Override
	@Transactional
	public Manager findByUsername(String username) {
		Session session=entityManager.unwrap(Session.class);
		Manager manager=(Manager) session.createQuery("from Manager m where m.username=:username",Manager.class).setParameter("username", username).uniqueResult();
		return manager;
	}

}
