package com.sesi.gerenciadorPedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.gerenciadorPedidos.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
