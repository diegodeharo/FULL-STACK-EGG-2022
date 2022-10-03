
package Main;

import Carta.Baraja;


public class Jugador {

   
    public static void main(String[] args) {
      
        Baraja baraja = new Baraja();
        
        baraja.barajar();
        
        System.out.println("Cantidad de cartas disponibles" + baraja.cartasDisponibles());
        baraja.montonCartas();
        
         System.out.println("Cantidad de cartas disponibles" + baraja.cartasDisponibles());
         System.out.println(baraja.sugienteCarta());
         
          System.out.println("Cantidad de cartas disponibles" + baraja.cartasDisponibles());
          System.out.println(baraja.darCartas(5));
        
           System.out.println("Cantidad de cartas disponibles" + baraja.cartasDisponibles());
           System.out.println(baraja.darCartas(50));
           
            System.out.println("Cantidad de cartas disponibles" + baraja.cartasDisponibles());
            baraja.montonCartas();
            
             System.out.println("Cantidad de cartas disponibles" + baraja.cartasDisponibles());
             baraja.mostrarCartas();
    }
    
}
