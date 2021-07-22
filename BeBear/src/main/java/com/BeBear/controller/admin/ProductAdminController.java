/**
 * 
 */
package com.BeBear.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.BeBear.entities.Category;
import com.BeBear.entities.Product;
import com.BeBear.repositories.CategoryRepository;
import com.BeBear.repositories.ProductRepository;

/**
 * @author bn
 *
 */
@Controller
public class ProductAdminController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@GetMapping("/admin/product")
	public String listProduct(Model model) {
		try {
			List<Product> products = productRepository.findAll();
			List<Category> categorys = categoryRepository.findAll();
//			System.out.println(products.get(0).getIdPhoto());
			
			// Xử lý tạm thời
			for(Product temp: products ) {
				temp.setIdPhoto(null);
				temp.setProductdetail(null);
			}
			// end
			model.addAttribute("products", products);
			model.addAttribute("categorys", categorys);
			model.addAttribute("product", new Product());
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return "admin/products";
	}
}
