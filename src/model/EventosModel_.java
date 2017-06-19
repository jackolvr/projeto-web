package model;

import java.sql.Date;
import java.sql.Time;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-06-17T22:47:30.681-0300")
@StaticMetamodel(EventosModel.class)
public class EventosModel_ {
	public static volatile SingularAttribute<EventosModel, Integer> id;
	public static volatile SingularAttribute<EventosModel, Date> data;
	public static volatile SingularAttribute<EventosModel, Time> hora;
	public static volatile SingularAttribute<EventosModel, String> descricao;
	public static volatile SingularAttribute<EventosModel, UsuariosModel> UsuariosModel;
}
