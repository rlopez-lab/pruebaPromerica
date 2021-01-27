package entidades;

import entidades.DetalleOrdenPK;
import entidades.Orden;
import entidades.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-27T15:15:56")
@StaticMetamodel(DetalleOrden.class)
public class DetalleOrden_ { 

    public static volatile SingularAttribute<DetalleOrden, Integer> cantidad;
    public static volatile SingularAttribute<DetalleOrden, Orden> orden;
    public static volatile SingularAttribute<DetalleOrden, Producto> producto;
    public static volatile SingularAttribute<DetalleOrden, DetalleOrdenPK> detalleOrdenPK;

}