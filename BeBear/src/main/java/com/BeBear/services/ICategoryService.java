/**
 * 
 */
package com.BeBear.services;

import java.util.List;

import com.BeBear.entities.Category;

public interface ICategoryService {
	
	public boolean saveCategory(Category category);
	
	public List<Category> findAllCategory();
	
	public boolean deleteCategoryById(int id);
}
