
package beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import tiendaws.orden.Orden;


@ManagedBean(name = "ordenDetalleBean")
@ViewScoped
public class OrdenDetalleBean {

    @ManagedProperty("#{ordenBeanWS}")
    private OrdenBeanWS ordenBeanWS;
    private Orden ordenEncontrada;
 
    public OrdenDetalleBean() {
    }
    
    @PostConstruct
      public void inicializar(){
   //     buscarOrden();
       //ordenEncontrada = buscarOrden(ordenBeanWS.orden);
        // System.out.println("orden: " + ); 
       // System.out.println("orden: " + ordenEncontrada);
    }

    public Orden buscarOrden(Integer ordenId){          
         ordenEncontrada.setId(ordenId);
       
        return ordenBeanWS.ordenService.encontrarOrdenId(ordenEncontrada);
   }

    public OrdenBeanWS getOrdenBeanWS() {
        return ordenBeanWS;
    }

    public void setOrdenBeanWS(OrdenBeanWS ordenBeanWS) {
        this.ordenBeanWS = ordenBeanWS;
    }
    
   

    public Orden getOrdenEncontrada() {
        return ordenEncontrada;
    }

    public void setOrdenEncontrada(Orden ordenEncontrada) {
        this.ordenEncontrada = ordenEncontrada;
    }
    
   
}
