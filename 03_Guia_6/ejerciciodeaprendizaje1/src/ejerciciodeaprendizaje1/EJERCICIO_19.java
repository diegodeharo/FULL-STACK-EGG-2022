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
public class EJERCICIO_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
         
        /*
        Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una 
        matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de 
        signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se 
        denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
        */
        
        System.out.println("PARA TENER EN CUENTA:\n"
                + "Una Matriz es ANTI SIMETRICA SI\n"
                + "1) la matriz A es cuadrada\n"
                + "2) la Diagonal principal es nula\n"
                + "3) la matriz A es igual a la matriz transpuesta opuesta, osea\n"
                + "     A= -AT");
        System.out.println("");
        System.out.println("");

        //declaramos varibles 
        int cont = 0;
        int cont2 = 0;
        // supondremos que la matriz es cuadrada
        System.out.print("ingrese el tamaño de la matriz-> ");
        int n = leer.nextInt();
        int m = n;
        System.out.println("");

        //declaramos la matriz_A
        int[][] matriz_a = new int[n][m];
        int[][] matriz_b = new int[n][m];

        //llenado de matriz_a en conjunto con la matriz_B
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("elemento[" + (i + 1) + "][" + (j + 1) + "]-> ");
                matriz_a[i][j] = leer.nextInt();
                matriz_b[i][j] = matriz_a[i][j];
            }
            System.out.println("********************");
        }
        System.out.println("");

        //mostrar matriz_a
        System.out.println("La matriz_A es :");
        System.out.println("");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("   " + matriz_a[i][j]);
            }
            System.out.println("");
        }

        //verificamos que la diagonal principal sea nula
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    if (matriz_a[i][j] == 0) {
                        cont++;
                    }
                }
            }
        }
        System.out.println("");
        System.out.println("");
        
        //si la diagonal es nula continuo
        if (cont == n) {
            System.out.println("**su diagonal Principal es NULA**");
            System.out.println("");
            System.out.println("La Transpuesta de matriz_A es :");
            System.out.println("");
            //mostrar transpuesta de matriz_a            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print("   " + matriz_b[j][i]);
                }
                System.out.println("");
            }
            System.out.println("");
            System.out.println("La Transpuesta opuesta de matriz_A es :");
            System.out.println("");

            //mostrar transpuesta de matriz_a
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print("   " + matriz_b[j][i] * -1);
                }
                System.out.println("");
            }
            System.out.println("");
            System.out.println("");

            //analizamos si la Matriz_A es igual a la Matriz transpuesta opuesta de A
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (matriz_a[i][j] == (matriz_b[j][i] * -1)) {
                        cont2++;
                    }
                }
            }
            //System.out.println("contador2->" + cont2);
            System.out.println("");

            //comparamos que los elementos de la matriz_a sea igual a los elementos de la transpuesta opuesta de A
            if (cont2 == (n * m)) {
                System.out.println("la matriz cumple con todas las condiciones para ser una ANTI-SIMETRICA");
            } else {
                System.out.println("disculpe, no es ANTI-SIMETRICA los elementos no coinciden");
                System.out.println("");
            }

        } else {
            System.out.println("No es una matriz antisimetrica ya que su diagonal no es NULA");
            System.out.println("");
        }

    }
}
