package br.com.rich.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.rich.model.EstadoModel;
import br.com.rich.repository.entity.EstadoEntity;
import br.com.rich.uteis.Uteis;

public class EstadoRepository {

	@Inject
	EstadoEntity estadoEntity;
	
	EntityManager entityManager;
	
	
	/***
	 * M�TODO RESPONS�VEL POR SALVAR UMA NOVO ESTADO
	 * @param estadoModel
	 */
	
	public void salvarNovoEstado (EstadoModel estadoModel){
		entityManager =  Uteis.JpaEntityManager();
		
		estadoEntity = new EstadoEntity();
		estadoEntity.setDataCriacao(LocalDateTime.now());
		estadoEntity.setDataModificacao(LocalDateTime.now());
		estadoEntity.setNome(estadoModel.getNome());
		estadoEntity.setSigla(estadoModel.getSigla());
		
		entityManager.persist(estadoEntity);
	}
	
	/***
	 * M�TODO PARA CONSULTAR ESTADO
	 * @return
	 */
	public List<EstadoModel> GetEstados(){
 
		List<EstadoModel> estadosModel = new ArrayList<EstadoModel>();
 
		entityManager =  Uteis.JpaEntityManager();
 
		Query query = entityManager.createNamedQuery("EstadoEntity.findAll");
 
		@SuppressWarnings("unchecked")
		Collection<EstadoEntity> estadosEntity = (Collection<EstadoEntity>)query.getResultList();
 
		EstadoModel estadoModel = null;
 
		for (EstadoEntity estadoEntity : estadosEntity) {
 
			estadoModel = new EstadoModel();
			estadoModel.setId(estadoEntity.getId());
			estadoModel.setNome(estadoEntity.getNome());
			estadoModel.setSigla(estadoEntity.getSigla());
			estadoModel.setDataCriacao(estadoEntity.getDataCriacao());
			estadosModel.add(estadoModel);
		}
 
		return estadosModel;
 
	}
	
	
	/***
	 * CONSULTA UM ESTADO CADASTRADO PELO C�DIGO
	 * @param id
	 * @return
	 */
	public EstadoEntity ConsultarEstado(int id){
 
		entityManager =  Uteis.JpaEntityManager();
 
		return entityManager.find(EstadoEntity.class, id);
	}
	

	
}
