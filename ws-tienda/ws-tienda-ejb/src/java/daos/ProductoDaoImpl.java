
package daos;

import entidades.Producto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class ProductoDaoImpl implements ProductoDao{
    @PersistenceContext(name = "ws-tienda-PU")
    EntityManager em;

    @Override
    public List<Producto> listaProductos() {
        return em.createNamedQuery("Producto.buscarTodo").getResultList();
    }

    @Override
    public Producto encontrarProductoId(Producto producto) {
        return em.find(Producto.class, producto.getId());
    }

    @Override
    public void agregarProducto(Producto producto) {
        em.persist(producto);
    }

    @Override
    public void modificarProducto(Producto producto) {
        em.merge(producto);
    }

    @Override
    public void eliminarProducto(Producto producto) {
        em.remove(em.merge(producto));
    }

}
