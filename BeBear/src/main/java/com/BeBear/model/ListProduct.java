/**
 * 
 */
package com.BeBear.model;

import java.util.List;

import com.BeBear.entities.Product;

/**
 * @author bn
 *
 */
public class ListProduct {
	
	private List<Product> products;
	
	private int totalPage;

	/**
	 * @return the products
	 */
	public List<Product> getProducts() {
		return products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(List<Product> products) {
		this.products = products;
	}

	/**
	 * @return the totalPage
	 */
	public int getTotalPage() {
		return totalPage;
	}

	/**
	 * @param totalPage the totalPage to set
	 */
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
	

}
