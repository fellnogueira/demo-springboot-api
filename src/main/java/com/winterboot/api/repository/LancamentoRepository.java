package com.winterboot.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.winterboot.api.model.Lancamento;
import com.winterboot.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {
	
	

}
