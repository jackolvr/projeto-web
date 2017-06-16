package com.model.rest.facade;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.membros.model.MembrosModel;


@Path("/membros")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)
public class MembrosFacade {
	
	static List<MembrosModel> listaMembros = new ArrayList<MembrosModel>();

	static {
		listaMembros.add(new MembrosModel(1, "Membro Um",85988992233L,"Solteiro",0,11062017,"nenhuma"));
	}


	@GET
	public List<MembrosModel> getMembros(){
		return listaMembros;

	}
	
	@POST
	public MembrosModel salvar(MembrosModel membros){
		listaMembros.add(membros);
		return membros;

	}
	
}
