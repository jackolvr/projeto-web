package com.membros.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MembrosModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	Integer cod;
	String nome;
	Long telefone;
	String estCivil;
	Integer nFilhos;
	Integer dtBatismo;
	String igAnterior;
	
	
	
	public MembrosModel () {
		
	}


	public MembrosModel(Integer cod, String nome, Long telefone, String estCivil, Integer nFilhos, Integer dtBatismo,
			String igAnterior) {
		this.cod = cod;
		this.nome = nome;
		this.telefone = telefone;
		this.estCivil = estCivil;
		this.nFilhos = nFilhos;
		this.dtBatismo = dtBatismo;
		this.igAnterior = igAnterior;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cod == null) ? 0 : cod.hashCode());
		result = prime * result + ((dtBatismo == null) ? 0 : dtBatismo.hashCode());
		result = prime * result + ((estCivil == null) ? 0 : estCivil.hashCode());
		result = prime * result + ((igAnterior == null) ? 0 : igAnterior.hashCode());
		result = prime * result + ((nFilhos == null) ? 0 : nFilhos.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MembrosModel other = (MembrosModel) obj;
		if (cod == null) {
			if (other.cod != null)
				return false;
		} else if (!cod.equals(other.cod))
			return false;
		if (dtBatismo == null) {
			if (other.dtBatismo != null)
				return false;
		} else if (!dtBatismo.equals(other.dtBatismo))
			return false;
		if (estCivil == null) {
			if (other.estCivil != null)
				return false;
		} else if (!estCivil.equals(other.estCivil))
			return false;
		if (igAnterior == null) {
			if (other.igAnterior != null)
				return false;
		} else if (!igAnterior.equals(other.igAnterior))
			return false;
		if (nFilhos == null) {
			if (other.nFilhos != null)
				return false;
		} else if (!nFilhos.equals(other.nFilhos))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}


	public Integer getCod() {
		return cod;
	}


	public void setCod(Integer cod) {
		this.cod = cod;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Long getTelefone() {
		return telefone;
	}


	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}


	public String getEstCivil() {
		return estCivil;
	}


	public void setEstCivil(String estCivil) {
		this.estCivil = estCivil;
	}


	public Integer getnFilhos() {
		return nFilhos;
	}


	public void setnFilhos(Integer nFilhos) {
		this.nFilhos = nFilhos;
	}


	public Integer getDtBatismo() {
		return dtBatismo;
	}


	public void setDtBatismo(Integer dtBatismo) {
		this.dtBatismo = dtBatismo;
	}


	public String getIgAnterior() {
		return igAnterior;
	}


	public void setIgAnterior(String igAnterior) {
		this.igAnterior = igAnterior;
	}

	
	
}