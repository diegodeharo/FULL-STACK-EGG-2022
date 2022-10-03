/* Realizar un programa para que una Persona pueda adoptar un Perro.
Vamos a contar de dos clases. Perro, que tendrá como atributos: nombre,
raza, edad y tamaño; y la clase Persona con atributos: nombre, apellido, 
edad, documento y Perro. Ahora deberemos en el main crear dos Personas y
dos Perros. Después, vamos a tener que pensar la lógica necesaria para
asignarle a cada Persona un Perro y por ultimo, mostrar desde la clase
Persona, la información del Perro y de la Persona.
 */
package perro;

import java.util.Scanner;

/**
 *
 * @author EL_SEMENTAL
 */
public class Perro {
    
    //instancio un objeto de tipo scanner
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    //atributos
    private String nombre;
    private String raza;
    private Double edad;
    private String tamano;
    
    //contructor por defecto
    public Perro() {
    }
    
    //constructor parametrizado
    public Perro(String nombre, String raza, Double edad, String tamano) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
    }
    
    //get and set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Double getEdad() {
        return edad;
    }

    public void setEdad(Double edad) {
        this.edad = edad;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamaño(String tamano) {
        this.tamano = tamano;
    }
    
    //tostring
    @Override
    public String toString() {
        return " ** Perro ** \n"
                + "nombre= " + nombre + "\n"
                + "raza= " + raza + "\n"
                + "edad= " + edad + "\n"
                + "tamano= " + tamano + "\n";
    }

    //metodos de llenado
    public void crearPerro(){
        System.out.println("** DATOS PERRUNO **");
        
        System.out.print("Nombre-> ");
        this.nombre = leer.next();
        
        System.out.print("Raza-> ");
        this.raza = leer.next();
        
        System.out.print("Edad-> ");
        this.edad = leer.nextDouble();
        
        System.out.print("Tamaño-> ");
        this.tamano = leer.next(); 
        
        System.out.println("///////////////////////////////");
        
    }
    
}
