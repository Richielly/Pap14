package br.com.rich.repository.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

	//`T21_ORDEM_A01_ORDEM`, `T13_PRE_ACABADO_A01_PRE_ACABADO`, `T13_PRE_ACABADO_T14_FORMULA_A01_FORMULA`

@Entity
@Table(name="t22_ordem_de_producao")
public class OrdemdeProducaoEntity {

	
	@Id
	@GeneratedValue
	@Column(name = "A01_ORDEM_DE_PRODUCAO")
	private int	id;
	@Column(name = "A02_DATA_CRIACAO")
	private LocalDateTime	dataCriacao;
	@Column(name = "A04_DATA_MODIFICACAO")
	private LocalDateTime	dataModificacao;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
