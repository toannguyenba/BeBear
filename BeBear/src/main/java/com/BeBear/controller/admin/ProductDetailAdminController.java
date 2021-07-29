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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.BeBear.entities.Color;
import com.BeBear.entities.Product;
import com.BeBear.entities.ProductDetail;
import com.BeBear.entities.Size;
import com.BeBear.services.impl.ColorService;
import com.BeBear.services.impl.ProductDetailService;
import com.BeBear.services.impl.ProductService;
import com.BeBear.services.impl.SizeService;
import com.BeBear.utils.PageUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author bn
 *
 */
@Controller
public class ProductDetailAdminController {
	@Autowired
	public ProductDetailService proDetailService;
	
	@Autowired
	private ColorService colorService;
	
	@Autowired
	private SizeService sizeService;
	
	@Autowired
	private ProductService productService;
	
	private List<Product> products;
	private List<Color> colors;
	private List<Size> sizes;
	
	@GetMapping("/admin/productDetail")
	public String getAllProductDetail (@RequestParam(name = "currentPage", defaultValue = "1")int currentPage, Model model) {
		try {
			//Tab active menu right
			model.addAttribute("page", "productDetail");
			//Phân trang
			Page<ProductDetail> pageProductDeatils = proDetailService.getAllProductDetail(currentPage);
			PageUtil pageUtil = new PageUtil(currentPage, pageProductDeatils.getTotalPages(), 10);
			model.addAttribute("pageUtil", pageUtil);
			
			//Lấy list productDetail
			List<ProductDetail> productDetails = pageProductDeatils.getContent();
			model.addAttribute("productDetails", productDetails);
			
			//Lấy các phụ thuộc
			getDependence(model);
			
			//Tạo mới một productDetail
			model.addAttribute("productDetail", new ProductDetail());
		} catch (Exception e) {
			System.out.println(e);
		}
		return "admin/productDetail";
	}
	
	@PostMapping("/admin/addProductDetail")
	public String addProductDetail (@ModelAttribute("productDetail") ProductDetail productDetail, RedirectAttributes redirectAtt) {
		try {
			boolean result = proDetailService.saveProductDetail(productDetail);
			if (result) {
				redirectAtt.addAttribute("message", "Thêm mới thành công");			
			} else {
				redirectAtt.addAttribute("message", "Thêm mới thất bại");	
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return "redirect:/admin/productDetail";
	}
	
	@PostMapping("/admin/editProductDetail")
	public String editProductDetail (@ModelAttribute("productDetail") ProductDetail productDetail, RedirectAttributes redirectAtt) {
		try {
			boolean result = proDetailService.saveProductDetail(productDetail);
			if (result) {
				redirectAtt.addAttribute("message", "Chỉnh sửa thành công");			
			} else {
				redirectAtt.addAttribute("message", "Chỉnh sửa thất bại");	
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return "redirect:/admin/productDetail";
	}
	
	private void getDependence(Model model) {
		//Lấy list product
		products = productService.findAllProduct();
		model.addAttribute("products", products);
		
		//Lấy list color
		colors = colorService.findAllColor();
		model.addAttribute("colors", colors);
		
		//Lấy list size
		sizes = sizeService.findAllSize();
		model.addAttribute("sizes", sizes);
	}
}
