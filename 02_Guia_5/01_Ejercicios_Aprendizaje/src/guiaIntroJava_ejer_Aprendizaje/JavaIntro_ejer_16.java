/*
Realizar un algoritmo que rellene un vector de 
tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa
mostrará donde se encuentra el numero y si se 
encuentra repetido.
 */
package ejerciciodeaprendizaje1;

import java.util.Scanner;

/**
 *
 * @author EL_SEMENTAL
 */
public class JavaIntro_ejer_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        /*
        Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al 
        usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el 
        numero y si se encuentra repetido
        */ 
   
        //ingresamos el tamaño del vector
        System.out.print("ingresar el tamaño del vector-> ");
        int tama;
        tama = leer.nextInt();
        System.out.println("");
        
        //declaramos y definimos al vector
        double[] vec = new double[tama];
        
        for (int i=0; i<tama ; i++){
         vec[i]= Math.abs((double)(Math.random() * -10));  
            System.out.println("el vector es ["+(i+1)+"]-> "+vec[i]);
        }
        
       
    }
    
}
