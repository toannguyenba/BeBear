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
import com.BeBear.services.impl.CategoryService;

/**
 * @author bn
 *
 */
@Controller
public class CategoryAdminController {
	@Autowired
	CategoryService categoryService;
	
	@GetMapping("/admin/category")
	public String getAllCategory(Model model) {
		try {
			List<Category> categorys = categoryService.findAllCategory();
			model.addAttribute("categorys", categorys);
			model.addAttribute("page", "category");
			model.addAttribute("category", new Category());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return "admin/category";
	}
	
	@PostMapping("/admin/addCategory")
	public String addCategory(@ModelAttribute("category") Category category, RedirectAttributes redirectAtt) {
		try {
			boolean result = categoryService.saveCategory(category);
			if (result) {
				redirectAtt.addAttribute("message", "Thêm mới thành công");			
			} else {
				redirectAtt.addAttribute("message", "Thêm mới thất bại");	
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return "redirect:/admin/category";
	}
	
	@PostMapping("/admin/editCategory")
	public String editCategory(@ModelAttribute("category") Category category, RedirectAttributes redirectAtt) {
		try {
			boolean result = categoryService.saveCategory(category);
			if (result) {
				redirectAtt.addAttribute("message", "Cập nhật thành công");			
			} else {
				redirectAtt.addAttribute("message", "Cập nhật thất bại");	
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return "redirect:/admin/category";
	}
	
	@PostMapping("/admin/deleteCategory")
	public String deleteCategory(@ModelAttribute("id") int id, RedirectAttributes redirectAtt) {
		try {
			boolean result = categoryService.deleteCategoryById(id);
			if (result) {
				redirectAtt.addAttribute("message", "Xóa thành công");			
			} else {
				redirectAtt.addAttribute("message", "Xóa thất bại");	
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return "redirect:/admin/category";
	}
}
