
package servicios;


import daos.DetalleOrdenDao;
import entidades.DetalleOrden;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(endpointInterface = "servicios.DetalleOrdenServiceWs")
public class DetalleOrdenServiceImpl implements DetalleOrdenService, DetalleOrdenServiceWs{

    @EJB
    DetalleOrdenDao detalleOrdenDao;

    @Override
    public List<DetalleOrden> listaDetalleOrden() {
        return detalleOrdenDao.detalleOrden();
    }

    @Override
    public DetalleOrden buscarDetalleOrdenId(DetalleOrden detalleOrden) {
        return detalleOrdenDao.buscarDetalleOrdenId(detalleOrden);
    }

    @Override
    public void AgregarDetalleOrden(DetalleOrden detalleOrden) {
        detalleOrdenDao.AgregarDetalleOrden(detalleOrden);
    }

    @Override
    public void ModificarDetalleOrden(DetalleOrden detalleOrden) {
        detalleOrdenDao.ModificarDetalleOrden(detalleOrden);
    }

    @Override
    public void eliminarDetalleOrden(DetalleOrden detalleOrden) {
        detalleOrdenDao.eliminarDetalleOrden(detalleOrden);
    }
            
   
}
