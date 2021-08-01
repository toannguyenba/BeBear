/**
 * 
 */
package com.BeBear.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BeBear.entities.Product;
import com.BeBear.services.impl.ProductService;

/**
 * @author bn
 *
 */
@RestController
public class HomeController {
	
	@Autowired
	private ProductService productService;

	@GetMapping("/product")
	public List<Product> index() {
		List<Product> products = productService.findAllProduct();   
		return products;
	}
}
