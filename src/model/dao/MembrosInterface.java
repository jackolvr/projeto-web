package model.dao;

import java.util.List;

import model.MembrosModel;

public interface MembrosInterface {

	MembrosModel salvarMembro(MembrosModel membrosModel);
	
	void alterar(MembrosModel membrosModel);
	
	void excluir(MembrosModel membrosModel);
	
	List<MembrosModel> getMembros();
	
}
