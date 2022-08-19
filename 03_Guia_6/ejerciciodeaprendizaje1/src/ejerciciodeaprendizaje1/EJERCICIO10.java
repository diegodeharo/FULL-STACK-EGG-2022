/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodeaprendizaje1;

import java.util.Scanner;

/**
 *
 * @author EL_SEMENTAL
 */
public class EJERCICIO10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        /*
        Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite 
        números al usuario hasta que la suma de los números introducidos supere el límite inicial.
         */

        System.out.println("ingrese el valor limite ");
        int limi = leer.nextInt();
        int suma = 0;
        do {
            System.out.println("ingrese el numero:");
            int num = leer.nextInt();
            suma = suma + num;
        } while (suma <= limi);
        System.out.println("la suma es mayor al limite-> " + suma);
    }

}
