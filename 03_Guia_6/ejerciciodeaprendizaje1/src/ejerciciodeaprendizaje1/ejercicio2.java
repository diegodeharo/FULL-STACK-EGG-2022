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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
        // Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
        String nombre;
        System.out.println("ingrese tu nombre:");
        nombre= teclado.next();
        System.out.println("el nombre es-> "+nombre);
    }
    
}
