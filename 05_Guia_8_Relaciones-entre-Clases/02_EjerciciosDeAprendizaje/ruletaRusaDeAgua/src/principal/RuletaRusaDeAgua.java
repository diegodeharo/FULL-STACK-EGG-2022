/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
import java.util.Scanner;
import juegoPaquete.Juego;
import jugadorPaquete.Jugador;
import revolverDeAgua.RevolverDeAgua;
import revolverDeAgua.RevolverMetodos;

/**
 *
 * @author EL_SEMENTAL
 */
public class RuletaRusaDeAgua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // instanciamos un objeto de tipo scanner para ingreso de datos
        Scanner leer = new Scanner(System.in);

        //Instanciamos un objeto de tipo revolverdeagua para los atributos
        RevolverDeAgua r = new RevolverDeAgua();

        //instanciamos un objeto de tipo revolverMetodo para los metodos
        RevolverMetodos rm = new RevolverMetodos();

        //instanciamos un objeto de tipo jugador para sus atributos y meto
        Jugador jugador = new Jugador();

        //Instanciamos un objeto de tipo juego, donde se guardan la
        //lista de jugadores y metodos
        Juego juego = new Juego();

        //creo una lista aux, donde se guardaran los jugadores creados.
        ArrayList<Jugador> jugadores = new ArrayList();

        jugador.crearJugadores();
//        jugadores.add(jugador);
//        
//        for (Jugador jugadore : jugadores) {
//            System.out.println(jugador.getJugadores());
//        }

        // jugador.disparo(rm);
        juego.llenarJuego(jugador.getJugadores(), rm);
        juego.ronda();

        System.out.println(" ** Los Paticipantes Fueron: \n");
        System.out.println(juego.getJugadores());

    }
}

//   do {
//            jugador.crearJugadores();
//
//            jugadores.add(new Jugador(jugador.getId(), jugador.getNombre(), jugador.isMojado()));
//            
//            
//            if (jugador.getId() == 6) {
//                
//                break;                
//            }
//            
//            System.out.println("Desea agregar mas jugadores, elija S/N");
//            System.out.print("op-> ");
//            opcion = leer.next();
//
//        } while (opcion.equalsIgnoreCase("s") && jugador.getId() != 6);
//
////        System.out.println(jugadores);
//
////        jugador.disparo(rm);
//        
//        juego.llenarJuego(jugadores, rm);
//        
//        juego.ronda();
//    }
