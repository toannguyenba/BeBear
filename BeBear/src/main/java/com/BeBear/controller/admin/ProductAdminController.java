/**
 * 
 */
package com.BeBear.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
		model.addAttribute("listRepository", productRepository.findAll());
		return "admin/products";
	}
}
