package com.productManagement.paydaybank.RestApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.productManagement.paydaybank.Business.IManagerService;
import com.productManagement.paydaybank.Business.IProductsService;
import com.productManagement.paydaybank.Entities.Manager;
import com.productManagement.paydaybank.Entities.Products;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/manager")
public class ManagerController {
	
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	private IManagerService managerService;
	
	@Autowired
	public ManagerController(BCryptPasswordEncoder bCryptPasswordEncoder, IManagerService managerService) {
		super();
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
		this.managerService = managerService;
	}

	@PostMapping("/signup")
    public void signUp(@RequestBody Manager manager) {
		manager.setPassword(bCryptPasswordEncoder.encode(manager.getPassword()));
		this.managerService.addManager(manager);
    }
	
	@GetMapping("/getmanager/{username}")
	public Manager getManager(@PathVariable String username) {
		return this.managerService.findByUsername(username);
	}
	
	@PutMapping("/updatemanager")
	public void updateManager( @RequestBody Manager manager) {
		this.managerService.updateManager(manager);
	}
	
}