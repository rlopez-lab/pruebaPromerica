
package entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@IdClass(DetalleOrdenPK.class)
@Table(name="detalle_orden")
public class DetalleOrden implements Serializable{
    
    private static final long serialVersionUID = 1L; 
    
    @Id
    @Column(name="id_orden")
    @ManyToOne
    //Se relaciona con Orden
    @JoinColumn(name="id")
    private Orden orden;
    
    @Id
    @Column(name="id_producto")
    @ManyToOne
    //Se relaciona con Producto
    @JoinColumn(name="id")
    private Producto Producto;
    private Integer cantidad;
    
    public DetalleOrden() {
    }

    public DetalleOrden(Orden orden, Producto Producto, Integer cantidad) {
        this.orden = orden;
        this.Producto = Producto;
        this.cantidad = cantidad;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public Producto getProducto() {
        return Producto;
    }

    public void setProducto(Producto Producto) {
        this.Producto = Producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    
  
    
}
