package com.BeBear.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.BeBear.entities.Color;
import com.BeBear.model.ColorInput;
import com.BeBear.services.impl.ColorService;

@Controller
public class ColorAdminController {

	@Autowired
	ColorService colorService;
	
	@GetMapping("/admin/color")
	public String listColor(Model model) {
		model.addAttribute("colors", colorService.findAllColor());
		model.addAttribute("color", new Color());
		return "admin/color";
	}
	
	@PostMapping("/admin/editColor")
	public String editColor(@ModelAttribute("color") Color color, RedirectAttributes redirectAtt) {
		boolean result = colorService.saveColor(color);
		if (result) {
			redirectAtt.addAttribute("message", "Cập nhật thành công");			
		} else {
			redirectAtt.addAttribute("message", "Cập nhật thất bại");	
		}
		return "redirect:/admin/color";
	}

	@PostMapping("/admin/addColor")
	public String addColor(@ModelAttribute("color") Color color, RedirectAttributes redirectAtt) {
		boolean result = colorService.saveColor(color);
		if (result) {
			redirectAtt.addAttribute("message", "Thêm mới thành công");			
		} else {
			redirectAtt.addAttribute("message", "Thêm mới thất bại");	
		}
		return "redirect:/admin/color";

	}
	
	@PostMapping("/admin/deleteColor")
	public String addColor(@ModelAttribute("id") int id, RedirectAttributes redirectAtt) {
		boolean result = colorService.deleteColorById(id);
		if (result) {
			redirectAtt.addFlashAttribute("message", "Xóa thành công");			
		} else {
			redirectAtt.addFlashAttribute("message", "Xóa thất bại");	
		}
		return "redirect:/admin/color";
	}
}