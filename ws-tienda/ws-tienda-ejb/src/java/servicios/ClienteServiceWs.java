
package servicios;

import entidades.Cliente;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface ClienteServiceWs {
    @WebMethod
    public List<Cliente> listaClientes();
    @WebMethod
    public Cliente encontrarClienteId(@WebParam(name= "cliente") Cliente cliente);
    @WebMethod
    public void registrarCliente(@WebParam(name= "cliente") Cliente cliente);
    @WebMethod
    public void modificarCliente(@WebParam(name= "cliente") Cliente cliente);
    @WebMethod
    public void eliminarCliente(@WebParam(name= "cliente") Cliente cliente);
}
