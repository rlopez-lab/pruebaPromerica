
package entidades;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DetalleOrdenPK implements Serializable {
    
   @Column(name = "ID_ORDEN") 
    private Integer idOrden;  
   @Column(name = "ID_PRODUCTO")
    private Integer idProducto;

    public DetalleOrdenPK() {
    }

    public DetalleOrdenPK(Integer idOrden, Integer idProducto) {
        this.idOrden = idOrden;
        this.idProducto = idProducto;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.idOrden);
        hash = 53 * hash + Objects.hashCode(this.idProducto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DetalleOrdenPK other = (DetalleOrdenPK) obj;
        if (!Objects.equals(this.idOrden, other.idOrden)) {
            return false;
        }
        if (!Objects.equals(this.idProducto, other.idProducto)) {
            return false;
        }
        return true;
    }
    
    

    

}
