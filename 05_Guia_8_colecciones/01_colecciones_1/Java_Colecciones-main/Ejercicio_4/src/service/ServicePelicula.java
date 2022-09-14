package service;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Johana
 */
public class ServicePelicula {

    Scanner leer = new Scanner(System.in);
    ArrayList<Pelicula> peliculas = new ArrayList<>();

    public void inicializar() {

        crearPelicula();
        mostrarPelicula();
        mayorDuracion();
        ordenarPorDuracionDescendente();
        ordenarPorDuracionAscendente();
        ordenarPorTitulo();
        ordenarPorDirector();
    }

    private void crearPelicula() {

        boolean ejecutar = true;
        do {
            System.out.println("Ingrese el titulo de la pelicula: ");
            String titulo = leer.next();
            System.out.println("Ingrese el director: ");
            String director = leer.next();
            System.out.println("Ingrese la duracion: ");
            double duracion = leer.nextDouble();

            peliculas.add(new Pelicula(titulo, director, duracion));

            System.out.println("Desea seguir agregando peliculas? y/n");
            ejecutar = leer.next().equalsIgnoreCase("y"); //? true : false;

        } while (ejecutar);

    }

    private void mostrarPelicula() {

        for (Pelicula peli : peliculas) {

            peli.mostrarDatos();
        }
        System.out.println("------------------------------------------------------");
    }

    private void mayorDuracion() {

        System.out.println("////LISTAR PELICULAS SEGUN LA DURACION (mayor que 1)////\n");
        for (Pelicula pelicula : peliculas) {

            if (pelicula.getDuracion() > 1) {

                pelicula.mostrarDatos();
            }

        }

    }

    public void ordenarPorDuracionDescendente() {

        System.out.println("////LISTAR PELICULAS ORDENADAS DE FORMA DESCENDENTE SEGUN LA DURACION////\n");
        Collections.sort(peliculas, compararDuracionDescendente);
        mostrarPelicula();
    }

    public void ordenarPorDuracionAscendente() {

        System.out.println("////LISTAR PELICULAS ORDENADAS DE FORMA ASCENDENTE SEGUN LA DURACION////\n");
        Collections.sort(peliculas, compararDuracionAscendente);
        mostrarPelicula();
    }

    private void ordenarPorTitulo() {

        System.out.println("////LISTAR PELICULAS POR TITULO ALFABETICAMENTE////\n");
        Collections.sort(peliculas, compararPorTituloAlf);
        mostrarPelicula();
    }

    private void ordenarPorDirector() {

        System.out.println("////ORDENAR PELICULAS POR DIRECTOR ALFABETICAMENTE////\n");
        Collections.sort(peliculas, compararPorDirectorAlf);
        mostrarPelicula();
    }

    private static Comparator<Pelicula> compararDuracionDescendente = new Comparator<Pelicula>() {

        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            double delta = p2.getDuracion() - p1.getDuracion();
            if (delta > 0) {
                return 1;
            }
            if (delta < 0) {
                return -1;
            }
            return 0;
        }
    };

    private static Comparator<Pelicula> compararDuracionAscendente = new Comparator<Pelicula>() {

        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            double delta = p1.getDuracion() - p2.getDuracion();
            if (delta > 0) {
                return 1;
            }
            if (delta < 0) {
                return -1;
            }
            return 0;
        }
    };

    private static Comparator<Pelicula> compararPorTituloAlf = new Comparator<Pelicula>() {

        @Override
        public int compare(Pelicula p1, Pelicula p2) {

            return p1.getTitulo().compareTo(p2.getTitulo());
        }

    };

    private static Comparator<Pelicula> compararPorDirectorAlf = new Comparator<Pelicula>() {

        @Override
        public int compare(Pelicula p1, Pelicula p2) {

            return p1.getDirector().compareTo(p2.getDirector());
        }

    };

}
