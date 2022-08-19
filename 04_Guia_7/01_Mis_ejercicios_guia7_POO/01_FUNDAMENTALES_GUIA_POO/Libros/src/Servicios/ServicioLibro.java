/**
 * en este perfil vamos a realizar todos las operaciones que mi proyecto demande para
 * solo hacer un programa mas limpio
 */
package Servicios;

import Entidades.Libros;
import java.util.Scanner;

public class ServicioLibro {

    //coloco el objeto leer del metodo scanner con la extencion de useDelimiter para que 
    //me permita realizar un salto de linea, y se introduce el scanner de modo global
    //para que todos los metodos puedan trabajar con el
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //metodos
    //creo mi objeto al cual voy a cargar todos los datos a los corrspondientes atributos
    Libros l1 = new Libros();

    //1.metodo-> cargar un libro
    
    public Libros Cargarlibros() {
        //que introduzca el isbn
        System.out.print("Insterte el ISBN->");
        l1.setIsbn(leer.nextInt());
        System.out.println("");

        //que introduzca el titulo
        System.out.print("Insterte el Titulo->");
        l1.setTitulo(leer.next());
        System.out.println("");

        //que introduzca el Autor
        System.out.print("Insterte el Autor->");
        l1.setAutor(leer.next());
        System.out.println("");

        //que introduzca el isbn
        System.out.print("Insterte el Numeros de Páginas->");
        l1.setNumerosdepag(leer.nextInt());
        System.out.println("");

        return l1;
        
        

    }

    

}
