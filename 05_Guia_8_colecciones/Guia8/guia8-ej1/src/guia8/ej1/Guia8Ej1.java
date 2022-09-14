/*
PRIMERA PARTE (1)

Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.  

SEGUNDA PARTE (2)

Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.  Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada. 
 */
package guia8.ej1;

import entidades.Menuu;
import entidades.Razaa;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.ServicioRaza;

/**
 *
 * @author hGauna
 */
public class Guia8Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Menuu menu = new Menuu();
        ServicioRaza servRaza = new ServicioRaza();
        int inputUser;
        do {
            menu.printMenu();
            inputUser = leer.nextInt();
            if (inputUser == 1) servRaza.agregarMascota(servRaza.crearMascota());
            if (inputUser == 2) servRaza.mostrarRazas(); 
        } while (inputUser != 2);
        System.out.println("Ingrese una raza");
        String inputRaza = leer.next();
        servRaza.iteratorRazas(inputRaza);
        //servRaza.iteratorRazas(leer.next());
    }
}
