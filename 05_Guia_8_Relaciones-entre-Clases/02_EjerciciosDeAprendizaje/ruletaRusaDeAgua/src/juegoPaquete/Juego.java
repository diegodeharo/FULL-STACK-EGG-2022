package juegoPaquete;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import jugadorPaquete.Jugador;
import revolverDeAgua.RevolverMetodos;

/**
 *
 * @author EL_SEMENTAL
 */
public class Juego {

    //instancio un objeto de tipo scanner para el ingreso de datos
    Scanner leer = new Scanner(System.in);

    //instancio un objeto jugador para los metodos
    Jugador jug = new Jugador();

    //atributo
    private List<Jugador> jugadores;
    private RevolverMetodos revolver;

    //contructor por defecto
    public Juego() {
        this.jugadores = new ArrayList();
    }

    //constructor parametrizado
    public Juego(List<Jugador> jugadores, RevolverMetodos revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    // get and set
    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverMetodos getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverMetodos revolver) {
        this.revolver = revolver;
    }

    // metodo de operacion
    /**
     * aca solo asigno a cada atributo de mi clase Juego, sus respectivos
     * valores
     *
     * @param jugadores
     * @param r
     */
    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverMetodos r) {

        this.jugadores = jugadores;
        this.revolver = r;

    }

    /**
     * rondas donde el jugador aprieta el gatillo, si no sale el chorro\ le da
     * la oportunidad a otro jugador, hasta que el chorro moje a un
     * participante.
     */
    public void ronda() {

        int cont = 0;
        boolean bandera;

        for (Jugador jugador : jugadores) {

            cont++;
            
            
            if (jug.disparo(revolver)) {

                System.out.println("El Jugador/a " + jugador.getNombre()
                        + " '" + jugador.getId() + "' es quien se mojo \n");
                
//                jugadores.add(new Jugador(jugador.getId(), jugador.getNombre(), jugador.setMojado(jug.disparo(revolver))));
                
                System.out.println(" ** FIN DE JUEGO ** \n");

                break;

            } else {

                System.out.println(" Continua el siguiente participante ");
                revolver.siguienteChorro();
            }

        }

    }

    @Override
    public String toString() {
        return " ** Juego ** " + "\n "
                + jugadores + "/n";
    }

}

////contador 
//        int cont = 1;
//        //bandera 
//        boolean bandera;
//        
//        do{
//        if (jug.disparo(revolver)) {
//            
//            System.out.println("El Jugador que recibio el Chorro es: ");
//            System.out.println(this.jugadores);
//            break;
//        }else{
//            
//            System.out.println("El Juego Continua");
//            cont++;
//            
//        }
//        
//        System.out.println("Presione un S/N para continuar con el "
//                + "siguiente participante");
//        String tecla = leer.next();
//        bandera = tecla.equalsIgnoreCase("s");
//    
//        }while ( bandera && cont != 6);
//    
//        System.out.println("");
