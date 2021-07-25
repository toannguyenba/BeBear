package com.BeBear.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.BeBear.entities.Color;
import com.BeBear.repositories.ColorRepository;
import com.BeBear.services.IColorService;

@Service
public class ColorService implements IColorService {

	@Autowired
	ColorRepository colorRepo;

	@Override
	public Page<Color> findAllColor(int currentPage) {
		Pageable pageable = PageRequest.of(currentPage - 1, 10);
		Page<Color> pageColor = colorRepo.findAll(pageable);
		return pageColor;
	}

	@Override
	public boolean deleteColorById(int id) {
		colorRepo.deleteById(id);
		return true;
	}

	@Override
	public boolean saveColor(Color color) {
		Color result = colorRepo.save(color);
		return result != null ? true : false;
	}
}
