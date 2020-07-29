package com.productManagement.paydaybank.RestApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.productManagement.paydaybank.Business.IProductsService;
import com.productManagement.paydaybank.Entities.Products;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class ProductsController {

	private IProductsService  productsService;
	
	@Autowired
	public ProductsController(IProductsService productsService) {
		super();
		this.productsService = productsService;
	}

	@GetMapping("/products")
	public List<Products> getAllProducts(){
		return this.productsService.getAllProducts();
	}

	@GetMapping("/products/{id}")
	public Products getProduct(@PathVariable int id){
		return this.productsService.getProductsById(id);
	}
	
	@PutMapping("/products/updateproduct")
	public void updateProduct(@RequestBody Products product) {
		this.productsService.updateProduct(product);
	}
}
