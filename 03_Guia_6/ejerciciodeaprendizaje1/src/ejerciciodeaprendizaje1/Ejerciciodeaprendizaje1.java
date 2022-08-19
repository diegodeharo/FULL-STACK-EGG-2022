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
public class Ejerciciodeaprendizaje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  Escribir un programa que pida dos números enteros por teclado y calcule la suma de los 
        //dos. El programa deberá después mostrar el resultado de la suma
        Scanner teclado= new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("ingrese el numero 1");
        num1= teclado.nextInt();
        System.out.println("ingrese el numero 1");
        num2= teclado.nextInt();
        int suma= num1+num2;
        System.out.println("la suma de los numero es-> "+suma);
    }
    
}
