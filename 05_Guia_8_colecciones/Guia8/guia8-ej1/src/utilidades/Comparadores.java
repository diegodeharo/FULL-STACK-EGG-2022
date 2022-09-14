/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import entidades.Razaa;
import java.util.Comparator;

/**
 *
 * @author hGauna
 */
public class Comparadores {
        public static Comparator<Razaa> ordenarPorNombreDesc = new Comparator<Razaa> () {
        @Override
        public int compare(Razaa t1, Razaa t) {
            return t.getNombre().compareTo(t1.getNombre());
        }
    };
}
