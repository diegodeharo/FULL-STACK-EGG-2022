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
public class EJERCICIO_EXTRA_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        /*
        Crear un programa que dibuje una escalera de números, donde cada línea de números 
        comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al 
        usuario al comenzar. Ejemplo: si se ingresa el número 3: 
        1
        12
        123

         */

        //se pide la altura de la escalera de numeros
        int n;
        boolean bandera;
        do {
            System.out.println("ingrese el tamaño de la escalera");
            n = leer.nextInt();
            bandera = n > 0;
        } while (!bandera);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" "+j);
            }
            System.out.println("");
        }
    }
}
