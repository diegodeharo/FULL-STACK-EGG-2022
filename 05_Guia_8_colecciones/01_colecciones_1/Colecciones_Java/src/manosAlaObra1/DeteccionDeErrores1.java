/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manosAlaObra1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;


public class DeteccionDeErrores1 {

   
    public static void main(String[] args) {
        
        //////////////////////////////////////////////////////

        ArrayList<Integer> listado = new ArrayList();
        
        TreeSet<String> palabras = new TreeSet();
        
        HashMap<Integer,String> personasA = new HashMap();
        
        //////////////////////////////////////////////////////
        
        HashMap<Integer , String> Personas = new HashMap();
        
        String n1 = "Carlos";
        Personas.put(Integer.SIZE, n1);
        
        String n2 = "Diego";
        Personas.put(Integer.SIZE, n2);
        
        Personas.entrySet().forEach((persons) -> {
            System.out.println("Nombre-> " + persons.getValue());
        });
        
        Personas.values().forEach((persons2)-> {
        System.out.println("Nombre-> " + persons2);
    });
        
        //////////////////////////////////////////////////////
        ArrayList<String> bebidas = new ArrayList();
        
        bebidas.add("café");
        bebidas.add("té");

        Iterator<String> it = bebidas.iterator();
        while (it.hasNext()) {
            if (it.next().equals("café")) {
                it.remove();
            }
        }
        //////////////////////////////////////////////////////
        
        
        

    }
}
