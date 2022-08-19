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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner (System.in);
        
        //Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados  
        //Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        
        double centigrados;
        double fahre;
        System.out.println("ingrese los grados Centigrados");
        centigrados= leer.nextDouble();
        fahre= 32 + (9 * centigrados / 5);
        System.out.println("en grados Fahrenheit es-> "+fahre);
        System.out.println("en grados centigrados es-> "+centigrados);
        
    }
    
}
