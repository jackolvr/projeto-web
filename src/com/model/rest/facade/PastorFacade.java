package com.model.rest.facade;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.pastor.model.PastorModel;

@Path("/registrados")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)
public class PastorFacade {

	static List<PastorModel> listaRegistrados = new ArrayList<PastorModel>();
	
	static {
		listaRegistrados.add(new PastorModel(1,"secretario","Joao","costa.joao","123456"));
	}
	
	@GET
	public List<PastorModel> getPastormodel(){
		return listaRegistrados;
	}
}
