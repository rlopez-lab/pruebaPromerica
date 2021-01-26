
package servicios;

import entidades.Producto;
import java.util.List;
import javax.ejb.Local;

@Local
public interface ProductoService {
    public List<Producto> listarProductos();
    public Producto buscarProductoId(Producto producto);
    public void agregarProducto(Producto producto);
    public void modificarProducto(Producto producto);
    public void eliminarProducto(Producto producto);
}
