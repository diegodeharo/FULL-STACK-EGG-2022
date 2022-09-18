/*
Escriba un programa que pida una frase o palabra y 
valide si la primera letra de esa frase es una ‘A’. 
Si la primera letra es una ‘A’, se deberá de imprimir 
un mensaje por pantalla que diga “CORRECTO”, en caso 
contrario, se deberá imprimir “INCORRECTO”. Nota:
investigar la función Substring y equals() de Java.
 */
package ejerciciodeaprendizaje1;

import java.util.Scanner;

/**
 *
 * @author EL_SEMENTAL
 */
public class JavaIntro_ejer_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer= new Scanner (System.in);
         /*
         Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase 
        es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que 
        diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar 
        la función Substring y equals() de Java.
         */
         
         //   A  N  A
         // 0  1  2  
         System.out.println("ingrese la frase o palabra");
         String frase=leer.next();
         String letra= frase.substring(0,1);
         
         if(letra.equalsIgnoreCase("A")){
             System.out.println("CORRECTO");         
         }else{
             System.out.println("INCORRECTO");
         }
         
    }
    
}
