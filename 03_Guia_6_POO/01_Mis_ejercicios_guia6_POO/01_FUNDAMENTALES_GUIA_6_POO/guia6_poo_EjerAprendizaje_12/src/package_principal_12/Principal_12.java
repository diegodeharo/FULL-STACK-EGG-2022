package package_principal_12;

import Package_Entidad_Persona.Persona;
import Package_Servicio_Persona.Persona_Servicio;
import java.util.Scanner;

public class Principal_12 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        // instanciamos el objeto de tipo servicio ya q es donde se realizo los calculos
        Persona_Servicio p1 = new Persona_Servicio();
        // intanciamos el objeto de tipo persona el cual posee los atributos y le asignamos
        //mediante el objeto p1 los datos cargados en los atributos correspondientes
        Persona introducir = p1.crearPersona();

        System.out.println("********************************************************");

        // persona 2
        Persona_Servicio p2 = new Persona_Servicio();
        // datos de la persona 2
        Persona introducir2 = p2.crearPersona();

        System.out.println("********************************************************");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // llamo a calcuclar edad p 1 y 2
        System.out.println("La edad de " + introducir.getNombre() + " es -> " + p1.calcularEdad());
        System.out.println("La edad de " + introducir2.getNombre() + " es -> " + p2.calcularEdad());

        System.out.println("********************************************************");

        // llamo a menor que
        System.out.println(introducir.getNombre() + " es menor que " + introducir2.getNombre() + "? -> " + p1.menorQue(p2.calcularEdad()));

        System.out.println("********************************************************");

        p1.mostrarPersona(introducir.getNombre(), introducir2.getNombre(), p1.calcularEdad(), p2.calcularEdad());
       
        System.out.println("********************************************************");
        System.out.println("********************************************************");
        
        /*
        
          // llamo a calcuclar edad p2
        p2.calcularEdad();
        
        System.out.println("");
        
        // introducir otra edad
       /* System.out.println("Nueva Edad:");
        int dia, mes, anio;
        
        System.out.print("Año->");
        anio = leer.nextInt();
        
         System.out.print("Mes->");
        mes = leer.nextInt();
        
         System.out.print("Dia->");
        dia = leer.nextInt();
        
        System.out.println("");
        
        System.out.println(introducir.getNombre() + " es menor? -> " + p1.menorQue(anio, mes, dia));*/
    }

}
