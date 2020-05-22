package br.usjt.Aula10.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.Aula10.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}
