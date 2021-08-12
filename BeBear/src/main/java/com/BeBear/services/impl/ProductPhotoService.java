/**
 * 
 */
package com.BeBear.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BeBear.repositories.ProductPhotoRepsitory;
import com.BeBear.services.IProductPhotoService;

/**
 * @author bn
 *
 */
@Service
public class ProductPhotoService implements IProductPhotoService {
	
	@Autowired
	ProductPhotoRepsitory proPhotoRepository;

	@Override
	public boolean deleteProductPhoto(int id) {
		proPhotoRepository.deleteById(id);
		return true;
	}

}
