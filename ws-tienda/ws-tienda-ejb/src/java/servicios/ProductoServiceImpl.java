
package servicios;

import daos.ProductoDao;
import entidades.Producto;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class ProductoServiceImpl implements ProductoService {
   
    @EJB
    ProductoDao productoDao;

    @Override
    public List<Producto> listarProductos() {
        return productoDao.listaProductos();
    }

    @Override
    public Producto buscarProductoId(Producto producto) {
        return productoDao.encontrarProductoId(producto);
    }

    @Override
    public void agregarProducto(Producto producto) {
        productoDao.agregarProducto(producto);
    }

    @Override
    public void modificarProducto(Producto producto) {
        productoDao.modificarProducto(producto);
    }

    @Override
    public void eliminarProducto(Producto producto) {
        productoDao.eliminarProducto(producto);
    }

}
