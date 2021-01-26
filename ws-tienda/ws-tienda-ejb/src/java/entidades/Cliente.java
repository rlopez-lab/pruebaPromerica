
package entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.*;


@Entity
@NamedQueries({@NamedQuery(name="Cliente.buscarTodos", query="SELECT c FROM Cliente c")})
@Table(name="cliente")
@XmlAccessorType(XmlAccessType.FIELD)
public class Cliente implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Size(max=50)
    private String nombres;
    @Size(max=50)
    private String apellidos;
    //se relaciona con Orden
    @OneToMany(mappedBy = "cliente")
    private List<Cliente> listaClientes;
    
    public Cliente() {
    }

    public Cliente(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    
    

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + '}';
    }
    
    

}
