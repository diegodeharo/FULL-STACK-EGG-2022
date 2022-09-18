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
public class JavaIntro_EXTRA_ejer_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        /*
        Simular la división usando solamente restas. Dados dos números enteros mayores que 
        uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método: 
        Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este 
        resultado es el residuo, y el número de restas realizadas es el cociente. 
        Por ejemplo: 50 / 13:
        50 – 13 = 37 una resta realizada 
        37 – 13 = 24 dos restas realizadas 
        24 – 13 = 11 tres restas realizadas 
        dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
        ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
         */

        //seran aceptados los numeros, siempre que sean mayores de uno
        boolean bandera;
        int dividendo = 0, divisor = 0, cont = 0, aux = 0;
        do {
            System.out.println("ingrese el primer numero");
            dividendo = leer.nextInt();
            System.out.println("ingrese el segundo numero");
            divisor = leer.nextInt();
            bandera = dividendo >= 1 && divisor >= 1 && dividendo > divisor;
        } while (bandera != true);
        System.out.println("La division con resta sucesiva quedaria\n"
                + dividendo + "/" + divisor);
        System.out.println("");
        do {
            cont++;
            if (cont == 1) {
                aux = dividendo - divisor;
            } else {
                aux = aux - divisor;
            }
        } while (aux > divisor);
        System.out.println("el residuo es-> " + aux);
        System.out.println("el conciente es-> " + cont);
        System.out.println("");
    }
}
