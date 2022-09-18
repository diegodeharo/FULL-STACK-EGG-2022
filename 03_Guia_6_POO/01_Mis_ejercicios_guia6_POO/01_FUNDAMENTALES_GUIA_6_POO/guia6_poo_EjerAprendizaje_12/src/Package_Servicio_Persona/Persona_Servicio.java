package Package_Servicio_Persona;

import Package_Entidad_Persona.Persona;
import java.util.Date;
import java.util.Scanner;

public class Persona_Servicio {
    
    Persona introducir = new Persona();
    
    Scanner leer = new Scanner(System.in);

    // crear Persona
    public Persona crearPersona() {

        System.out.print("Ingrese el Nombre de la Persona-> ");
        introducir.setNombre(leer.next());

        System.out.println("****************************************");
        System.out.println("Datos de la persona");
        System.out.println("****************************************");

        System.out.print("Dia-> ");
        introducir.setDia(leer.nextInt());

        System.out.print("Mes-> ");
        introducir.setMes(leer.nextInt());

        System.out.print("Anio-> ");
        introducir.setAnio(leer.nextInt());

        return introducir;
    }

    // calcular edad
    public int calcularEdad() {

        // datos persona 
        Date fecha = new Date(introducir.anio - 1900, introducir.mes, introducir.dia);

        //datos persona 2
        //  Date fecha2 = new Date( introducir.anio - 1900, introducir.mes, introducir.dia );
        // fecha actual
        Date fechaActual = new Date();

        // retorna la edad de la persona         
        return (fechaActual.getYear() - fecha.getYear());

    }

    // Menor que actualizado
    public boolean menorQue( int edad2 ) {
        
        Date fecha = new Date(introducir.anio - 1900, introducir.mes, introducir.dia);        
        
        Date fechaActual = new Date();
        
        return  (fechaActual.getYear() - fecha.getYear()) <  edad2;
        
    }
    /*
    //menor que 
    public boolean menorQue(int anio, int mes, int dia) {

        Date fecha2 = new Date(anio - 1900, mes, dia);
        Date fecha = new Date(introducir.anio - 1900, introducir.mes, introducir.dia);
        Date fechaActual = new Date();

        return (fechaActual.getYear() - fecha.getYear()) < (fechaActual.getYear() - fecha2.getYear());
    }
     */
    
    // mostrar persona
 public void mostrarPersona(String persona1, String persona2, int edad1, int edad2 ){
     
     System.out.println("Datos persona1-> " + persona1 + " tiene " + edad1 + " años ");
     System.out.println("Datos persona2-> " + persona2 + " tiene " + edad2 + " años ");
     
     
     
     
 }  

}
