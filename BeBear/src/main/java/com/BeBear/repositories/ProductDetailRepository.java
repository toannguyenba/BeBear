/**
 * 
 */
package com.BeBear.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BeBear.entities.ProductDetail;

/**
 * @author bn
 *
 */
@Repository
public interface ProductDetailRepository extends JpaRepository<ProductDetail, Integer> {

}
