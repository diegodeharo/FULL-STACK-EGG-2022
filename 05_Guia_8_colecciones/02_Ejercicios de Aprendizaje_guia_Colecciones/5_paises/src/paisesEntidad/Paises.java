
package paisesEntidad;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author EL_SEMENTAL
 */
public class Paises {
    
//    public String pais ;
//    
//    //creo mi constructor pais
//    public Paises(String pais) {
//        this.pais = pais;
//    }
//    
//    
//    //instancio un objeto scanner
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
//
//    //creo mi conjunto ordenado paises de tipo String
    TreeSet<String> paises = new TreeSet();

    public Paises() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * metodo de ingreso de paises
     */
    public void ingresarPaises() {

        //variable bandera
        String aux = "s";

        do {

            System.out.print("Ingrse el Pais-> ");
           // pais= leer.next();//variable de ingreso de dato
            paises.add(leer.next()) ;// creo mi conjunto paises
            System.out.println("*************************");
            System.out.println("Desea agregar más Paises?");
            System.out.print(" **Op ( S / N ) ** -> ");//variable de opcion de respuesta
            aux = leer.next();
             System.out.println("*************************");
        } while (aux.equalsIgnoreCase("s"));//mientras sea "s" se mantiene en 
        // el bucle.

    }

    /**
     * metodo de muestra de la lista de paises y corroboramos que los que fueron
     * repetidos, de forma automatica se borran y su lugar es ocupádo por el
     * siguiente.
     */
    public void mostrarPaises() {

        /*
        este es un iterator para poder mostrar 
         */
        Iterator it = paises.iterator();//devuelvo un iterator

        System.out.println(paises);

    }
    
    /**
     * metodo de recorrer con el iterator, buscar el pais que el usuario desea
     * eliminar y borrarlo, si dicho pais no se encuentra en la lista, se le
     * informa al usuario que no esta el pais.
     */
    public void eliminarPais() {

        System.out.println("Que Pais desea Eliminar:");
        System.out.print("Selección-> ");
        String selec = leer.next();

        //bandera del while
        String aux = "s";

        do { // desea borrar mas de un pais?

            // bandera
            boolean bandera = false;

            //intancio un iterator
            Iterator<String> it = paises.iterator();//

            while (it.hasNext()) {

                if (it.next().equalsIgnoreCase(selec)) {
                    bandera = true;
                    it.remove();
                }

            }

            //informa si el borrado fue con exito o no.
            if (bandera) {
                System.out.println("Borrado Exitoso");
            } else {
                System.out.println("Diculpe, Pais No encontrade");
            }

            System.out.println("***************************");
            System.out.println("Desea Eliminar otro Pais? ( S / N )");
            System.out.print("Op-> ");
            aux = leer.next();
            System.out.println("***************************");

        } while (aux.equalsIgnoreCase("s"));
        
        //muestro los paises
        mostrarPaises();

    }

    @Override
    public String toString() {
        return "///////////////////////////////"
                + "Pais-> " + paises + "\n";
    }
    
    
}
