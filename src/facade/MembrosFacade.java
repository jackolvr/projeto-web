package facade;


import java.util.List;

import javax.inject.Inject;
import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.MembrosModel;
import model.servico.MembrosServInterface;




@Path("/membros")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)
public class MembrosFacade {
	
	
	@Inject
	private MembrosServInterface membrosServInterface;
	
	@GET
	public List<MembrosModel> getMembros(){
		return membrosServInterface.getMembros();
	}

	@POST
	public MembrosModel salvarMembros(MembrosModel membrosModel){
		return membrosServInterface.salvarMembro(membrosModel);
	}
	
	@PUT
	public void atualizar(MembrosModel membrosModel){
		membrosServInterface.alterar(membrosModel);
	}
	
	@DELETE
	@Path("/{idMembro}")
	public void exclui(@PathParam("idMembro") Integer idMembro ){
		MembrosModel membrosModel = new MembrosModel();
		membrosModel.setCod(idMembro);
		membrosServInterface.excluir(membrosModel);
	}


}
