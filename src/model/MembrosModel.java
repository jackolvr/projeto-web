package model;

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