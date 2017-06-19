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

import model.IgrejaModel;
import model.servico.IgrejaServInterfac;



@Path("/igreja")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)
public class IgrejaFacade {
	
	@Inject
	private IgrejaServInterfac igrejaServInterface;
	
	@GET
	public List<IgrejaModel> getIgreja(){
		return igrejaServInterface.getIgreja();
	}

	@POST
	public IgrejaModel salvarIgreja(IgrejaModel igrejaModel){
		return igrejaServInterface.salvarIgreja(igrejaModel);
	}
	
	@PUT
	public void atualizar(IgrejaModel igrejaModel){
		igrejaServInterface.alterar(igrejaModel);
	}
	
	@DELETE
	@Path("/{idIgreja}")
	public void exclui(@PathParam("idIgreja") Integer idIgreja ){
		IgrejaModel igrejaModel = new IgrejaModel();
		igrejaModel.setId(idIgreja);
		igrejaServInterface.excluir(igrejaModel);
	}

}
