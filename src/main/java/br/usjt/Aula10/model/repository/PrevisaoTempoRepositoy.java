package br.usjt.Aula10.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.Aula10.model.PrevisaoTempo;

public interface PrevisaoTempoRepositoy extends JpaRepository<PrevisaoTempo, Long> {
	
}