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
public class Ejercicio_extra_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        /*
        Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de 
        las personas ingresadas por teclado e indique si son mayores o menores de edad. 
        Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
        mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
        */
        String nombre = null;
        int n = 0;
        nombres(nombre, n);
    }

    public static void nombres(String nombre, int n) {
        Scanner leer = new Scanner(System.in);
        String letra;
        int i = 1;
        do {
            System.out.println("*************************************");
            System.out.print("Ingrese el nombre de la persona[" + i + "]-> ");
            nombre = leer.next();
            System.out.println("*************************************");
            System.out.print("Ingrese la edad de la persona[" + i + "]-> ");
            n = leer.nextInt();
            System.out.println("***************************************");
            i++;
            if (n >= 18) {

                System.out.println("el señor/a[" + nombre + "] es mayor de edad");
                System.out.println("*************************************");
            } else {
                System.out.println("el señor/a[" + nombre + "] es menor de edad");
                System.out.println("*************************************");
            }
            System.out.println("desea seguir agregando mas personas? SI/NO");
            letra = leer.next();
            System.out.println("*************************************");
            letra = letra.toLowerCase();
            if (letra.equalsIgnoreCase("no")) {
                System.out.println("gracias,hasta luego");
                System.out.println("*************************************");
            }
        } while (letra.equalsIgnoreCase("si"));
    }
}
