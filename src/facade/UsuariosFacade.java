package facade;

import java.util.ArrayList;
import java.util.List;

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

@Path("/usuarios")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)
public class UsuariosFacade {

	static List<UsuariosModel> listaUsuarios = new ArrayList<UsuariosModel>();
	
	static {
		listaUsuarios.add(new UsuariosModel(1,"secretario","Joao","costa.joao","123456"));
	}
	
	@GET
	public List<UsuariosModel> getUsuariosModel(){
		return listaUsuarios;
	}
	
	@POST
	public UsuariosModel salvar(UsuariosModel usuario){
		listaUsuarios.add(usuario);
		return usuario;
		
	}
	
	@PUT
	public void atualizar(UsuariosModel usuario){
		listaUsuarios.remove(usuario);
		listaUsuarios.add(usuario);
	}
	
	@DELETE
	@Path("/{idUsuario}")
	public void excluir(@PathParam("idUsuario") Integer idUsuario){
		UsuariosModel usuario = new UsuariosModel();
		usuario.setId(idUsuario);
		listaUsuarios.remove(usuario);
	}
}
