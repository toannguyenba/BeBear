/**
 * 
 */
package com.BeBear.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BeBear.entities.Productphoto;

/**
 * @author bn
 *
 */
@Repository
public interface ProductPhotoRepsitory extends JpaRepository<Productphoto, Integer> {

}
