/**
 * 
 */
package com.BeBear.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BeBear.entities.Product;
import com.BeBear.repositories.ProductRepository;
import com.BeBear.services.IProductService;

/**
 * @author bn
 *
 */
@Service
public class ProductService implements IProductService {
	@Autowired
	ProductRepository productRepo;

	@Override
	public List<Product> findAllProduct() {
		List<Product> products = productRepo.findAll();
		return products;
	}

	@Override
	public boolean deleteProductById(int id) {
		productRepo.deleteById(id);
		return true;
	}

	@Override
	public boolean saveProduct(Product product) {
		Product result = productRepo.save(product);
		return result != null ? true : false;
	}
}
