
package daos;

import entidades.DetalleOrden;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class DetalleOrdenImpl implements DetalleOrdenDao{
    @PersistenceContext(unitName = "ws-tienda-PU")
    EntityManager em;

    @Override
    public List<DetalleOrden> detalleOrden() {
        return em.createNamedQuery("DetalleOrden.buscarTodos").getResultList();
    }

    @Override
    public DetalleOrden buscarDetalleOrdenId(DetalleOrden detalleOrden) {
        return null;
    }

    @Override
    public void AgregarDetalleOrden(DetalleOrden detalleOrden) {
        em.persist(detalleOrden);
    }

    @Override
    public void ModificarDetalleOrden(DetalleOrden detalleOrden) {
        em.merge(detalleOrden);
    }

    @Override
    public void eliminarDetalleOrden(DetalleOrden detalleOrden) {
        em.remove(em.merge(detalleOrden));
    }
}
