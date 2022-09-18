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
public class JavaIntro_EXTRA_ejer_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        /*
         Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe 
        detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y 
        la cantidad de números impares. Al igual que en el ejercicio anterior los números 
        negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
         */
        System.out.println("ingrese la cantidad de numeros");
        int n = leer.nextInt();
        int numero = 0, cont = 0, cont_p = 0, cont_i = 0;
        if (n > 0) {
            System.out.println("ingrese un numero mayor a cero");
                System.out.println("");
            for (int i = 0; i < n; i++) {                
                do {
                    System.out.print("ingrese el numero[" + (i + 1) + "]-> ");
                    numero = leer.nextInt();
                    System.out.println("");
                } while (numero <= 0);
                cont++;
                if (numero % 2 == 0) {
                    cont_p++;
                } else {
                    cont_i++;
                }
                if (numero % 5 == 0) {
                    break;
                }
            }
        } else {
            System.out.println("disculpe, intente con un numero mayor a cero");
        }
        System.out.println("la cantidad de numero es-> " + n);
        System.out.println("la cantidad de numeros leidos es-> " + cont);
        System.out.println("la cantidad de numeros leidos pares-> " + cont_p);
        System.out.println("la cantidad de numeros leidos impares-> " + cont_i);
        System.out.println("");

    }
}
