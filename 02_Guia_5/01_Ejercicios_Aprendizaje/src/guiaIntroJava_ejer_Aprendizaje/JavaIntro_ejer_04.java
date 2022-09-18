/*
 *Dada una cantidad de grados centígrados se debe 
mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejerciciodeaprendizaje1;

import java.util.Scanner;

/**
 *
 * @author EL_SEMENTAL
 */
public class JavaIntro_ejer_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        double centigrados;
        double fahre;

        System.out.println("ingrese los grados Centigrados");

        centigrados = leer.nextDouble();
        fahre = 32 + (9 * centigrados / 5);

        System.out.println("en grados Fahrenheit es-> " + fahre);
        System.out.println("en grados centigrados es-> " + centigrados);

    }

}
