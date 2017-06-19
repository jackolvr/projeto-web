package model.servico;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import model.MembrosModel;
import model.dao.MembrosInterface;


public class MembrosImplServInterfac implements MembrosServInterface{

	@Inject
	private MembrosInterface membrosInterface;
	
	@Override
	public List<MembrosModel> getMembros() {
		return membrosInterface.getMembros();
	}
	
	@Override
	@Transactional
	public MembrosModel salvarMembro(MembrosModel membrosModel) {
		return membrosInterface.salvarMembro(membrosModel);
	}

	@Override
	@Transactional
	public void alterar(MembrosModel membrosModel) {
		membrosInterface.alterar(membrosModel);
		
	}

	@Override
	@Transactional
	public void excluir(MembrosModel membrosModel) {
		membrosInterface.excluir(membrosModel);
		
	}

	

}
