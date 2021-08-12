/**
 * 
 */
package com.BeBear.controller.admin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.BeBear.config.AmazonClient;
import com.BeBear.entities.Color;
import com.BeBear.entities.Product;
import com.BeBear.entities.ProductDetail;
import com.BeBear.entities.Productphoto;
import com.BeBear.entities.Size;
import com.BeBear.services.impl.ColorService;
import com.BeBear.services.impl.ProductDetailService;
import com.BeBear.services.impl.ProductPhotoService;
import com.BeBear.services.impl.ProductService;
import com.BeBear.services.impl.SizeService;
import com.BeBear.utils.FileUploadUtil;
import com.BeBear.utils.PageUtil;

/**
 * @author bn
 *
 */
@Controller
public class ProductDetailAdminController {
	
	private AmazonClient amazonClient;
	
	@Autowired
	ProductDetailAdminController(AmazonClient amazonClient) {
		this.amazonClient = amazonClient;
	}
	
	@Autowired
	public ProductDetailService proDetailService;
	
	@Autowired
	private ColorService colorService;
	
	@Autowired
	private SizeService sizeService;
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private ProductPhotoService productPhotoService;
	
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
	public String addProductDetail (@ModelAttribute("productDetail") ProductDetail productDetail, @RequestParam("file") MultipartFile file, RedirectAttributes redirectAtt) {
		try {
			if (file.getOriginalFilename() != "") {
				List<Productphoto> proPhotos = new ArrayList<Productphoto>();
				String url = this.amazonClient.uploadFile(file);			
				Productphoto proPhoto = new Productphoto(productDetail, url);			
				proPhotos.add(proPhoto);			
				productDetail.setProductPhotos(proPhotos);
			} 
			
			boolean result = proDetailService.saveProductDetail(productDetail);
			if (result) {
				redirectAtt.addAttribute("message", "Thêm mới thành công");			
			} else {
				redirectAtt.addAttribute("message", "Thêm mới thất bại");	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/admin/productDetail";
	}
	
	@PostMapping("/admin/editProductDetail")
	public String editProductDetail (@ModelAttribute("productDetail") ProductDetail productDetail, @RequestParam("file") MultipartFile file, RedirectAttributes redirectAtt) {
		try {
			if (file.getOriginalFilename() != "") {
				ProductDetail productDetailFromDB = proDetailService.getByIdProductDetail(productDetail.getIdProductDetail());
				Productphoto proPhotoFromDB = productDetailFromDB.getProductPhotos().get(0);
				//Delete file from s3
				this.amazonClient.deleteFile(proPhotoFromDB.getUrl());
				productPhotoService.deleteProductPhoto(proPhotoFromDB.getIdPhoto());
				
				List<Productphoto> proPhotos = new ArrayList<Productphoto>();
				String url = this.amazonClient.uploadFile(file);			
				Productphoto proPhoto = new Productphoto(productDetail, url);			
				proPhotos.add(proPhoto);			
				productDetail.setProductPhotos(proPhotos);
			} 
			
			boolean result = proDetailService.updateProductDetail(productDetail);
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
