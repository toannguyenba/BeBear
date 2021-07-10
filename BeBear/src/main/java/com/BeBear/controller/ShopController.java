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
public class ShopController {
	@GetMapping("/shop")
	public String index() {
		return "shop";
	}
}
