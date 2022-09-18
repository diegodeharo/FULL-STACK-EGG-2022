/*
Escribir un programa que lea un número entero
por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().
 */
package ejerciciodeaprendizaje1;

import java.util.Scanner;

/**
 *
 * @author EL_SEMENTAL
 */
public class JavaIntro_ejer_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner (System.in);
        
        double num;
        double doble;
        double triple;
        double raiz;
        
        System.out.println("ingrese el numero");
        num= leer.nextDouble();
        
        doble= 2*num;
        triple=3*num;
        raiz= Math.sqrt(num);
        
        System.out.println("el doble de "+num+" es-> "
                +doble);
        System.out.println("el triple de "+num+" es-> "
                +triple);
        System.out.println("la raiz de "+num+" es-> "
                +raiz);
    }
    
}
