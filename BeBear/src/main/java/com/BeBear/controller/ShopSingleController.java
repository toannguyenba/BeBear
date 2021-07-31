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
public class ShopSingleController {
	@GetMapping("/shop-single")
	public String index() {
		return "shop-single.html";
	}
}