package br.com.rich.repository.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

	//`A02_DATA_CRIACAO`, `A03_DATA_MODIFICACAO`, `A04_NOME`, 
 	//`T14_FORMULA_A01_FORMULA`, `T14_FORMULA_A01_FORMULA1`

@Entity
@Table(name="t13_pre_acabado")
public class PreAcabadoEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "A01_PRE_ACABADO")
	private int	id;
	@Column(name = "A02_NOME")
	private int	nome;
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
	public int getNome() {
		return nome;
	}
	public void setNome(int nome) {
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

}
