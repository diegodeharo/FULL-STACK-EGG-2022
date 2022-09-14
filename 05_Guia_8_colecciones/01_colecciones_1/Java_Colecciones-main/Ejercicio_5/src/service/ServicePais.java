/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Johana
 */
public class ServicePais {

    Scanner leer = new Scanner(System.in);
    HashSet<String> paises = new HashSet();

    public void inicializar() {

        guardarPais();
        mostrarPaises();
        ordenarPaises();
        eliminarPais();
    }

    private void guardarPais() {

        boolean ejecutar = true;
        do {

            System.out.println("Ingrese un pais: ");
            paises.add(leer.next().toUpperCase());

            System.out.println("Desea seguir agregando mas paises?. y/n");
            ejecutar = leer.next().equalsIgnoreCase("y") ? true : false;

        } while (ejecutar);
    }

    private void mostrarPaises() {

        for (String pais : paises) {

            System.out.println(pais);

        }
        System.out.println("****************");
    }

    private void ordenarPaises() {

        TreeSet<String> treePaises = new TreeSet<>(paises);
        //ArrayList<String> arrayPaises = new ArrayList(paises);
        //Collections.sort(arrayPaises);
        for (String pais : treePaises) {

            System.out.println(pais);

        }
    }

    private void eliminarPais() {

        Iterator<String> it = paises.iterator();
        int seEncontro = 0;
        System.out.println("Ingrese el pais que sea eliminar: ");
        String aEliminar = leer.next().toUpperCase();

        while (it.hasNext()) {

            if (aEliminar.equals(it.next())) {

                seEncontro = 1;
                it.remove();
                mostrarPaises();
            }
        }

        if (seEncontro == 0) {

            System.out.println("El pais que ingreso no se encuentra en el conjunto");
        }

    }

}
