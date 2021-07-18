package com.BeBear.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
	
	@GetMapping("/addColor/{id}")
	public String editColor(@PathVariable(name = "id") int id, Model model) {
		model.addAttribute("color", colorService.findColorById(id));
		return "admin/color-input";
	}

	@GetMapping("admin/addColor")
	public String inputColor(Model model) {
		model.addAttribute("colors", new ColorInput());
		return "admin/color-input";
	}

	@PostMapping("/admin/addColor")
	public String addColor(@ModelAttribute("color") Color color) {
		System.out.println(color.toString());
		boolean result = colorService.saveColor(color);
		return "redirect:/admin/color";

	}
}
