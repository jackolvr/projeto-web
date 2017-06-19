package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="igreja")
public class IgrejaModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id //indica a chave primaria 
	@GeneratedValue(strategy=GenerationType.IDENTITY) //gera valor automaticamente
	@Column(name="idIgreja")
	Integer id;
	@Column(name="cnpj", length=13, nullable=true)
	Long cnpj;
	@Column(name="nome", length=45, nullable=false)
	String nome;
	@Column(name="endereco", length=50, nullable=true)
	String endereco;
	@Column(name="telefone", length=14, nullable=true)
	Long telefone;
	@Column(name="cebecalho", length=20, nullable=true)
	String cabecalho;
	
	public IgrejaModel() {
		
	}

	public IgrejaModel(Integer id, Long cnpj, String nome, String endereco, Long telefone, String cabecalho) {
		this.id = id;
		this.cnpj = cnpj;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cabecalho = cabecalho;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		IgrejaModel other = (IgrejaModel) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getCnpj() {
		return cnpj;
	}

	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	public String getCabecalho() {
		return cabecalho;
	}

	public void setCabecalho(String cabecalho) {
		this.cabecalho = cabecalho;
	}

	

	
	
}
