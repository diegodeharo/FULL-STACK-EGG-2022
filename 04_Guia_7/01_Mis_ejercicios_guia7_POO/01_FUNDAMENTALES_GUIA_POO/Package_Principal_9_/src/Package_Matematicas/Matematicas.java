
package Package_Matematicas;


public class Matematicas {
    
    // ATRIBUTOS
    
    public double num1;
    public double num2;
    
    // METODOS IMPORTANTES

    //constructor vacio
    public Matematicas() {
    }
    // constructor parametrizado
    public Matematicas(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    // GET & SET
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    
}
