package entidades;

import entidades.Cliente;
import entidades.DetalleOrden;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-25T21:52:25")
@StaticMetamodel(Orden.class)
public class Orden_ { 

    public static volatile SingularAttribute<Orden, Cliente> cliente;
    public static volatile SingularAttribute<Orden, Date> fecha;
    public static volatile SingularAttribute<Orden, Integer> id;
    public static volatile ListAttribute<Orden, DetalleOrden> detalleOrden;

}