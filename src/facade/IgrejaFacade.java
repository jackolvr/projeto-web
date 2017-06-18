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

import model.IgrejaModel;



@Path("/igreja")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)
public class IgrejaFacade {
	
	static List<IgrejaModel> listaIgreja = new ArrayList<IgrejaModel>();
	
	static {
		listaIgreja.add(new IgrejaModel(1,00000000000000L,"Igreja Um","endereço um", 8599994455L,"cabeçalho"));
	}
	
	@GET
	public List<IgrejaModel> getIgrejaModel(){
		return listaIgreja;
	}
	
	@POST
	public IgrejaModel salvar(IgrejaModel igreja){
		listaIgreja.add(igreja);
		return igreja;
		
	}
	
	@PUT
	public void atualizar(IgrejaModel igreja){
		listaIgreja.remove(igreja);
		listaIgreja.add(igreja);
	}
	
	@DELETE
	@Path("/{idIgreja}")
	public void excluir(@PathParam("idIgreja") Integer idIgreja){
		IgrejaModel igreja = new IgrejaModel();
		igreja.setId(idIgreja);
		listaIgreja.remove(igreja);
	}

}
