/**
 * 
 */
package com.BeBear.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BeBear.entities.Category;
import com.BeBear.repositories.CategoryRepository;
import com.BeBear.services.ICategoryService;

/**
 * @author bn
 *
 */
@Service
public class CategoryService implements ICategoryService {
	
	@Autowired
	CategoryRepository categoryRepo;

	@Override
	public boolean saveCategory(Category category) {
		Category result = categoryRepo.save(category);
		return result!= null ? true : false;
	}

	@Override
	public List<Category> findAllCategory() {
		List<Category> categorys = categoryRepo.findAll();
		return categorys;
	}

	@Override
	public boolean deleteCategoryById(int id) {
		categoryRepo.deleteById(id);
		return true;
	}

}
