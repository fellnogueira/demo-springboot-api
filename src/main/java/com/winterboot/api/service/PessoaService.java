package com.winterboot.api.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.winterboot.api.model.Pessoa;
import com.winterboot.api.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	PessoaRepository pessoaRepository;
	
	public Pessoa atualizar(Long id, Pessoa pessoa) {
		Pessoa pessoaSalva = buscaPessoaPeloId(id);
		BeanUtils.copyProperties(pessoa, pessoaSalva, "id");
		return pessoaRepository.save(pessoaSalva);
	}

	public void atualizarPropriedadeAtivo(Long id, Boolean ativo) {
		Pessoa pessoaSalva = buscaPessoaPeloId(id);
		pessoaSalva.setAtivo(ativo);
		pessoaRepository.save(pessoaSalva);
	}

	private Pessoa buscaPessoaPeloId(Long id) {
		Pessoa pessoaSalva = pessoaRepository.getOne(id);
		if (pessoaSalva == null) 
			throw new EmptyResultDataAccessException(1);

		return pessoaSalva;
	}
}
