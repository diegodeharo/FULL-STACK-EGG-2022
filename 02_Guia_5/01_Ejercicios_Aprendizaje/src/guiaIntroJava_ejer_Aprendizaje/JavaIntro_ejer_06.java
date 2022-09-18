/*
 Crear un programa que dado un numero determine
si es par o impar.
 */
package ejerciciodeaprendizaje1;

import java.util.Scanner;

/**
 *
 * @author EL_SEMENTAL
 */
public class JavaIntro_ejer_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        int num;
        System.out.println("ingrese el numero");
        num = leer.nextInt();

        //estructura condicional if
        if (num % 2 == 0) {
            System.out.println("el numero es par");
        } else {
            System.out.println("el numero es impar");
        }

    }

}
