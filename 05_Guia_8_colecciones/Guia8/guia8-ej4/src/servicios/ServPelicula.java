/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Menu;
import entidades.Pelicula;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import static utilidades.Comparadores.ordenarPorDirector;
import static utilidades.Comparadores.ordenarPorDuracionAsc;
import static utilidades.Comparadores.ordenarPorDuracionDesc;
import static utilidades.Comparadores.ordenarPorTitulo;

/**
 *
 * @author hGauna
 */
public class ServPelicula {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    DecimalFormat a2Dec = new DecimalFormat("#.00");
    List<Pelicula> moviesList = new ArrayList();
    
    public Pelicula crearPelicula(){
        String titulo, director;
        Double duracion;
        System.out.println("Ingrese el titulo de la pelicula");
        titulo = leer.next();
        System.out.println("Ingrese el director de la pelicula");
        director = leer.next();
        System.out.println("Ingrese la duracion de la pelicula");
        duracion = leer.nextDouble();
        return new Pelicula(titulo, director, duracion);
    }
    
    public void cargarPeliculas(ArrayList<Pelicula> lista){
        Menu newMenu = new Menu();
        int usrInput = 0;
        
        do {
            newMenu.printMenu();
            
            usrInput = leer.nextInt();
            
            switch(usrInput){
                case 1:
                    lista.add(this.crearPelicula());
                    break;
                case 2:
                    System.out.println("Proximamente buscar por titulo");
                    //buscarTitulo();
                    break;
                case 3:
                    System.out.println("Proximamente buscar por director");
                    buscarDirector();
                    break;
                case 4:
                    System.out.println("Hasta luego");
                    break;                    
                default:
                    System.out.println("Por favor revise la opcion seleccionada");
            }
            
        }while (usrInput != 4);
    }
    
    public void mostrarPeliculas(ArrayList<Pelicula> lista){
        for (Pelicula element : lista){
            System.out.println("Pelicula: " + element.getTitulo() + " - " + "Director: " + element.getDirector());
        }
    }
    
        public void mostrarPeliculasLargas(ArrayList<Pelicula> lista){
            System.out.println("");
            System.out.println("Peliculas de mas de 1 hora");
        for (Pelicula element : lista){
            if (element.getDuracion() > 1 ) System.out.println("Pelicula: " + element.getTitulo() + " - " + "Director: " + element.getDirector());
        }
    }
        
    public void ordenarDesc(ArrayList<Pelicula> peliculas) {
        Collections.sort(peliculas, ordenarPorDuracionDesc);
        System.out.println("");
        System.out.println("Ordenado por durecion Descendente");
        peliculas.forEach((elemento) -> System.out.println("Titulo: " + elemento.getTitulo() + " de tamaño: " + elemento.getDuracion()));
    }

    public void ordenarAsc(ArrayList<Pelicula> peliculas) {
        Collections.sort(peliculas, ordenarPorDuracionAsc);
        System.out.println("");
        System.out.println("Ordenado por durecion Ascendente");
        peliculas.forEach((elemento) -> System.out.println("Titulo: " + elemento.getTitulo() + " de tamaño: " + elemento.getDuracion()));
    }

    public void ordenarPorDirector(ArrayList<Pelicula> peliculas) {
        Collections.sort(peliculas, ordenarPorDirector);
        System.out.println("");
        System.out.println("Ordenado por Director");
        peliculas.forEach((elemento) -> System.out.println("Titulo: " + elemento.getTitulo() + " director: " + elemento.getDirector()));
    }

    public void ordenarPorTitulo(ArrayList<Pelicula> peliculas) {
        Collections.sort(peliculas, ordenarPorTitulo);
        System.out.println("");
        System.out.println("Ordenado por Titulo");
        peliculas.forEach((elemento) -> System.out.println("Titulo: " + elemento.getTitulo() + " director: " + elemento.getDirector()));
    }
    
    public void buscarDirector(){
        
    }
    
    public void buscarTitulo(){
        
    }
}
