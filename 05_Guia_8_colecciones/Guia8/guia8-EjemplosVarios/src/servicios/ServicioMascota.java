/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Mascota;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author hGauna
 */
public class ServicioMascota {
    private Scanner leer; 
    private List<Mascota> mascotas; // List o ArrayList es casi lo mismo.

    public ServicioMascota() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }
    
    public Mascota crearMascota(){
        System.out.println("Introducir nombre");
        String nombre = leer.next();
        System.out.println("Ingresar raza");
        String raza = leer.next();
        return new Mascota(nombre, raza);
    }
    
    public void agregarMascota(Mascota m) {
        mascotas.add(m);
    }
    
    public void fabricaMascota(int cant){
        for (int i = 0; i < cant; i++) {
            //mascotas.add(this.crearMascota());
            agregarMascota(this.crearMascota());
        }
    }
    
    public void mostrarMascota(){
        System.out.println("Las mascotas son: ");
        for (Mascota m : mascotas) {
            System.out.println(m.getNombre() + " raza: " + m.getRaza());
        }
        System.out.println("La cantidad de mascotas es: " + mascotas.size());
    }
    // To-do agregar try and catch
    public void actualizarMascota(int index){
        System.out.println("");
        System.out.println("----------Actualizamos una mascota----------");
        if (index <= (mascotas.size()-1)){
            Mascota m = crearMascota();
            mascotas.set(index,m);
        }else{
            System.out.println("El indice ingresado es erroneo, no se actualizo ni un registro");
        }

    }
    
    public void eliminarMascota(int index){
        System.out.println("");
        System.out.println("----------Eliminamos una mascota----------");
        if (index <= (mascotas.size()-1)){
            mascotas.remove(index);
        }else{
            System.out.println("El indice ingresado es erroneo, no se elimino ni un registro");
        }
    }
    
    public void eliminarPorNombre(String nombre){
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota m = mascotas.get(i);
            if (m.getNombre().equals(nombre)){
                mascotas.remove(i);
            }
        }
    }
    
        public void actualizarPorNombre(String nombre){
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota m = mascotas.get(i);
            if (m.getNombre().equals(nombre)){
                System.out.println("Ingrese el nuevo nombre");
                m.setNombre(leer.next());
            }
        }
    }
    
}
