package br.usjt.Aula10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.Aula10.model.PrevisaoTempo;
import br.usjt.Aula10.service.PrevisaoTempoService;

@Controller
public class PrevisaoTempoController {
	
	@Autowired
	private PrevisaoTempoService service;
	
	@GetMapping("/previsao")
	public ModelAndView listarPrevisoes() {
		ModelAndView mv = new ModelAndView("lista_previsao_tempo");
		List<PrevisaoTempo> previsoes = service.listarPrevisoes();
		mv.addObject("previsoes", previsoes);
		mv.addObject("previsao", new PrevisaoTempo());
		return mv;
	}
	
	@PostMapping("/previsao")
	public String adicionarPrevisao(PrevisaoTempo previsao) {
		service.salvar(previsao);
		return "redirect:/previsao";
	}
}