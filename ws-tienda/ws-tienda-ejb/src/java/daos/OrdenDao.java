
package daos;

import entidades.Orden;
import java.util.List;


public interface OrdenDao {
    public List<Orden> listaOrden();
    public Orden encontrarOrdenId(Orden orden);
    public void agregarOrden(Orden orden);
    public void modificarOrden(Orden orden);
    public void eliminarOrden(Orden orden);
}
