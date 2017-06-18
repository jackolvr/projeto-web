package model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CalendarioModel implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	Integer id;
	Date data;
	Time hora;
	String descricao;
	Integer idLogin;
	
	public CalendarioModel() {
		// TODO Auto-generated constructor stub
	}

	public CalendarioModel(Integer id, Date data, Time hora, String descricao, Integer idLogin) {
		this.id = id;
		this.data = data;
		this.hora = hora;
		this.descricao = descricao;
		this.idLogin = idLogin;
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
		CalendarioModel other = (CalendarioModel) obj;
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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Time getHora() {
		return hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getIdLogin() {
		return idLogin;
	}

	public void setIdLogin(Integer idLogin) {
		this.idLogin = idLogin;
	}
	
	
	
}