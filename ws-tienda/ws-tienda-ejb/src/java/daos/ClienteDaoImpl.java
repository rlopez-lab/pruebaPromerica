
package daos;

import entidades.Cliente;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.*;

@Stateless
public class ClienteDaoImpl implements ClienteDao {
    @PersistenceContext(unitName = "ws-tienda-PU")
    EntityManager em;

    @Override
    public List<Cliente> listaClientes() {
        return em.createNamedQuery("Cliente.buscarTodos").getResultList();
    }

    @Override
    public Cliente encontrarClienteId(Cliente cliente) {
        return em.find(Cliente.class, cliente.getId());
    }

    @Override
    public void agregarCliente(Cliente cliente) {
        em.persist(cliente);
    }

    @Override
    public void modificarCliente(Cliente cliente) {
        em.merge(cliente);
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        em.remove(em.merge(cliente));
    }

}
