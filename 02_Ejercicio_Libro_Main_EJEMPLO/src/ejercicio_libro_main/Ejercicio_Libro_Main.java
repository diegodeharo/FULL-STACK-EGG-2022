
package ejercicio_libro_main;

import Molde.CrearLibro;
import Servicios.CargarLibro;


public class Ejercicio_Libro_Main {

    
    public static void main(String[] args) {
     
        /*
        Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
        Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
        constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
        luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
        numero de páginas.
        */
        CargarLibro libro1= new CargarLibro();//paso 12-> crear e inicializar el objeto con variable L1
        CrearLibro l1=libro1.datos_libro();//paso 13-> crear el objeto crearlibro con nombre de variable l1, el cual luego debe ser importado 
                                           //a este objeto lo inicializo pasando los valores, a travez del paquete de 
                                           //servicios, llamando a la clase cargarlibro y al metodo datoslibros
       
        libro1.Mostrar_libro(l1);//paso 14-> como el objeto cargar libro ya esta importado, ahora necesito mostrar los datos que se ingresaron
                                           //para ello como tambien ya esta importado el objeto servicio cargar libro, solo debo mostrar los valores 
                                           //que cargue en el llamado anterior.
        
        
    }
    
}
