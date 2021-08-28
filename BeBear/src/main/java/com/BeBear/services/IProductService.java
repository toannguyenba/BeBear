/**
 * 
 */
package com.BeBear.services;

import java.util.List;

import org.springframework.data.domain.Page;

import com.BeBear.entities.Product;

public interface IProductService {
	
	public boolean saveProduct(Product product);
	
	public List<Product> findAllProduct();
	
	public boolean deleteProductById(int id);
	
	public Product findByIdProduct(int idProduct);
	
	public List<Product> findProduct(String filter);
	
	public Page<Product> findProductPage(String filter, int count, int currentPage);
}
