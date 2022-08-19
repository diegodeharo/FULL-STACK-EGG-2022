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
public class EJERCICIO_EXTRA_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        /*
        Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño 
        N, con los valores ingresados por el usuario.
         */
        int suma = 0;
        System.out.println("ingresar el tamaño del vector");
        int n = leer.nextInt();
        System.out.println("");
        int[] vec = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("elemnto[" + (i + 1) + "]-> ");
            vec[i] = leer.nextInt();
            suma += vec[i];
            System.out.println("");
        }
        System.out.println("la suma de los elementos del vector es-> " + suma);
        System.out.println("");
    }

}
