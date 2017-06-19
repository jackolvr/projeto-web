package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.MembrosModel;

public class MembrosImplDao implements MembrosInterface {
	
	@PersistenceContext(unitName="scmcTeste2")
	private EntityManager entityManager;

	@Override
	public MembrosModel salvarMembro(MembrosModel membrosModel) {
		entityManager.persist(membrosModel);
		return membrosModel;
	}

	@Override
	public void alterar(MembrosModel membrosModel) {
		MembrosModel membrosModelMerge = entityManager.merge(membrosModel);
		entityManager.persist(membrosModelMerge);
	}

	@Override
	public void excluir(MembrosModel membrosModel) {
		MembrosModel membrosModelMerge = entityManager.merge(membrosModel);
		entityManager.remove(membrosModelMerge);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<MembrosModel> getMembros() {
		Query query = entityManager.createQuery("from MembrosModel");
		return query.getResultList();
	}

}
