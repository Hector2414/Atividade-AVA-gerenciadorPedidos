package com.sesi.gerenciadorPedidos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sesi.gerenciadorPedidos.repository.ProdutoRepository;



@Controller
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	ProdutoRepository produtoRepository;
	
	@GetMapping("/listarProduto")
	public String listarProduto(Model modelo){
		modelo.addAttribute("produtos",produtoRepository.findAll());
		return"listarProduto";
	}
}
