
package servicios;

import entidades.Cliente;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ClienteServiceWs {
    @WebMethod
    public List<Cliente> listaClientes();
    @WebMethod
    public Cliente encontrarClienteId(Cliente cliente);
    @WebMethod
    public void registrarCliente(Cliente cliente);
    @WebMethod
    public void modificarCliente(Cliente cliente);
    @WebMethod
    public void eliminarCliente(Cliente cliente);
}
