
package Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Johana
 */
public class ServiceMascota {

    Scanner leer = new Scanner(System.in);
    ArrayList<String> razas = new ArrayList();

    /**
     *  Metodo de inicializacion del programa
     */
    public void inicializar() {

        guardarRaza();
        listarRazas();
        removerConIterator();

    }

    /**
     * Guardando la raza de los perros introducidos por teclado
     */
    private void guardarRaza() {

        boolean ejecutar = true;

        while (ejecutar) {

            System.out.println("Ingrese raza de los perros ");
            razas.add(leer.next());
            System.out.println("¿Desea seguir agregando? y/n");
            ejecutar = leer.next().equalsIgnoreCase("y");

        }
        System.out.println("***************************");
    }

    /**
     * Listando las razas mendiante un foreach
     */
    private void listarRazas() {

        for (String raza : razas) {

            System.out.println(raza);

        }

    }

    /**
     * Removiendo la raza del perro introduciendolo por teclado
     */
    private void removerConIterator() {

        System.out.println("Ingrese la raza de perro a eliminar");
        String aEliminar = leer.next();

        Iterator<String> it = razas.iterator();

        while (it.hasNext()) {

            if (aEliminar.equalsIgnoreCase(it.next())) {

                it.remove();
            }

        }

        mostrarListaOrdenada();

    }

    /**
     * Mostrar por pantalla la lista de razas de forma ordenada
     */
    private void mostrarListaOrdenada() {

        Collections.sort(razas);

        listarRazas();

    }

}
