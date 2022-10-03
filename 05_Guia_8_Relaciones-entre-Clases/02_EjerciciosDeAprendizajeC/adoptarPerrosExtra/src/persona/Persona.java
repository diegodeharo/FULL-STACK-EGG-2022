/*
 * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos
a contar de dos clases. Perro, que tendrá como atributos: nombre, raza, 
edad y tamaño; y la clase Persona con atributos: nombre, apellido, edad, 
documento y Perro. 


EXTRA:
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona.
Nuestro programa va a tener que contar con muchas personas y muchos 
perros. El programa deberá preguntarle a cada persona, que perro según
su nombre, quiere adoptar. Dos personas no pueden adoptar al mismo perro, 
si la persona eligió un perro que ya estaba adoptado, se le debe 
informar a la persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos 
mostrar todas las personas con sus respectivos perros.

 */
package persona;

import perro.Perro;

/**
 *
 * @author EL_SEMENTAL
 */
public class Persona {
    
    // ATRIBUTOS
    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer dni;
    private Perro perro;
    
    // CONSTRUCTOR POR DEFECTO
    public Persona() {
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Persona(String nombre, String apellido, Integer edad, Integer dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
//        this.perro = perro;
    }

    // GET AND SET
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

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }
    
        
    // TO STRING

    @Override
    public String toString() {
        return " ** Persona ** \n"
                + "  Nombre:\t" + nombre + "\n"
                + "Apellido:\t" + apellido + "\n"
                + "    Edad:\t" + edad + "\n"
                + "     Dni:\t" + dni + "\n"
                + perro + "\n" + "********";
    }

}
