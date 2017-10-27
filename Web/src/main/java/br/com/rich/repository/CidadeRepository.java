package br.com.rich.repository;

import java.time.LocalDateTime;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.rich.model.CidadeModel;
import br.com.rich.model.EstadoModel;
import br.com.rich.repository.entity.CidadeEntity;
import br.com.rich.repository.entity.EstadoEntity;
import br.com.rich.uteis.Uteis;

public class CidadeRepository {

	@Inject
	CidadeEntity cidadeEntity;
	@Inject
	EstadoEntity estadoEntity;
	EntityManager entityManager;
	
	
	/***
	 * MÉTODO RESPONSÁVEL POR SALVAR UMA NOVA CIDADE
	 * @param cidadeModel
	 */
	
	public void salvarNovaCidade (CidadeModel cidadeModel){
		entityManager =  Uteis.JpaEntityManager();
		
		cidadeEntity = new CidadeEntity();
		cidadeEntity.setDataCriacao(LocalDateTime.now());
		cidadeEntity.setDataModificacao(LocalDateTime.now());
		cidadeEntity.setNome(cidadeModel.getNome());
		
		EstadoEntity estadoEntity = entityManager.find(EstadoEntity.class, cidadeModel.getEstado().getId());
		cidadeEntity.setEstado(estadoEntity);
		
		
		entityManager.persist(cidadeEntity);
	}
	
	
	
}
