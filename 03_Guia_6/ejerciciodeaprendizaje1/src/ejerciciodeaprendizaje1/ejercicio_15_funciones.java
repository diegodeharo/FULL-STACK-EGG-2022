/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodeaprendizaje1;

import java.util.Scanner;

/**
 *
 * @author EL_SEMENTAL
 */
public class ejercicio_15_funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
         Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los 
        muestre por pantalla en orden descendente
        */
        Scanner leer = new Scanner(System.in);
        // variable descendente
        double descendente = 0;
        //creamos el vector
        double[] vector = new double[5];
        double[] vector2 = new double[5];
        llenar_vec( vector,vector2);
       
    }

    public static void llenar_vec(double[] vector, double[] vector2) {
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("vector[" + (i + 1) + "]->");
            vector[i] = leer.nextDouble();
        }
        System.out.println("");
        for (int i = 4; i >= 0; i--) {
            System.out.println("vector[" + (i + 1) + "]-> " + vector[i]);
        }
        System.out.println("");
    }
}
