/*
20. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 
formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir
un cuadrado por teclado y determine si este cuadrado
es mágico o no. El programa deberá comprobar que los 
números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package ejerciciodeaprendizaje1;

import java.util.Scanner;

/**
 *
 * @author EL_SEMENTAL
 */
public class JavaIntro_ejer_20_b {

     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //declaro la matriz
        int[][] matriz = new int[3][3];

        //llenar matriz de 3*3
        System.out.println("realizar el llenado de matriz ");
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                matriz[i][j] = leer.nextInt();

            }
            System.out.println("");//reever

        }
        System.out.println("----------------"); //espacio

        //Mostrar matriz
        System.out.println("La matriz es ");
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("   " + matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("--------------");

        //creo las funciones con los argumentos que va a ser (matriz)
        verificacion(matriz);

    }

    public static void verificacion(int[][] matriz) {

        int fila = 0, columna = 0, diagonal = 0;

        //verifico que las sumas sean iguales
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                fila += matriz[0][j]; //sumo cada elemento de la fila
                columna += matriz[i][0]; //suma cada elemento de la columna
                diagonal += matriz[i][i]; //suma cada elementos de las diagonales

            }
        }

        if (fila == columna && columna == diagonal) {
            System.out.println("La matriz es magica ");
        } else {
            System.out.println("La matriz NO es magica ");

        }
    }
}