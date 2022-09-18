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
public class JavaIntro_EXTRA_ejer_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        /*
        Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida 
        que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de 
        20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que 
        será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras, 
        rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima 
        por pantalla la sopa de letras creada. 
        Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones 
        de Java substring(), Length() y Math.random().
         */

// substring-> funcion para obtener el rango de caracteres de una cadena
        int aux;
        //String[] palabra = new String[20];
        String palabra = null;
        int[][] mat = new int[20][20];
        String[][] letra = new String[20][20];
        System.out.println("Aca comienza la Sopa de Letra para Peques");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                mat[i][j] = (int) (Math.random() * 10);
                letra[i][j] = String.valueOf(mat[i][j]);
                System.out.print("   " + letra[i][j]);
            }
            System.out.println("");
        }
        //llama al sub programa para hacer la comparativa de la palabra y ver si cumple con la longi de las palabras se coloca en 
        //la sopa de letra
        sopaletra(mat,letra);
        
        
    }
    //generamos una funcion donde se coloca el nombre o la palabra de 3 a 5 caracteres

    public static String nombre(String palabra) {
        Scanner leer = new Scanner(System.in);
        String palabras = null;
        int j=0;
        if (j!=20) {
            int i, aux;
        do {
            System.out.println("Ingrese una Palabra entre 3 y 5 caracteres Max");
            palabra = leer.nextLine();
            aux = palabra.length();
            } while (aux < 3 || aux > 5);
            return palabra;
        } else {
            palabra=null;
            return palabra;
        }
    }
    //suprograma donde corrobora si la log de la palabra es correcta, se muestra la matriz modificada, sino, muestra la original
     public static void sopaletra(int[][] mat, String[][] letra) {
        Scanner leer = new Scanner(System.in);
        String palabra = null;
        palabra= nombre(palabra);
        int aux = palabra.length();
        if (palabra.equalsIgnoreCase(null)) {
            System.out.println("La Matriz no sufre Cambios");
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    mat[i][j] = (int) (Math.random() * 10);
                    letra[i][j] = String.valueOf(mat[i][j]);
                    System.out.print("   " + letra[i][j]);
                }
            }
        } else {
            if (aux == 3) {
                SL(mat,letra,palabra);
                System.out.println("la palabra recibida es de 3 caracteres");
            } else {
                SL(mat, letra, palabra);
                System.out.println("la palabra recibida es de 5 caracteres");
            }
        }
    }

    public static void SL(int[][] mat, String[][] letra, String palabra) {
        Scanner leer = new Scanner(System.in);
        int aux = palabra.length();
        int k = 0, m = 1;
        System.out.println("tamaño de palabra-" + aux);
        System.out.println(" palabra-" + palabra);
        System.out.println("");
        System.out.println("Sopa de Letra");
        /*for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                mat[i][j] = (int) (Math.random() * 10);
                if (aux == 3 ) {
                    k++;
                    letra[i][j] = palabra.substring(j, j);
                    System.out.print("   " + letra[i][j]);
                } else if (aux > 3 || aux < 6 ) {
                    m++;
                    letra[i][j] = palabra.substring(j, j);
                    System.out.print("   " + letra[i][j]);
                } else {
                    letra[i][j] = String.valueOf(mat[i][j]);
                    System.out.print("   " + letra[i][j]);
                }*/
    }
    //System.out.println("");
}

//substring()//  ><  //&& k != m  && k != m


