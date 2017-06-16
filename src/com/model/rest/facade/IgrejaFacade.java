package com.model.rest.facade;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.igreja.model.IgrejaModel;



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

}
