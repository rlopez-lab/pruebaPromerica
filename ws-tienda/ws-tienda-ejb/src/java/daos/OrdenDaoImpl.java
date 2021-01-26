
package daos;

import entidades.Orden;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class OrdenDaoImpl implements OrdenDao {
    @PersistenceContext(unitName = "ws-tienda-PU")
    EntityManager em;

    @Override
    public List<Orden> listaOrden() {
        return em.createNamedQuery("Orden.buscarTodos").getResultList();
    }

    @Override
    public Orden encontrarOrdenId(Orden orden) {
        return em.find(Orden.class, orden.getId());
    }

    @Override
    public void agregarOrden(Orden orden) {
        em.persist(orden);
    }

    @Override
    public void modificarOrden(Orden orden) {
        em.persist(orden);
    }

    @Override
    public void eliminarOrden(Orden orden) {
        em.remove(em.merge(orden));
    }

}
