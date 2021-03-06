package br.com.rich.repository.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="T05_CONTATO")
public class ContatoEntity implements Serializable {

	
	//A01_CONTATO, A02_TELEFONE_FIXO`, `A03_CELULAR`, `A04_EMAIL`, `A05_WEBSITE`
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="A01_CONTATO")
	private long id;
	@Column(name="A02_TELEFONE_FIXO")
	private String telefoneFixo;
	@Column (name="A03_CELULAR")
	private String celular;
	@Column (name="A04_EMAIL")
	private String email;
	@Column (name="A05_WEBSITE")
	private String website;
	@Column(name = "A06_DATA_CRIACAO")
	private LocalDateTime	dataCriacao;
	@Column(name = "A07_DATA_MODIFICACAO")
	private LocalDateTime	dataModificacao;
	
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
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTelefoneFixo() {
		return telefoneFixo;
	}
	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
