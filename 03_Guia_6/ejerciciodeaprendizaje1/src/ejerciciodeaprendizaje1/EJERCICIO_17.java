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
public class EJERCICIO_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
         
        /*         
         Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos 
         de 2 dígitos, etcétera (hasta 5 dígitos).
        */
        
        //DECLARO EL TAMAÑO DEL VECTOR QUE SE INTRODUCE POR MEDIO DEL USUARIO A TRAVEZ DEL TECLADO
        int n;
        System.out.println("ingrese el tamaño del vector ");
        n = leer.nextInt();
        System.out.println("");
        //DECLARAMOS EL VECTOR CON SU TIPO Y TAMAÑO
        int[] vec = new int[n];
        //RELLENAMOS EL VECTOR
        for (int i = 0; i < n; i++) {
            System.out.print("elemento del vector["+(i+1)+"]-> ");
            vec[i] = leer.nextInt();
        }
        System.out.println("");
        
        //contamos los digitos de cada elemento del vector
        int num1;
        for (int i = 0; i < n; i++) {
            num1 = vec[i];
            System.out.println("numero->"+num1);
            num1 = num1 % 10000;
            System.out.println("numero->"+num1);
            num1 = num1 % 1000;
            System.out.println("numero->"+num1);
            num1 = num1 % 100;
            System.out.println("numero->"+num1);
            num1 = num1 % 10;
            System.out.println("numero->"+num1);
        }
        System.out.println("");
    }


}
