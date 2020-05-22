package br.usjt.Aula10.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.Aula10.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public Usuario findOneByUserAndPass(String user, String pass);
	
}