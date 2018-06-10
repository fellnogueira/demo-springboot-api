package com.winterboot.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.winterboot.api.model.Lancamento;
import com.winterboot.api.repository.LancamentoRepository;

@RestController
@RequestMapping("/lancamento")
public class LancamentoController {

	@Autowired
	LancamentoRepository lancamentoRepository;
	
	@GetMapping
	public List<Lancamento> listar(){
		return lancamentoRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Lancamento> buscaPorId(@PathVariable Long id){
		return lancamentoRepository.findById(id);
	}
}
