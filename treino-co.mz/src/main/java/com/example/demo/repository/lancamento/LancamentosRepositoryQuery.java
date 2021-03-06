package com.example.demo.repository.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.model.Lancamento;
import com.example.demo.repository.filter.LancamentoFilter;
import com.example.demo.resource.projection.ResumoLancamento;

@Service
public interface LancamentosRepositoryQuery {
	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);

	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);

}
