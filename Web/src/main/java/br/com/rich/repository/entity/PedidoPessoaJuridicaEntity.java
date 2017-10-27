package br.com.rich.repository.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

	//`T09_PEDIDO_A01_PEDIDO`, `T03_PESSOA_JURIDICA_A01_PESSOA_JURIDICA`, `T03_PESSOA_JURIDICA_T01_PESSOA_A01_PESSOA`

@Entity
@Table(name="t26_pedido_pessoa_juridica")
public class PedidoPessoaJuridicaEntity {

	@Id
	@GeneratedValue
	@Column(name="A01_PEDIDO_PESSOA_JURIDICA")
	private int id;
	@Column(name = "A02_DATA_CRIACAO")
	private LocalDateTime	dataCriacao;
	@Column(name = "A03_DATA_MODIFICACAO")
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
