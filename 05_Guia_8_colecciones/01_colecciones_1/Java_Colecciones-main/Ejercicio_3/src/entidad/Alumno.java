/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;

/**
 *
 * @author Johana
 */
public class Alumno {
    
    private String nombre;
    ArrayList<Integer> notas = new ArrayList();

    public Alumno(String nombre, ArrayList<Integer> notas) {
        
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void mostrarNombre(){
    
        System.out.println("*************************\n"
                + "Nombre --> "+nombre);
    }
    
    public double notaFinal(){
    
        double promedio = 0;
        double suma = 0;
        for (Integer nota : notas) {
            
            suma += nota;
        }
        promedio = suma / 3;
        return promedio;
    }
    
}
