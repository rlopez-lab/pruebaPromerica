
package servicios;

import entidades.DetalleOrden;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface DetalleOrdenServiceWs {
   @WebMethod
   public List<DetalleOrden> listaDetalleOrden();
   @WebMethod
   public DetalleOrden buscarDetalleOrdenId(DetalleOrden detalleOrden);
   @WebMethod
   public void AgregarDetalleOrden(DetalleOrden detalleOrden);
   @WebMethod
   public void ModificarDetalleOrden(DetalleOrden detalleOrden);
   @WebMethod
   public void eliminarDetalleOrden(DetalleOrden detalleOrden);
    
}
