/*
 * Escribir un programa que pida dos números enteros 
por teclado y calcule la suma de los dos. El programa
deberá después mostrar el resultado de la suma
 */
package ejerciciodeaprendizaje1;

import java.util.Scanner;

/**
 *
 * @author EL_SEMENTAL
 */
public class JavaIntro_ejer_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int num1;
        int num2;

        System.out.println("ingrese el numero 1");
        num1 = teclado.nextInt();

        System.out.println("ingrese el numero 1");
        num2 = teclado.nextInt();

        int suma = num1 + num2;

        System.out.println("la suma de los numero"
                + " es-> " + suma);
    }

}
