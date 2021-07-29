/**
 * 
 */
package com.BeBear.services;

import java.util.List;

import com.BeBear.entities.Product;

public interface IProductService {
	
	public boolean saveProduct(Product product);
	
	public List<Product> findAllProduct();
	
	public boolean deleteProductById(int id);
}