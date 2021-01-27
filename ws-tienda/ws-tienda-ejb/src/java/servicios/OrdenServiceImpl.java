
package servicios;

import daos.OrdenDao;
import entidades.Orden;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

@Stateless
@WebService(endpointInterface = "servicios.OrdenServiceWs")
public class OrdenServiceImpl implements OrdenService, OrdenServiceWs {

    @EJB
    private OrdenDao ordenDao;
        
    @Override
    public List<Orden> listaOrden() {
        return ordenDao.listaOrden();
    }

    @Override
    public Orden encontrarOrdenId(Orden orden) {
        return ordenDao.encontrarOrdenId(orden);
    }

    @Override
    public void agregarOrden(Orden orden) {
        ordenDao.agregarOrden(orden);
    }

    @Override
    public void modificarOrden(Orden orden) {
        ordenDao.modificarOrden(orden);
    }

    @Override
    public void eliminarOrden(Orden orden) {
        ordenDao.eliminarOrden(orden);
    }

}
