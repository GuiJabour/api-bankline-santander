package com.dio.santander.banklin.api.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.dio.santander.banklin.api.dto.NovaMovimentacao;
import com.dio.santander.banklin.api.model.Correntista;
import com.dio.santander.banklin.api.model.Movimentacao;
import com.dio.santander.banklin.api.model.MovimentacaoTipo;
import com.dio.santander.banklin.api.repository.CorrentistaRepository;
import com.dio.santander.banklin.api.repository.MovimentacaoRepository;

@Service
public class MovimentacaoService {

	
	@Autowired
	MovimentacaoRepository movimentacaoRepository;
	
	@Autowired
	CorrentistaRepository correntistaRepository;
	
	public void save(@RequestBody NovaMovimentacao novaMovimentacao) {
		
		Movimentacao movimentacao = new Movimentacao();
		
		double valor = novaMovimentacao.getMovimentacaoTipo() == MovimentacaoTipo.RECEITA ? novaMovimentacao.getValor() : novaMovimentacao.getValor() * -1;
		
		movimentacao.setDataHora(LocalDateTime.now());
		movimentacao.setDescricao(novaMovimentacao.getDescricao());
		movimentacao.setIdConta(novaMovimentacao.getIdConta());
		movimentacao.setValor(valor);
		movimentacao.setMovimentacaoTipo(novaMovimentacao.getMovimentacaoTipo());
		
		Correntista correntista = correntistaRepository.findById(novaMovimentacao.getIdConta()).orElse(null);
		
		if (correntista != null) {
			correntista.getConta().setSaldo(correntista.getConta().getSaldo() + valor);
			correntistaRepository.save(correntista);
		}
		
		movimentacaoRepository.save(movimentacao);
		
		
	}
	
}
