package br.com.daniel.aula04.servicos;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.daniel.aula04.dto.UsuarioDTO;
import br.com.daniel.aula04.entidade.Usuario;
import br.com.daniel.aula04.repositorios.UsuarioRepositorio;

@Service
public class UsuarioServico {
	
	@Autowired
	private UsuarioRepositorio repositorio;
	
	@Transactional(readOnly = true)
	public UsuarioDTO findById(Long id) {
		Usuario entity= repositorio.findById(id).get();
		
		UsuarioDTO dto = new UsuarioDTO(entity);
		return dto;
	}
	
	
	
	
}
