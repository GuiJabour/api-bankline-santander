package com.dio.santander.banklin.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.banklin.api.dto.NovoCorrentista;
import com.dio.santander.banklin.api.model.Correntista;
import com.dio.santander.banklin.api.repository.CorrentistaRepository;
import com.dio.santander.banklin.api.services.CorrentistaService;

@RestController
@RequestMapping(value = "/correntistas")
public class CorrentistaController {

	@Autowired
	CorrentistaRepository correntistaRepository;
	
	@Autowired
	CorrentistaService correntistaService;
	
	@GetMapping
	public List<Correntista> findAll() {
		return correntistaRepository.findAll();
	}
	
	@PostMapping
	public void save (@RequestBody NovoCorrentista correntista) {
		
		correntistaService.save(correntista);
		
	}
	
	
}
