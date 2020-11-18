package modelo;

/**
 *
 * @author Marcos Perez
 */
import java.util.ArrayList;

public class ArbolAvl {

    private NodoAvl raiz;
    private int altura;
    private int cant;

    public ArbolAvl() {
        raiz = null;
    }

    public ArbolAvl(NodoAvl raiz) {
        this.raiz = raiz;
    }

    public NodoAvl getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoAvl raiz) {
        this.raiz = raiz;
    }

    /**
     *
     * @param index 0-altura total 1-altura izquierda 2-altura derecha
     * @return String con el valor solicitado
     */
    public String retornarAltura(int index) {
        altura = 0;
        switch (index) {
            case 0:
                retornarAltura(raiz, 1);
                break;
            case 1:
                retornarAltura(raiz.getHijoIzq(), 1);
                break;
            case 2:
                retornarAltura(raiz.getHijoDer(), 1);
                break;
        }
        return "" + altura;
    }

    private void retornarAltura(NodoAvl actual, int nivel) {
        if (actual != null) {
            retornarAltura(actual.getHijoIzq(), nivel + 1);
            if (nivel > altura) {
                altura = nivel;
            }
            retornarAltura(actual.getHijoDer(), nivel + 1);
        }
    }

    /**
     *
     * @return entero con la cantidad de nodos total
     */
    public int cantidadNodos() {
        cant = 0;
        cantidadNodos(raiz);
        return cant;
    }

    private void cantidadNodos(NodoAvl actual) {
        if (actual != null) {
            cant++;
            cantidadNodos(actual.getHijoIzq());
            cantidadNodos(actual.getHijoDer());
        }
    }

    /**
     *
     * @return entero con la cantidad de nodos RAIZ
     */
    public int cantidadNodosRaiz() {

        return cantidadNodos() - cantidadNodosHoja();
    }

    /**
     *
     * @return entero con la cantidad de nodos HOJA
     */
    public int cantidadNodosHoja() {
        cant = 0;
        if(raiz.getHijoDer()==null && raiz.getHijoIzq()==null){
            return 0;
        }else{
        cantidadNodosHoja(raiz);
        }
        return cant;
    }

    private void cantidadNodosHoja(NodoAvl actual) {
        if (actual != null) {
            if (actual.getHijoIzq() == null && actual.getHijoDer() == null) {
                cant++;
            }
            cantidadNodosHoja(actual.getHijoIzq());
            cantidadNodosHoja(actual.getHijoDer());
        }
    }

    /**
     * Verificar si el arbol está vacio
     *
     * @return true en caso de estar vacio y false en caso contrario
     */
    public boolean vacio() {
        return raiz == null;
    }

    public int getFe(NodoAvl x) {
        if (x == null) {
            return -1;
        } else {
            return x.getFe();
        }
    }

    public NodoAvl rotacionIzquierda(NodoAvl c) {
        NodoAvl auxiliar = c.getHijoIzq();
        c.setHijoIzq(auxiliar.getHijoDer());
        auxiliar.setHijoDer(c);
        c.setFe(Math.max(getFe(c.getHijoIzq()), getFe(c.getHijoDer())) + 1);
        auxiliar.setFe(Math.max(getFe(auxiliar.getHijoIzq()), getFe(auxiliar.getHijoDer())) + 1);
        return auxiliar;
    }

    public NodoAvl rotacionDerecha(NodoAvl c) {
        NodoAvl auxiliar = c.getHijoDer();
        c.setHijoDer(auxiliar.getHijoIzq());
        auxiliar.setHijoIzq(c);
        c.setFe(Math.max(getFe(c.getHijoIzq()), getFe(c.getHijoDer())) + 1);
        auxiliar.setFe(Math.max(getFe(auxiliar.getHijoIzq()), getFe(auxiliar.getHijoDer())) + 1);
        return auxiliar;
    }

    public NodoAvl rotacionDobleIzquierda(NodoAvl c) {
        NodoAvl auxiliar;
        c.setHijoIzq(rotacionDerecha(c.getHijoIzq()));
        auxiliar = rotacionIzquierda(c);
        return auxiliar;
    }

    public NodoAvl rotacionDobleDerecha(NodoAvl c) {
        NodoAvl auxiliar;
        c.setHijoDer(rotacionIzquierda(c.getHijoDer()));
        auxiliar = rotacionDerecha(c);
        return auxiliar;
    }

    public NodoAvl insertarAvl(NodoAvl nuevo, NodoAvl subAr) {
        NodoAvl nuevoPadre = subAr;

        if (nuevo.getContacto().getNombre().compareToIgnoreCase(subAr.getContacto().getNombre()) < 0) {
            if (subAr.getHijoIzq() == null) {
                subAr.setHijoIzq(nuevo);
            } else {
                subAr.setHijoIzq(insertarAvl(nuevo, subAr.getHijoIzq()));
                if ((getFe(subAr.getHijoIzq()) - getFe(subAr.getHijoDer())) == 2) {
                    if (nuevo.getContacto().getNombre().compareToIgnoreCase(subAr.getHijoIzq().getContacto().getNombre()) < 0) {
                        nuevoPadre = rotacionIzquierda(subAr);
                    } else {
                        nuevoPadre = rotacionDobleIzquierda(subAr);
                    }
                }
            }
        } else if (nuevo.getContacto().getNombre().compareToIgnoreCase(subAr.getContacto().getNombre()) > 0) {
            if (subAr.getHijoDer() == null) {
                subAr.setHijoDer(nuevo);
            } else {
                subAr.setHijoDer(insertarAvl(nuevo, subAr.getHijoDer()));
                if ((getFe(subAr.getHijoDer()) - getFe(subAr.getHijoIzq())) == 2) {
                    if (nuevo.getContacto().getNombre().compareToIgnoreCase(subAr.getContacto().getNombre()) > 0) {
                        nuevoPadre = rotacionDerecha(subAr);
                    } else {
                        nuevoPadre = rotacionDobleDerecha(subAr);
                    }
                }
            }
        } else {
            System.out.println("Nodo Duplicado");
        }

        if ((subAr.getHijoIzq() == null) && (subAr.getHijoDer() != null)) {
            subAr.setFe(subAr.getHijoDer().getFe() + 1);
        } else if ((subAr.getHijoDer() == null) && (subAr.getHijoIzq() != null)) {
            subAr.setFe(subAr.getHijoIzq().getFe() + 1);
        } else {
            subAr.setFe(Math.max(getFe(subAr.getHijoIzq()), getFe(subAr.getHijoDer())) + 1);
        }

        return nuevoPadre;
    }
    /**
     * Insertar un contacto al arbol
     *
     * @param contacto es el contacto a ingresar
     */
    public void insertar(Contacto contacto){
        NodoAvl nuevo = new NodoAvl(contacto, null, null);
        if(raiz == null){
            raiz = nuevo;
        }else{
            raiz=insertarAvl(nuevo, raiz);
        }
                
    }

    /**
     *
     * @param nombre
     * @return true si logra eliminar el contacto, false en caso ocntrario
     */
    public boolean delete(String nombre) { 
        NodoAvl actual = raiz;
        NodoAvl padre = raiz;
        boolean esHijoIzquierdo = true;
        while (!nombre.equals(actual.getContacto().getNombre())){
            padre = actual;
            if (nombre.compareToIgnoreCase(actual.getContacto().getNombre()) < 0){
                esHijoIzquierdo = true;
                actual = actual.getHijoIzq();
            } else{
                esHijoIzquierdo = false;
                actual = actual.getHijoDer();
            }
            if (actual == null){
                return false;              
            }
        } 
        if (actual.getHijoIzq() == null && actual.getHijoDer() == null) {
            if (actual == raiz){
                raiz = null;               
            } else if (esHijoIzquierdo) {
                padre.setHijoIzq(null);   
            } else {
                padre.setHijoDer(null);     
            }
        }else if (actual.getHijoDer() == null) {
            if (actual == raiz) {
                raiz = actual.getHijoIzq();
            } else if (esHijoIzquierdo) {
                padre.setHijoIzq(actual.getHijoIzq());
            } else {
                padre.setHijoDer(actual.getHijoIzq());
            }
        }else if (actual.getHijoIzq() == null) {
            if (actual == raiz) {
                raiz = actual.getHijoDer();
            } else if (esHijoIzquierdo) {
                padre.setHijoIzq(actual.getHijoDer());
            } else {
                padre.setHijoDer(actual.getHijoDer());
            }
        } else{
            NodoAvl sucesor = getSucesor(actual);
            if (actual == raiz) {
                raiz = sucesor;
            } else if (esHijoIzquierdo) {
                padre.setHijoIzq(sucesor);
            } else {
                padre.setHijoDer(sucesor);
            }
            sucesor.setHijoIzq(actual.getHijoIzq());

        }
        return true;                                // success
    }  // fin delete()

    public NodoAvl getSucesor(NodoAvl nodoRempla) {
        NodoAvl reemplazarP = nodoRempla;
        NodoAvl reemplazo = nodoRempla;
        NodoAvl auxiliar = nodoRempla.getHijoDer();

        while (auxiliar != null) {
            reemplazarP = auxiliar;
            reemplazo = auxiliar;
            auxiliar = auxiliar.getHijoIzq();
        }
        if (reemplazo != nodoRempla.getHijoDer()) {
            reemplazarP.setHijoIzq(reemplazo.getHijoDer());

        }
        return reemplazo;
    }

    /**
     * Imprirmir listado de contactos alfabeticamente
     *
     * @param index 1-inOrder 2-preOrder 3-postOrder
     * @return listado de contactos inOrden
     */
    public ArrayList<String> imprimir(int index) {
        ArrayList<String> lista = new ArrayList<>();
        switch (index) {
            case 1:
                inOrder(raiz, lista);
                break;
            case 2:
                preOrder(raiz, lista);
                break;
            case 3:
                postOrder(raiz, lista);
                break;

        }
        return lista;
    }

    /**
     *
     * @param local es el nodo mediante el cual se navega el arbol
     * @param lista es la encargada de guardar dato por dato
     */
    private void inOrder(NodoAvl local, ArrayList<String> lista) {
        if (local != null) {
            inOrder(local.getHijoIzq(), lista);
            lista.add(local.getContacto().getNombre());
            inOrder(local.getHijoDer(), lista);
        }
    }

    public void preOrder(NodoAvl local, ArrayList<String> listaPre) {
        if (local != null) {
            listaPre.add(local.getContacto().getNombre());
            preOrder(local.getHijoIzq(), listaPre);
            preOrder(local.getHijoDer(), listaPre);
        }
    }

    public void postOrder(NodoAvl local, ArrayList<String> listaPost) {
        if (local != null) {
            postOrder(local.getHijoIzq(), listaPost);
            postOrder(local.getHijoDer(), listaPost);
            listaPost.add(local.getContacto().getNombre());
        }
    }

    /**
     * verificar que no exista un contacto ingresado
     *
     * @param nombre informacion del contacto a verificar
     * @return null en caso de no existir y el nombre en caso de que si exista
     * el contacto
     */
    public Contacto buscar(String nombre) {

        NodoAvl actual = raiz;
        if (actual == null) {
            return null;
        } else {
            while (!actual.getContacto().getNombre().equalsIgnoreCase(nombre)) {
                if (nombre.compareToIgnoreCase(actual.getContacto().getNombre()) < 0) {
                    actual = actual.getHijoIzq();
                } else {
                    actual = actual.getHijoDer();
                }
                if (actual == null) {
                    return null;
                }
            }
            return actual.getContacto();

        }
    }

}
