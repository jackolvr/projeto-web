package model.servico;

import java.util.List;

import model.IgrejaModel;

public interface IgrejaServInterfac {
	
IgrejaModel salvarIgreja(IgrejaModel igrejaModel);
	
	void alterar(IgrejaModel igrejaModel);
	
	void excluir(IgrejaModel igrejaModel);
	
	List<IgrejaModel> getIgreja();


}
