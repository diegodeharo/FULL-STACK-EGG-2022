/*
Crea una aplicación que a través de una función nos
convierta una cantidad de euros introducida por
teclado a otra moneda, estas pueden ser a dólares,
yenes o libras. La función tendrá como parámetros, 
la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará
un mensaje indicando el cambio (void).
 */
package ejerciciodeaprendizaje1;

import java.util.Scanner;

/**
 *
 * @author EL_SEMENTAL
 */
public class JavaIntro_ejer_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        /*
         Crea una aplicación que a través de una función nos convierta una cantidad de euros 
        introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La 
        función tendrá como parámetros, la cantidad de euros y la moneda a converir que será 
        una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 
        (void).
        El cambio de divisas es:
         * 0.86 libras es un 1 €
         * 1.28611 $ es un 1 €
         * 129.852 yenes es un 1 €
         */
        String respuesta = "n";
        String moneda;
        double euro = 0;
        int op = 0;
        do {
            System.out.println("Elija a que moneda desea Convertir:\n"
                    + "1)dolar\n"
                    + "2)libra\n"
                    + "3)yen\n"
                    + "4)salir\n");
            op = leer.nextInt();
            if (op > 0 && op < 5) {
                if (op != 4) {
                    System.out.print("Ingrese la cantidad de euros a convertir: € ");
                    euro = leer.nextInt();
                    System.out.println("");
                }
            } else {
                System.out.println("disculpe, opción incorrecta, intente nuevamente");
                System.out.println("");
                continue;
            }

            switch (op) {
                case 1:
                    moneda = "dolar";
                    dolares(euro, moneda);
                    break;
                case 2:
                    moneda = "libra";
                    libras(euro, moneda);
                    break;
                case 3:
                    moneda = "yen";
                    yenes(euro, moneda);
                    break;
                case 4:
                    System.out.println("Esta seguro que desea salir? S/N");
                    respuesta = leer.next();
                    respuesta = respuesta.toLowerCase();

                    if (respuesta.equalsIgnoreCase("s")) {
                        System.out.println("Hasta Luego");
                        break;

                    } else {
                        System.out.println("siga nomas");
                    }
            }
        } while (respuesta.equals("n"));
    }
//**********************FUNCIONES********************************************
//******************************************************************

    public static void dolares(double euro, String moneda) {
        System.out.println("1.28611 $ es un 1 €");
        System.out.println("");
        double dol = 1.28611 * euro;
        System.out.println("Cantidad en Dolares es->$$ " + dol);
        System.out.println("");
    }

    public static void libras(double euro, String moneda) {
        System.out.println("0.86 libras es un 1 €");
        System.out.println("");
        double lib = 0.86 * euro;
        System.out.println("Cantidad en Libras es-> £" + lib);
        System.out.println("");
    }

    public static void yenes(double euro, String moneda) {
        System.out.println("129.852 yenes es un 1 €");
        System.out.println("");
        double ye = 129.852 * euro;
        System.out.println("Cantidad en yenes es-> ¥" + ye);
        System.out.println("");
    }
}
