package libro;

import Entidad.CrearLibro;
import ServicioLibro.ServicioLibro;

/**
 *
 * @author Maxi
 */
public class Libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        ServicioLibro libro1=new ServicioLibro();
        CrearLibro l1=libro1.cargarLibro();
        libro1.MostrarLibro(l1);
        
    }
    
}