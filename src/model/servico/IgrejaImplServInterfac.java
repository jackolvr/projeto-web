package model.servico;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import model.IgrejaModel;
import model.dao.IgrejaInterface;

public class IgrejaImplServInterfac implements IgrejaServInterfac{
	
	@Inject
	private IgrejaInterface igrejaInterface;
	
	@Override
	public List<IgrejaModel> getIgreja() {
		return igrejaInterface.getIgreja();
	}

	@Override
	@Transactional
	public IgrejaModel salvarIgreja(IgrejaModel igrejaModel) {
		return igrejaInterface.salvarIgreja(igrejaModel);
	}

	@Override
	@Transactional
	public void alterar(IgrejaModel igrejaModel) {
		igrejaInterface.alterar(igrejaModel);
		
	}

	@Override
	@Transactional
	public void excluir(IgrejaModel igrejaModel) {
		igrejaInterface.excluir(igrejaModel);
		
	}

	

}
