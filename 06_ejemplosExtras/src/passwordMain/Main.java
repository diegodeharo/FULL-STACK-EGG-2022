

package passwordMain;

import password.Password;
import passwordServicio.Ejecutable;



public class Main {

  
    public static void main( String[ ] args ) {
       
        Ejecutable ejecutable1 = new Ejecutable();
        
        
        Password[ ] array = new Password[ 5 ];
        
        
        
        for (int i = 0; i < 5; i++) {
            
          Password password = new Password();
          
          password.crearContraseña();
          
          array[ i ] = password;
            
        }
        
        
        
        
        for( Password i: array){
            
            System.out.println( i.getUsuario() + " - " + i.getContrasenia() );
            
        }
        
        
    }
    
}
