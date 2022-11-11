package br.com.daniel.aula04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.daniel.aula04.entidade.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

}
