package br.com.rich.repository.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

	//`A02_QUANTIDADE`, `A03_DATA_CRIACAO`, `A04_DATA_MODIFICACAO`

@Entity
@Table(name="t14_formula")
public class FormulaEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "A01_FORMULA")
	private int	id;
	@Column(name = "A02_QUANTIDADE")
	private int	quantidade;
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
