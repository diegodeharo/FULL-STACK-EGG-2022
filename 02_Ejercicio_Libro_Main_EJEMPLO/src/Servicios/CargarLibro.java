/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas.
 */
package Servicios;//paso 5-> para realizar todas las operaciones logicas o mas que se necesiten.

import Molde.CrearLibro;
import java.util.Scanner;

public class CargarLibro {

    Scanner leer = new Scanner(System.in);
    CrearLibro libro1 = new CrearLibro();//paso 6-> donde creo al objeto de variable libro1 y la hago nacer

    public CrearLibro datos_libro() {//paso 7-> un metodo para poder llenar los valores que me pide el enunciado
        /*
        public int isbn;
        public String titulo;
        public String autor;
        public int paginas;
         */
        //paso 8-> mediante el objeto creado usamos el set para darle valor a nuestros atributos
        System.out.print("Ingrese el ISBN-> ");
        libro1.setIsbn(leer.nextInt());
        System.out.println("");

        System.out.print("Ingrese el Título-> ");
        libro1.setTitulo(leer.next());
        System.out.println("");

        System.out.print("Ingrese el Autor-> ");
        libro1.setAutor(leer.next());
        System.out.println("");

        System.out.print("Ingrese las Páginas-> ");
        libro1.setPaginas(leer.nextInt());
        System.out.println("");

        return libro1;
    }
    
    //paso 9-> creo un metodo para mostrar el libro realizado, mostrando los datos que me piden en el enunciado
    public void  Mostrar_libro(CrearLibro libro1){//paso10-> creo el metodo por parametro sin necesidad de crear
        //un metodo con tipo de dato "crearlibro" ya que no devuelvo ningun valor y solo voy a mostrar
        
        //paso 11-> con este metodo mostramos cada item realizado en el metodo anterior
        System.out.print("El isbn es->"+libro1.getIsbn()); 
        System.out.println("");
        
        System.out.print("El Titulo es->"+libro1.getTitulo()); 
        System.out.println("");
        
        System.out.print("El isbn es->"+libro1.getAutor()); 
        System.out.println("");
        
        System.out.print("El isbn es->"+libro1.getPaginas()); 
        System.out.println("");
        
    }
    
}
