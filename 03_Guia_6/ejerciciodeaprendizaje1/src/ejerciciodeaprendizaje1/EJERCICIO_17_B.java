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
public class EJERCICIO_17_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        /*         
         Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos 
         de 2 dígitos, etcétera (hasta 5 dígitos).
         */
        //DECLARO EL TAMAÑO DEL VECTOR QUE SE INTRODUCE POR MEDIO DEL USUARIO A TRAVEZ DEL TECLADO
        int n;
        int num1;
        int cont1, cont2, cont3, cont4, cont5, i;
        cont1 = 0;
        cont2 = 0;
        cont3 = 0;
        cont4 = 0;
        cont5 = 0;
        System.out.println("ingrese el tamaño del vector ");
        n = leer.nextInt();
        System.out.println("");
        //DECLARAMOS EL VECTOR CON SU TIPO Y TAMAÑO
        int[] vec = new int[n];
        //RELLENAMOS EL VECTOR
        for (i = 0; i < n; i++) {
            do {
                System.out.print("elemento del vector[" + (i+1) + "]-> ");
                vec[i] = leer.nextInt();
                num1 = vec[i];
                String numCadena = String.valueOf(num1);
                num1 = numCadena.length();
            } while (num1 >= 6);

            if (num1 > 0 && num1 < 6) {
                //comparo cuantos elementos del vector poseen 1 a 5 digitos            
                switch (num1) {
                    case 1:
                        cont1++;
                        break;
                    case 2:
                        cont2++;
                        break;
                    case 3:
                        cont3++;
                        break;
                    case 4:
                        cont4++;
                        break;
                    case 5:
                        cont5++;
                        break;
                }
            } else {
                break;
            }
        }
        System.out.println("");
        System.out.println("Cantidad de elementos del vector-> " + (i));
        System.out.println("elemento de 1 digito-> " + cont1);
        System.out.println("elemento de 2 digito-> " + cont2);
        System.out.println("elemento de 3 digito-> " + cont3);
        System.out.println("elemento de 4 digito-> " + cont4);
        System.out.println("elemento de 5 digito-> " + cont5);
    }
}
