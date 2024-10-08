package com.sesi.gerenciadorPedidos.model;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToMany
	@JoinTable(name="Produto_pedido", joinColumns = @JoinColumn(name="pedido_id"), inverseJoinColumns = @JoinColumn(name="produto_id"))
	private Set<Produto>produto;
	
	private int quantidade;
	private LocalDate data;
	private float valor;
	private Status status;
	
	
	
	
	
	
	
	
}
