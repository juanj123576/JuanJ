/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import controlador.Controlador;
import modelo.*;
import vista.Directorio;

/**
 * Clase Principal
 * @author Marcos Perez
 */
public class Principal {
    
    
    
    public static void main(String[] args){
        
    Directorio vista = new Directorio();
    Controlador controlador = new Controlador();
    ArbolAvl arbol = new ArbolAvl();
    vista.setControl(controlador);
    controlador.setVista(vista);
    controlador.setArbol(arbol);
    
    vista.setVisible(true);
        
        
    }
    
}
