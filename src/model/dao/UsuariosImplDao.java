package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.UsuariosModel;

public class UsuariosImplDao implements UsuariosInterface{

	@PersistenceContext(unitName="scmcTeste2")
	private EntityManager entityManager;
	
	@Override
	public UsuariosModel salvarUsuario(UsuariosModel usuariosModel) {
		entityManager.persist(usuariosModel);
		return usuariosModel;
	}

	@Override
	public void alterar(UsuariosModel usuariosModel) {
		UsuariosModel usuariosModelMerge = entityManager.merge(usuariosModel);
		entityManager.persist(usuariosModelMerge);
	}

	@Override
	public void excluir(UsuariosModel usuariosModel) {
		UsuariosModel usuariosModelMerge = entityManager.merge(usuariosModel);
		entityManager.remove(usuariosModelMerge);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<UsuariosModel> getUsuarios() {
		Query query = entityManager.createQuery("from UsuariosModel");
		return query.getResultList();
	}

}
