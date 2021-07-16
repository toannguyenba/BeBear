/**
 * 
 */
package com.BeBear.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.BeBear.entities.Product;

/**
 * @author bn
 *
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
//    @Query(value="select p.idproduct, p.productname, c.CategoryName, p.description, p.updatedatetime, p.updater from product p" + 
//    		"left join category c on p.idcategory = c.idcategory;", nativeQuery = true)
//    public List<ProductInfo> findAllProductInfo();
    
//	@Query(value = "select p.idproduct, p.productname, c.CategoryName, p.description, p.updatedatetime, p.updater from product p left join category c on p.idcategory = c.idcategory")
//    public List<Product> findAllProduct();
}
