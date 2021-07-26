/**
 * 
 */
package com.BeBear.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.BeBear.entities.ProductDetail;
import com.BeBear.services.impl.ProductDetailService;
import com.BeBear.utils.PageUtil;

/**
 * @author bn
 *
 */
@Controller
public class ProductDetailAdminController {
	@Autowired
	public ProductDetailService proDetailService;
	
	@GetMapping("/admin/productDetail")
	public String getAllProductDetail (@RequestParam(name = "currentPage", defaultValue = "1")int currentPage, Model model) {
		//Tab active menu right
		model.addAttribute("page", "productDetail");
		//Phân trang
		Page<ProductDetail> pageProductDeatils = proDetailService.getAllProductDetail(currentPage);
		PageUtil pageUtil = new PageUtil(currentPage, pageProductDeatils.getTotalPages(), 10);
		model.addAttribute("pageUtil", pageUtil);
		//Lấy list productDetail
		List<ProductDetail> productDetails = pageProductDeatils.getContent();
		model.addAttribute("productDetails", productDetails);
		//Tạo mới một productDetail
		model.addAttribute("productDetail", new ProductDetail());
		return "admin/productDetail";
	}
}
