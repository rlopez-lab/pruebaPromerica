
package servicios;

import entidades.DetalleOrden;
import java.util.List;
import javax.ejb.Local;

@Local
public interface DetalleOrdenService {
   public List<DetalleOrden> listaDetalleOrden();
   public DetalleOrden buscarDetalleOrdenId(DetalleOrden detalleOrden);
   public void AgregarDetalleOrden(DetalleOrden detalleOrden);
   public void ModificarDetalleOrden(DetalleOrden detalleOrden);
   public void eliminarDetalleOrden(DetalleOrden detalleOrden);
}
