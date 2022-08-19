

package package_principal_5;

import Package_Banco.CuentaBancaria_Usuario;
import Package_Banco_Operaciones.ServicioUsuario;
import java.util.Scanner;


public class Principal {

    
    public static void main(String[] args) {
        
         //instanciar el objeto leer del tipo Scanner
        Scanner leer = new Scanner(System.in);
        
        //intanciar un objeto usuario de tipo servicio usuario
        ServicioUsuario usuario = new ServicioUsuario();
        
        //cargamos los atributos con los datos al objeto
        //"cuenta" del tipo cuenta bancaria usuario
        CuentaBancaria_Usuario cuenta = usuario.datos();
        
        System.out.println("*****************************************************************");
        
        System.out.println("");
       
        //realizaremos un menu de acuerdo a la opcion ingresada
        //por el usuario 
        //variables
        int op ;
        boolean aux ;
        
        System.out.println("Cuenta Bancaria");
        System.out.println("Seleccione una opción:\n\n"
                + "1)Ingrese Dinero\n"
                + "2)Retirar Dinero\n"
                + "3)Extraccion Rapida\n"
                + "4)Colsultar Saldo\n"
                + "5)Consultar Datos\n"
                + "6)Salir");
        
        System.out.println("");
        
        do {
            
            System.out.println("*****************************************************************");
            System.out.print("Opción-> ");
            op = leer.nextInt();
            System.out.println("");

            if (op > 0 && op <= 6) {  
            
            switch (op) {

                case 1:
                    
                    System.out.println("Su Saldo Actual es-> " + cuenta.getSaldoActual());
                    System.out.print("\n");

                    System.out.print("Ingrese el monto de DInero-> ");
                    usuario.ingresar(leer.nextDouble());
                    
                    System.out.print("Su Saldo Actualizado es-> " + cuenta.getSaldoActual());
                    System.out.print("\n");
                    
                    op = 0;

                    break;

                case 2:
                
                    System.out.print("Su Saldo Actual es-> " + cuenta.getSaldoActual());
                    System.out.print("\n");

                    if (cuenta.getSaldoActual() != 0) {

                        System.out.print("Ingrese el monto de DInero a Retirar-> ");
                        
                         aux = usuario.retirar(leer.nextDouble());

                        if ( aux ) {

                            System.out.println("Su Saldo Actualizado es-> " + cuenta.getSaldoActual());

                        } else if  ( !aux && cuenta.getSaldoActual()!=0 ) {
                            
                            System.out.println("disculpe, ingrese un monto menor.");

                        }else{
                            
                             System.out.println("Su Saldo Actualizado es-> " + cuenta.getSaldoActual());
                            
                        }

                    }else{
                        
                         System.out.println("disculpe, no tiene saldo.");
                        
                    }
                    
                    System.out.print("\n");
                   
                    op = 0;

                    break;

                case 3:
                    
                    System.out.println("Solo puede extraer el 20% de su saldo");
                    
                    System.out.println("desea continuar: S/N");
                    
                    String letra = leer.next();
                    letra = letra.toLowerCase();
                    
                    if (letra.equalsIgnoreCase("s")) {
                        
                        System.out.print("Cuanto desea Extraer->");
                        
                        boolean aux2 = usuario.extraccionrapida(leer.nextDouble());
                        
                        if (aux2) {
                            
                            System.out.print("Su Saldo Actualizado es-> " + cuenta.getSaldoActual());
                            
                        } else {
                            
                            System.out.println(" su extraccion excede el maximo");
                            System.out.print("Su Saldo  es-> " + cuenta.getSaldoActual());
                            
                        }                        
                    }
                    System.out.println("");
                    break;

                case 4:
                    
                    System.out.println("su saldo es-> " + usuario.consultarsaldo());
                    
                    break;

                case 5:
                    
                    System.out.println("Datos usuario-> " + cuenta);
                    
                    break;
            }
            
            }else {
                System.out.println("Introduzca una Opción Válida");
            }

        } while (op != 6);
        
    }
    
}


//metodo para limpiar pantalla

/**
 * System.out.println("\033[H\033[2J");
        System.out.flush( );    
       
 */