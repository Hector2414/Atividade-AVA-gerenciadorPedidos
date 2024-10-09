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
	
	
	
	
	
	
	public void mudarStatus() {
		
		
	}
	
	
	
	public Pedido() {
		
	}


	public Pedido(int id, Set<Produto> produto, int quantidade, LocalDate data, float valor, Status status) {
		
		this.id = id;
		this.produto = produto;
		this.quantidade = quantidade;
		this.data = data;
		this.valor = valor;
		this.status = status;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Set<Produto> getProduto() {
		return produto;
	}
	public void setProduto(Set<Produto> produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
