/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_extras;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author EL_SEMENTAL
 */
public class JavaIntro_EXTRA_ejer_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Random num= new Random();
        
        /*
        Realice un programa para que el usuario adivine el resultado de una multiplicación entre 
        dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario 
        si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir 
        al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como 
        utilizar la función Math.random() de Java.
         */
        int azar, azar2, multi, result;
        do {
            System.out.println("adivina cual es el resultado de dos numero enteros mayores a cero");
            System.out.println("");
            azar = num.nextInt(10);
            azar2 = num.nextInt(10);
            multi = azar * azar2;
            System.out.println("resultado-> "+multi);
            System.out.println("adivida el resultado");
            result = leer.nextInt();            
            if (result == multi) {
                System.out.println("acertaste");
            } else {
                System.out.println("disculpa, intentalo de nuevo");
            }
        } while (result != multi);
        System.out.println("el resultado de la multiplicacion es-> " + multi);
    }
}
