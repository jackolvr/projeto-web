package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.IgrejaModel;

public class IgrejaImplDao implements IgrejaInterface{
	
	@PersistenceContext(unitName="scmcTeste2")
	private EntityManager entityManager;
	

	@Override
	public IgrejaModel salvarIgreja(IgrejaModel igrejaModel) {
		entityManager.persist(igrejaModel);
		return igrejaModel;
	}

	@Override
	public void alterar(IgrejaModel igrejaModel) {
		IgrejaModel igrejaModelMerge = entityManager.merge(igrejaModel);
		entityManager.persist(igrejaModelMerge);
	}

	@Override
	public void excluir(IgrejaModel igrejaModel) {
		IgrejaModel igrejaModelMerge = entityManager.merge(igrejaModel);
		entityManager.remove(igrejaModelMerge);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<IgrejaModel> getIgreja() {
		Query query = entityManager.createQuery("from IgrejaModel");
		return query.getResultList();
	}
	
	

}
