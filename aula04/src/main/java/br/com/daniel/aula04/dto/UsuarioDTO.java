package br.com.daniel.aula04.dto;

import br.com.daniel.aula04.entidade.Usuario;

public class UsuarioDTO {
	
	private Long id;
	private String nome;
	
	public UsuarioDTO() {
		super();
	}

	public UsuarioDTO(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public UsuarioDTO(Usuario usuario) {
		
		id = usuario.getId();
		nome = usuario.getNome();
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
