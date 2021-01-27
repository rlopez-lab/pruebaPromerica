
package servicios;

import daos.ClienteDao;
import entidades.Cliente;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

@Stateless
@WebService(endpointInterface = "servicios.ClienteServiceWs")
public class ClienteServiceImpl implements ClienteService, ClienteServiceWs{

    @EJB
    private ClienteDao clienteDao;
    
    @Override
    public List<Cliente> listaClientes() {      
        return clienteDao.listaPersonas();
    }

    @Override
    public Cliente encontrarClienteId(Cliente cliente) {
        return clienteDao.encontrarClienteId(cliente);
    }

    @Override
    public void registrarCliente(Cliente cliente) {
        clienteDao.agregarCliente(cliente);
    }

    @Override
    public void modificarCliente(Cliente cliente) {
        clienteDao.modificarCliente(cliente);
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        clienteDao.eliminarCliente(cliente);
    }

}
