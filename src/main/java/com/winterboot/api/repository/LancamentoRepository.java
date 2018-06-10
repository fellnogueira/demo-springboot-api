package com.winterboot.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.winterboot.api.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
