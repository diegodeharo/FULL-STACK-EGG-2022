/*
Realizar un programa que simule el funcionamiento de un
dispositivo RS232, este tipo de dispositivo lee
cadenas enviadas por el usuario. Las cadenas deben
llegar con un formato fijo: tienen que ser de un 
máximo de 5 caracteres de largo, el primer carácter 
tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se 
consideran correctas, la secuencia especial 
“&&&&&” marca el final de los envíos (llamémosla FDE),
y toda secuencia distinta de FDE, que no respete el 
formato se considera incorrecta. Al finalizar el 
proceso, se imprime un informe indicando la cantidad 
de lecturas correctas e incorrectas recibidas. Para
resolver el ejercicio deberá investigar cómo se 
utilizan las siguientes funciones de Java Substring(),
Length(), equals().
 */
package ejerciciodeaprendizaje1;

import java.util.Scanner;

/**
 *
 * @author EL_SEMENTAL
 */
public class JavaIntro_ejer_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        /*
        Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de 
        dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato 
        fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser 
        X y el último tiene que ser una O. 
        Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
        especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta 
        de FDE, que no respete el formato se considera incorrecta. 
        Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e 
        incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las 
        siguientes funciones de Java Substring(), Length(), equals()
         */
        int cont_c = 0;
        int cont_i = 0;
        int longi;
        String cadena;
        do {
            System.out.println("ingrese la cadena del protocolo");
            cadena = leer.next();
            longi = cadena.length();
            String letra_ini = cadena.substring(0, 1);
            String letra_fin = cadena.substring(longi - 1);
            if (longi <= 5 && letra_ini.equalsIgnoreCase("x") && letra_fin.equalsIgnoreCase("O")) {
                cont_c++;
            } else if (cadena.equalsIgnoreCase("&&&&&")) {
                break;
            } else {
                cont_i++;
            }
        } while (0 != cadena.compareTo("&&&&&"));

        System.out.println("fin de trama");
        System.out.println("correctas->" + cont_c);
        System.out.println("incorrectas->" + cont_i);
    }
}
