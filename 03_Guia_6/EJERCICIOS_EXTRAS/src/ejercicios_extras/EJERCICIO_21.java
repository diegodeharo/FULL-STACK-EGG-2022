/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_extras;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author EL_SEMENTAL
 */
public class EJERCICIO_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        /*
        Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el 
        usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
        */
        System.out.println("ingrese el tiempo en minutos");
        double min=leer.nextDouble();
        calculo(min);
        
    }
    public static void calculo(double min){
        
        double hora= min/60;
        double num= (int)(hora/1);
        System.out.println("hora->"+hora);
        System.out.println("num->"+num);
        //si las horas superan las 24, entonces que lo cuente como un dia
        if(num>24){
            double dia = num-24;
            double hora_res=dia;
            
        }
        
       
        
    }
    
}
