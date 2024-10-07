package com.sesi.gerenciadorPedidos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;  
	
      private String nome;
      private String email;
      private String telefone;
      private TipoUsuario tipoUsuario;
}
