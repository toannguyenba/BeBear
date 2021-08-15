package com.BeBear.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.BeBear.entities.Color;

public interface ColorRepository extends JpaRepository<Color, Integer> {

	@Query(value = "select distinct c.* from Color c\r\n" + 
			"	inner join ProductDetail pd on pd.IdColor = c.IdColor\r\n" + 
			"    inner join Product p on p.IdProduct = pd.IdProduct\r\n" + 
			"    where p.IdProduct = ?1", nativeQuery = true)
	public List<Color> getListByIdProduct(int idProduct);
}
