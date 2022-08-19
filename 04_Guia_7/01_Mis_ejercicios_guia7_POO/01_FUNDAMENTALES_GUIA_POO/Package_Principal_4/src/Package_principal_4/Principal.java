
package Package_principal_4;

import Package_Calculo.Rectangulo_Calculo;
import Package_Molde_Rectangulo.Rectangulo;

public class Principal {

    public static void main(String[] args) {
        
        //instanciar un objeto del tipo Rectangulo_Calculo para
        //realizar los calculos
        
        Rectangulo_Calculo calculo = new Rectangulo_Calculo();
        
        // instanciar el objeto de tipo Rectangulo donde ser asignaran
        // los atributos pero ya cargados
        
       Rectangulo rectangulo = calculo.datos();
       
       // muestro los resultados
       
        System.out.print("Perimetro-> " + calculo.perimetro(rectangulo));
        System.out.println("");
        
        System.out.print("Superficie-> " + calculo.superficie(rectangulo));
        System.out.println("");
        
        
        //*****************************************************************    
        System.out.println("");
        //*****************************************************************
        System.out.println("Mi rectangulo quedaria:");
        System.out.println("");
        calculo.rectangulo_asteriscos();
        
    }

}
