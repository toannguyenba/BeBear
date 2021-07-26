/**
 * 
 */
package com.BeBear.services;

import org.springframework.data.domain.Page;

import com.BeBear.entities.ProductDetail;

/**
 * @author bn
 *
 */
public interface IProductDetailService {
	public boolean saveProductDetail(ProductDetail productDetail);
	
	public Page<ProductDetail> getAllProductDetail(int currentPage);
	
	public boolean deleteProductDetail(int id);
}
