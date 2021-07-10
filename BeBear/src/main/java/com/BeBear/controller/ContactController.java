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
public class ContactController {
	@GetMapping("/contact")
	public String index() {
		return "contact";
	}
}
