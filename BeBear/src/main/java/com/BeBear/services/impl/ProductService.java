/**
 * 
 */
package com.BeBear.services.impl;

import java.util.ArrayList;
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

	@Override
	public Product findByIdProduct(int idProduct) {
		Product product = productRepo.findByIdProduct(idProduct);
		return product;
	}

	@Override
	public List<Product> findProduct(String filter) {
		List<Product> products = new ArrayList<Product>();
		try {
			if (filter != null) {
				int idCategory = Integer.parseInt(filter);
				products = productRepo.findByIdCategory(idCategory);
			} else {
				products = productRepo.findAll();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return products;
	}
}
