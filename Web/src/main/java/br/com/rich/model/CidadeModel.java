package br.com.rich.model;

import java.time.LocalDateTime;

public class CidadeModel {

	
	private int id;
	private String nome;
	private LocalDateTime	dataCriacao;
	private LocalDateTime	dataModificacao;
	private EstadoModel estado;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public LocalDateTime getDataModificacao() {
		return dataModificacao;
	}
	public void setDataModificacao(LocalDateTime dataModificacao) {
		this.dataModificacao = dataModificacao;
	}
	public EstadoModel getEstado() {
		return estado;
	}
	public void setEstado(EstadoModel estado) {
		this.estado = estado;
	}
	
	
	
}
