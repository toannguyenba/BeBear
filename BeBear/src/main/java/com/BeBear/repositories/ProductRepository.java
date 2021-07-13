/**
 * 
 */
package com.BeBear.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BeBear.entities.Product;

/**
 * @author bn
 *
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    
}
