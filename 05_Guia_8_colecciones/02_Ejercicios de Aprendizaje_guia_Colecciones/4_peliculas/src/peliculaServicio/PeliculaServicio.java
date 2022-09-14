
package peliculaServicio;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import peliculaEntidad.PeliculaEntidad;

/**
 *
 * @author EL_SEMENTAL
 */
public class PeliculaServicio {
    
    //instancio un objeto de tipo scanner para la insercion de datos por 
    //teclado
    Scanner leer = new Scanner(System.in);//importo la clase
    
    //creo un Arraylist de tipo peliculaEntidad para luego guardar los datos
    //dentro de la lista como un objeto pelicula
    /**
     * importo tanto el array como el objeto peliculaEntidad
     */
    ArrayList<PeliculaEntidad> pelicula = new ArrayList<>();
    
    
    //Metodos de operación.
    
    //Metodo para el ingreso de la info de una o varias peliculas de
    // acuerdo lo que el usuario deseee
    public void infoPelicula() {

        //variable bandera
        boolean aux;

        do {//bucle de ingreso de mas de una pelicula por le usuario

            //titulo
            System.out.println("*********************************\n");
            System.out.print("** Ingrese el Nombre de la Película-> ");
            String titulo = leer.next();

            System.out.println("///////////////////////////////////");

            //Director
            System.out.print("** Nombre del Director-> ");
            String directo = leer.next();

            System.out.println("///////////////////////////////////");

            //Duración
            System.out.print("** Duración de la Pelicula-> ");
            Double duracion = leer.nextDouble();

            System.out.println("///////////////////////////////////");

            //creo una lista con mi objeto peliculaEntidad con sus parametros
            pelicula.add(new PeliculaEntidad(titulo, directo, duracion));

            //preguntamos si deseo o no agregas mas peliculas
            System.out.println("Desea Ingresar más Peliculas?");
            System.out.print("Op:(S / N)->");
            String respuesta = leer.next();
            aux = respuesta.equalsIgnoreCase("s");

            System.out.println("\n*********************************\n");

        } while (aux);

    }

    //////////////////////// mostrado de peliculas ///////////////////////
    //metodo mostrar todas las peliculas por interator
    public void mostrarPeliculas() {

        //creo un iterator
        Iterator it = pelicula.iterator();//devuelvo el iterator

        System.out.println("******************");
        System.out.println(" ** Pelicula ** \n");
        System.out.println("******************");

        while (it.hasNext()) {//mientras haya elementos

            System.out.println(it.next()); //muestro la lista de pelicula
            //de mi toString

        }

        System.out.println("*********************************\n");

    }

//    //metodo para mostrar por medio del foreach
//    public void mostrarPeliculas2(){
//        
//        System.out.println("*********************************\n");
//        
//        //utilizo un foreach para la mustra 
//        pelicula.forEach((peli)-> System.out.println(peli));
//        
//        System.out.println("*********************************\n");
//    }
    ////////////////////////////////////////////////////////////////////
    //metodo de pelicuals mayores a 1 hora
    public void mayorAunaHora() {

        System.out.println("*********************************");
        System.out.println("Peliculas Mayor de una Hora");
        System.out.println("*********************************");
        pelicula.forEach((peli) -> {

            if (peli.getDuracion() > 1) {

                System.out.println(peli);
            }
        });
    }
    ////////////////////////////////////////////////////////////////////

    //metodo: ordenar por duracion de mayor a menor
    public void mayorAmenorDuracion() {

        System.out.println("*********************************");
        System.out.println("Peliculas Mayor a Menor Duración");
        System.out.println("*********************************");
        //Collections.sort(pelicula, mayorMenor);
        pelicula.sort(mayorMenor);
        System.out.println(pelicula);
    }
    
    public static Comparator<PeliculaEntidad> mayorMenor = new Comparator<PeliculaEntidad>() {
        @Override
        public int compare(PeliculaEntidad p1, PeliculaEntidad p2) {
            
           double aux = p2.getDuracion() - p1.getDuracion();
           
            if (aux > 0) {                
                return 1;                
            }            
            if (aux < 0) {   
                return -1;
            }
            return 0;
        }
    };

    ////////////////////////////////////////////////////////////////////
    //metodo: ordenar por duracion de menor a mayor
    public void menorMayorDuracion() {

        System.out.println("*********************************");
        System.out.println("Peliculas Menor a Mayor Duración");
        System.out.println("*********************************");
        pelicula.sort(menorMayor);
        System.out.println(pelicula);
        
    }
    
    //uso un comparator
    public static Comparator<PeliculaEntidad> menorMayor = new Comparator<PeliculaEntidad>() {
        @Override
        public int compare(PeliculaEntidad p2, PeliculaEntidad p1) {
            
//            return p2.getDuracion().compareTo(p1.getDuracion());

            //creo una variable aux ya que los atributos de mis peliculas poseen
            //otro tipo de dato provocando que me ocasione un error, es por ello
            //el uso y creación de otra variable
            double aux = p2.getDuracion() - p1.getDuracion();
            if (aux > 0) {
                return 1;
            }
            if (aux < 0) {
                return -1;
            }
            return 0;
        }
    };
    
    ////////////////////////////////////////////////////////////////////
    // metodo para mostrar ordenado por titulo
    public void tituloAfabeticamente(){
        
        System.out.println("****************************");
        System.out.println("** Titulo modo Alfabetico **");
        System.out.println("****************************");
        pelicula.sort(Talfabetico);
        System.out.println(pelicula);
    }

    //interfaz comparador
    public static Comparator<PeliculaEntidad> Talfabetico = new Comparator<PeliculaEntidad>() {
        @Override
        public int compare(PeliculaEntidad p1, PeliculaEntidad p2) {
           return p1.getTitulo().compareTo(p2.getTitulo());
        }
    };
  
    ////////////////////////////////////////////////////////////////////
    // metodo para mostrar ordenado por directo
    public void directoAfabeticamente(){
        
        System.out.println("****************************");
        System.out.println("** Directo modo Alfabetico **");
        System.out.println("****************************");
        pelicula.sort(Dalfabetico);
        System.out.println(pelicula);
    }

    //interfaz comparador
    public static Comparator<PeliculaEntidad> Dalfabetico = new Comparator<PeliculaEntidad>() {
        @Override
        public int compare(PeliculaEntidad p1, PeliculaEntidad p2) {
           return p1.getDirector().compareTo(p2.getDirector());
        }
    };
    
    
}
