 

package Pacakage_Puntos_Servicios;

import Package_Puntos.Puntos;
import java.util.Scanner;

 
public class Puntos_Servicios {
    
    Scanner leer = new Scanner(System.in);
    
    Puntos puntos = new Puntos();
    
    // Metodos de Calculos
    public Puntos crearPuntos(){
        
        System.out.println("********************************************");

        System.out.println("ingrese los Puntos X : ");

        System.out.println("********************************************");

        System.out.print("x_1 -> ");
        puntos.setX1(leer.nextInt());
        System.out.println("--------------------------------------------------------");
        System.out.print("x_2 -> ");
        puntos.setX2(leer.nextInt());

        System.out.println("********************************************");

        System.out.println("********************************************");

        System.out.println("ingrese los Puntos Y : ");

        System.out.println("********************************************");

        System.out.print("Y_1 -> ");
        puntos.setY1(leer.nextInt());
        System.out.println("--------------------------------------------------------");
        System.out.print("Y_2 -> ");
        puntos.setY2(leer.nextInt());
        System.out.println("********************************************");

        return puntos;
        
    }
    
    public double Calcular(  ){
        
       return Math.sqrt( ( Math.pow( ( puntos.getX2() - puntos.getX1() ), 2) ) +  ( Math.pow( ( puntos.getY2() - puntos.getY1() ), 2) ) );
    }
    
    
}
