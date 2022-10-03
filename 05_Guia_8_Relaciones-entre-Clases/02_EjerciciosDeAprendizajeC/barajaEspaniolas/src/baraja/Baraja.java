/*
 * Realizar una baraja de cartas españolas orientada a objetos. Una carta 
tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo 
(espadas, bastos, oros y copas). Esta clase debe contener un método toString() 
que retorne el número de carta y el palo. La baraja estará compuesta por un 
conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, 
cuando no haya más o se haya llegado al final, se indica al usuario que no
hay más cartas. 
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese 
número de cartas. En caso de que haya menos cartas que las pedidas, 
no devolveremos nada, pero debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido,
si no ha salido ninguna indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir,
si se saca una carta y luego se llama al método, este no mostrara esa 
primera carta.
 */
package baraja;

import carta.Carta;
import java.util.ArrayList;
import java.util.Collections;
import numero.Numero;
import palo.Palo;

public class Baraja {

    // ATRIBUTOS
    //mazo principal
    private ArrayList<Carta> mazo = new ArrayList();

    // Mazo de Jugador
    private ArrayList<Carta> cartaRepartida = new ArrayList();

    // constructor por defecto
    public Baraja() {
        for (Palo palito : Palo.values()) {// recorre los numeros
            for (Numero nume : Numero.values()) {// recorre los palitos
                System.out.println(palito + " " + nume);
                mazo.add(new Carta(nume, palito));
            }
            System.out.println("*********");
        }

    }

    // METODO DE OPERACION 
    public void barajar() {//mazo mezclade

        // mezclar la coleccion 
        Collections.shuffle(mazo);

        //System.out.println(mazo); otra manera de mostrar mi lista
        for (Carta carta : mazo) {
            System.out.println(carta);
        }

    }

    /**
     * siguienteCarta(): devuelve la siguiente carta que está en la baraja,
     * cuando no haya más o se haya llegado al final, se indica al usuario que
     * no hay más cartas
     */
    public Carta siguienteCarta() {

        Carta cartasiguiente = mazo.get(0);
        mazo.remove(0);
        cartaRepartida.add(cartasiguiente);
        if (cartasDisponible() == 0) {
            System.out.println(" ** No quedan mas Cartas ** ");
        }
        

        return cartasiguiente;
    }
    
    

    /**
     * • cartasDisponibles(): indica el número de cartas que aún se puede
     * repartir.
     */
    public int cartasDisponible() {

        //System.out.println("Cantidad de cartas restantes");
        return mazo.size();
    }

    /*
    darCartas(): dado un número de cartas que nos pidan, 
    le devolveremos ese número de cartas. En caso de que haya
    menos cartas que las pedidas, no devolveremos nada, pero 
    debemos indicárselo al usuario.
     */
    public void darCartas(int cantidad) {
        
        if (cantidad > cartasDisponible()) {

            System.out.println(" ** No Hay Cartas Disponible ** ");

        } else {
            
            ArrayList<Carta> repartida = new ArrayList();
            for (int i = 0; i < cantidad; i++) {

//                siguienteCarta();
                repartida.add(siguienteCarta());
            }
            
            System.out.println(repartida);
        }
        
        

    }

    /*
    cartasMonton(): mostramos aquellas cartas que ya han salido,
    si no ha salido ninguna indicárselo al usuario
     */
    public void cartasMonton() {
        

        if (cartaRepartida.size() == 0) {

            System.out.println(" ** No se Repartieron Cartas ** ");

        } else {

            for (Carta carta : cartaRepartida) {
                System.out.println(carta);
            }

        }

    }
    
    /**
     * mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se
     * saca una carta y luego se llama al método, ste no mostrara esa primera
     * carta.
     */
    public void mostrarBaraja() {

        if (mazo.size() == 0) {

            System.out.println(" ** No quedaron Carta ** ");

        } else {

            for (Carta carta : mazo) {
                System.out.println(carta);
            }

        }

    }
}
