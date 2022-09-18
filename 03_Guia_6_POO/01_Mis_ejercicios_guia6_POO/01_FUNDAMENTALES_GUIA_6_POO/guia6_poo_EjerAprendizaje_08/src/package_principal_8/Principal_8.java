

package package_principal_8;

import Packages_Cadena.Cadena;
import java.util.Scanner;



public class Principal_8 {

   
    
    public static void main(String[] args) {
    
        Cadena cadena = new Cadena();
        Scanner leer = new Scanner(System.in);

        //ingrese la palabra o la cadena de palabra separada por un espacio
        System.out.print("Ingrese la Palabra o Frase -> ");

        cadena.setFrase(leer.nextLine());

        cadena.setLongitud(cadena.getFrase().length());

        System.out.println("La longitud de la Frase es-> " + cadena.getLongitud());

        System.out.println("mostrar vocales-> " + cadena.MostrarVocales(cadena.getFrase(), cadena.getLongitud()));

        System.out.println("");

        System.out.println(" invertir frase-> " + cadena.invertirFrase(cadena.getFrase(), cadena.getLongitud()));

        System.out.println("");

        System.out.print("el caracter se repite -> " + cadena.vecesRepetido() + "\n\n");

        System.out.println("");

        cadena.compararLongitud();

        System.out.println("");

        System.out.println("La frase quedaria-> " + cadena.unirFrase());

        System.out.println("");

        System.out.println(" La nueva Frase quedaria-> " + cadena.reemplazar());

        System.out.println("");

        System.out.println("La frase contiene el caracter-> " + cadena.Contiene());

    }

}
