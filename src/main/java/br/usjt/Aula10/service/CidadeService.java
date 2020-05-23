package br.usjt.Aula10.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.usjt.Aula10.model.Cidade;
import br.usjt.Aula10.model.repository.CidadeRepository;

public class CidadeService {
	
	@Autowired
	private CidadeRepository repo;
	
	public void salvar(Cidade cidade) {
		repo.save(cidade);
	}
	
	public List<Cidade> listarCidade() {
		return repo.findAll();
	}
	
	public void excluir(Cidade cidade) {
		repo.delete(cidade);
	}
}