
package daos;

import entidades.DetalleOrden;
import java.util.List;


public interface DetalleOrdenDao {
   public List<DetalleOrden> detalleOrden();
   public DetalleOrden buscarDetalleOrdenId(DetalleOrden detalleOrden);
   public void AgregarDetalleOrden(DetalleOrden detalleOrden);
   public void ModificarDetalleOrden(DetalleOrden detalleOrden);
   public void eliminarDetalleOrden(DetalleOrden detalleOrden);
    
}
