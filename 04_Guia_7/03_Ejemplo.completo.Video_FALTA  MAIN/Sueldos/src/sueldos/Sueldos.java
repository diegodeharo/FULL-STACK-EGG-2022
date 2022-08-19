
package sueldos;

import Entidades.Vendedor;
import Servicio.VendedorServicio;

public class Sueldos {//paso 1-> creo mi main principal, aca seria mi paquete sueldo 

    public static void main(String[] args) {
        //paso 18-> aca empezamos a interactuar con las clases de entidad y vendedor de servicio
        // la idea es llamar a estos metodos y no tener que escribir tantos codigos
        //LA FINALIDAD DE TODO ESTO, ES PODER REUTILIZAR TANTO LA ESTRUCTURA DEFINIDAS EN LOS OBJETOS (entidades)
        //COMO LA ESTRUCTURAS DEFINIDAS EN LOS SERVICIOS PARA PODER IMPLEMENTAR LA CANTIDAD DE VECES QUE SEA 
        //NECESARIOS Y NO TENER QUE ESCRIBIR CADA METODO EN EL MAIN CADA VEZ QUE YO LO NECESITE.
        
//PASO 19-> a)instanciar un objeto de tipo servicio para poder acceder 
VendedorServicio vs=new VendedorServicio();
//b)y ademas vamos a necesitar hacer una instanciacion del objeto que yo voy a alojar el retorno de lo que 
//construimos en la clases de servicio

Vendedor v1=vs.altaVendedor();

/**
 * este metodo de "alta vendedor" retorna un objeto del tipo vendedor llamado V1 con todos sus atributos llenos.
 * 
 * 
 * Ahora bien, este objeto (v1) es el que tenemos que alojar en el main para poder luego pasarlo como 
 * parametro para llamar al resto de los metodos cargados
 */

/**
 * c)una vez que yo ya tengo en la clase principal o main el objeto que retorna de la funcion con todos sus atributos
 * cargados, puedo llamar a los otros metodos que declaramos en la clase service, pasandole por parametro este 
 * objeto "v1" que cramos en el primer metodo, para hacer los distintos calculos que habiamos determinado
 */

vs.SueldoMensual(v1);
vs.Vacaciones(v1);



    }

}
