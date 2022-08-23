
package passwordServicio;

import java.util.Scanner;
import password.Password;

/**
 *  Haz una clase llamada Password que siga las siguientes condiciones:

Que tenga los atributos longitud y contraseña . Por defecto, la longitud sera de 8.
Los constructores serán los siguiente:
Un constructor por defecto.
Un constructor con la longitud que nosotros le pasemos. Generara una contraseña aleatoria con esa longitud.
Los métodos que implementa serán:
* 
* 
* 
esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener mas de 2 mayúsculas, 
mas de 1 minúscula y mas de 5 números.
* 
generarPassword():  genera la contraseña del objeto con la longitud que tenga.
* 
* 
* 
Método get para contraseña y longitud.
Método set para longitud.
* 
Ahora, crea una clase clase ejecutable:
* 
Crea un array de Passwords con el tamaño que tu le indiques por teclado.
* 
Crea un bucle que cree un objeto para cada posición del array.
* 
Indica también por teclado la longitud de los Passwords (antes de bucle).
* 
Crea otro array de booleanos donde se almacene si el password del array de Password es o no fuerte
* (usa el bucle anterior).
* 
Al final, muestra la contraseña y si es o no fuerte (usa el bucle anterior). Usa este simple formato:
* 
contraseña1 valor_booleano1

contraseña2 valor_bololeano2
* 
* 
 * 
 */


public class Ejecutable {
    
    //clase scanner para ingreso de datos
    Scanner leer = new Scanner(System.in);
    
    // instanciamos un objeto del tipo password
   // Password p1 = new Password();
    
    
    
//    esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte 
//   debe tener mas de 2 mayúsculas, mas de 1 minúscula y mas de 5 números.
//  generarPassword():  genera la contraseña del objeto con la longitud que tenga.
    
    // METODOS DE OPERACION
    //1
    public boolean esFuerte(){
        
        return false;
    }
    
    //2
    public void generarPassword(){
        
        
    }
    
    //3
    //Crea un array de Passwords con el tamaño que tu le indiques por teclado.
    
    public void crearArray(){
        
        String[ ] arrayPassword = new String [ 5 ];
        
        for (int i = 0; i < 5; i++) {
            
             Password p1 = new Password();
             p1.crearContraseña();
            arrayPassword [ i ] = p1.getContrasenia();
            
        }
        
    }
    
    //4
    
    
    
    
}
