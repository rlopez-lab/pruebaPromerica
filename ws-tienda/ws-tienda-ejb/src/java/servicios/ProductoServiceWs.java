
package servicios;

import entidades.Producto;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ProductoServiceWs {
    @WebMethod
    public List<Producto> listaProductos();
    @WebMethod
    public Producto encontrarProductoId(Producto producto);
    @WebMethod
    public void agregarProducto(Producto producto);
    @WebMethod
    public void modificarProducto(Producto producto);
    @WebMethod
    public void eliminarProducto(Producto producto);
}
