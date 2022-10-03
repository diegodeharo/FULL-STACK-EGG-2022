/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos
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
package perro;

import java.util.Iterator;
import tamanio.Tamanio;

/**
 *
 * @author EL_SEMENTAL
 */
public class Perro {
    
    // ATRIBUTOS
    private String nombre;
    private String raza;
    private Integer edad;
    private Tamanio tamanio;

    public Perro() {
    }

    public Perro(String nombre, String raza, Integer edad, Tamanio tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }

    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return " ** Perro ** \n"
                + " Nombre:\t" + nombre + "\n"
                + "   Raza:\t" + raza + "\n"
                + "   Edad:\t" + edad + "\n"
                + "Tamanio:\t" + tamanio + "\n"
                + "*****";
    }

    public Iterator<Perro> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
