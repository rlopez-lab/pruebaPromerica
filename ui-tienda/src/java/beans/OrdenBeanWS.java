/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import tiendaws.orden.Orden;
import tiendaws.orden.OrdenServiceImplService;
import tiendaws.orden.OrdenServiceWs;

/**
 *
 * @author RLOPEZ
 */
@Named("ordenBeanWS")
@ViewScoped
public class OrdenBeanWS implements Serializable{
    
    
    OrdenServiceWs ordenService = new OrdenServiceImplService().getOrdenServiceImplPort();
    List<Orden> listaOrdenes;
    private Orden orden = new Orden();
    private Orden ordenEncontrada = new Orden();
    private Integer ord;
   
    
    public OrdenBeanWS() {
    }
   
      
    @PostConstruct
    public void inicializar(){
       //Inicialializamos las variables
       listaOrdenes = ordenService.listaOrden();
    }

    
    
     public void buscarOrden1(Integer ordenId) {
        ord = ordenId;
        orden.setId(ordenId);

        ordenEncontrada = ordenService.encontrarOrdenId(ordenEncontrada);
        //System.out.println("orden: " + ord);
        //System.out.println("orden: " + ordenEncontrada.getId() +" "+ ordenEncontrada.getIdCliente().getId());
    }
    
    public List<Orden> getListaOrdenes() {
        return listaOrdenes;
    }

    public void setListaOrdenes(List<Orden> listaOrdenes) {
        this.listaOrdenes = listaOrdenes;
    }

 
    public Integer getOrd() {
        return ord;
    }

    public void setOrd(Integer ord) {
        this.ord = ord;
    }

    public Orden getOrdenEncontrada() {
        return ordenEncontrada;
    }

    public void setOrdenEncontrada(Orden ordenEncontrada) {
        this.ordenEncontrada = ordenEncontrada;
    }
    
    
 
}
