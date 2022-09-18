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
public class JavaIntro_EXTRA_ejer_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        /*
        Escriba un programa que averigüe si dos vectores de N enteros son iguales (la 
        comparación deberá detenerse en cuanto se detecte alguna diferencia entre los 
        elementos).
         */
        System.out.println("ingrese el tamaño de los vectores");
        int n = leer.nextInt();
        int cont = 0;
        int[] vec = new int[n];
        int[] vec2 = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("elementovec[" + (i + 1) + "]-> ");
            vec[i] = leer.nextInt();
            System.out.println("");
        }
        System.out.println("*****************************************");
        for (int i = 0; i < n; i++) {
            System.out.print("elementovec2[" + (i + 1) + "]-> ");
            vec2[i] = leer.nextInt();
            System.out.println("");
        }
        System.out.println("*****************************************");
        for (int i = 0; i < n; i++) {
            if (vec[i] == vec2[i]) {
                cont++;
            }
        }
        System.out.println("*****************************************");

        if (cont == n) {
            System.out.println("los dos vectores son identicos");
        } else {
            System.out.println("disculpe los vectores no coinciden en sus elementos");
        }
    }
}
