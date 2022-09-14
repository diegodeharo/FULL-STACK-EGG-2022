/*
  Diseñar un programa que lea y guarde razas de perros en un ArrayList
de tipo String. El programa pedirá una raza de perro en un bucle, 
el mismo se guardará en la lista y después se le preguntará al usuario
si quiere guardar otro perro o si quiere salir. Si decide salir, se 
mostrará todos los perros guardados en el ArrayList.

Después de mostrar los perros, al usuario se le pedirá un perro y se recorrerá
la lista con un Iterator, se buscará el perro en la lista. Si el perro 
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la
lista ordenada. Si el perro no se encuentra en la lista, se le informará al 
usuario y se mostrará la lista ordenada.
 */
package perros.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author EL_SEMENTAL
 */
public class PerrosServicios {
    
    // objeto del tipo scanner para el ingreso por teclado
    Scanner leer = new Scanner(System.in);
    
    //creo mi array de razas de perros
    ArrayList<String> razasPerros = new ArrayList();
    
    //Metodos para -> ingreso de raza, muestra de raza y eliminacion de raza
    
    //ingreso la raza del perro
    
    public void ingresarRaza (){
        
        // creo unas banderas para determinar si quiere o no continuar agregando
        // o borrando
        boolean aux = true;
        boolean aux2 = false;
        
        do{
        System.out.print("Ingrese la Raza-> ");
        razasPerros.add(leer.next());
        
        System.out.println("*******************************");
        
        System.out.println("Desea seguir Agregando? S/N");
        
        //creamos una variable de tipo String que recibira el dato por teclado
        String tecla = leer.next();
        
        aux = tecla.equalsIgnoreCase("s");
        System.out.println("*******************************");
        
        } while (aux);
        
        //si el usuario desea salir, se mostrara todos las razas intoducidas
        
        if (!aux) {
            
           mostrarRazas();
            
        }
        
        System.out.println("*******************************");
        
        // se pedira que Raza desea eleminar
        System.out.println("Desea Eliminar alguna Raza? S/N");
        
        //creo un String donde ingreso por teclado la respuesta
        String res = leer.next();
        
        //formulo la condición de acuerdo a la respuesta
        if (res.equalsIgnoreCase("s")) {

            eliminarRaza(); //eliminar una raza
            mostrarActualizado(); // muestra la nueva lista actualizada

        } else {

            mostrarActualizado();// por defecto me muestra la lista 
                                 // ordenada

        }
        
        System.out.println("*******************************");
    }
    
    // metodo mostrar razas
   public void mostrarRazas(){
       
       System.out.println("Las Razas introducidas son:");
       razasPerros.forEach((contador) -> System.out.println("  *Raza-> "
               + contador));
       
   } 
   
   //Metodo eliminarRaza
   public void eliminarRaza(){
       
       //creo una variable contador para saber si se borro o no mi
       //elemento
       int cont = 0;
       
       System.out.print("Ingrese la Raza a Eliminar-> ");
       
       //variable que su contenido se introduce por medio del teclado
        String razaBusqueda = leer.next();
        
       //se creara un recorrido por medio de un ITERATOR PERO debo 
       //ESPECIFICAR EL MISMO TIPO DE DATO de mi array 
       Iterator<String> it = razasPerros.iterator();
       
       //siempre y cuando haya un elemento en la lista Hashnext == true
       while( it.hasNext() ){
           
           if ( it.next().equalsIgnoreCase(razaBusqueda) ) {
               
               cont++;
               it.remove();
               
           }
           
       }  
       
       if (cont>0) {
           
           System.out.println("Borrado Exitoso");
           cont = 0;
       
       }else{
           
           System.out.println("** ERROR ** Ingrese un Raza de la LIsta");
           
       }
           

       System.out.println("*******************************");
       
   }
   
   //Metodo mostrarActualizado-> muestra la lista luego del borrado
   public void mostrarActualizado(){
       
       //creo el sort para una lista ordenada de forma ascendente
       Collections.sort(razasPerros);
       
       //creo un objeto del tipo iterator para recorrer la lista
       Iterator it = razasPerros.iterator();//devuelve un iterator It
       
       
       System.out.println("Mis Razas Actualizadas son:");
       
       // mientras it.hashNext() == true
       while( it.hasNext() ){
           
           System.out.println("  *Razas-> " + it.next() );
           
       }
       
   }
   
    
}
