
package servicios;

import entidades.Orden;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface OrdenServiceWs {
    @WebMethod
    public List<Orden> listaOrden();
    @WebMethod
    public Orden encontrarOrdenId(@WebParam(name="orden") Orden orden);
    @WebMethod
    public void agregarOrden(@WebParam(name="orden") Orden orden);
    @WebMethod
    public void modificarOrden(@WebParam(name="orden") Orden orden);
    @WebMethod
    public void eliminarOrden(@WebParam(name="orden") Orden orden);
}
