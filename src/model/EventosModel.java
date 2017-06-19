package model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="eventos")
public class EventosModel implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id //indica a chave primaria 
	@GeneratedValue(strategy=GenerationType.IDENTITY) //gera valor automaticamente
	@Column(name="idEventos")
	Integer id;
	Date data;
	Time hora;
	String descricao;
	
	
	@ManyToOne
	@JoinColumn(name="idUsuario", referencedColumnName="idUsuario")
	UsuariosModel UsuariosModel;
	
	public EventosModel() {
		// TODO Auto-generated constructor stub
	}

	public EventosModel(Integer id, Date data, Time hora, String descricao) {
		this.id = id;
		this.data = data;
		this.hora = hora;
		this.descricao = descricao;
		
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
		EventosModel other = (EventosModel) obj;
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

	
	
}