package com.BeBear.services;

import org.springframework.data.domain.Page;

import com.BeBear.entities.Color;

public interface IColorService {
	
	public boolean saveColor(Color color);
	
	public Page<Color> findAllColor(int currentPage);
	
	public boolean deleteColorById(int id);
}
