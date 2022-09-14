
import java.util.ArrayList;
import java.util.List;
import entidades.Mascota;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import servicios.ServicioMascota;
import utilidades.Comparadores;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hGauna
 */
public class Guia8Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //-----------------------------------------------OTRO TEMA-------------------------------------------------------
        //-----------------------------------------------------MAP---------------------------------------------------------------
        HashMap<String, Mascota> macotas = new HashMap();
        macotas.put("1", new Mascota("Kira", "boxer"));
        macotas.put("2", new Mascota("Deiba", "golden"));
        macotas.put("3", new Mascota("Juana", "puro amor"));
        macotas.put("4", new Mascota("Soraya", "golden"));

        for (Map.Entry<String, Mascota> element : macotas.entrySet()) {
            String key = element.getKey();
            Mascota value = element.getValue();
            System.out.println("Key: " + key + " value.nombre: " + value.getNombre() + " value.raza: " + value.getRaza());
            System.out.println("---------------------------------------------------");
            System.out.println("Key: " + key + " value: " + value); //hace uso del toString en la clase Mascota
        }
        //remover especificando indice y objeto
        macotas.remove("1", new Mascota("Soraya", "golden"));
        //remover especificando solo el  indice
        macotas.remove("1");

        for (Map.Entry<String, Mascota> element : macotas.entrySet()) {
            String key = element.getKey();
            Mascota value = element.getValue();
            System.out.println("Key: " + key + " value.nombre: " + value.getNombre() + " value.raza: " + value.getRaza());
            System.out.println("---------------------------------------------------");
            System.out.println("Key: " + key + " value: " + value); //hace uso del toString en la clase Mascota
        }

//-----------------------------------------------OTRO TEMA-------------------------------------------------------
//-----------------------------------------------------TreeSet-----------------------------------------------------------
//        Esto si no lo vamos a querer ordenar en el futuro
//        //Set<Mascota> mascotitas = new HashSet();
//        
//        //Esto si lo vamos a querer ordenar
//        TreeSet<Mascota> mascotitas = new TreeSet();
//        
//        mascotitas.add(new Mascota("lucas", "Golden"));
//        mascotitas.add(new Mascota("lucas", "Golden"));
//        mascotitas.add(new Mascota("lucas", "Golden"));
//        mascotitas.add(new Mascota("soraya", "Boxer"));
//        mascotitas.add(new Mascota("soraya", "Boxer"));
//        mascotitas.add(new Mascota("chiquito", "Puro amor"));
//        mascotitas.add(new Mascota("chiquito", "Puro amor"));
//        mascotitas.add(new Mascota("zzzz", "Puro amor"));
//
//        mascotitas.forEach((element) -> System.out.println(element.getNombre()));
//-----------------------------------------------OTRO TEMA-------------------------------------------------------
//---------------------------------------------SET o CONJUNTOS----------------------------------------------
//        //Estamos creando un conjunto de tipo string que se llama nombres y lo inicializamos como un hashSet
//        //No soportan elementos duplicados
//        Set<String> nombres = new HashSet();
//        //Lo mismo pasaria si fuera un treeSet
//        TreeSet<String> nombres2 = new TreeSet();
//        
//        nombres.add("chiquito1");
//        nombres.add("chiquito1");
//        nombres.add("chiquito1");
//        
//        nombres2.add("grandote");
//        nombres2.add("grandote");
//        nombres2.add("grandote");
//        
//        nombres2.forEach((element) -> System.out.println(element));
//        
//       nombres.forEach((element) -> System.out.println(element));
//-----------------------------------------------OTRO TEMA--------------------------------------------------------
//----------------------------------------------------LISTAS-------------------------------------------------------------
//        //A modo de pureba nada mas...  
//        String[] nombres = {"pepe", "pipo", "popo"}; //tenemos un array con nombres
//        List<String> nombresList = new ArrayList(Arrays.asList(nombres)); //importamos el array de nombres al arrayList
//
//        //otra prueba 
//        List<String> nombres_ = new ArrayList();
//        nombres_.add("Pao");
//        nombres_.add("Abi");
//        nombres_.add("Pola");
//        nombres_.add("Kira");
//
//        //bucles iteradores para recorrer arrays
//        System.out.println("----ForEach-----");
//        for (String elem : nombres_) {
//            System.out.println(elem);
//        }
//
//        System.out.println("---- otro ForEach-----");
//        nombres_.forEach((e) -> System.out.println(e));
//
//        System.out.println("---- Stream Revisar documentacion-----");
//        nombres_.stream().count();
//
//        System.out.println("----For clasico----");
//        for (int i = 0; i < nombres_.size(); i++) {
//            System.out.println(nombres_.get(i));
//        }
//
//        System.out.println("----For clasico recorrer para eliminar----");
//        for (int i = 0; i < nombres_.size(); i++) {
//            String m = nombres_.get(i);
//            if (m.equals("Abi")) {
//                nombres_.remove(m);
//            }
//
//        }
//        nombres_.forEach((e) -> System.out.println(e));
//
//        System.out.println("----ITERATOR----");
//        Iterator<String> it = nombres_.iterator();
//        while (it.hasNext()) {
//            String aux = it.next();
//            System.out.println(aux);
//            if (aux.equals("Kira")) {
//                it.remove();
//            }
//        }
//        nombres_.forEach((e) -> System.out.println(e));
//
//        System.out.println("----------------para usar COMPARATOR-------------- ");
//        ArrayList<Mascota> mascotas = new ArrayList();
//        mascotas.add(new Mascota("soraya", "Boxer"));
//        mascotas.add(new Mascota("chiquito", "Puro amor"));
//        mascotas.add(new Mascota("lucas", "Golden"));
//        mascotas.add(new Mascota("kira", "Boxer"));
//        mascotas.add(new Mascota("Juana", "Puro amor"));
//        mascotas.add(new Mascota("Deiba", "Golden"));
//
//        mascotas.forEach((e) -> System.out.println(e.getNombre()));
//        Collections.sort(mascotas, Comparadores.ordenarPorNombreDesc);
//        //Collections.shuffle(mascotas);
//        System.out.println("COMPARATOR ORDENADO");
//        //mascotas.forEach((e)-> System.out.println(e.getNombre()));
//        for (Mascota m : mascotas) {
//            System.out.println(m.getNombre());
//        }
//        /*        
//        ServicioMascota servMasc = new ServicioMascota();
//        //List<Mascota> mascotitas = new ArrayList<>();
//        //servMasc.crearMascota();
//        servMasc.fabricaMascota(2);
//        servMasc.mostrarMascota();
//        servMasc.actualizarMascota(0);
//        servMasc.mostrarMascota();
//        servMasc.eliminarMascota(0);
//        servMasc.mostrarMascota();
//         */
    }

}

/*        
        //Cargando y recorriendo arrays
        String[] nombresArray = new String[5];
        
        for (int i = 0; i < nombresArray.length; i++) {
            nombresArray[i] = "Personaje " + (i+1);
        }
        
        for (String elemento : nombresArray){
            System.out.println(elemento);
        }
        System.out.println("---------------------------------------------------------");
        //Cargando y recorriendo un arrayList
        ArrayList<String> nombresArrList = new ArrayList();
        
        for (int i = 0; i < 5; i++) {
            nombresArrList.add("Personaje " + (i + 1));
        }
        
        for (String element : nombresArrList) {
            System.out.println(element);
        }
*/
