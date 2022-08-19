package circunferencia2;

import Calculos_Circunferencia_Pakage.Calculos_Circunferencia;

import Circunferencia_Packege.Circunferencia;

public class Principal {
    
    public static void main(String[] args) {
        
        Calculos_Circunferencia calculo = new Calculos_Circunferencia();

        Circunferencia circunferencia = calculo.CargarRadio();

        double area = calculo.area(circunferencia);
        double perimetro = calculo.perimetro(circunferencia);

        System.out.println("area-> " + area);
        System.out.println("perimetro-> " + perimetro);

        System.out.println("area-> " + calculo.area(circunferencia));
        System.out.println("perimetro-> " + calculo.perimetro(circunferencia));
    }

}
/**
 * ESTE EJERCICIO SE REALIZARA CON PAQUETE DE ENTIDAD Y PAQUETE DE SERVICIO PARA
 * DEJAR UN MEJOR ORDEN EN LA PROGRAMACIÓN
 * 
 */
