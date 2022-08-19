
package Entidades;

import java.util.Scanner;
/* Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:  */

public class Cadena {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    
    private String frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
 /* a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.*/    
    public int mostrarVocales() {
        int cont = 0;
        
        for (int i = 0; i < frase.length(); i++) {
            
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
                
                cont++;
                
            }

        }
        return cont;
    }
    
 /*b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac". */    
    
    public String invertirFrase() {
        String invertida = "";

        for (int i = frase.length() - 1; i >= 0; i--) {
            invertida += frase.charAt(i);
        }
        return invertida;
    }
/* c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:  */          
    public int vecesRepetido() {
        System.out.println("ingrese un caracter");
        String letra = leer.next();
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra.charAt(0)) {
                cont++;
            }
        }
        System.out.println("c) la letra ingresada se repite " + cont + " veces");
        return cont;
    }
/* d) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario. */  
    public boolean compararLongitud() {
        String fraseNueva = "";
        System.out.println("ingrese la frase a comparar");
        fraseNueva = leer.next();
        if (frase.length() == fraseNueva.length()) {
            return true;
        } else {
            return false;
        }

    }

/* e) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante*/
    public String unirFrases() {
        String frase2 = "";
        System.out.println("ingrese una frase nueva");
        frase2 = leer.next();
        return frase.concat(frase2);

    }
    
 /* f) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante. */
    public String reemplazar() {

        String stringWithRandomChars = frase;
        String fraseFinal = stringWithRandomChars.replace('a', '*');

        return fraseFinal;
    }
    
/* g)  Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.  */    
    
    public boolean contiene() {
        String letra = "";
        System.out.println("ingrese una letra");
        letra = leer.next();
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra.charAt(0)) {
                return true;
            }
        }
        return false;
    }
}
