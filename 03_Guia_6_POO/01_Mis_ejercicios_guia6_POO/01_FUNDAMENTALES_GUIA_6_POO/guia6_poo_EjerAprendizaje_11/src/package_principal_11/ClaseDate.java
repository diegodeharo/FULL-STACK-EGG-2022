package package_principal_11;

import java.util.Date;
import java.util.Scanner;

public class ClaseDate {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);       
        
        System.out.print("ingrese el Dia->");
        int dia = leer.nextInt();
        
        System.out.print("ingrese el mes->");
        int mes = leer.nextInt();
        
        System.out.print("ingrese el año->");
        int anio = leer.nextInt();
        System.out.println("");
        
   // instanciamos un objeto de tipo Date
   Date fecha = new Date(anio-1900, mes, dia);// con este metodo, yo asigno los valores al
   //constructor date, y le resto 1900 para obtener la fecha real y luego en la linea 31
   // puedo hacer el calculo de cuantos años hay de diferencia
  
  // con este solo se cual es la fecha actual sin necesidad de ingresar los datos
    Date fechaActual = new Date();
    System.out.println("la fecha actual es " + fechaActual );
    
    System.out.println("la diferencia es de " + (fechaActual.getYear()- fecha.getYear()) + " años");
        
        

    }
}
