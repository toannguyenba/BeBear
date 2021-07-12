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
public class ProductAdminController {
	@GetMapping("/adminProduct")
	public String index() {
		return "admin/products";
	}
}
