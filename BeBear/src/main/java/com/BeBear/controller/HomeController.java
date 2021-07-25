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
public class HomeController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
}
