package com.productManagement.paydaybank.DataAccess;

import com.productManagement.paydaybank.Entities.Manager;

public interface IManagerDal {
	void addManager(Manager manager);
	Manager findByUsername(String username);
}
