/**
 * 
 */
package com.BeBear.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
import com.BeBear.entities.Color;
=======
>>>>>>> tungdev
import com.BeBear.entities.Product;
import com.BeBear.entities.ProductDetail;
import com.BeBear.entities.Size;

/**
 * @author bn
 *
 */
@Repository
public interface ProductDetailRepository extends JpaRepository<ProductDetail, Integer> {

	public List<ProductDetail> findByIdProductAndIdColorAndIdSize(Product idProduct, Color idColor, Size idSize);

	public List<ProductDetail> findByIdProduct(Product product);

}
