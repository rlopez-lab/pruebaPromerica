
package daos;

import entidades.Producto;
import java.util.List;


public interface ProductoDao {
    public List<Producto> listaProductos();
    public Producto encontrarProductoId(Producto producto);
    public void agregarProducto(Producto producto);
    public void modificarProducto(Producto producto);
    public void eliminarProducto(Producto producto);
    
}
