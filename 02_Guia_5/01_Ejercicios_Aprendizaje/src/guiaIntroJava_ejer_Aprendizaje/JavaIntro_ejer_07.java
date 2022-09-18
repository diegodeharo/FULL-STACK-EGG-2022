/*
Crear un programa que pida una frase y si esa frase
es igual a “eureka” el programa pondrá un mensaje de
Correcto, sino mostrará un mensaje de Incorrecto.
Nota: investigar la función equals() en Java.
 */
package ejerciciodeaprendizaje1;

import java.util.Scanner;

/**
 *
 * @author EL_SEMENTAL
 */
public class JavaIntro_ejer_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner (System.in);
        
        /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
        pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar 
        la función equals() en Java.*/
        System.out.println("ingrese la frase");
        String frase = leer.next();
        
        if(frase.equalsIgnoreCase("eureka")){
            System.out.println("las frases son correctas"); 
                 
        }else{
            System.out.println("las frases son incorrectas"); 
        }
    }
    
}
