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
package packServicio;

import java.util.Scanner;
import packCuenta.Cuenta;

public class Servicio_Cuenta {

    // Instancio mi objeto leer de scanner
    Scanner leer = new Scanner(System.in);

    // instancio mi objeto de tipo Cuenta para trabajar sobre los atributos
    Cuenta cuenta = new Cuenta();

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // creo mis metodo para el calculo del ejercicio
    // metodo de bienvenida
    public void bienvenido() {

        System.out.println("**************************");
        System.out.println("******Bienvenido******");
        System.out.println("**************************");

        System.out.print("Ingrese el Nombre del Titular-> ");
        cuenta.setTitular(leer.next());

        int op = 0;

        do {

            System.out.println("/////////////////////////////////////////");
            System.out.println(" Desea Ingresar o Retirar ");
            System.out.println("/////////////////////////////////////////");

            System.out.println("1_) Ingresar \n"
                    + "2_) Retirar\n"
                    + "3_) Salir");

            System.out.print("opcion-> ");

            op = leer.nextInt();

            switch (op) {

                case 1:

                    ingresar();

                    break;

                case 2:

                    retirar();

                    break;

                default:
                    System.out.println("Hata luego");
            }

        } while (op != 3);

    }

    // creo mis metodo para el calculo del ejercicio
    public void ingresar() {

        System.out.print("Desea Agregar dinero a su cuenta? S/N -> ");
        String letra = leer.next();
        letra = letra.toLowerCase();

        if (letra.equalsIgnoreCase("s")) {

            System.out.println("Saldo Actual-> " + cuenta.getCantidad());

            System.out.print("Ingrese la Cantidad a su Cuenta-> ");

            cuenta.setCantidad(leer.nextDouble());

            if (cuenta.getCantidad() > 0) {

                System.out.println("La cantidad ingresada es correcta-> " + cuenta.getCantidad());

            } else {

                System.out.println("Su cantidad ingresa es Menor ");

            }

        } else {

            System.out.println("Gracias, Hasta Luego");

        }

    }

    //   Retirar
    public void retirar() {

        boolean bandera = false;

        System.out.println("Saldo Actual del señor/a " + cuenta.getTitular() + " -> " + cuenta.getCantidad());

        if (cuenta.getCantidad() > 0) {

            do {

                System.out.print("cuanto desea Retirar->");

                double aux = leer.nextInt();

                if (cuenta.getCantidad() < aux) {

                    System.out.println("Disculpe, ingrese un monto menor a " + cuenta.getCantidad());

                    System.out.print("Desea Continuar? S / N -> ");
                    String carac = leer.next();
                    carac = carac.toLowerCase();

                    if (carac.equalsIgnoreCase("n")) {

                        bandera = true;

                    }

                } else if (cuenta.getCantidad() == aux) {

                    cuenta.setCantidad(0);

                    System.out.println("Saldo actual -> " + cuenta.getCantidad());

                    bandera = true;

                } else {

                    cuenta.setCantidad(cuenta.getCantidad() - aux);

                    System.out.println("Su saldo Actual es-> " + cuenta.getCantidad());

                    bandera = true;

                }

            } while (!bandera);

        } else {

            System.out.println(" Disculpe no tiene Saldo Suficiente");

        }

    }

}
