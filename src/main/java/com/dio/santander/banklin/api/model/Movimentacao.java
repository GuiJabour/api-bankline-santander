package com.dio.santander.banklin.api.model;

import java.time.LocalDateTime;

public class Movimentacao {

	private Long id;
	private LocalDateTime dataHora;
	private String descricao;
	private String valor;
	private MovimentacaoTipo movimentacaoTipo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public MovimentacaoTipo getMovimentacaoTipo() {
		return movimentacaoTipo;
	}
	public void setMovimentacaoTipo(MovimentacaoTipo movimentacaoTipo) {
		this.movimentacaoTipo = movimentacaoTipo;
	}
	
	
}
