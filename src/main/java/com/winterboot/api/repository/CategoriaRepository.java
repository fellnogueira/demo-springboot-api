package com.winterboot.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.winterboot.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	
}
