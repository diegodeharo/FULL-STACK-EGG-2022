 
package sala;

import espectador.Espectador;

 
public class Sala {
    
    // ATRIBUTOS
    private Espectador espectador;
    
   public void matriz(){
       
       for (int i = 8; i >0 ; i--) {
           for (int j = 1; j < 7; j++) {
               
               System.out.print(i + "A" + " |");
               
           }
           
           System.out.println(" ");
       }
   }
    
    
}
