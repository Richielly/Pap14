package br.com.rich.repository.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

//`A02_NOME`, `A03_SIGLA`, `A04_DATA_CRIACAO`, `A05_DATA_MODIFICACAO`
@Entity
@Table(name="t08_estado")


@NamedQueries({ 
	@NamedQuery(name = "EstadoEntity.findAll",query= "SELECT p FROM EstadoEntity p"),
	@NamedQuery(name="EstadoEntity.GroupByNome",query= "SELECT p.nome, count(p) as total FROM EstadoEntity p GROUP By p.nome")
	 
})


public class EstadoEntity {

	@Id
	@GeneratedValue
	@Column(name = "A01_ESTADO")
	private int id;
	@Column(name = "A02_NOME")
	private String nome;
	@Column(name = "A03_SIGLA")
	private String sigla;
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
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
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
