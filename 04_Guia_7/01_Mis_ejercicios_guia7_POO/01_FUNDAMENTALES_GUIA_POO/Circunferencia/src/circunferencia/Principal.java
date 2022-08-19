package circunferencia;

public class Principal {

    public static void main(String[] args) {

        double radio = 0;

        Circunferencia c1 = new Circunferencia();
        c1.Crearcincunferencia();

        System.out.println("El Area es-> " + c1.area(c1.getRadio()));
        System.out.println("");

        System.out.println("El Perimetro es-> " + c1.perimetro(c1.getRadio()));
        System.out.println("");

    }

}
/**
 * este ejercicio esta realizado de la manera de una clase donde se colocan los atributos y metodos 
 * necesarios
 */