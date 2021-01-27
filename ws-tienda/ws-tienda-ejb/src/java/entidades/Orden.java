
package entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@NamedQueries({@NamedQuery(name="Orden.buscarTodos", query="SELECT o FROM Orden o")})
@Table(name="orden")
@XmlAccessorType(XmlAccessType.FIELD)
public class Orden implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    private Integer id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    @XmlTransient
    @OneToMany(mappedBy = "orden")
    private List<DetalleOrden> detalleOrden;
    @JoinColumn(name = "ID_CLIENTE", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Cliente idCliente;
    
  
    public Orden() {
    }

    
    public Orden( Cliente idCliente, Date fecha) {
        this.idCliente = idCliente;
        this.fecha = fecha;
    }
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return idCliente;
    }

    public void setCliente(Cliente idCliente) {
        this.idCliente = idCliente;
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
