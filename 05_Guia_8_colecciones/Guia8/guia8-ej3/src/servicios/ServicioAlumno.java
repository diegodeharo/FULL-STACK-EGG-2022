/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static javafx.beans.binding.Bindings.not;

/**
 *
 * @author hGauna
 */
public class ServicioAlumno {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private List<Alumno> alumnos; 
    private List<Integer> notas;
    public void servicioAlumno(){
        this.alumnos = new ArrayList();
    }
    
    public Alumno crearAlumno(){
        notas = new ArrayList();
        System.out.println("Ingrese el nombre del alumno");
        String nombre = leer.next();
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota numero: " + (i+1));
            int nota = leer.nextInt();
            System.out.println(i);
            notas.add(nota);
        }
        return new Alumno(nombre, notas);
    }
    
    public void cargarAlumno(Alumno alumno){
        alumnos.add(alumno);
    }
    
    public double notaFinal(Alumno alumno){
        List<Integer> notas = alumno.getNotas();
        double aux=0;
        for (int nota : notas){
            aux += (double) nota;
        }
        return (aux/3);
    }
}
