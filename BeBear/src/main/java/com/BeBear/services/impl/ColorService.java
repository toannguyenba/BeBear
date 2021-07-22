package com.BeBear.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BeBear.entities.Color;
import com.BeBear.repositories.ColorRepository;
import com.BeBear.services.IColorService;

@Service
public class ColorService implements IColorService {

	@Autowired
	ColorRepository colorRepo;

	@Override
	public List<Color> findAllColor() {
		List<Color> colors = colorRepo.findAll();
		return colors;
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
