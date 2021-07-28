/**
 * 
 */
package com.BeBear.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.BeBear.entities.Category;
import com.BeBear.entities.Product;
import com.BeBear.services.impl.CategoryService;
import com.BeBear.services.impl.ProductService;

/**
 * @author bn
 *
 */
@Controller
public class ProductAdminController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/admin/product")
	public String listProduct(Model model) {
		try {
			List<Product> products = productService.findAllProduct();
			List<Category> categorys = categoryService.findAllCategory();
//			System.out.println(products.get(0).getIdPhoto());
			
			// Xử lý tạm thời
//			for(Product temp: products ) {
//				temp.setIdPhoto(null);
//				temp.setProductdetail(null);
//			}
			// end
			model.addAttribute("products", products);
			model.addAttribute("categorys", categorys);
			model.addAttribute("product", new Product());
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return "admin/products";
	}
	
	@PostMapping("/admin/addProduct")
	public String addProduct(@ModelAttribute("product") Product product, RedirectAttributes redirectAtt) {
		try {
			boolean result = productService.saveProduct(product);
			if (result) {
				redirectAtt.addAttribute("message", "Thêm mới thành công");			
			} else {
				redirectAtt.addAttribute("message", "Thêm mới thất bại");	
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return "redirect:/admin/product";
	}
	
	@PostMapping("/admin/editProduct")
	public String editProduct(@ModelAttribute("product") Product product, RedirectAttributes redirectAtt) {
		try {
			boolean result = productService.saveProduct(product);
			if (result) {
				redirectAtt.addAttribute("message", "Cập nhật thành công");			
			} else {
				redirectAtt.addAttribute("message", "Cập nhật thất bại");	
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return "redirect:/admin/product";
	}
	
	@PostMapping("/admin/deleteProduct")
	public String deleteProduct(@ModelAttribute("id") int id, RedirectAttributes redirectAtt) {
		try {
			boolean result = productService.deleteProductById(id);
			if (result) {
				redirectAtt.addAttribute("message", "Xóa thành công");			
			} else {
				redirectAtt.addAttribute("message", "Xóa thất bại");	
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return "redirect:/admin/product";
	}
}
