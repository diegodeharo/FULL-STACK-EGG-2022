/*
 Realizar un programa que rellene un matriz de 4 x 4
de valores aleatorios y muestre la traspuesta de la 
matriz. La matriz traspuesta de una matriz A se 
denota por B y se obtiene cambiando sus filas por 
columnas (o viceversa).
 */
package ejerciciodeaprendizaje1;

import java.util.Scanner;

/**
 *
 * @author EL_SEMENTAL
 */
public class JavaIntro_ejer_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        /*
         Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la 
        traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene 
        cambiando sus filas por columnas (o viceversa).
         */

        //declaramos la matriz_A
        int[][] matriz_a = new int[4][4];
        int[][] matriz_b = new int[4][4];

        //llenedo de matriz_a
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz_a[i][j] = (int) (Math.random() * 10);
            }
        }

        //mostrar matriz_a
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + matriz_a[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        //mostrar transpuesta de matriz_a
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print(" " + matriz_a[i][j]);
            }
            System.out.println("");
        }

    }
}
