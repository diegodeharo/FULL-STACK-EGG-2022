package Package_Molde_Rectangulo;

public class Rectangulo {

    //atributos
    private double base;
    private double altura;

    //METODOS
        
    //Constructores
    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //get & set
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
