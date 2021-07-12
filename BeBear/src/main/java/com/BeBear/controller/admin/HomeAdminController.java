/**
 * 
 */
package com.BeBear.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author bn
 *
 */
@Controller
public class HomeAdminController {
	@GetMapping("/adminHome")
	public String index() {
		return "admin/index";
	}
}
