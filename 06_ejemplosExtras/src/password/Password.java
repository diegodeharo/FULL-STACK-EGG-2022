/**
 *  Haz una clase llamada Password que siga las siguientes condiciones:
 *
 * Que tenga los atributos longitud y contraseña . Por defecto, la longitud sera de 8.
 * Los constructores serán los siguiente:
 * Un constructor por defecto.
 * Un constructor con la longitud que nosotros le pasemos. Generara una contraseña aleatoria con esa longitud.
 *
 * Los métodos que implementa serán:
 *
 * Método get para contraseña y longitud.
 *
 * Método set para longitud.
 *
 * esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener mas de 2 mayúsculas,
 * mas de 1 minúscula y mas de 5 números.
 *
 * generarPassword():  genera la contraseña del objeto con la longitud que tenga.
 *
 *
 *
 * Ahora, crea una clase clase ejecutable:
 *
 * Crea un array de Passwords con el tamaño que tu le indiques por teclado.
 * Crea un bucle que cree un objeto para cada posición del array.
 * Indica también por teclado la longitud de los Passwords (antes de bucle).
 * Crea otro array de booleanos donde se almacene si el password del array de Password es o no fuerte
 * (usa el bucle anterior).
 * Al final, muestra la contraseña y si es o no fuerte (usa el bucle anterior). Usa este simple formato:
 * contraseña1 valor_booleano1
 *
 * contraseña2 valor_bololeano2
 */
package password;

import java.util.Scanner;

public class Password {

    Scanner leer = new Scanner(System.in);

    // Atributos    
    private int longitud = 8;
    private String contrasenia;
    private String usuario;
    private boolean fuerte;

    // Metodos importantes
    // constructor por defecto
    public Password() {
    }

    // Constructor parametrizado
    public Password(int longitud, String contrasenia, String usuario, boolean fuerte) {

        this.longitud = longitud;
        this.contrasenia = contrasenia;
        this.usuario = usuario;
        this.fuerte = fuerte;

    }

    // Get & Set
    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public boolean isFuerte() {
        return fuerte;
    }

    public void setFuerte(boolean fuerte) {
        this.fuerte = fuerte;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // metodo de comparacion con un vector para mayuscula minus y numeros
    public String comparativa(String dato) {

        // creo un vector con el abecedario en mayuscula
        String[] abc = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        for (int i = 0; i < abc.length; i++) { //Mayus

            if (dato.equals(abc[i])) {

                return abc[i];
            }

        }

        return null;
    }

    public String comparativa2(String dato) {

        // vector minuscula
        String[] abcminus = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for (int i = 0; i < abcminus.length; i++) { //minus

            if (dato.equals(abcminus[i])) {

                return abcminus[i];
            }

        }

        return null;
    }

    // vector numeros
    public String comparativa3(String dato) {

        String[] number = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        for (int i = 0; i < number.length; i++) { //number

            if (dato.equals(number[i])) {

                return number[i];
            }

        }

        return null;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *
     *
     *
     *
     *
     *
     *
     *
     */
//    // metodo referenica contraseña
//    public void crearContraseña(){
//        
//        System.out.print("Ingrese el Usuario-> ");
//         usuario = leer.next();
//         
//        System.out.print("Ingrese la Contraseña-> ");
//         contrasenia = leer.next();
//         System.out.println("");
//         
//    }
//    
    // metodo generarPassword
    public void generarPassword() {

        System.out.println("********************************************************");
        System.out.println("Ingrese la Contraseña");
        System.out.println("la misma debe tener un max de 8 caracteres entre mayusculas, minusculas y números");
        System.out.println("********************************************************");

        do {

            System.out.println("///////////////////////////////////////");
            System.out.print("USUARIO-> ");
            usuario = leer.next();
            System.out.print("CONTRASEÑA-> ");
            contrasenia = leer.next();
            System.out.println("///////////////////////////////////////");

            if (contrasenia.length() > 8) {

                System.out.println("----------------------------------------------");
                System.out.println("Disculpe, excedió el tamaño de la contraseña, ingresela nuevamente");
                System.out.println("----------------------------------------------");

            } else {

                System.out.println("+++++++++++++++++++++++++");
                System.out.println("Gracias");
                System.out.println("+++++++++++++++++++++++++");
            }

        } while (contrasenia.length() != 8);

    }

    //Metodo esFuerte
    public boolean esFuerte() {

        //boolean fuerte = false; // este es el valor de retorno principal que me informa si es o no una contraseña fuerte.
        boolean bandera1 = false, bandera2 = false, bandera3 = false; // creo 4 banderas booleanas que me permiten saber si es cierto o no que cada parte de la contraseña es correcta para que sea fuerte o no.

        int cont = 0, cont1 = 0, cont2 = 0; // creo  contadores los cuales me permiten determinar si los caracteres de contraseña cumple con la condicion inicial        

        String[] acumulador = new String[longitud]; // construyo un vector donde guardo cada uno de los elementos de mi contraseña

        for (int i = 0; i < longitud; i++) { // por defecto la longitud ya esta definida por el valor de LONGITUD

            acumulador[i] = contrasenia.substring(i, i + 1); // asigno en cada elemento del vector un caracter de mi contraseña           

        }

        // MAYUSCULAS  y minusculas y numeros     
        for (int i = 0; i < 8; i++) { //cuento los caracteres de mi contraseña y los analizo para saber si estan o no en mayuscula, minus y numb  

            if (acumulador[i].equals(comparativa(acumulador[i]))) {  // analizo si estan en mayuscula y sumo un contador si es verdadero

                cont++; // si se cumple la condicion suma el primer contador de mayusculas

            } else if (acumulador[i].equals(comparativa2(acumulador[i]))) {

                cont1++; // si se cumple la condicion suma el primer contador de minus

            } else if (acumulador[i].equals(comparativa3(acumulador[i]))) {

                cont2++; // si se cumple la condicion suma el primer contador de numb

            }

        }

//        System.out.println("contador1->" + cont);
//        System.out.println("contador2->" + cont1);
//        System.out.println("contador3->" + cont2);


        //   corroboro que mis  caracteres cumplan con la condicion
        if (cont >= 2) {

            bandera1 = true; // si hay al menos 2 mayus cumple con la condicion

        }

        if (cont1 >= 1) {

            bandera2 = true; // si al menos hay 1  minus cumple con la condicion

        }

        if (cont2 >= 5) {

            bandera3 = true; //si al menos hay 5 numeros, cumple con la condicion

        }

        // ya con toda la info y el desglose de mi contraseña con sus caracteres, analizo si cumple todos con las condiciones y retorno un verdadero o false
        if (bandera1 && bandera2 && bandera3) {

            return !fuerte;

        }

//        System.out.println("La Contraseña es Fuerte-> " + fuerte);
        return false;
    }

}


/**
 * LA CONTRASEÑA DEBE SER FUERTE SI:
 * 
 * MAYUSCULA-> AL MENOS 2 
 * 
 * MINUSCULA-> AL MENOS 1
 * 
 * NUMEROS-> AL MENOS 5 
 * 
 * 
 * MANERA DE RESTAR EN CODIGO ASCI PARA OBTENER LOS NUMERO DE 0 A 9

 */
// los numeros en hexa van del 0x30 al 0x39                 
// char temporar = acumulador [ i ] - 0x30 ;

// if ( temporal > 0 && temporal <= 9 ) { 
  //        system.out.println ("es un numero");  }
