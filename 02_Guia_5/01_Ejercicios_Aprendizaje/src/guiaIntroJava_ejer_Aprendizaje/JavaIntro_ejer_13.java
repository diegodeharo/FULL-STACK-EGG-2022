/*
Dibujar un cuadrado de N elementos por lado 
utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá
dibujar lo siguiente:
 */
package ejerciciodeaprendizaje1;

import java.util.Scanner;

/**
 *
 * @author EL_SEMENTAL
 */
public class JavaIntro_ejer_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner (System.in);
        /*
        Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el 
        cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
        * * * * 
        *     *
        *     *
        * * * *
        */
        
        /*
        00 01 02 03
        10 11 12 13
        20 21 22 23
        30 31 32 33
        */
              System.out.println("ingrese el tamaños de los lados del cuadrado");
        int lado = leer.nextInt();       
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i > 0 && j > 0 && i < lado-1 && j < lado-1) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println("");
        }
        
        
    }
}
