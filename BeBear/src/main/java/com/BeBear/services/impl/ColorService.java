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
	public int saveAllColor(List<Color> colors) {
		int result = colorRepo.saveAll(colors).size();
		return result;
	}
}
