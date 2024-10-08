package com.sesi.gerenciadorPedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.gerenciadorPedidos.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
