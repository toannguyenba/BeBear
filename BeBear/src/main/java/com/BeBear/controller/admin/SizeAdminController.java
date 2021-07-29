/**
 * 
 */
package com.BeBear.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.BeBear.entities.Size;
import com.BeBear.services.impl.SizeService;

@Controller
public class SizeAdminController {
	
	@Autowired
	SizeService sizeService;
	
	@GetMapping("/admin/size")
	public String listSize(Model model) {
		model.addAttribute("page", "size");
		model.addAttribute("sizes", sizeService.findAllSize());
		model.addAttribute("size", new Size());
		return "admin/size";
	}
	
	@PostMapping("/admin/addSize")
	public String addSize(@ModelAttribute("size") Size size, RedirectAttributes redirectAtt) {
		boolean result = sizeService.saveSize(size);
		if (result) {
			redirectAtt.addFlashAttribute("message", "Thêm mới thành công");
		} else {
			redirectAtt.addFlashAttribute("message", "Thêm mới thất bại");
		}
		return "redirect:/admin/size";
	}
	
	@PostMapping("/admin/editSize")
	public String editSize(@ModelAttribute("size") Size size, RedirectAttributes redirectAtt) {
		boolean result = sizeService.saveSize(size);
		if (result) {
			redirectAtt.addFlashAttribute("message", "Cập nhật thành công");
		} else {
			redirectAtt.addFlashAttribute("message", "Cập nhật thất bại");
		}
		return "redirect:/admin/size";
	}
	
	@PostMapping("/admin/deleteSize")
	public String deleteSize(@ModelAttribute("id") int id, RedirectAttributes redirectAtt) {
		boolean result = sizeService.deleteSize(id);
		if (result) {
			redirectAtt.addFlashAttribute("message", "Xóa thành công");
		} else {
			redirectAtt.addFlashAttribute("message", "Xóa thất bại");
		}
		return "redirect:/admin/size";
	}
}
