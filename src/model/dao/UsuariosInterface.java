package model.dao;

import java.util.List;

import model.UsuariosModel;

public interface UsuariosInterface {

UsuariosModel salvarUsuario(UsuariosModel usuariosModel);
	
	void alterar(UsuariosModel usuariosModel);
	
	void excluir(UsuariosModel usuariosModel);
	
	List<UsuariosModel> getUsuarios();
}
