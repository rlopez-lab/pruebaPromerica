
package daos;

import entidades.Cliente;
import java.util.List;


public interface ClienteDao {
    public List<Cliente> listaClientes();
    public Cliente encontrarClienteId(Cliente cliente);
    public void agregarCliente(Cliente cliente);
    public void modificarCliente(Cliente cliente);
    public void eliminarCliente(Cliente cliente);
}
