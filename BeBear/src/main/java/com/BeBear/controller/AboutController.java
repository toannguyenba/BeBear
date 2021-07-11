/**
 * 
 */
package com.BeBear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author bn
 *
 */
@Controller
public class AboutController {
	@GetMapping("/about")
	public String index() {
		return "about";
	}
}
