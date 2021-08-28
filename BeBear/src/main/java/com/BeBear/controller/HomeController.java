/**
 * 
 */
package com.BeBear.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.BeBear.entities.Category;
import com.BeBear.entities.Color;
import com.BeBear.entities.Product;
import com.BeBear.entities.ProductDetail;
import com.BeBear.entities.Size;
import com.BeBear.model.ListProduct;
import com.BeBear.services.impl.CategoryService;
import com.BeBear.services.impl.ColorService;
import com.BeBear.services.impl.ProductDetailService;
import com.BeBear.services.impl.ProductService;
import com.BeBear.services.impl.SizeService;

/**
 * @author bn
 *
 */
@RestController
public class HomeController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private ProductDetailService proDetailService;
	
	@Autowired
	private ColorService colorService;
	
	@Autowired
	private SizeService sizeService;
	
	@GetMapping("/product")
	public List<Product> getProductByIdCategory(@RequestParam(value = "filter", required = false) String filter) {
		List<Product> products = new ArrayList<Product>();
		try {
			products = productService.findProduct(filter);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return products;
	}
	
	@GetMapping("/products")
	public ListProduct getProduct(@RequestParam(value = "filter", required = false) String filter, 
			@RequestParam("count") int count,
			@RequestParam("currentPage") int currentPage) {
		ListProduct list = new ListProduct();
		List<Product> products = new ArrayList<Product>();
		Page<Product> productPage = null;
		int totalPage;
		try {
			productPage = productService.findProductPage(filter, count, currentPage);
			products = productPage.getContent();
			totalPage = productPage.getTotalPages();
			list.setProducts(products);
			list.setTotalPage(totalPage);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
	
	@GetMapping("/productByIdProduct")
	public Product getProductByIdProduct(@RequestParam(value = "id", required = false) int id) {
		Product product = new Product();
		try {
			product = productService.findByIdProduct(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return product;
	}
	
	@GetMapping("/category")
	public List<Category> getAllCategory() {
		List<Category> categorys = new ArrayList<Category>(); 
		try {
			categorys = categoryService.findAllCategory();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return categorys;
	}
	
	@GetMapping("/productDetail")
	public List<ProductDetail> getProductDetail(@RequestParam("filter") int filter) {
		List<ProductDetail> proDetails = new ArrayList<ProductDetail>(); 
		Product product = productService.findByIdProduct(filter);
		try {
			proDetails = proDetailService.findProductDetailByIdProduct(product);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return proDetails;
	}
	
	@GetMapping("/color")
	public List<Color> getAllColor(@RequestParam("filter") int filter) {
		List<Color> colors = new ArrayList<Color>(); 
		try {
			colors = colorService.getListByIdProduct(filter);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return colors;
	}
	
	@GetMapping("/size")
	public List<Size> getSize(@RequestParam("filter") int filter) {
		List<Size> sizes = new ArrayList<Size>(); 
		try {
			sizes = sizeService.findByIdProduct(filter);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return sizes;
	}
}
