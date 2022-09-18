/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_extras;

import java.util.Scanner;

/**
 *
 * @author EL_SEMENTAL
 */
public class JavaIntro_EXTRA_ejer_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
         /*
        Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
        0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. 
        Ejemplo:
        0-0-0
        0-0-1
        0-0-2
        0-0-E
        0-0-4
        0-1-2
        0-1-E
        Nota: investigar función equals() y como convertir números a String.
         */
        String a, b, c, d = "E";
        boolean e = false, f = false, g = false;
        System.out.println("contador ascendente");
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            a = String.valueOf(i);
            for (int j = 0; j < 5; j++) {
                b = String.valueOf(j);
                for (int k = 0; k < 5; k++) {
                    c = String.valueOf(k);
                    if (a.equalsIgnoreCase("3")) {
                        System.out.print("E ");
                    } else {
                        System.out.print(a + "  ");
                    }
                    if (b.equalsIgnoreCase("3")) {
                        System.out.print("E ");
                    } else {
                        System.out.print(b + "  ");
                    }
                    if (c.equalsIgnoreCase("3")) {
                        System.out.print("E ");
                    } else {
                        System.out.print(c + "  ");
                    }
                    System.out.println("");
                }
            }
        }
    }
}
         
     