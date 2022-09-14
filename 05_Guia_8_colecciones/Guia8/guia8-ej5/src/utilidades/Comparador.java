/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import entidades.Pais;
import java.util.Comparator;

/**
 *
 * @author hGauna
 */
public class Comparador {
            public static Comparator<Pais> ordenarAsc = new Comparator<Pais> () {
        @Override
        public int compare(Pais t1, Pais t) {
            return t1.getPais().compareTo(t.getPais());
        }

}
