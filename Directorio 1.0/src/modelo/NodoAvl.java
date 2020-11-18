/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Marcos Perez
 */
public class NodoAvl {
    
    private int fe;
    private Contacto contenido;
    private NodoAvl hijoIzq;
    private NodoAvl hijoDer;

    public NodoAvl(Contacto contenido, NodoAvl hijoIzq, NodoAvl hijoDer) {
        this.contenido = contenido;
        this.hijoIzq = hijoIzq;
        this.hijoDer = hijoDer;
    }

    public NodoAvl() {
      contenido=null;
      hijoIzq=null;
      hijoDer=null;
      this.fe=0;
    }
    
     public int getFe() {
        return fe;
    }

    public void setFe(int fe) {
        this.fe = fe;
    }
    
    public Contacto getContacto() {
        return contenido;
    }

    public NodoAvl getHijoIzq() {
        return hijoIzq;
    }

    public NodoAvl getHijoDer() {
        return hijoDer;
    }

    public void setContacto(Contacto contenido) {
        this.contenido = contenido;
    }

    public void setHijoIzq(NodoAvl hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public void setHijoDer(NodoAvl hijoDer) {
        this.hijoDer = hijoDer;
    }
    
    @Override
    public String toString(){
        return ""+contenido;
    }
    
}
