/**
 * este perfil se usa para el calculo o las acciones de los metodos que soliciten
 */
package Calculos_Circunferencia_Pakage;

import Circunferencia_Packege.Circunferencia;
import java.util.Scanner;

public class Calculos_Circunferencia {
    
    Scanner leer = new Scanner(System.in); 
    
    public Circunferencia CargarRadio(){
        
        Circunferencia circunferencia = new Circunferencia();
        
        System.out.print("Ingrese el radio->");
        
        circunferencia.setRadio(leer.nextDouble());
        
        System.out.println("");
        
        return circunferencia;
        
    }
    
    
    public double area(Circunferencia circunferencia){
        
        return Math.PI*Math.pow( circunferencia.getRadio() , 2 );
        
    }
    
     public double perimetro(Circunferencia circunferencia){
        
        return 2 * Math.PI * circunferencia.getRadio();
        
    }
     
}
