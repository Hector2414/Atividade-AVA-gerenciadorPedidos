package com.sesi.gerenciadorPedidos.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sesi.gerenciadorPedidos.model.Usuario;
import com.sesi.gerenciadorPedidos.repository.UsuarioRepository;

@Configuration
public class CarregarDados {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Bean   
	CommandLineRunner executar() {
		return args ->{
			
			
			
			Usuario usuario = new Usuario();
			usuario.setNome("Hector");
			
			usuarioRepository.save(usuario);
			
			
			
		};}
}
