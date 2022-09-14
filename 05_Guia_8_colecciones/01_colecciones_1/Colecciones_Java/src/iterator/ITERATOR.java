package iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;

public class ITERATOR {

    public static void main(String[] args) {

        /*
        Es un objeto del Framework de colecciones que me permite recorrer 
        y eliminar algún elemento de una colección, ya que si realizo esto
        con un foreach me tira un error.
        
        iterator()-> este, devuelve las instruccines para iterar sobre 
        esa coleccion. Este método iterator(), devuelve la colección, lo 
        recibe el objeto iterator y usando el objeto iterator, podemos
        iterar sobre nuestra colección.
        
        PARA PODER USAR EL ITERATOR ES IMPORTANE CREAR EL ONJETO DE TIPO
        ITERATOR, CON EL MISMO TIPO DE DATO QUE NUESTRA COLECCION.
        
        ******************************************************************
        ******************************************************************
        ******************************************************************        
        
        El Iterator contiene 3 métodos:
        
        boolean-> hasNext() -> Retorna true si al iterator le quedan
                            elementos por iterar.
        
        Object-> next() -> Devuelve el siguiente elemento en la colección, 
                         mientras el método hasNext() retorne true. Este 
                         método es el que sirve para mostrar el elemento.
        
        void-> remove() -> Elimina el elemento actual de la colección.
        
        ******************************************************************
        ******************************************************************
        ******************************************************************
         */
        /**
         * **** ELIMINAR UN ELEMENTO DE UNA COLECCIÓN CON ITERATOR ******
         *
         * Esto aplica para el resto de las colecciones, excepto los mapas que
         * son los único que NO PODEMOS ELIMINAR MIENTRAS LAS ITERAMOS.
         */
        
        /*
        ******************************************************************
        ******************************************************************
        **************** ORDENAR UNA COLECCION ***************************
        
        Collections.sort( coleccion ) -> función a usar, recibe la 
        colección y la ordena para despues poder mostrarla ordenada 
        de manera ascendente.  
        
        Algunas colecciones, como los conjuntos o los mapas no pueden 
        utilizar el sort(). Ya que por ejemplo los HashSet, manejan 
        valores Hash y el sort() no sabe ordenar por hash, si no por 
        elementos. Por otro lado, los mapas al tener dos datos, 
        el sort() no sabe por cuál de esos datos ordenar.
        
        Entonces, para ordenar los conjuntos, deberemos convertirlos a
        listas, para poder ordenar esa lista por sus elementos. Y a la
        hora de ordenar un mapa como tenemos dos datos para ordenar, 
        vamos a convertir el HashMap a un TreeMap.
        
        Nota: recordemos que los TreeSet y TreeMap se ordenan por sí
        mismos.
        
        */
        
        
        //*********** RECORREMOS LA LISTA CON EL ITERATOR ****************
        System.out.println("*************** ARRAY LIST *************\n");

        ArrayList<String> lista = new ArrayList();
        
        //creo mis variable cadena
        String A = "Diego";
        String B = "Ignasio";
        String C = "Marcelo";
        String D = "juan";
        
        //agrego mis nombres a mi lista        
        lista.add(A);
        lista.add(B);
        lista.add(C);
        lista.add(D);
        
        System.out.println("Orden de una Lista por sort()\n");

        Collections.sort(lista);
        
        System.out.println("************* ITERATOR LISTA ********");
        //creamos el Iterator para recorrer la lista
        Iterator iterator = lista.iterator(); // devolvemos el iterator
        System.out.println("Elemento de la Lista");

        // armamos un bucle while, siempre que el hasnext() devuelva true
        while (iterator.hasNext()) { //mostamos los elementos con el 
            // iterator.next()

            System.out.println(iterator.next() + " ");

        }
        System.out.println(" ");
        
        System.out.println("*******************************************");
        
        System.out.println("* ITERATOR ELIMINAR ELEMENTO DE LA LISTA *");
        
        // Creo un objeto enter del tipo iterator para recorrer la lista
        // por medio del metodo iterator()
        Iterator<String> enter = lista.iterator();
        
        //pregunto si tiene un elemento y si es veradero, quiero borrar
        //algún elemento
        while( enter.hasNext() ){
            if (enter.next().equalsIgnoreCase("Diego")) {
                enter.remove();
            }
            
        }
        
        System.out.println("Muestro mi Lista luego del Borrado\n");
        // vuelvo a crar un nuevo objeto iterator el cual me devuelve 
        //un nuevo iterator en la lista
        Iterator iterar = lista.iterator();
        
        //mientras haya un elemento me mostrara la lista
        while( iterar.hasNext() ){
            System.out.println("ListaActualizada-> " + iterar.next());            
        }
        System.out.println("");
        
        System.out.println("*******************************************");

        //****************************************************************        
        //*********************** CONJUNTO *******************************
        /*
        recordemos que en un conjunto no hay elementos duplicados como
         podria ser el caso de un arraylist
         */
        
        System.out.println("**************** CONJUNTO ******************");
        
        HashSet<Integer> NumerosSet = new HashSet();

        //creamos variables de tipo entero
        Integer a = 10;
        Integer b = 20;
        Integer c = 30;
        Integer d = 40;

        //agregamos las variable a nuestra colección
        NumerosSet.add(a);
        NumerosSet.add(b);
        NumerosSet.add(c);
        NumerosSet.add(d);
        
        System.out.println("Orden de un Conjunto por sort()\n");
        
        // se convierte el HashSet en Lista
        ArrayList<Integer> NumeroLista = new ArrayList( NumerosSet );
        
        //Ordeno la coleccion en forma ascendente
        Collections.sort(NumeroLista);
        
        //Mostramos el nuevo array que hemos creado desde el Conjunto
        NumeroLista.forEach((orden) -> {
            System.out.println("NumerosOrdenados-> " + orden);  
        });
        
        System.out.println("");
        
        System.out.println("*******************************************\n");
        
        System.out.println("Mostramos los elementos del Conjunto sin ordenar");        
        
        //Mostramos nuestro Conjunto
        NumerosSet.forEach((conjunto) -> {
            System.out.println("Numero-> " + conjunto + "\n");
        });
        System.out.println("*******************************************");
        
        System.out.println("************* ITERATOR CONJUNTO ********");
        //*********** RECORREMOS UN CONJUNTO CON EL ITERATOR *************
        //creamos el objeto iterator para recorrer el conjunto
        Iterator iterator2 = NumerosSet.iterator();// devuelve le iterator

        //while-> entra siempre que hasnext() == true
        while (iterator2.hasNext()) {
            System.out.println("NumerosConjunto-> " + iterator2.next()
                    + "\n");
        }
        
        System.out.println("*******************************************");
        //****************************************************************
        
        System.out.println("******** ITERATOR ELIMINAR ELEMENTO ********");
        //*********** ELIMINAR UN ELEMENTO DEL CONJUNTO *************
        //creamos el objeto iterator del tipo de dato de la colección
       
        Iterator <Integer> entero2 = NumerosSet.iterator();

        //while-> entra siempre que hasnext() == true
        while (entero2.hasNext()) {/* si hasnext posee elementos entonces
                                    devuelve un true */
            if (entero2.next() == 10) { /* si el elemento mediante la 
                                          variable entero2 es igual a 10                                   
                                          entonces*/
                entero2.remove();       // remueva el elemento
            }
        }
        
        System.out.println("Muestro el Cojunto con el elemento Borrado\n");
        
        //cramos un objeto iterator3 para que nos devuelva el iterator
        Iterator iterator3 = NumerosSet.iterator(); /*
        para tener en cuenta, cada vez que deba recorrer el conjunto o 
        lista, luego de una eliminación de un elemento, debo hacer una 
        nueva iteración con un objeto nuevo
        */
        
        
        while (iterator3.hasNext()) {
            System.out.println("NumerosConjunto_2-> " + iterator3.next()
                    + "\n");
        }
        
        System.out.println("*******************************************\n");
        
        System.out.println("************* MAPAS *************");
        System.out.println("Mostramos como seria un Orden en los MAPAS\n");
        
        //Mapas
        //creamos nuestro MAPA
        HashMap<Integer , String > alumnos = new HashMap();
        
        //agregamos elementos a nuestro Mapa
        alumnos.put(10, "Diego");
        alumnos.put(20, "Juan");
        alumnos.put(35, "Vero");
        alumnos.put(8, "Carla");
        alumnos.put(40, "Diego");
        
        System.out.println("Muestra por Defecto\n");
        
        //Mostramos nuestro Mapa
        alumnos.entrySet().forEach((iterador) -> {

            System.out.println("Number-> " + iterador.getKey() + "\n"
                    + "Name-> " + iterador.getValue() + "\n");

        });
        System.out.println("*******************************************");
        
        // debemos convertirlo de HashMap a TreeMap
        TreeMap< Integer, String > alumnosTree = new TreeMap( alumnos );
        
        System.out.println("Muestra por Orden Ascendente\n");
        
        //Mostramos nuestro Mapa
        alumnosTree.entrySet().forEach((iterador) -> {

            System.out.println("Number-> " + iterador.getKey() + "\n"
                    + "Name-> " + iterador.getValue() + "\n");

        });
        System.out.println("*******************************************");
        
       
        
        //****************************************************************
    }

}
