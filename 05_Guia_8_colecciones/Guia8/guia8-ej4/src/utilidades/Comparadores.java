/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author hGauna
 */
public class Comparadores {
        public static Comparator<Pelicula> ordenarPorDuracionDesc = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t1, Pelicula t) {
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };    
        public static Comparator<Pelicula> ordenarPorDuracionAsc = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t1, Pelicula t) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
        public static Comparator<Pelicula> ordenarPorDirector = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t1, Pelicula t) {
            return t1.getDirector().compareTo(t.getDirector());
        }
    };
        public static Comparator<Pelicula> ordenarPorTitulo = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t1, Pelicula t) {
            return t1.getTitulo().compareTo(t.getTitulo());
        }
    };
}
