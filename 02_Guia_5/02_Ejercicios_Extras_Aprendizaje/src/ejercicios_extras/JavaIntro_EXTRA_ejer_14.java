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
public class JavaIntro_EXTRA_ejer_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        /*
        Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de 
        hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad 
        de hijos para averiguar la media de edad de los hijos de todas las familias
         */
        System.out.println("ingrese el numero de familias");
        int n, m, cont = 0, edad;
        float suma = 0, prom = 0;
        n = leer.nextInt();
        System.out.println("");
        int[] familia = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Familia[" + (i + 1) + "]");
            System.out.print("ingrese el numero de hijos-> ");
            m = leer.nextInt();
            System.out.println("");
            for (int j = 0; j < m; j++) {
                System.out.print("edad del hijo [" + (j + 1) + "]-> ");
                cont++;
                edad = leer.nextInt();
                suma += edad;
                prom = suma / cont;
            }
            System.out.println("**************************************");
        }
        System.out.println("");
        System.out.println("El Promedio de Edades de todas las Familias es-> " + prom);
        System.out.println("");
    }

}
