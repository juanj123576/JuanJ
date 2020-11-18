
package controlador;

import java.util.ArrayList;
import modelo.*;
import vista.*;

/**
 * Encargado de la comunicacion entre la vista y la logica- Bajo acoplamiento --Alta coherencia 
 *
 * @author Marcos Perez
 */
public class Controlador {

    ArbolAvl arbol;
    Directorio vista;
    DatosEst datosEsta;

    public void setVista(Directorio vista) {
        this.vista = vista;
    }

    public void setArbol(ArbolAvl arbol) {
        this.arbol = arbol;
    }

    /**
     * @return Listado de contactos en orden alfabetica, en caso de no existir
     * un contacto retorna null.
     *
     */
    public ArrayList<String> listaContacto() {

        return arbol.imprimir(1);
    }
    public ArrayList<String> listaPre() {

        return arbol.imprimir(2);
    }
    public ArrayList<String> listaPost() {

        return arbol.imprimir(3);
    }
    /**
     * Retornar informacion reference a un contacto
     *
     * @param nombre informacion de contacto del cual necesita informacion
     * @return vector de cuatro {nombre, telefono, direccion, correo}
     *
     */
    public String[] getInfo(String nombre) {
        Contacto aux = arbol.buscar(nombre);
        String[] datos = {aux.getNombre(), String.valueOf(aux.getTelefono()), aux.getDireccion(), aux.getDireccion()};
         return datos;
   
    }

    /**
     * Agregar contacto
     *
     * @param nombre
     * @param telefono
     * @param direccion
     * @param correo
     */
    public void agregarCont(String nombre, double telefono, String direccion, String correo) {
        Contacto aux = new Contacto(nombre, telefono, direccion, correo);
        arbol.insertar(aux);
        //arbol.insert(aux);
    }

    /**
     * Eliminar un contacto
     *
     * @param nombre informacion del contacto a eliminar
     * @return
     */
    public boolean eliminarCont(String nombre) {
        return arbol.delete(nombre);
    }
    
    public void notifica(String nombre, boolean EA){
    
       Notificacion notificar  = new Notificacion(nombre, EA); 
    //aqui yohalcis debes notificar y si es una eliminacion, debes poner algo simpatico.
    
    
    }
    
    /**
     * buscar contacto
     *
     * @param nombre informacion del contacto a buscar
     * @return null en caso de no existir y el nombre en caso de que si exista
     * el contacto
     */
    public String buscar(String nombre) {
        Contacto aux = arbol.buscar(nombre);
        if (aux == null) {
            return null;
        } else {
            return aux.getNombre();
        }
    }

    public void datosEstadisticos() {
       
        DatosEst dialog = new DatosEst(new javax.swing.JFrame(), true);
        dialog.setLocationRelativeTo(null);
        if(arbol.cantidadNodos()>0){
        dialog.setDatosEst(arbol.imprimir(3), arbol.imprimir(2), arbol.imprimir(1), arbol.retornarAltura(0), arbol.cantidadNodos(), arbol.cantidadNodosRaiz(), arbol.cantidadNodosHoja(), arbol.retornarAltura(2), arbol.retornarAltura(1));
        }
        dialog.setVisible(true);
        
    }
}
