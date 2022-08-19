

package Package_Banco;

public class CuentaBancaria_Usuario {
    
    //atributos
    
    private String nombre;
    
    private int NumerodeCuenta;
    
    private long DNI;
    
    private double SaldoActual ;
    
    
    //private float Interes;
    
    //METODOS 
    
    //Contructores
    
    //a
     public CuentaBancaria_Usuario() {
    }
     
    //b
    public CuentaBancaria_Usuario( String nombre, int NumerodeCuenta, long DNI, double SaldoActual) {
       
        this.NumerodeCuenta = NumerodeCuenta;
        
        this.DNI = DNI;
        
        this.SaldoActual = SaldoActual;
        
        this.nombre = nombre;
       
    }
    
    //GETTER & SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumerodeCuenta() {
        return NumerodeCuenta;
    }

    public void setNumerodeCuenta(int NumerodeCuenta) {
        this.NumerodeCuenta = NumerodeCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double getSaldoActual() {
        return SaldoActual;
    }

    public void setSaldoActual(double SaldoActual) {
        this.SaldoActual = SaldoActual;
    }
    
    //toString
    @Override
    public String toString() {
        return "CuentaBancaria_Usuario{" + "nombre=" + nombre + ", NumerodeCuenta=" + NumerodeCuenta + ", DNI=" + DNI + ", SaldoActual=" + SaldoActual + '}';
    }
    
}
