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
public class ejercicio_extra_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        /*
        Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por 
        debajo de 1.60 mts. y el promedio de estaturas en general.
         */

        System.out.println("Cantidad de Personas");
        double n = leer.nextDouble();
        double suma = 0;
        int cont = 0;
        int cont1 = 0;
        double prom_g = 0;
        double prom = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("ingrese la altura de la persona[" + (i + 1) + "]->");
            double altura = leer.nextDouble();
            System.out.println("");
            suma += altura;
            cont++;
            prom_g = suma / cont;
            if (altura <= 1.60) {
                cont1++;
                prom = suma / cont1;
            }
        }
        System.out.println("cantidad de personas fueron-> " + n);
        System.out.println("promedio general de alturas-> " + prom_g);
        System.out.println("cantidad de personas menores a 1.60mt-> " + cont1);
        System.out.println("promedio de alturas menores a 1.60-> " + prom_g);
        System.out.println("");

    }

}
