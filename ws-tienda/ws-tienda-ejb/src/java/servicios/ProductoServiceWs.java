
package servicios;

import entidades.Producto;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface ProductoServiceWs {
    @WebMethod
    public List<Producto> listaProductos();
    @WebMethod
    public Producto encontrarProductoId(@WebParam(name= "producto") Producto producto);
    @WebMethod
    public void agregarProducto(@WebParam(name= "producto") Producto producto);
    @WebMethod
    public void modificarProducto(@WebParam(name= "producto") Producto producto);
    @WebMethod
    public void eliminarProducto(@WebParam(name= "producto") Producto producto);
}
