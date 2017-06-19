package model.servico;

import java.util.List;

import model.UsuariosModel;

public interface UsuariosServInterface {

UsuariosModel salvarUsuario(UsuariosModel usuariosModel);
	
	void alterar(UsuariosModel usuariosModel);
	
	void excluir(UsuariosModel usuariosModel);
	
	List<UsuariosModel> getUsuarios();
}
