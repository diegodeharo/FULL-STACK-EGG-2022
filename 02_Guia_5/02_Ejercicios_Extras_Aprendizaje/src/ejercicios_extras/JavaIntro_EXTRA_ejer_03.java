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
public class JavaIntro_EXTRA_ejer_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        /*
        Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
        Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String
        */
        
        System.out.println("Ingrese el Caracter:");
        System.out.print("Carac: ");
        String caracter = leer.next();
        
        if (caracter.equalsIgnoreCase("a")||caracter.equalsIgnoreCase("e")
                ||caracter.equalsIgnoreCase("i")||caracter.equalsIgnoreCase("o")
                ||caracter.equalsIgnoreCase("u")) {
            
            System.out.println("El Caracter "+caracter+" es una vocal");
            
        }else{
            System.out.println("Disculpe, no es Vocal");
        }

    }  
    
}
