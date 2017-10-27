package br.com.rich.repository.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

	//`A02_NOME`, `A03_SIGLA`

@Entity
@Table(name="t24_unidade_de_medida")
public class UnidadeDeMedidaEntity {

	@Id
	@GeneratedValue
	@Column(name="A01_UNIDADE_DE_MEDIDA")
	private int id;
	@Column(name="A02_NOME")
	private String nome;
	@Column(name="A03_SIGLA")
	private String sugla;
	@Column(name = "A04_DATA_CRIACAO")
	private LocalDateTime	dataCriacao;
	@Column(name = "A05_DATA_MODIFICACAO")
	private LocalDateTime	dataModificacao;
	
	
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
	public String getSugla() {
		return sugla;
	}
	public void setSugla(String sugla) {
		this.sugla = sugla;
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
	
	
	
	
}
