/**
 *  Haz una clase llamada Password que siga las siguientes condiciones:

Que tenga los atributos longitud y contraseña . Por defecto, la longitud sera de 8.
Los constructores serán los siguiente:
Un constructor por defecto.
Un constructor con la longitud que nosotros le pasemos. Generara una contraseña aleatoria con esa longitud.
* 
Los métodos que implementa serán:
* 
* Método get para contraseña y longitud.
* 
Método set para longitud.
* 
esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener mas de 2 mayúsculas, 
mas de 1 minúscula y mas de 5 números.
* 
generarPassword():  genera la contraseña del objeto con la longitud que tenga.
* 

* 
Ahora, crea una clase clase ejecutable:

Crea un array de Passwords con el tamaño que tu le indiques por teclado.
Crea un bucle que cree un objeto para cada posición del array.
Indica también por teclado la longitud de los Passwords (antes de bucle).
Crea otro array de booleanos donde se almacene si el password del array de Password es o no fuerte
(usa el bucle anterior).
Al final, muestra la contraseña y si es o no fuerte (usa el bucle anterior). Usa este simple formato:
contraseña1 valor_booleano1

contraseña2 valor_bololeano2
 */


package password;

import java.util.Scanner;


public class Password {
    
    Scanner leer = new Scanner(System.in);
    
    // Atributos    
    private long longitud = 8;
    private String contrasenia;
    private String usuario;
    
    // Metodos importantes
    // constructor por defecto
    public Password() {
    }
    
    // Constructor parametrizado
    public Password(long longitud, String contrasenia, String usuario) {
        
        this.longitud = longitud;
        this.contrasenia = contrasenia;      
        this.usuario = usuario;
        
    }
    
    // Get & Set
    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(long longitud) {
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
    
    
    // metodo referenica contraseña
    public void crearContraseña(){
        
        System.out.print("Ingrese el Usuario-> ");
         usuario = leer.next();
         
        System.out.print("Ingrese la Contraseña-> ");
         contrasenia = leer.next();
         System.out.println("");
    }

    
    
    
}
