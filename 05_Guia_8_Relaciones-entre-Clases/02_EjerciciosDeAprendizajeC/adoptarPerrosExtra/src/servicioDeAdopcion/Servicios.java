/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioDeAdopcion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import perro.Perro;
import persona.Persona;
import tamanio.Tamanio;

/**
 *
 * @author EL_SEMENTAL
 */
public class Servicios {

    // Instanciamos un objeto de tipo scanner para el ingreso de datos
    Scanner leer = new Scanner(System.in);

    // creamos un array de personas 
    ArrayList<Persona> persona = new ArrayList();

    // Creamos un array de perros
    ArrayList<Perro> perro = new ArrayList();

    // Cramos un array de perros adoptados
    ArrayList<Perro> perroadoptados = new ArrayList();

    // metodo crear persona
//    public ArrayList<Persona> crearPersona() {
//        ArrayList persona = new ArrayList();
//        
//         persona.add( new Persona( "Diego","deHaro",32,34873426));
//         persona.add( new Persona( "Maria","deHaro",32,34873426));
//         persona.add( new Persona( "juan","deHaro",32,34873426));
//         persona.add( new Persona( "Claudia","deHaro",32,34873426));         
//        
//        return persona;
//    }
    ////////////////// personas ///////////////////////////////////   
    private void crearPersonas() {

        persona.add(new Persona("Diego", "deHaro", 32, 34873426));
        persona.add(new Persona("Maria", "deHaro", 32, 34873426));
        persona.add(new Persona("juan", "deHaro", 32, 34873426));
        persona.add(new Persona("Claudia", "deHaro", 32, 34873426));

    }

    private void mostrarPersonas() {

        for (Persona persona1 : persona) {
            System.out.println(persona1);
        }
    }

    ////////////////// Perros ///////////////////////////////////   
    public void crearPerros() {

        perro.add(new Perro("Firulai", "caniche", 2, Tamanio.MEDIANO));
        perro.add(new Perro("Toby", "boxer", 1, Tamanio.GRANDE));
        perro.add(new Perro("Zeus", "pitbul", 2, Tamanio.GRANDE));
        perro.add(new Perro("Nala", "labrador", 3, Tamanio.GRANDE));
        perro.add(new Perro("Oliver", "pinche", 5, Tamanio.CHICO));
    }

    private void mostrarPerros() {

        for (Perro perros : perro) {

            System.out.println(perros.getNombre());

        }
    }
    ////////////////////////////////////////////////////////////

     ////////////// Metodo Asigar Perro a Persona /////////////
    private void asignarPerro(String per, String can) {

        for (Persona p : persona) {
            if (p.getNombre().equalsIgnoreCase(per)) {
                for (Perro a : perro) {
                    if (a.getNombre().equalsIgnoreCase(can)) {
                        p.setPerro(a);
                    }

                }
            }
        }
    }

    ////////////////// Metodos Pricipal de Servicio  ////////////////////
    public void personaPerro() {

        crearPersonas();//instancio las personas
        crearPerros();//instancio los perrro

        String opcion = "n";//variable local aux 

        boolean bandera = false;// variable bandera de condicion

        // recorrido por la lista de las personas ubicando a cada una de ellas
        // por medio del indice i
        for (int i = 0; i < persona.size(); i++) {

            // un do.while para que cuando el nombre del can no este
            // se le de la opcion a la persona de volver a preguntar si
            // desea seleccionar un can de la lista.
            do {

                System.out.println(persona.get(i).getNombre()
                        + " que perro desea: ");

                System.out.println("ingrese el nombre del Perro: ");
                System.out.println("***************************");

                // instancia el metodo que muestra los canes
                mostrarPerros();

                System.out.println("***************************");

                System.out.print("Nombre-> ");
                String nom = leer.next();//asigo el nombre que luego se buscara

                System.out.println("***************************");

                //instancio un iterator para remover un can de la lita y luego
                // asignar ese can como atributo de una persona
                Iterator<Perro> removercan = perro.iterator();

                while (removercan.hasNext()) {// mientras haya un elemento en 
                    // en la lista se ejecuta

                    // si el nombre de can coincide con el ingresado por 
                    // el usuario se ejecuta el if
                    if (removercan.next().getNombre().equalsIgnoreCase(nom)) {

                        System.out.println(persona.get(i).getNombre()
                                + " adopto a " + nom.toUpperCase() + "\n"
                                + "*************************** \n");

                        // instancio el metodo donde asigno el can a la persona
                        // que lo solicito
                        asignarPerro(persona.get(i).getNombre(), nom);

                        removercan.remove();// remueve el can 

                        bandera = true;// habilita la bandera en true

                        break;// sale del bucle

                    }

                }

                // si la bandera es true, resetea la bandera para continuar 
                // con las otras personas en la lista
                if (bandera) {

                    bandera = false;// reset de bandera

                    break;// sale del bucle

                } else {// por defecto, le doy la opcion de elejir otro can

                    System.out.println("Disculpe, el perro seleccionado no se"
                            + " encuentra en la lista \n desea adoptar un perro?"
                            + " S / N \n ");

                    System.out.println("***************************");
                    System.out.print("Opcion-> ");
                    opcion = leer.next();// S o N para continuar con la 
                    // seleccion del can
                    System.out.println("***************************");
                    
                }

            } while (opcion.equalsIgnoreCase("s"));

            mostrarPersonas();// muestra a las personas con sus perros

        }
    }

}
