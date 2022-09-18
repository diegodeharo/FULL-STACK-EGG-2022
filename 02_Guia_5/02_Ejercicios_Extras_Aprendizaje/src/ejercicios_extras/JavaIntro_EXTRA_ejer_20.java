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
public class JavaIntro_EXTRA_ejer_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        /*
        Crear una función rellene un vector con números aleatorios, pasándole un arreglo por 
        parámetro. Después haremos otra función o procedimiento que imprima el vector.
        */
        
        System.out.println("ingrese el tamaño del vector");
        int n=leer.nextInt();
        int [] vec= new int[n];
        relleno(vec,n);
        mostrar(vec,n);
    }
    public static void relleno(int[] vec, int n){
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("elemento["+(i+1)+"]-> ");
            vec[i]=(int)(Math.random()*100);
            System.out.print(+vec[i]);
            System.out.println("");
        }
        System.out.println("********************************");
    }
    
    public static void mostrar(int[] vec, int n){
        Scanner leer = new Scanner(System.in);
        System.out.println("elementos del vector:");
        for (int i = 0; i < n; i++) {
            System.out.println(" ["+vec[i]+"] ");
        }
    }
    
    
}
