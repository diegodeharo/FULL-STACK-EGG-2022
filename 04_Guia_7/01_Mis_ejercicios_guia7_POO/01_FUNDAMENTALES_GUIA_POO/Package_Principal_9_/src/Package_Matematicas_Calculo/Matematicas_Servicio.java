

package Package_Matematicas_Calculo;

import Package_Matematicas.Matematicas;


public class Matematicas_Servicio {
    
    // Metodos para Calculos
    
    // debo instanciar el objeto de tipo Matematica
    
    Matematicas numeros = new Matematicas();
    
    public double devolverMayor(double num1, double num2){
        
        return Math.max(num2, num1);
        
    }
    
    public double Potencia(double num1, double num2){
        
        return Math.pow(Math.max(Math.round(num2), Math.round(num1) ), Math.min( Math.round(num2), Math.round(num1) ));
        
    }
    
    public double calcularRaiz( double num1, double num2 ){
        
        return Math.sqrt(Math.min(Math.abs( num2 ), Math.abs( num1 ) ) )  ;
        
    }
    
}
