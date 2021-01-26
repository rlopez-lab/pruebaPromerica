package entidades;

import entidades.Orden;
import entidades.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-25T21:52:25")
@StaticMetamodel(DetalleOrden.class)
public class DetalleOrden_ { 

    public static volatile SingularAttribute<DetalleOrden, Producto> Producto;
    public static volatile SingularAttribute<DetalleOrden, Orden> orden;
    public static volatile SingularAttribute<DetalleOrden, Integer> cantidad;

}