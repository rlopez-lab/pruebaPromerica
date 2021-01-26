
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({@NamedQuery(name="Orden.buscarTodos", query="SELECT o FROM Orden o")})
public class Orden implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    private Integer id;
    @Column(name = "id_cliente")
    private Integer cliente;
    private Date fecha;

    public Orden() {
    }

    
    public Orden( Integer cliente, Date fecha) {
        this.cliente = cliente;
        this.fecha = fecha;
    }
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCliente() {
        return cliente;
    }

    public void setCliente(Integer cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
}
