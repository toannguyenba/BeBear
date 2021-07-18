package com.BeBear.services;

import java.util.List;
import java.util.Optional;

import com.BeBear.entities.Color;

public interface IColorService {

	public int saveAllColor(List<Color> colors);
	
	public boolean saveColor(Color color);
	
	public List<Color> findAllColor();
	
	public boolean deleteColorById(int id);
}
