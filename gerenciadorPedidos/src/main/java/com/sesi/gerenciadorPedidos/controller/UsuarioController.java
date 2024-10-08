package com.sesi.gerenciadorPedidos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sesi.gerenciadorPedidos.repository.UsuarioRepository;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	public UsuarioRepository usuarioRepository;
	
	@GetMapping("/listarUsuario")
	public String listarUsuario(Model modelo){
		modelo.addAttribute("usuarios", usuarioRepository.findAll());
		return"listarUsuario";
	}
	
	
	
}
