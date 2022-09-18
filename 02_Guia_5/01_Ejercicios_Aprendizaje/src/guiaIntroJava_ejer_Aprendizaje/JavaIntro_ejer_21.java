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
public class JavaIntro_ejer_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        /*
        Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 
        3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida 
        dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que 
        se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una 
        que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de 
        la matriz M en la cual empieza el primer elemento de la submatriz P
         */

        //declaracion de variables globales
        int n = 10;

        int f = 3;

        int[][] mat_a = new int[n][n];
        int[][] mat_b = new int[f][f];
        int[][] mat_rec = new int[f][f];
        //******************************

        //introduzco los elementos de la matriz
        System.out.println("llenado de matriz A de [n][n]");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                //System.out.print("elemento[" + (i + 1) + "][" + (j + 1) + "]->");
                //mat_a[i][j] = (int)(Math.random() * 10);
                mat_a[i][j] = (int) (Math.random() * 100);
                System.out.print("   " + mat_a[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");

        //llenado de la matriz mas chica 
        System.out.println("llenado de matriz B de [f][c]");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < f; j++) {
                System.out.print("elemento[" + (i + 1) + "][" + (j + 1) + "]->");
                //mat_a[i][j] = (int) (Math.random() * 10);
                mat_b[i][j] = leer.nextInt();
                //System.out.println("");
            }
            System.out.println("");
        }

        //llamo submethodos para la realizacion del problema
        mostrarmat(mat_a, mat_b, mat_rec);
        // recorrermat(mat_a,mat_b);
    }
    //*************************************************************
    //submethodos
    //*************************************************************

    //muestra de matrices
    public static void mostrarmat(int[][] mat_a, int[][] mat_b, int[][] mat_rec) {
        Scanner leer = new Scanner(System.in);
        //mostrado de matriz A
        System.out.println(" matriz A de [n][n]");
        int cont;
        for (int i = 0; i <8; i++) {
            for (int j = 0; j <8; j++) {

                if (mat_a[i][j] == mat_b[0][0]) {
                    cont = 0;
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (mat_a[i + k][j + l] == mat_b[k][l]) {
                                cont++;
                                //System.out.print("elementos iguales->" + mat_a[i + k][j + l] + " posicion[" + (i + k) + "][" + (j + l) + "]");
                                System.out.print("  [" + (i + k) + "][" + (j + l) + "]  ");
                                System.out.print(mat_a[i + k][j + l]);
                            }
                        }
                        System.out.println("");
                    }
                    if (cont == 9) {
                        System.out.println("contador-> " + cont);
                        break;
                    }
                }
            }
        }

    }
}
