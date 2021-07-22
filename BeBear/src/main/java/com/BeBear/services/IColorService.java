package com.BeBear.services;

import java.util.List;

import com.BeBear.entities.Color;

public interface IColorService {
	
	public boolean saveColor(Color color);
	
	public List<Color> findAllColor();
	
	public boolean deleteColorById(int id);
}
