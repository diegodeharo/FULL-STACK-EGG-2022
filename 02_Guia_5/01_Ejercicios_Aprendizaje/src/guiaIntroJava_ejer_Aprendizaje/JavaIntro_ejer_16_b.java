/*
Realizar un algoritmo que rellene un vector de 
tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa
mostrará donde se encuentra el numero y si se 
encuentra repetido.
 */
package ejerciciodeaprendizaje1;

import java.util.Scanner;

/**
 *
 * @author EL_SEMENTAL
 */
public class JavaIntro_ejer_16_b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        /*
        Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al 
        usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el 
        numero y si se encuentra repetido
         */

        //ingresamos el tamaño del vector
        System.out.print("ingresar el tamaño del vector-> ");
        int tama;
        int cont = 0;
        tama = leer.nextInt();
        System.out.println("");

        //declaramos y definimos al vector
        int[] vec = new int[tama];
        int[] vector2 = new int[tama];

        for (int i = 0; i < tama; i++) {
            vec[i] = Math.abs((int) (Math.random() * -10));
            System.out.println("el vector es [" + (i + 1) + "]-> " + vec[i]);
        }
        System.out.println("");

        //preguntar que numero desea buscar y mostrar en que posicion se encuentra y si es que esta repetido
        int numero;
        System.out.println("introducir numero a buscar:");
        numero = leer.nextInt();
        for (int i = 0; i < tama; i++) {
            if (numero == vec[i]) {
                cont++;
                vector2[i] = vec[i];
            }
        }
        System.out.print("el numero[" + numero + "] se repite-> " + cont + " veces\n"
                + "se repite en la posicion del vector-> ");
        for (int i = 0; i < tama; i++) {
            if (numero == vec[i]) {
                System.out.print(" [" + (i + 1) + "] ");
            }

        }
        System.out.println("");
    }

}
