package com.sesi.gerenciadorPedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.gerenciadorPedidos.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
