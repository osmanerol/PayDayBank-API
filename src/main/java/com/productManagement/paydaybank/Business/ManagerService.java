package com.productManagement.paydaybank.Business;

import static java.util.Collections.emptyList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.productManagement.paydaybank.DataAccess.IManagerDal;
import com.productManagement.paydaybank.DataAccess.ManagerDal;
import com.productManagement.paydaybank.Entities.Manager;

@Service
public class ManagerService implements IManagerService,	UserDetailsService{
	
	private IManagerDal managerDal;
	
	@Autowired
	public ManagerService(IManagerDal managerDal) {
		this.managerDal=managerDal;
	}
	
	@Override
	public void addManager(Manager manager) {
		this.managerDal.addManager(manager);
	}

	@Override
	public Manager findByUsername(String username) {
		return this.managerDal.findByUsername(username);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Manager manager = this.managerDal.findByUsername(username);
        if (manager == null) {
            throw new UsernameNotFoundException(username);
        }
        return new User(manager.getUsername(), manager.getPassword(), emptyList());
	}

	@Override
	public void updateManager(Manager manager) {
		this.managerDal.updateManager(manager);
	}


}
