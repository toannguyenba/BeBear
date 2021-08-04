/**
 * 
 */
package com.BeBear.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BeBear.entities.Size;
import com.BeBear.repositories.SizeRepository;
import com.BeBear.services.ISizeService;

/**
 * @author bn
 *
 */
@Service
public class SizeService implements ISizeService {
	
	@Autowired
	SizeRepository sizeRepo;

	@Override
	public boolean saveSize(Size size) {
		Size result = sizeRepo.save(size);
		return result == null ? true : false;
	}

	@Override
	public List<Size> findAllSize() {
		List<Size> sizes = sizeRepo.findAll();
		return sizes;
	}

	@Override
	public boolean deleteSize(int id) {
		sizeRepo.deleteById(id);
		return false;
	}

	@Override
	public List<Size> findByIdProduct(int idProduct) {
		List<Size> sizes = sizeRepo.findByIdProduct(idProduct);
		return sizes;
	}

}
