package com.BeBear.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BeBear.entities.Color;

public interface ColorRepository extends JpaRepository<Color, Integer> {

	
}
