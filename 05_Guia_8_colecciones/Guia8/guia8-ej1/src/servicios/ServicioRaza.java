/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Razaa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import static utilidades.Comparadores.ordenarPorNombreDesc;

/**
 *
 * @author hGauna
 */
public class ServicioRaza {

    private Scanner leer;
    private List<Razaa> razas;

    public ServicioRaza() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.razas = new ArrayList();
    }

    public Razaa crearMascota() {
        System.out.println("Introducir nombre de la raza");
        String nombre = leer.next();
        System.out.println("Ingresar el tamaño de la raza");
        String tamanio = leer.next();
        return new Razaa(nombre, tamanio);
    }

    public void agregarMascota(Razaa m) {
        razas.add(m);
    }

    public void mostrarRazas() {
        if (razas.isEmpty()) {
            System.out.println("no hay nada que mostrar");
        } else {
            System.out.println("");
            System.out.println("Las razas cargadas son:");
            for (Razaa elemento : razas) {
                System.out.println("Raza: " + elemento.getNombre() + " de tamaño: " + elemento.getTamanio());
            }
        }
    }
    
    public void iteratorRazas(String raza) {
        System.out.println("");
        Iterator<Razaa> it = razas.iterator();
        while (it.hasNext()) {
            Razaa aux = it.next();
            System.out.println("en el iterator " + aux.getNombre());
            if (aux.getNombre().equals(raza)) {
                it.remove();
            }
        }
        Collections.sort(razas, ordenarPorNombreDesc);
        razas.forEach((elemento) -> System.out.println("Raza: " + elemento.getNombre() + " de tamaño: " + elemento.getTamanio()));
    }
}
