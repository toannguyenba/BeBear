/**
 * 
 */
package com.BeBear.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.BeBear.entities.ProductDetail;
import com.BeBear.repositories.ProductDetailRepository;
import com.BeBear.services.IProductDetailService;

/**
 * @author bn
 *
 */
@Service
public class ProductDetailService implements IProductDetailService {
	
	@Autowired
	private ProductDetailRepository proDetailRepository;

	@Override
	public boolean saveProductDetail(ProductDetail productDetail) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Page<ProductDetail> getAllProductDetail(int currentPage) {
		Pageable pageable = PageRequest.of(currentPage - 1, 10);
		Page<ProductDetail> productDetails = proDetailRepository.findAll(pageable);
		return productDetails;
	}

	@Override
	public boolean deleteProductDetail(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
