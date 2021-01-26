
package servicios;

import entidades.Orden;
import java.util.List;
import javax.ejb.Local;

@Local
public interface OrdenService {
     public List<Orden> listaOrden();
    public Orden encontrarOrdenId(Orden orden);
    public void agregarOrden(Orden orden);
    public void modificarOrden(Orden orden);
    public void eliminarOrden(Orden orden);
}
