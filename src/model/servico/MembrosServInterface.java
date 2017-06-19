package model.servico;

import java.util.List;

import model.MembrosModel;

public interface MembrosServInterface {

MembrosModel salvarMembro(MembrosModel membrosModel);
	
	void alterar(MembrosModel membrosModel);
	
	void excluir(MembrosModel membrosModel);
	
	List<MembrosModel> getMembros();
}
