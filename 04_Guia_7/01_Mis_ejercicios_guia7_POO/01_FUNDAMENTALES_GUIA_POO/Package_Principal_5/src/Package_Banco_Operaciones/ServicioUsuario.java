
package Package_Banco_Operaciones;

import Package_Banco.CuentaBancaria_Usuario;
import java.util.Scanner;


public class ServicioUsuario {
    
    // instanciar un objeto CUENTA del tipo CuentaBancaria_Usuario
    CuentaBancaria_Usuario cuenta = new CuentaBancaria_Usuario();
    
    //instanciar un objeto leer. del escanner p/ ingresar los datos por el teclado
    Scanner leer = new Scanner(System.in);
    
    //METODOS DE AYUDA USUARIO
    
    //
    public CuentaBancaria_Usuario datos() {

        System.out.print("Ingrese el Nombre-> ");
        cuenta.setNombre(leer.next());      

        System.out.print("Ingrese el DNI-> ");
        cuenta.setDNI(leer.nextLong());      

        System.out.print("Ingrese el Numero de Cuenta-> ");
        cuenta.setNumerodeCuenta(leer.nextInt());       

        System.out.print("Saldo Actual-> " + cuenta.getSaldoActual());
        System.out.print("\n");

        return cuenta;

    }
    
    //Metodo Ingresar
    public void ingresar(double ingreso){
        
       // System.out.println("ingrese el monto de Dinero->");
        
       // ingreso = leer.nextDouble();
       
       cuenta.setSaldoActual( ingreso + cuenta.getSaldoActual());
       
    }
    
    //Metodo retirar
    public boolean retirar(double retirar) {

        boolean bandera;

        if (retirar > cuenta.getSaldoActual()) {

            bandera = false;

        } else if ((retirar == cuenta.getSaldoActual())) {

            cuenta.setSaldoActual(0);
            bandera = false;

        } else {

            cuenta.setSaldoActual(cuenta.getSaldoActual() - retirar);
            bandera = true;

        }

        return bandera;

    }

    //Metodo extraccion rapida
    public boolean extraccionrapida(double extraccion){
        
        boolean bandera;
        
        //chequea el 20% real de la cuenta
        double calculo = cuenta.getSaldoActual() * 0.2;
        
        if (extraccion > calculo) {
            
            bandera = false;
            
        }else{
            
            bandera = true;
            
        }
        
        return bandera;
        
    }
    
    //Metodo Consultar Saldo
    public double consultarsaldo(){
        
       double saldo = cuenta.getSaldoActual();
        
       return saldo;
    }
    
    //Metodo consultar dato
    
}
