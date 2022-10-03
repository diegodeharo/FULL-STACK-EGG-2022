/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartasEspaniolasMain;

import baraja.Baraja;
import java.util.Scanner;

/**
 *
 * @author EL_SEMENTAL
 */
public class CartasEspaniolasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //instancio un objeto de tipo scanner  para ingresar el dato
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
        System.out.println("mazo iniciado");
        Baraja mazoA = new Baraja();
        
        System.out.println("MAZO BARAJAO");
        mazoA.barajar();
        
        System.out.println("Mazo Siguiente Carta");
        mazoA.siguienteCarta();
        
        System.out.println("Carta Removida del Mazo principal");
        System.out.println("cartas disponibles-> " +  mazoA.cartasDisponible());
        
        System.out.println("Ingrese la cantidad de cartas que desee: ");
        System.out.print("cantidad-> ");
        int cantidad = leer.nextInt();
        mazoA.darCartas(cantidad);
        
//        System.out.println("Carta Removida del Mazo principal");
//        System.out.println("cartas disponibles-> " +  mazoA.cartasDisponible());
//        
        
    }
    
}
