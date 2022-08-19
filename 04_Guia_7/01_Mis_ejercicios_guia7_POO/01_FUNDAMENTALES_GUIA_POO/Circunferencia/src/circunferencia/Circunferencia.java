package circunferencia;

import java.util.Scanner;

public class Circunferencia {

    Scanner leer = new Scanner(System.in);

    //atributos
    private double radio;

    //metodo constructor por parametro
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    //  constructor por defecto
    public Circunferencia() {

    }

    //setter & getter
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //metodo para crear circunferencia
    public void Crearcincunferencia() {
        System.out.print("Ingrese el Radio de la Circunferencia-> ");
        this.radio = leer.nextDouble();
    }

    //metodo area    
    public double area(double radio) {

        double a = Math.PI * (radio * radio);

        return a;

    }

    //metodo perimetro    
    public double perimetro(double radio) {

        double p = 2 * Math.PI * radio;

        return p;

    }

}
