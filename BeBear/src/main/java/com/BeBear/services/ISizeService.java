/**
 * 
 */
package com.BeBear.services;

import java.util.List;

import com.BeBear.entities.Size;

/**
 * @author bn
 *
 */
public interface ISizeService {
	public boolean saveSize(Size size);
	
	public List<Size> findAllSize();
	
	public boolean deleteSize(int id);
}
