package br.com.rich.cidade.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.rich.model.CidadeModel;
import br.com.rich.repository.CidadeRepository;
import br.com.rich.usuario.controller.UsuarioController;
import br.com.rich.uteis.Uteis;

@Named(value="cadastrarCidadeController")
@RequestScoped
public class CadastrarCidadeController {
	
	@Inject
	CidadeModel cidadeModel;
	@Inject
	UsuarioController usuarioController;
	@Inject
	CidadeRepository cidadeRepository;
	
	
	public void SalvarNovaCidade(){
		 
		cidadeRepository.salvarNovaCidade(this.cidadeModel);
		this.cidadeModel = null;
 
		Uteis.MensagemInfo("Registro cadastrado com sucesso");
 
	}

	public CidadeModel getCidadeModel() {
		return cidadeModel;
	}

	public void setCidadeModel(CidadeModel cidadeModel) {
		this.cidadeModel = cidadeModel;
	}
	
	
}
