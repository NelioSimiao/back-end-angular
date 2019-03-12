package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Lancamento;
import com.example.demo.repository.lancamento.LancamentosRepositoryQuery;

public interface LancamentosRepository extends JpaRepository<Lancamento, Long>, LancamentosRepositoryQuery {

}
