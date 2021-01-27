
package servicios;

import daos.ProductoDao;
import entidades.Producto;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(endpointInterface = "servicios.ProductoServiceWs")
public class ProductoServiceImpl implements ProductoService, ProductoServiceWs {
   
    @EJB
    ProductoDao productoDao;

    @Override
    public List<Producto> listaProductos() {
        return productoDao.listaProductos();
    }

    @Override
    public Producto encontrarProductoId(Producto producto) {
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
