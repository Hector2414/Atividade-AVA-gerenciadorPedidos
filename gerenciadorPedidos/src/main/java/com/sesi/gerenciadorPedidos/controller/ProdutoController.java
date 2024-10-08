package com.sesi.gerenciadorPedidos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sesi.gerenciadorPedidos.model.Pedido;
import com.sesi.gerenciadorPedidos.repository.ProdutoRepository;
import com.sesi.gerenciadorPedidos.repository.UsuarioRepository;



@Controller
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	ProdutoRepository produtoRepository;
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	
	
	@GetMapping("/listarProduto")
	public String listarProduto(Model modelo){
		modelo.addAttribute("produtos",produtoRepository.findAll());
		return"listarProduto";
	}
	
	
	
	@GetMapping("/novo")
	public String mostrarFormulario(Model modelo) {
		modelo.addAttribute("pedidos", new Pedido() );
		modelo.addAttribute("usuarios", usuarioRepository.findAll());
		modelo.addAttribute("produtos", produtoRepository.findAll());
		return"formularioPedido";
	}
}
