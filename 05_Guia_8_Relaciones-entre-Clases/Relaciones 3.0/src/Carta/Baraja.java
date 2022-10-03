
package Carta;

import enums.Numeros;
import enums.Palos;
import java.util.ArrayList;
import java.util.Collections;


public class Baraja {
    
    private ArrayList<Carta> mazo = new ArrayList();
    private ArrayList<Carta> repartidas = new ArrayList();
    
    
    
    public Baraja() {
        
        for (Palos palo : Palos.values()) {
            for (Numeros num : Numeros.values()) {
                
                this.mazo.add(new Carta(num,palo));
                
        }
    }
}

    public void barajar(){
        
       Collections.shuffle(this.mazo);
       
}
    
    public Carta sugienteCarta(){
        
        Carta siguiente = mazo.get(0);
        this.mazo.remove(0);
        this.repartidas.add(siguiente);
        if(cartasDisponibles() == 0) {
            System.out.println("no quedan cartas que repartir");
        }
        
        return siguiente;
        
    }
    
    public int cartasDisponibles() {
        
        return this.mazo.size();
        
    }
    
    public ArrayList<Carta> darCartas(int cantidad){
        
        if(cantidad <= this.cartasDisponibles()){
            
            ArrayList<Carta> reparto = new ArrayList<Carta>();
            
            for (int i = 0; i < cantidad ; i++) {
                
                reparto.add(this.sugienteCarta());
            }
            return reparto;
        }
        System.out.println("Se pidieron mas cartas de las disponibles");
        
        return new ArrayList<Carta>();
        
     
        }
    
   public void montonCartas(){
   
       if (this.repartidas.size()== 0 ) {
           
           System.out.println("No quedan cartas para repartir");
       
       return;
   }
       System.out.println("Las cartas repartidas fueron");
       
       for (Carta carta : this.repartidas) {
           System.out.println(carta);
   }
        
    }
   
   public void mostrarCartas() {
       
       if (this.mazo.size() == 0) {
           
           System.out.println("no quedan cartas en el mazo");
   }
       System.out.println("Las cartas que quedan en el mazo son");
       
       for (Carta carta : this.mazo) {
           
           System.out.println(carta);
       }

}
}