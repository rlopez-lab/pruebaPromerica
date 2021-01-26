
package entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@NamedQueries({@NamedQuery(name="Orden.buscarTodos", query="SELECT o FROM Orden o")})
@Table(name="orden")
public class Orden implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    private Integer id;
    
    @Column(name = "id_cliente")
    @ManyToOne
    @JoinColumn(name="id")
    private Cliente cliente;
    private Date fecha;
    //Se relaciona con orden
    @OneToMany(mappedBy = "orden")
    private List<DetalleOrden> detalleOrden;

    public Orden() {
    }

    
    public Orden( Cliente cliente, Date fecha) {
        this.cliente = cliente;
        this.fecha = fecha;
    }
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<DetalleOrden> getDetalleOrden() {
        return detalleOrden;
    }

    public void setDetalleOrden(List<DetalleOrden> detalleOrden) {
        this.detalleOrden = detalleOrden;
    }
    
    
    
}
