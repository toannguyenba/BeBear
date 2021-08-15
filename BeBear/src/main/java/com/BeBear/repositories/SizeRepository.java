/**
 * 
 */
package com.BeBear.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.BeBear.entities.Size;

/**
 * @author bn
 *
 */
public interface SizeRepository extends JpaRepository<Size, Integer>  {
	
	@Query(value = "select distinct s.* from Size s \r\n" + 
			"inner join ProductDetail pd on s.idSize = pd.idSize\r\n" + 
			"inner join Product p on pd.idProduct = p.idProduct\r\n" + 
			"where p.idProduct = ?1", nativeQuery = true)
	public List<Size> findByIdProduct(int idProduct);
}
