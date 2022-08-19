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
public class Ejercicio_extra_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        /*
        Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio 
        de n números (n>0). El valor de n se solicitará al principio del programa y los números 
        serán introducidos por el usuario. Realice dos versiones del programa, una usando el 
        bucle “while” y otra con el bucle “do - while”.
        */
        System.out.println("PRIMER EJEMPLO USANDO EL WHILE");
       int bandera=0;
       int i=0,cont=0,suma=0,max = 0,min=0;
       int numero;
       float prom=0;
        System.out.println("ingrese la cantidad de numeros");
        int n=leer.nextInt();       
            while(cont!=n && n>0){               
                do{
                System.out.print("ingrese el numero["+(i+1)+"]-> ");
                numero = leer.nextInt();
            } while (numero <= 0);
            i++;
            if (i == 1) {
                max = numero;
                min = numero;
            }
            if (max < numero) {
                max = numero;
            }
            if (min > max) {
                min = max;
            }
            cont++;
            suma += numero;
            prom = suma / cont;
            }
            System.out.println("la cantidad de numero ingresados es-> "+n);
            System.out.println("el numero Max es-> "+max);
            System.out.println("el numero MMin es-> "+min);
            System.out.println("el Promedio de todos los numeros es-> "+prom);
                  
    }
    
}
