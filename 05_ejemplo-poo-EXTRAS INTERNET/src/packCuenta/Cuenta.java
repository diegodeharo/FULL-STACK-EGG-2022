/**
 * 1) Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad (puede tener decimales).
 *
 * El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior.
 *
 * Crea sus métodos get, set y toString.
 *
 * Tendrá dos métodos especiales:
 *
 * ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
 * retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa,
 * la cantidad de la cuenta pasa a ser 0.
 *
 *
 */
package packCuenta;

public class Cuenta {
    
    // atributos
     
    private String titular;
    private double cantidad;
    
    
    // METODOS IMPORTANTES

    //constructor por defecto
    public Cuenta() {
    }

    
    // contructor parametrizado
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }
    
    // GET & SET

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    // TO STRING

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
    
    
    
    

}
