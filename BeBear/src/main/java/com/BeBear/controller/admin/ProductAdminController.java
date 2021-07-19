/**
 * 
 */
package com.BeBear.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.BeBear.entities.Product;
import com.BeBear.repositories.ProductRepository;

/**
 * @author bn
 *
 */
@Controller
public class ProductAdminController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping("/adminProduct")
	public String listProduct(Model model) {
		try {
			List<Product> products = productRepository.findAll();
			model.addAttribute("products", products);
			model.addAttribute("product", new Product());
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return "admin/products";
	}
}
