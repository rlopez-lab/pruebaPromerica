
package servicios;

import entidades.Cliente;
import java.util.List;
import javax.ejb.Local;

@Local
public interface ClienteService {
        public List<Cliente> listaClientes();
        public Cliente encontrarClienteId(Cliente cliente);
        public void registrarCliente(Cliente cliente);
        public void modificarCliente(Cliente cliente);
        public void eliminarCliente(Cliente cliente);
}
