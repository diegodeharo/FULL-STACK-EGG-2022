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
public class Ejercicio_extra_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        /*
        Escribir un programa que lea un número entero y devuelva el número de dígitos que 
        componen ese número. Por ejemplo, si introducimos el número 12345, el programa 
        deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador 
        de división. Nota: recordar que las variables de tipo entero truncan los números o 
        resultados.
         */
        int aux, aux1, cont = 0, num = 0;
        do {
            System.out.println("ingrese el numero");
            num = leer.nextInt();
        } while (num <= 0);
        aux1 = (int) num % 10;
        cont++;
        aux = (int) num / 10;
        if (aux == 0 && (aux1 >= 1 && aux <= 9)) {
            System.out.println("");
            System.out.println("cantidad de digitos-> " + cont);
        } else {
            cont++;
            System.out.println("aux1->" + aux1);
            System.out.println("aux->" + aux);
            while (aux != 1) {
                aux = (int) aux / 10;
                System.out.println("aux->" + aux);
                cont++;
            }
            System.out.println("");
            System.out.println("cantidad de digitos-> " + cont);
        }
    }
}
