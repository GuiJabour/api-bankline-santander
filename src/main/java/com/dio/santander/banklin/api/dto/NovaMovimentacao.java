package com.dio.santander.banklin.api.dto;

import com.dio.santander.banklin.api.model.MovimentacaoTipo;

public class NovaMovimentacao {

	private String descricao;
	private double valor;
	private MovimentacaoTipo movimentacaoTipo;
	private Long idConta;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getValor() {
		return valor;
	}
	public MovimentacaoTipo getMovimentacaoTipo() {
		return movimentacaoTipo;
	}
	public void setMovimentacaoTipo(MovimentacaoTipo movimentacaoTipo) {
		this.movimentacaoTipo = movimentacaoTipo;
	}
	public Long getIdConta() {
		return idConta;
	}
	public void setIdConta(Long idConta) {
		this.idConta = idConta;
	}
	
	
	
}
