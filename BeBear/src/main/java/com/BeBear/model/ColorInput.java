package com.BeBear.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.BeBear.entities.Color;

public class ColorInput implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Color> colors;
	
	public ColorInput() {
		colors = new ArrayList<Color>();
	}

	public List<Color> getColors() {
		return colors;
	}

	public void setColors(List<Color> colors) {
		this.colors = colors;
	}
	
	
}
