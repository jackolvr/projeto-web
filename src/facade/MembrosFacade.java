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

import model.MembrosModel;


@Path("/membros")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)
public class MembrosFacade {
	
	static List<MembrosModel> listaMembros = new ArrayList<MembrosModel>();

	static {
		listaMembros.add(new MembrosModel(1, "Membro Um",85988992233L,"Solteiro",0,11062017,"nenhuma"));
	}


	@GET
	public List<MembrosModel> getMembrosModel(){
		return listaMembros;
	}
	
	@POST
	public MembrosModel salvar(MembrosModel membro){
		listaMembros.add(membro);
		return membro;
		
	}
	
	@PUT
	public void atualizar(MembrosModel membro){
		listaMembros.remove(membro);
		listaMembros.add(membro);
	}
	
	@DELETE
	@Path("/{idMembro}")
	public void excluir(@PathParam("idMembro") Integer idMembro){
		MembrosModel membro = new MembrosModel();
		membro.setCod(idMembro);
		listaMembros.remove(membro);
	}
	
}
