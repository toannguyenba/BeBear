/**
 * 
 */
package com.BeBear.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.BeBear.entities.Product;
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
		//Kiem tra productDetail da ton tai chua
		List<ProductDetail> pds = proDetailRepository.findByIdProductAndIdColorAndIdSize(productDetail.getIdProduct(), productDetail.getIdColor(), productDetail.getIdSize());
		if (pds == null || pds.isEmpty()) {
			ProductDetail result = proDetailRepository.save(productDetail);
			return result != null ? true : false;
		} else {
			return false;
		}
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

	@Override
	public List<ProductDetail> findAll() {
		List<ProductDetail> productDetails = proDetailRepository.findAll();
		return productDetails;
	}

	@Override
	public List<ProductDetail> findProductDetailByIdProduct(Product product) {
		List<ProductDetail> productDetails = proDetailRepository.findByIdProduct(product);
		return productDetails;
	}

	@Override
	public boolean updateProductDetail(ProductDetail productDetail) {
		boolean check = true;
		try {
			List<ProductDetail> pds = proDetailRepository.findByIdProductAndIdColorAndIdSize(productDetail.getIdProduct(), productDetail.getIdColor(), productDetail.getIdSize());
			ProductDetail pd = proDetailRepository.getById(productDetail.getIdProductDetail());
			boolean checkIdProduct = pd.getIdProduct() != productDetail.getIdProduct();
			boolean checkIdColor = pd.getIdColor() != productDetail.getIdColor();
			boolean checkIdSize = pd.getIdSize() != productDetail.getIdSize();
			// Nếu sửa id trùng với bản ghi khác
			if ((checkIdProduct || checkIdColor || checkIdSize) && !pds.isEmpty()) {
				check = false;
			} else {
				ProductDetail result = proDetailRepository.save(productDetail);
				check = result != null;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return check;
	}
	
}
