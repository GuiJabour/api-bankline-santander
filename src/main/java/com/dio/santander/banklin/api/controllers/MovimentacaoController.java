package com.dio.santander.banklin.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.banklin.api.dto.NovaMovimentacao;
import com.dio.santander.banklin.api.model.Movimentacao;
import com.dio.santander.banklin.api.repository.MovimentacaoRepository;
import com.dio.santander.banklin.api.services.MovimentacaoService;

@RestController
@RequestMapping(value = "/movimentacao")
public class MovimentacaoController {

	@Autowired
	MovimentacaoRepository movimentacaoRepository;
	
	@Autowired
	MovimentacaoService movimentacaoService;
	
	@GetMapping("/{idConta}")
	public List<Movimentacao> findAll(@PathVariable("idConta") Long idConta){
		return movimentacaoRepository.findByidConta(idConta);
	}
	
	@GetMapping
	public List<Movimentacao> findAll() {
		return movimentacaoRepository.findAll();
	}
	
	@PostMapping
	public void save (@RequestBody NovaMovimentacao movimentacao) {
		
		movimentacaoService.save(movimentacao);
		
	}
	
	
}
