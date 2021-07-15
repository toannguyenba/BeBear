package com.BeBear.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.BeBear.model.ColorInput;
import com.BeBear.services.impl.ColorService;

@Controller
public class ColorAdminController {

	@Autowired
	ColorService colorService;

	@GetMapping("/addColor")
	public String inputColor(Model model) {
		model.addAttribute("colors", new ColorInput());
		return "admin/color-input";
	}

	@PostMapping("/addColor")
	public String addColor(@ModelAttribute("colors") ColorInput colors) {
		int result = colorService.saveAllColor(colors.getColors());
		return "redirect:addColor";

	}
}
