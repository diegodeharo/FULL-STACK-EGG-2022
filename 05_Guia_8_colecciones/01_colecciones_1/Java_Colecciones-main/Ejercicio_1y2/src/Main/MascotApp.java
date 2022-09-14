
package Main;

import Service.ServiceMascota;

/**
 *
 * @author Johana
 */
public class MascotApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ServiceMascota servMasc = new ServiceMascota();
        servMasc.inicializar();
        
    }
    
}
