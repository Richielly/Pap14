package br.com.rich.repository.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

	//`A02_DATA_DE_EMISSAO`, `A03_NUMERO`, `A04_QUANTIDADE`, `A05_DATA_DE_CRIACAO`, `A06_DATA_DE_MODIFICACAO`, 
	//`T13_PRE_ACABADO_A01_PRE_ACABADO`, `T13_PRE_ACABADO_T14_FORMULA_A01_FORMULA`, `T13_PRE_ACABADO_T14_FORMULA_A01_FORMULA1`

@Entity
@Table(name="t21_ordem")
public class OrdemEntity {

	@Id
	@GeneratedValue
	@Column(name = "A01_ORDEM")
	private int	id;
	@Column(name = "A02_DATA_DE_EMISSAO")
	private LocalDateTime	dataemissao;
	@Column(name = "A03_NUMERO")
	private int	numero;
	@Column(name = "A04_QUANTIDADE")
	private int	quantidade;
	@Column(name = "A05_DATA_CRIACAO")
	private LocalDateTime	dataCriacao;
	@Column(name = "A06_DATA_MODIFICACAO")
	private LocalDateTime	dataModificacao;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDateTime getDataemissao() {
		return dataemissao;
	}
	public void setDataemissao(LocalDateTime dataemissao) {
		this.dataemissao = dataemissao;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
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
