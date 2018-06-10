package com.winterboot.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.winterboot.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
