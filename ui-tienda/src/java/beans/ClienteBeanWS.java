
package beans;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import tiendaws.cliente.Cliente;
import tiendaws.cliente.ClienteServiceImplService;
import tiendaws.cliente.ClienteServiceWs;

@ManagedBean
@ViewScoped
public class ClienteBeanWS {
    
    
    ClienteServiceWs clienteService = new ClienteServiceImplService().getClienteServiceImplPort();
    List<Cliente> listaClientes;
    
    public ClienteBeanWS() {
    }
   
      
    @PostConstruct
    public void inicializar(){
       //Inicialializamos las variables
       listaClientes = clienteService.listaClientes();
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
      
   
}
