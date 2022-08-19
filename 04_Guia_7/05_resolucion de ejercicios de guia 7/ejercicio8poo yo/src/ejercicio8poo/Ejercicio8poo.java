
package ejercicio8poo;

import Entidades.Cadena;
import java.util.Scanner;

/* Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:  */

public class Ejercicio8poo {

   
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      Cadena c1 = new Cadena();
   
        System.out.println("ingrese una frase");
        String frase = leer.nextLine();
        int longitud= frase.length();
        c1.setFrase(frase);
        c1.setLongitud(longitud);
        
        System.out.println("a)la cantidad de vocales de la frase es: "+c1.mostrarVocales() );
        System.out.println("b) la frase invertida queda asi: "+c1.invertirFrase());
        c1.vecesRepetido();
        System.out.println("d) las frases comparadas tienen la misma longitud???: "+c1.compararLongitud());
        System.out.println("e) la frase resultante es: "+c1.unirFrases());
        System.out.println("f) la frase final queda asi:  "+c1.reemplazar());
        System.out.println("g) la frase contiene la letra indicada???: "+c1.contiene());
    }
    
}
