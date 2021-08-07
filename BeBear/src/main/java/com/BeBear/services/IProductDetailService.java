/**
 * 
 */
package com.BeBear.services;

import java.util.List;

import org.springframework.data.domain.Page;

import com.BeBear.entities.Product;
import com.BeBear.entities.ProductDetail;

/**
 * @author bn
 *
 */
public interface IProductDetailService {
	public boolean saveProductDetail(ProductDetail productDetail);
	
	public Page<ProductDetail> getAllProductDetail(int currentPage);
	
	public boolean deleteProductDetail(int id);
	
	public List<ProductDetail> findAll();
	
	public List<ProductDetail> findProductDetailByIdProduct(Product product);
	
}
