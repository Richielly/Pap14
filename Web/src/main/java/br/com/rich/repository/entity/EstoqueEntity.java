package br.com.rich.repository.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

	//`A02_QUANTIDADE`, `A03_ESTOQUE_MINIMO`, `A04_DATA_DE_CRIACAO`, `A05_DATA_DE_MODIFICACAO`, 
	//`T24_UNIDADE_DE_MEDIDA_A01_TIPO_DE_MEDIDA`, `T13_PRE_ACABADO_A01_PRE_ACABADO`, `T13_PRE_ACABADO_T14_FORMULA_A01_FORMULA`

@Entity
@Table(name="t18_estoque")
public class EstoqueEntity {

	@Id
	@GeneratedValue
	@Column(name = "A01_ESTOQUE")
	private int	id;
	@Column(name = "A02_QUANTIDADE")
	private String	quantidade;
	@Column(name = "A03_ESTOQUE_MINIMO")
	private int	estoqueMinimp;
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
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	public int getEstoqueMinimp() {
		return estoqueMinimp;
	}
	public void setEstoqueMinimp(int estoqueMinimp) {
		this.estoqueMinimp = estoqueMinimp;
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
