
package servicios;

import entidades.DetalleOrden;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface DetalleOrdenServiceWs {
   @WebMethod
   public List<DetalleOrden> listaDetalleOrden();
   @WebMethod
   public DetalleOrden buscarDetalleOrdenId(@WebParam(name="detalleOrden") DetalleOrden detalleOrden);
   @WebMethod
   public void AgregarDetalleOrden(@WebParam(name="detalleOrden") DetalleOrden detalleOrden);
   @WebMethod
   public void ModificarDetalleOrden(@WebParam(name="detalleOrden") DetalleOrden detalleOrden);
   @WebMethod
   public void eliminarDetalleOrden(@WebParam(name="detalleOrden") DetalleOrden detalleOrden);
    
}
