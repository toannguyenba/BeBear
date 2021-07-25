package com.BeBear.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.BeBear.entities.Color;
import com.BeBear.services.impl.ColorService;
import com.BeBear.utils.PageUtil;

@Controller
public class ColorAdminController {

	@Autowired
	ColorService colorService;
	
	@GetMapping("/admin/color")
	public String listColor(@RequestParam(name = "currentPage", defaultValue = "1")int currentPage, Model model) {
		Page<Color> pageColor = colorService.findAllColor(currentPage);
		PageUtil pageUtil = new PageUtil(currentPage, pageColor.getTotalPages(), 10);
		model.addAttribute("pageUtil", pageUtil);
		List<Color> colors = pageColor.getContent();
		model.addAttribute("colors", colors);
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
	public String deleteColor(@ModelAttribute("id") int id, RedirectAttributes redirectAtt) {
		boolean result = colorService.deleteColorById(id);
		if (result) {
			redirectAtt.addFlashAttribute("message", "Xóa thành công");			
		} else {
			redirectAtt.addFlashAttribute("message", "Xóa thất bại");	
		}
		return "redirect:/admin/color";
	}
}
