package model.servico;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import model.UsuariosModel;
import model.dao.UsuariosInterface;

public class UsuariosImplServInterfac implements UsuariosServInterface{

	@Inject
	private UsuariosInterface usuariosInterface;
	
	
	@Override
	public List<UsuariosModel> getUsuarios() {
		return usuariosInterface.getUsuarios();
	}
	
	@Override
	@Transactional
	public UsuariosModel salvarUsuario(UsuariosModel usuariosModel) {
		return usuariosInterface.salvarUsuario(usuariosModel);
	}

	@Override
	@Transactional
	public void alterar(UsuariosModel usuariosModel) {
		usuariosInterface.alterar(usuariosModel);
		
	}

	@Override
	@Transactional
	public void excluir(UsuariosModel usuariosModel) {
		usuariosInterface.excluir(usuariosModel);
		
	}

}
