
package libros;

import Entidades.Libros;
import Servicios.ServicioLibro;


public class MiLibro {

    public static void main(String[] args) {
        /**
         * creo un objeto de servicios ya que desde ahi es donde introducto los
         * datos para mis atributos correspondientes a mi objeto de mi clase
         * determinada
         */
        ServicioLibro sl = new ServicioLibro();
        
        //importo a la entidad que posee al objeto con los atributos y luego le asigno el retorno de toda 
        // la info que se puso sobre los atributos de mi objeto
        Libros l1 = sl.Cargarlibros();
      
        System.out.println(l1);
      

    }

}
