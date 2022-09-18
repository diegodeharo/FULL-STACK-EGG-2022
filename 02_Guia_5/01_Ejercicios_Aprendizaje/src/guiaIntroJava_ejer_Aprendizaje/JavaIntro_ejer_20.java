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
public class JavaIntro_ejer_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        /*
        Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la 
        suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que 
        permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. 
        El programa deberá comprobar que los números introducidos son correctos, es decir, 
        están entre el 1 y el 9.
         */

        //declaramos la matriz_A
        int[][] matriz_a = new int[3][3];
        int[][] matriz_b = new int[3][3];
        int aux;
        //boolean indicador=false;

        //llenedo de matriz_a
        System.out.println("ingrese los elementos de la matriz_A");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.print("elemento[" + (i + 1) + "][" + (j + 1) + "]-> ");
                    matriz_a[i][j] = leer.nextInt();
                    aux = matriz_a[i][j];
                } while (aux < 1 || aux > 9);
            }
            System.out.println("");
        }
        System.out.println("");

        //mostrar matriz_a
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("   " + matriz_a[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        //submetodo estatico de suma de las filas de la matrizA
        matfila(matriz_a);        
        //submetodo estatico de suma de las COLUMNAS de la matrizA
        matcolum(matriz_a);        
        //submetodo estatico de suma de las DIAGONALES de la matrizA
        matdiago(matriz_a);        

        if (matfila(matriz_a) && matcolum(matriz_a) && matdiago(matriz_a)) {
            System.out.println("La Matriz es MAGICA");
        } else {
            System.out.println("La Matriz no es MAGICA");
        }

    }
//******************************************************************************************************************************
    //creamos las funciones que se encargan de sumar cada fila, columna y las dos diagonales para corroborar que es una 
    // matriz magica

    //******************************************************************************************************************************   
    //funcion matfila
    public static boolean matfila(int[][] matriz_a) {
        int suma = 0;
        int aux1 = 0;
        int cont = 0;
        boolean indicador = false;
        /*
         00  01  02  
          1   1   1   -> 3
         10  11  12   
          1   1   1   -> 3
         20  21  22  
          1   1   1   -> 3
        
         */
        //sumamos cada fila
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma = suma + matriz_a[i][j];
            }
            if (i == 0) {
                aux1 = suma;
                suma = 0;
                //System.out.println("aux1->" + aux1);
            } else if (i > 0 && aux1 == suma) {
                cont++;
                suma = 0;
                //System.out.println("contador->" + cont);
                //System.out.println("aux1->" + aux1);
            }
            if (cont == (3 - 1)) {
                indicador = true;
                //System.out.println("indicador->" + indicador);
            }
        }
        return (indicador);
    }
//******************************************************************************************************************************
    //fun matcolum

    public static boolean matcolum(int[][] matriz_a) {
        int suma = 0;
        int aux1 = 0;
        int cont = 0;
        boolean indicador = false;
        /*
         00  01  02  
          1   1   1    
         10  11  12   
          1   1   1    
         20  21  22  
          1   1   1    
          |   |   |  
          3   3   3          
         */
        //sumamos cada columna
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                suma = suma + matriz_a[i][j];
            }
            if (j == 0) {
                aux1 = suma;
                suma = 0;
                // System.out.println("aux1->" + aux1);
            } else if (j > 0 && aux1 == suma) {
                cont++;
                suma = 0;
                //System.out.println("contador->" + cont);
                //System.out.println("aux1->" + aux1);
            }
            if (cont == (3 - 1)) {
                indicador = true;
                //System.out.println("indicador->" + indicador);
            }
        }
        return (indicador);
    }
//******************************************************************************************************************************
    //fun matriz diagonales

    public static boolean matdiago(int[][] matriz_a) {
        int suma = 0;
        int suma1 = 0;
        int cont = 0;
        boolean indicador = false;
        /*
                    3
         00  01  02  
          1   1   1     
         10  11  12  
          1   1   1   
         20  21  22  
          1   1   1   
                    3    
         */
        //sumamos cada diagonal
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    suma = suma + matriz_a[i][j];
                }
                if (i + j == 2) {
                    suma1 = suma1 + matriz_a[i][j];
                }
            }
        }
        if (suma == suma1) {
            indicador = true;
            //System.out.println("indicador->" + indicador);
        }
        return (indicador);
    }
}
