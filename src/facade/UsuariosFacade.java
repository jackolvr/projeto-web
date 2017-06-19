package facade;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.UsuariosModel;
import model.servico.UsuariosServInterface;



@Path("/usuarios")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)
public class UsuariosFacade {

	@Inject
	private UsuariosServInterface usuariosServInterface;
	
	@GET
	public List<UsuariosModel> getUsuarios(){
		return usuariosServInterface.getUsuarios();
	}

	@POST
	public UsuariosModel salvarUsuarios(UsuariosModel usuariosModel){
		return usuariosServInterface.salvarUsuario(usuariosModel);
	}
	
	@PUT
	public void atualizar(UsuariosModel usuariosModel){
		usuariosServInterface.alterar(usuariosModel);
	}
	
	@DELETE
	@Path("/{idUsuario}")
	public void exclui(@PathParam("idUsuario") Integer idUsuario ){
		UsuariosModel usuariosModel = new UsuariosModel();
		usuariosModel.setId(idUsuario);
		usuariosServInterface.excluir(usuariosModel);
	}
}
