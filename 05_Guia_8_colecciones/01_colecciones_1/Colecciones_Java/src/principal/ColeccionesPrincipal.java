package principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

public class ColeccionesPrincipal {

    public static void main(String[] args) {
        

        //********************* DEFINICIONES **************************
        
        // trabajaremos con colecciones-> representa un grupo de objetos
        // conocidos como Elementos, la única restricción es que no 
        // crearemos objetos de tipos primitivos, sino sus equivalentes
        // en vez de int usamos Integer
        
        /*
         * Para tener muy en cuenta, las colecciones, crecen de manera dinámica
         * (es decir de manera que se vayan agregando mas objetos) y no como los
         * arreglos comunes, donde ponemos un indice de inicio y fin
         */
        
        /*
         * Vamos a trabajar en el Java Collections Framework del paquete
         * Java.util -> Que es una ARQUITECTURA compuesta de Intefaces y Clases.
         */
        
        /**
         * FRAMERWORK-> posee un CONJUSTO ESTANDARIZADOS de Conceptos,
         * Prácticas, Criterios y Herramientas para resolver un problema en
         * particular o de indole similar.
         */
        
        
        /*
        LISTAS-> Los elementos están más ordenados y podemos elegir en que
        lugar colocar cada elemento mediante el indice. Ej: 
        lista[0] == lista[1]
        */
        
        /*
        ArrayList -> es un arreglo de tamaño variables con las caracteristicas 
        de las listas
        */
        
        /*
        LinkedList -> es una lista de DOBLE ENLACE es decir como una Lista 
        Enlazada que permite moverse hacia delante y hacia atras. Su rendi
        miento es mejor al agregar y quitar que arraylist, pero peor en los
        metodos set y get.
        */
        
        // ejermplos de un ArrayList y un LinkedList
        
        // ArrayList
        ArrayList <Integer> numerosA = new ArrayList();
        
        //LinkedList
        LinkedList <Integer> numerosB = new LinkedList();
        
        /*
        CONJUNTO o Set (ingles)-> a diferencia de una lista, NO HAY DUPLICADOS
        , modelan una colección de objetos de una misma clase, donde c/elemento
        aparece SOLO UNA VEZ.
        */
        
        /*
        HashSet -> se implementa utilizando una tabla Hash la cual le da un 
        valor único, evitando así, los duplicados, pero los elementos no 
        están ordenados.
        */
        
        /*
        Hash-> una función Criptográfica, es un algoritmo matemático que trans
        forma cualquier bloque arbitrario de datos en una nueva serie de caracte
        res alfanuméricos (letras y números) con LONGITUD fija.
        */
        
        /*
        TreeSet -> se implementa utilizando una ESTRUCTURA DE ARBOL
        ordena los elementos, pero los métodos de agregar y eliminar
        son más lentos que HashSet ya que al entrar un nuevo elementos debe
        ordenarlo, tampoco admite duplicados.
        */
        
        /*
        LinkedHashSet -> esta entre HashSet y TreeSet, se implementa como 
        una tabla hash con una lista vinculada que se ejecuta a través de 
        ella, por lo que propociona el orden de inserción.
        */
        
        
        //ejemplos de HashSet de cadenas
        HashSet<String> nombres = new HashSet();
        
        //Ejemplos de un treeset de numeros
        TreeSet <Integer> numeros = new TreeSet();
        
        //Ejemplo de un LinkedHashSet de cadenas
        LinkedHashSet <String> frases = new LinkedHashSet();
        
        //******************** MAPAS ****************************************
        /*
        MAPAS -> Modelan un Objeto a TRAVES DE UNA LLAVE Y UN VALOR, es decir
        que cada valor va a tener una llave unica para representar dicho Valor
        , donde las llaves son UNICAS y los valores si pueden repetirse, por
        por Ej: una persona que tiene su DNI (llave única) y como valor seria
        su Nombre, el cual puede repetirse el nombre, pero no así su DNI.
        
        Los mapas poseen dos tipos de datos, el cual el primero es para la 
        llave y el segundo sería para el valor, es decir que el tipo de dato
        no deben de ser los mismos.
        */
        
        /*
        HashMap -> es un mapa implementado a través de una tabla Hash, las
        llaves se almacenan utilizando un algoritmo de hash solo PARA LAS LLAVES
        y evitar QUE SE REPITAN.
        */
        
        /*
        TREEMAP -> es un Mapa que ordena los Elementos de maneja ascendentes a 
        traves de las llaves.
        */
        
        /*
        LinkedHashMap -> es una HasMap que conserva el orden de inserción.
        */
        
        
        //Ejemplos de un HasMap de personas
       // HashMap<Llave,Valor> indentificador = new HashMap();
        HashMap<Integer,String> personaA = new HashMap();
        
        // Ejemplo de un TreeMap de personas
        TreeMap <Integer,String> personasB = new TreeMap();
        
        // Ejemplo de un LinkedHashMap de personas
        LinkedHashMap<Integer,String> PersonaC = new LinkedHashMap();
        
        //*************************************************************
        //*************************************************************
        //*************************************************************
        //*************************************************************
        
        //********** Añadir un elemento a una coleccion ***************
        
        /*
        Listas y Conjutos usamos -> add(T) (función)
        
        Mapas -> put(llave,valor) (función)        
        */
        
        //*************************************************************
        //*********** Ejemplo general para adherir, eliminar **********
        //*************************************************************
        
        //***************** AGREGAMOS EN LISTAS ***********************        
        //Listas de tipo Integer
        ArrayList<Integer> NumerosA = new ArrayList(); 
        int x = 20;
        NumerosA.add(x);/* agregamos el numero 20 a la lista, en la 
                            posición 0        
                            */
        //*************************************************************
        
        //***************** RECORREMOS EN LISTAS ********************** 
        // mostramos los elementos a través de la variable
        
        for (Integer numero : NumerosA) {            
            System.out.println("NumeroLista-> " + numero);            
        }
        System.out.println("*****************************************\n");
     
        //*************************************************************

        //******************** ELIMINAR LISTA *************************
        // ELIMINAR INDICE *************************
        //ejemplo de eliminar el numero que esta en el indice 0
        NumerosA.remove(0); //Elimina el número que está en el indice 0

        //Eliminar por ELEMENTO
        ArrayList<Integer> NumerosC = new ArrayList();
        Integer i = 50;
        int p = 45 ;
        NumerosC.add(i);
        NumerosC.add(p);
        //queda pendiente el ver porque no funca el eliminar por elemento
        //de una lista.
        NumerosC.remove(i);// Elimina el numero 10 o el PRIMER 10 que 
                            // encuentre

        //*************************************************************

        
        //***************** AGREGAMOS EN CONJUNTO ********************
        //Conjuntos
        HashSet<Integer> NumerosB = new HashSet();
        Integer y = 20, m = 10, a = 5, k = 45;

        NumerosB.add(y);
        NumerosB.add(m);
        NumerosB.add(a);
        NumerosB.add(k);
        
        //*************************************************************
        
        //***************** RECORREMOS CONJUNTO ********************** 
        // mostramos los elementos a través de la variable
        
        for (Integer numerob : NumerosB) {            
            System.out.println("Numeros Conjunto-> " + numerob + "\n");            
        }
        System.out.println("*****************************************\n");
     
        //*************************************************************

        
        //***************** ELIMINAMOS EN CONJUNTO ********************
        
        NumerosB.remove(20); // Eliminamos el numero 50 o el primer 50
        
        //*************************************************************
        
       
        //***************** AGREGAMOS EN MAPA ************************       
        //Mapas
        HashMap<Integer, String> Alumnos = new HashMap();
        
        int Dni1 = 34873426;
        String nombreAlumno1 = "Diego";
        Alumnos.put(Dni1, nombreAlumno1);//agregamos la llave y el valor

        int Dni2 = 34659854;
        String nombreAlumno2 = "Carlos" ;
        Alumnos.put(Dni2, nombreAlumno2);//agregamos la llave y el valor
        
        int Dni3 = 36152365;
        String nombreAlumno3 = "Maria" ;
        Alumnos.put(Dni3, nombreAlumno3);//agregamos la llave y el valor
        
        int Dni4 = 16380629;
        String nombreAlumno4 = "Diego" ;
        Alumnos.put(Dni4, nombreAlumno4);//agregamos la llave y el valor
        
        int Dni5 = 13674674;
        String nombreAlumno5 = "Haydee" ;
        Alumnos.put(Dni5, nombreAlumno5);//agregamos la llave y el valor
        //*************************************************************

        System.out.println("Mapas\n");
        
        //***************** RECORREMOS MAPAS ********************** 
        // recorremos mediante el objeto Map.Entry
        // recorremos las dos partes del mapa
        Alumnos.entrySet().forEach((entry) -> {
            System.out.println("Nombre-> " 
                    
                    + entry.getValue() + "\n" + //trae valores del mapa
                            
                            "DNI-> " + entry.getKey() // trae llaves del mapa
                    
                    + "\n");
        });
     
        //*************************************************************
        
        //***************** 2_RECORREMOS MAPAS ************************ 
        // recorremos mediante SIN el objeto Map.Entry
        
        // recorremos POR parte el Mapa
        
        // llaves        
        for (Integer DNI : Alumnos.keySet()) {
            
            System.out.println("Dni-> " + DNI + "\n");
            
        }
        
        // valores
        Alumnos.values().forEach((Nombres) -> {
            System.out.println("Nombres-> " + Nombres + "\n");
        });
     
        //*************************************************************
        
        //***************** ELIMINAMOS EN MAPAS ********************
        // En los mapas el único elemento importate es su llave el 
        // cual lo hace único
        
        Alumnos.remove(34873426); // borramos la llave 34873426
        
        //*************************************************************
        
        
        
        //*************************************************************
        //*************************************************************
        //*************************************************************
        //*************************************************************
        
        //********** Eliminar un Elemento de una Colección ************
        
        /*
        LISTAS:
        
        * remove(int indice) -> remueve un elemento de acuerdo al indice
        seleccionado, provacando que todo se mueva para NO dejar un 
        indice sin Elemento
        
        *remove(elemento)-> remueve la PRIMERA aparicion de un elemento 
        a borrar en una lista
        */
        
        /*        
        CONJUNTOS: no CONSTA DE INDICES solo de borra por ELEMENTOS.
        
        remove(elemento)-> remueve el elemento en la primera aparición en
        un conjunto 
        */
        
        /*        
        MAPAS: La parte más importante de los mapas es su LLAVE ya que 
        lo hacen únicos
        
        remove(llave)-> remueve la primera aparición de la llave de un
        elemento en un mapa
        */
        
        //*************************************************************
        //*************************************************************
        //*************************************************************
        //*************************************************************
        
        
        //********** RECORRER UNA COLECCION ***************************
        
        /*
        Para las colecciones vamos a utilizar un bucle forEach
        
        Para los mapas utilizamos el objeto Map.Entry en el forEach,
        a través de este objeto vamos a traer las llave y los valores. 
        Pero sino, podríamos usar el forEach para cada parte de nuestro
        mapa
        */
        
        /*
        
        estructura de un forEach:
        
        for ( Tipo de dato variableVacia : Coleecion ){
        
        }
        
        */
       
        
        
      
        
        
        
    }

}
