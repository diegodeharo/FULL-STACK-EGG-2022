/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author EL_SEMENTAL
 */
public class ejerciio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner (System.in);
        int numero;
        int a=1;
        int contador=0;
        do{
            System.out.println("ingrese el numero "+a+":");
            a++;  
            numero=leer.nextInt();
            //creo un if para determinar que solo ingresen un rango de num
            if(numero<1 || numero >20){
            break;
            }else{           
            System.out.print(numero +"-> ");
             //creo el bucle for bucle de repeticion hasta que se compare la variable con la finalizacion
            for(int i=0;i < numero; i++){
                System.out.print("*");
            }
            }
            System.out.println("");            
            //cuenta la cantidad de num que debe ser max 4
             contador++;
            
        }while ( contador!=4);
    }
    
    /* ejercicio 10-> Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada 
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se 
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las 
vocales acentuadas) se mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación 
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.*/
    
}
