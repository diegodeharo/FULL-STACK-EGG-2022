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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
       // Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda 
        //en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
        
        String frase;
        System.out.println("ingrese la frase");
        frase= teclado.nextLine();//el nextLine me sirve para una cadena de palabras, en cambio si solo coloco el next() me toma una palabra y no una 
                                  //cadena de palabras  
        
        System.out.println("mayuscula-> "+frase.toUpperCase());
        System.out.println("Minuscula-> "+frase.toLowerCase());    }
    
}
