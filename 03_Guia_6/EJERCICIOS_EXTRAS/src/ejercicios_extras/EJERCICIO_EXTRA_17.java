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
public class EJERCICIO_EXTRA_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        /*
        Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos 
        por parámetro para que nos indique si es o no un número primo, debe devolver true si es 
        primo, sino false.
        Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es 
        primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
        ¿Qué son los números primos?
        Básicamente, un número primo es un número natural que tiene solo dos divisores o 
        factores: 1 y el mismo número. Es decir, es primo aquel número que se puede dividir por 
        uno y por el mismo número.
        El primer número primo es 2, y hay 25 números primos entre 1 y 100, ellos son: 2, 3, 5, 7, 11, 
        13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89 y 97
     */
        int n = 0, contp = 0;
        boolean bandera = false;
        System.out.println("El numero ingresado es Primo?-> " + primos(n, contp, bandera));
        System.out.println("");
    }

    //funcion boleana
    public static boolean primos(int n, int contp, boolean bandera) {
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("ingrese le numero mayor a 1");
            n = leer.nextInt();
        } while (n <= 1);
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                contp++;
            }
        }
        System.out.println("contador->" + contp);
        System.out.println("");
        bandera = contp == 2;
        //System.out.println("el numero["+n+"] es primo");
        //System.out.println("el numero["+n+"] NO es primo");
        return bandera;
    }
}
