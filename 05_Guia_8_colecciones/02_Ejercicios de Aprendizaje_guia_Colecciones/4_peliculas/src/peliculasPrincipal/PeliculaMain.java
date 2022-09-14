/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculasPrincipal;

import peliculaServicio.PeliculaServicio;

/**
 *
 * @author EL_SEMENTAL
 */
public class PeliculaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //llamo al servicio donde esta mi operacion de ingreso de info
        PeliculaServicio ps = new PeliculaServicio();
        
        //llamo al metodo con mi objeto ps de tipo peliculaServicio
        ps.infoPelicula();
//        ps.mostrarPeliculas();
//        ps.mostrarPeliculas2();
//        ps.mayorAunaHora();
        ps.mayorAmenorDuracion();
//        ps.menorAmayorDuracion();
//        ps.menorMayorDuracion();
//        ps.tituloAfabeticamente();
//        ps.directoAfabeticamente();
    }

}
