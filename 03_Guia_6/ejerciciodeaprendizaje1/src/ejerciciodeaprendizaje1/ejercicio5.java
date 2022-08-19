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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner (System.in);
        // Escribir un programa que lea un número entero por teclado y muestre por pantalla el 
        // doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
        
        double num;
        double doble;
        double triple;
        double raiz;
        System.out.println("ingrese el numero");
        num= leer.nextDouble();
        doble= 2*num;
        triple=3*num;
        raiz= Math.sqrt(num);
        System.out.println("el doble de "+num+" es-> "+doble);
        System.out.println("el triple de "+num+" es-> "+triple);
        System.out.println("la raiz de "+num+" es-> "+raiz);
    }
    
}
