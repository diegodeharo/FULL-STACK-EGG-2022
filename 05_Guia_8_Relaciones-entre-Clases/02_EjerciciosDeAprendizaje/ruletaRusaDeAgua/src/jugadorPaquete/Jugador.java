package jugadorPaquete;

import java.util.ArrayList;
import java.util.Scanner;
import revolverDeAgua.RevolverMetodos;

/**
 *
 * @author EL_SEMENTAL
 */
public class Jugador {

    //instanciar un objeto de tipo scanner para el ingreso de datos
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //atributos
    private int id;         //representa el numero del jugador
    private String nombre;  // nombre Jugador mas el id
    private boolean mojado; // indica si esta o no mojado el jugador

    //array de juagadores
    ArrayList<Jugador> jugadores = new ArrayList();

    public Jugador() {
    }

    public Jugador(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    /**
     * devuelve true si el jugado recibe el disparo sera cierto cuando la
     * posicion del chorro, coincida con la posicion del tambor, al ser cierto,
     * el jugador de ese momento recibe el chorro y cambia la variable mojado de
     * false a true y ese valor es devuelto.
     *
     * @param r
     * @return
     */
    public boolean disparo(RevolverMetodos r) {

        this.mojado = false;

//        System.out.println("El jugador " + this.id + " aprieta "
//                + "el gatillo");
        if (r.mojar()) {

//            System.out.println("el jugador " + this.id + " se mojo");
            this.mojado = true;

            return this.mojado;

        } else {

            r.siguienteChorro();

        }

        return this.mojado;
    }

    /**
     * metodo para agregar el nombre de cada participante
     */
    public void crearJugadores() {

        //variable de agregacion de jugador
        String tecla = "s";

        do {

            this.id++;
            System.out.print("Nombre-> ");
            this.nombre = leer.next();

            jugadores.add(new Jugador(id, nombre, mojado));

        } while (id <= 5 && tecla.equalsIgnoreCase("s"));
    }

    /**
     * indentificacion del jugador
     *
     * @return
     */
    @Override
    public String toString() {
        return " ** Jugador ** \n"
                + "Id-> " + id + "\n"
                + "Nombre-> " + nombre + "\n"
//                + "Mojado->" + mojado + "\n"
                + "**************************\n";
    }

}

//if (this.id >= 6) {
//
//            this.id = 1;
//
//        } else {
//            this.id++;
//            System.out.print("Nombre-> ");
//            this.nombre = leer.next();
//        }