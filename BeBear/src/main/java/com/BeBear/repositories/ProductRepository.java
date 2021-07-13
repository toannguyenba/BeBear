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
    @Query(value="select p.idproduct, p.productname, p.description, c.CategoryName from product p\r\n" + 
    		"left join category c on p.idcategory = c.idcategory;", nativeQuery = true)
    public List<Product> findAllProductInfo();
}
