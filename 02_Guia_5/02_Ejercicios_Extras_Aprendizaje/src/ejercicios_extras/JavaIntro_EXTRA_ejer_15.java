/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_extras;

import java.util.Scanner;

/**
 *
 * @author EL_SEMENTAL
 */
public class JavaIntro_EXTRA_ejer_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        /*
        Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, 
        restar, multiplicar y dividir. La aplicación debe tener una función para cada operación 
        matemática y deben devolver sus resultados para imprimirlos en el main. 
         */
        int op;
        System.out.println("ingrese el primer numero");
        int n = leer.nextInt();
        System.out.println("ingrese el segundo numero");
        int m = leer.nextInt();
        do {
            System.out.println("seleccione una opción\n"
                    + "1)Sumar\n"
                    + "2)Restar\n"
                    + "3)Multiplicar\n"
                    + "4)Dividir\n"
                    + "5)Ingresar nuevamente los valore\n"
                    + "6)Salir\n");
            System.out.println("***********************************");
            op = leer.nextInt();
            System.out.println("***********************************");
            switch (op) {
                case 1:
                    System.out.println("La suma de [" + n + "]+[" + m + "] es-> " + sumar(n, m));
                    System.out.println("***********************************");
                    break;
                case 2:
                    System.out.println("La resta de [" + n + "]-[" + m + "] es-> " + restar(n, m));
                    System.out.println("***********************************");
                    break;
                case 3:
                    System.out.println("La multiplicacion de [" + n + "]*[" + m + "] es-> " + multiplicar(n, m));
                    System.out.println("***********************************");
                    break;
                case 4:
                    System.out.println("La division de [" + n + "]/[" + m + "] es-> " + dividir(n, m));
                    System.out.println("***********************************");
                    break;
                case 5:
                    System.out.println("ingrese el primer numero");
                    n = leer.nextInt();
                    System.out.println("ingrese el segundo numero");
                    m = leer.nextInt();
                    break;
                case 6:
                    System.out.println("esta seguro que desea salir? S/N");
                    String letra = leer.next();
                    letra = letra.toLowerCase();
                    if (letra.equalsIgnoreCase("s")) {
                        System.out.println("Hasta Luego");
                    } else {
                        op = 0;
                    }
                    break;
            }
        } while (op != 6);

    }

    public static int sumar(int n, int m) {
        int suma = n + m;
        return suma;
    }

    public static int restar(int n, int m) {
        int resta = n - m;
        return resta;
    }

    public static int multiplicar(int n, int m) {
        int multiplicacion = n * m;
        return multiplicacion;
    }

    public static float dividir(int n, int m) {
        float div = n / m;
        return div;
    }

}
