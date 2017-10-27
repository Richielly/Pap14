package br.com.rich.repository.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//A02_LOGRADOURO`, `A03_NUMERO`, `A04_BAIRRO`, `A05_CEP`, `A06_COMPLEMENTO`
//`T07_CIDADE_A01_CIDADE`, `T01_PESSOA_A01_PESSOA`

@Entity
@Table(name="t06_endereco")
public class EnderecoEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="A01_ENDERECO")
	private int id;
	@Column(name="A02_LOGRADOURO")
	private String logradouro;
	@Column(name="A03_NUMERO")
	private String numero;
	@Column(name="A04_BAIRRO")
	private String Bairro;
	@Column(name="A05_CEP")
	private long cep;
	@Column(name="A06_COMPLEMENTO")
	private String complemento;
	@Column(name = "A07_DATA_CRIACAO")
	private LocalDateTime	dataCriacao;
	@Column(name = "A08_DATA_MODIFICACAO")
	private LocalDateTime	dataModificacao;
//	@OneToOne
//	@JoinColumn(name="T01_PESSOA_A01_PESSOA")
//	private CidadeEntity cidade;
//	@OneToOne
//	@JoinColumn(name="tb_pessoa_id_pessoa")
//	private PessoaModel pessoa;
	
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return Bairro;
	}
	public void setBairro(String bairro) {
		Bairro = bairro;
	}
	public long getCep() {
		return cep;
	}
	public void setCep(long cep) {
		this.cep = cep;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
//	public CidadeEntity getCidade() {
//		return cidade;
//	}
//	public void setCidade(CidadeEntity cidade) {
//		this.cidade = cidade;
//	}
//	public PessoaModel getPessoa() {
//		return pessoa;
//	}
//	public void setPessoa(PessoaModel pessoa) {
//		this.pessoa = pessoa;
//	}
	
	
}
