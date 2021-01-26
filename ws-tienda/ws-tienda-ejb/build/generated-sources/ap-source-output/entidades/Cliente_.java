package entidades;

import entidades.Cliente;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-25T21:52:25")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> apellidos;
    public static volatile ListAttribute<Cliente, Cliente> listaClientes;
    public static volatile SingularAttribute<Cliente, Integer> id;
    public static volatile SingularAttribute<Cliente, String> nombres;

}