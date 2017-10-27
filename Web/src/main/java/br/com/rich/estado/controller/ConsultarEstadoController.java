package br.com.rich.estado.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Produces;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.rich.model.EstadoModel;
import br.com.rich.repository.EstadoRepository;

@Named(value="consultarEstadoController")
@ViewScoped
public class ConsultarEstadoController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String estadoss;
	
	@Inject transient
	private EstadoModel estadoModel;
 
	@Produces 
	private List<EstadoModel> estados;
 
	@Inject transient
	private EstadoRepository estadoRepository;

	
	
	public String getEstadoss() {
		return estadoss;
	}
	public void setEstadoss(String estadoss) {
		this.estadoss = estadoss;
	}
	public List<EstadoModel> getEstados() {
		return estados;
	}
	public void setEstados(List<EstadoModel> estados) {
		this.estados = estados;
	}
	public EstadoModel getEstadoModel() {
		return estadoModel;
	}
	public void setEstadoModel(EstadoModel estadoModel) {
		this.estadoModel = estadoModel;
	}

	
	/***
	 * CARREGA OS ESTADOS NA INICIALIZAÇÃO 
	 */
	@PostConstruct
	public void init(){
 
		//RETORNAR OS ESTADOS CADASTRADOS
		this.estados = estadoRepository.GetEstados();
		
	}
	
	/***
	 * CARREGA INFORMAÇÕES DE UM ESTADO PARA SER EDITADA
	 * @param pessoaModel
	 */
	public void Editar(EstadoModel estadoModel){
 
		/*PEGA APENAS A PRIMEIRA LETRA DO SEXO PARA SETAR NO CAMPO(M OU F)*/
		estadoModel.setNome(estadoModel.getNome());
 
		this.estadoModel = estadoModel;
 
	}
	
	
	
	
	
}
