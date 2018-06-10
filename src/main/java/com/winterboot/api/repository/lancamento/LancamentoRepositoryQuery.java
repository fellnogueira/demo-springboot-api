package com.winterboot.api.repository.lancamento;

import java.util.List;

import com.winterboot.api.model.Lancamento;
import com.winterboot.api.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {

	public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);
}
