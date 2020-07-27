package com.productManagement.paydaybank.Business;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.productManagement.paydaybank.Entities.Manager;

public interface IManagerService {
	void addManager(Manager manager);
	Manager findByUsername(String username);
	UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
