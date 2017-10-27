package br.com.rich.repository.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

	//`A02LOTE`, 
	//`T21_ORDEM_A01_ORDEM`, `T12_PRODUTO_ACABADO_A01_PRODUTO_ACABADO`, `T12_PRODUTO_ACABADO_T11_PRODUTO_A01_PRODUTO`, `T12_PRODUTO_ACABADO_T17_MARCA_A01_MARCA`, `T12_PRODUTO_ACABADO_T13_PRE_ACABADO_A01_PRE_ACABADO`, `T12_PRODUTO_ACABADO_T13_PRE_ACABADO_T14_FORMULA_A01_FORMULA`, `T12_PRODUTO_ACABADO_T13_PRE_ACABADO_T14_FORMULA_A01_FORMULA1`

@Entity
@Table(name="t23_ordem_de_envase")
public class OrdemDeEnvaseEntity {

	@Id
	@GeneratedValue
	@Column(name="A01_ORDEM_DE_ENVASE")
	private int id;
	@Column(name="A02_LOTE")
	private String lote;
	@Column(name = "A03_DATA_CRIACAO")
	private LocalDateTime	dataCriacao;
	@Column(name = "A04_DATA_MODIFICACAO")
	private LocalDateTime	dataModificacao;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLote() {
		return lote;
	}
	public void setLote(String lote) {
		this.lote = lote;
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
