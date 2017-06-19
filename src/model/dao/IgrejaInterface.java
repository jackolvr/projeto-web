package model.dao;

import java.util.List;

import model.IgrejaModel;

public interface IgrejaInterface {

	IgrejaModel salvarIgreja(IgrejaModel igrejaModel);
	
	void alterar(IgrejaModel igrejaModel);
	
	void excluir(IgrejaModel igrejaModel);
	
	List<IgrejaModel> getIgreja();

}
