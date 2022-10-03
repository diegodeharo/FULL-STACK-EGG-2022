

package unoAmuchos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EL_SEMENTAL
 */
public class TeamJugadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Jugador j = new Jugador();
        j.setNombre("Diego");
        j.setApellido("deHaro");
        j.setPosicion(1);
        
        List<Jugador> jugador = new ArrayList();
        jugador.add(j);
        
        Equipo e = new Equipo();
        e.setEquipo(jugador);
        
        System.out.println("EL TEAM PICANTE ES:\n"
        +e.getEquipo());
        
        
    }
    
}
