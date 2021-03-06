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
@Table(name="usuarios")
public class UsuariosModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id //indica a chave primaria 
	@GeneratedValue(strategy=GenerationType.IDENTITY) //gera valor automaticamente
	@Column(name="idUsuario")
	Integer id;
	@Column(name="funcao", length=20, nullable=true)
	String funcao;
	@Column(name="nome", length=45, nullable=true)
	String Nome;
	@Column(name="login", length=20, nullable=false)
	String login;
	@Column(name="senha", length=20, nullable=false)
	String senha;
	
	
	
	public UsuariosModel() {
		// TODO Auto-generated constructor stub
	}
	
	public UsuariosModel(Integer id, String funcao, String nome, String login, String senha) {
		this.id = id;
		this.funcao = funcao;
		Nome = nome;
		this.login = login;
		this.senha = senha;
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
		UsuariosModel other = (UsuariosModel) obj;
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
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	
}