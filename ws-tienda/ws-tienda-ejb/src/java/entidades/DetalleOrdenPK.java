
package entidades;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;

@Embeddable
public class DetalleOrdenPK implements Serializable {
    
    
    private Orden orden;  
    private Producto producto;

    public DetalleOrdenPK() {
    }

    public DetalleOrdenPK(Orden orden, Producto Producto) {
        this.orden = orden;
        this.producto = producto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.orden);
        hash = 11 * hash + Objects.hashCode(this.producto);
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
        return true;
    }

}
