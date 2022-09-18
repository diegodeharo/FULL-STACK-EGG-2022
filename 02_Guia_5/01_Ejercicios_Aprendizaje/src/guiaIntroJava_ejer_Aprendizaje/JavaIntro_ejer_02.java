/*
 * Escribir un programa que pida tu nombre,
lo guarde en una variable y lo muestre por
pantalla.
 */
package ejerciciodeaprendizaje1;

import java.util.Scanner;

/**
 *
 * @author EL_SEMENTAL
 */
public class JavaIntro_ejer_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        // Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
        String nombre;

        System.out.println("ingrese tu nombre:");
        nombre = teclado.next();

        System.out.println("el nombre es-> " + nombre);
    }

}
