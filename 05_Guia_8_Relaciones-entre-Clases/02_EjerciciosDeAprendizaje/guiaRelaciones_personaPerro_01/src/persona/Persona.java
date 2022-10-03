/* Realizar un programa para que una Persona pueda adoptar un Perro.
Vamos a contar de dos clases. Perro, que tendrá como atributos: nombre,
raza, edad y tamaño; y la clase Persona con atributos: nombre, apellido, 
edad, documento y Perro. Ahora deberemos en el main crear dos Personas y
dos Perros. Después, vamos a tener que pensar la lógica necesaria para
asignarle a cada Persona un Perro y por ultimo, mostrar desde la clase
Persona, la información del Perro y de la Persona.
 */
package persona;

import java.util.Scanner;
import perro.Perro;

/**
 *
 * @author EL_SEMENTAL
 */
public class Persona {
    
    //instancio un objeto de tipo scanner para ingresar los datos por 
    //teclado
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    //atributos
    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer documento;
    private Perro perro;
    
    //contructo por defecto
    public Persona() {
    }
    
    //constructor parametrizado
    public Persona(String nombre, String apellido, Integer edad, Integer documento, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
    }
    
    //get and set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }
    
    //metodo de creacion de persona
    public void crearPersona(){
        
        System.out.println(" ** Persona ** ");
        
        System.out.print("Nombre-> ");
        this.nombre = leer.next();
        
        System.out.print("Apellido-> ");
        this.apellido = leer.next();
        
        System.out.print("Edad-> ");
        this.edad = leer.nextInt();        
               
        System.out.print("Documento-> ");
        this.documento = leer.nextInt();
        
        
    }

    @Override
    public String toString() {
        return " ** Persona ** \n"
                + "Nombre-> " + nombre + "\n"
                + "Apellido-> " + apellido + "\n"
                + "Edad-> " + edad + "\n"
                + "Documento-> " + documento + "\n"
                + "--------------------------\n"
                + perro + "\n";
    }

    
    
}
