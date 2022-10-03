/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unoAmuchos;

/**
 *
 * @author EL_SEMENTAL
 */
public class Jugador {
    
    private String nombre;
    private String apellido;
    private int posicion;

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

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Jugador:\n" + "nombre= " + nombre + "\n"
                + "apellido= " + apellido + "\n"
                + "posicion= " + posicion + "\n";
    }

    
    
}
