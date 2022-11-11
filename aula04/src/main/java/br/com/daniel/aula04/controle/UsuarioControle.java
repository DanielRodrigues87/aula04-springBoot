package br.com.daniel.aula04.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.daniel.aula04.dto.UsuarioDTO;
import br.com.daniel.aula04.servicos.UsuarioServico;

@RestController
@RequestMapping(value = "/users")
public class UsuarioControle {
	
	@Autowired
	private UsuarioServico servico;
	
	
	@GetMapping(value = "/{id}")
	public UsuarioDTO findByID(@PathVariable Long id) {
		return servico.findById(id);
	}
	
	
	
	
	
	
}
