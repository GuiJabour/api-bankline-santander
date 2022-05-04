package com.dio.santander.banklin.api.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.santander.banklin.api.dto.NovoCorrentista;
import com.dio.santander.banklin.api.model.Conta;
import com.dio.santander.banklin.api.model.Correntista;
import com.dio.santander.banklin.api.repository.CorrentistaRepository;

@Service
public class CorrentistaService {

	@Autowired
	CorrentistaRepository correntistaRepository;
	
	public void save (NovoCorrentista novoCorrentista) {
		
		Correntista correntista = new Correntista();
		
		correntista.setNome(novoCorrentista.getNome());
		correntista.setCpf(novoCorrentista.getCpf());
		
		Conta conta = new Conta();
		
		conta.setNumero(new Date().getTime());
		conta.setSaldo(111.22);
		
		correntista.setConta(conta);
		
		correntistaRepository.save(correntista);
	}
	
}
