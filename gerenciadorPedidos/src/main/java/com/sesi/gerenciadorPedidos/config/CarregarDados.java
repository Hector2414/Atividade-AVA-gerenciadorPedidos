package com.sesi.gerenciadorPedidos.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sesi.gerenciadorPedidos.model.Produto;
import com.sesi.gerenciadorPedidos.model.Status;
import com.sesi.gerenciadorPedidos.model.TipoUsuario;
import com.sesi.gerenciadorPedidos.model.Usuario;
import com.sesi.gerenciadorPedidos.repository.ProdutoRepository;
import com.sesi.gerenciadorPedidos.repository.UsuarioRepository;

@Configuration
public class CarregarDados {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Bean   
	CommandLineRunner executar() {
		return args ->{
			
			
			
			Usuario usuario = new Usuario();
			usuario.setNome("Hector");
			usuario.setEmail("hector@lima.com");
			usuario.setTelefone("(11) 99999-9999");
			usuario.setTipoUsuario(TipoUsuario.ADMIN);
			
			usuarioRepository.save(usuario);
			
			
			
			
			
			Produto produto = new Produto();
			produto.setNome("Livro");
			produto.setEstoque(2);
			produto.setPreco(35);
			
			
			produtoRepository.save(produto);
		};}
}
