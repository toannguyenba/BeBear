package com.BeBear.services;

import java.util.List;

import org.springframework.data.domain.Page;

import com.BeBear.entities.Color;

public interface IColorService {
	
	public boolean saveColor(Color color);
	
	public Page<Color> findColorPage(int currentPage);
	
	public List<Color> findAllColor();
	
	public boolean deleteColorById(int id);
	
	public List<Color> getListByIdProduct(int idProduct);
}
