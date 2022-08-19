

package package_principal_7;

import Package_Entidad_Persona.Persona;
import Package_Servicio_Persona.Servicio_Persona;
import java.util.Scanner;



public class Principal {

   
    
    public static void main(String[] args) {
        
        // Variable para el porcentaje de peso y edades
        int cont1 = 0, cont2 = 0, cont3 = 0,  contMe = 0, contme = 0, i, a, b, c ;
        boolean bandera, bandera2, bandera3, bandera4 ;
        
        
        Scanner leer = new Scanner(System.in);
 //*************************************************************************************       
        // persona 1
        
        Servicio_Persona p1 = new Servicio_Persona();
        /////////////////////////////////////////////////////////////////////////////        
        Persona persona1 = p1.crearPersona();
        /////////////////////////////////////////////////////////////////////////////        
       i = p1.IMC();
      
        switch (i) {
            
            case 1:
                
                System.out.println("Exedido de peso");
                
                break;
                
            case 0:
                
                System.out.println("Peso Ideal");
                
                break;
                
            default:
                
                System.out.println("Falta de peso");
                
                break;
                
        }
      
          /////////////////////////////////////////////////////////////////////////////        
         bandera = p1.esMayordeEdad(persona1.getEdad());
        
        if (bandera) {
            
            System.out.println( persona1.getNombre() + " es Mayor de Edad ");
            
        }else{
            
             System.out.println( persona1.getNombre() + " es Menor de Edad ");
             
        }
        System.out.println("***************************************************************************");
        System.out.println("***************************************************************************");
        
         //************************************************************************************* 
         //************************************************************************************* 
               
        // persona 2
        
        Servicio_Persona p2 = new Servicio_Persona();
        /////////////////////////////////////////////////////////////////////////////        
        Persona persona2 = p2.crearPersona();
        /////////////////////////////////////////////////////////////////////////////        
       a = p2.IMC();
      
        switch ( a ) {
            
            case 1:
                
                System.out.println("Exedido de peso");
                
                break;
                
            case 0:
                
                System.out.println("Peso Ideal");
                
                break;
                
            default:
                
                System.out.println("Falta de peso");
                
                break;
                
        }
       
          /////////////////////////////////////////////////////////////////////////////        
         bandera2 = p2.esMayordeEdad(persona2.getEdad());
        
        if ( bandera2 ) {
            
            System.out.println( persona2.getNombre() + " es Mayor de Edad ");
            
        }else{
            
             System.out.println( persona2.getNombre() + " es Menor de Edad ");
             
        }
        System.out.println("***************************************************************************");
        System.out.println("***************************************************************************");
        
         //************************************************************************************* 
         //************************************************************************************* 
         
         // persona 3
        
        Servicio_Persona p3 = new Servicio_Persona();
        /////////////////////////////////////////////////////////////////////////////        
        Persona persona3 = p3.crearPersona();
        /////////////////////////////////////////////////////////////////////////////        
       b = p3.IMC();
      
        switch ( b ) {
            
            case 1:
                
                System.out.println("Exedido de peso");
                
                break;
                
            case 0:
                
                System.out.println("Peso Ideal");
                
                break;
                
            default:
                
                System.out.println("Falta de peso");
                
                break;
                
        }
        
          /////////////////////////////////////////////////////////////////////////////        
         bandera3 = p3.esMayordeEdad(persona3.getEdad());
        
        if ( bandera3 ) {
            
            System.out.println(  persona3.getNombre() + " es Mayor de Edad ");
            
        }else{
            
             System.out.println( persona3.getNombre() + " es Menor de Edad ");
             
        }
        System.out.println("***************************************************************************");
        System.out.println("***************************************************************************");
        
        //************************************************************************************* 
         //************************************************************************************* 
         
        // persona 4
        
        Servicio_Persona p4 = new Servicio_Persona();
        /////////////////////////////////////////////////////////////////////////////        
        Persona persona4 = p4.crearPersona();
        /////////////////////////////////////////////////////////////////////////////        
       c = p4.IMC();
      
        switch ( c ) {
            
            case 1:
                
                System.out.println("Exedido de peso");
                
                break;
                
            case 0:
                
                System.out.println("Peso Ideal");
                
                break;
                
            default:
                
                System.out.println("Falta de peso");
                
                break;
                
        }
       
          /////////////////////////////////////////////////////////////////////////////        
         bandera4 = p4.esMayordeEdad(persona4.getEdad());
        
        if ( bandera4 ) {
            
            System.out.println( persona4.getNombre() + " es Mayor de Edad " );
            
        }else{
            
             System.out.println( persona4.getNombre() + " es Menor de Edad " );
             
        }
        System.out.println("***************************************************************************");
        System.out.println("***************************************************************************");
        
       /* //calculos aux
        System.out.print("i->" + i + "\n"
                + "a->" + a + "\n"
                + "b->" + b + "\n"
                + "c->" + c+"\n");
        System.out.print("bandera->" + bandera + "\n"
                + "bandera2->" + bandera2+ "\n"
                + "bandera3->" + bandera3 + "\n"
                + "bandera4->" + bandera4 + "\n" );
              */  
        
        
         //************************************************************************************* 
         //*************************************************************************************
         ///////////////////////////////////////////////////////////////////////////////////////
         //Contador de peso  en IMC-> ideal, bajo, alto
         //contador de edades -> Medad o medad
         
        if (i == 0) {

            cont1++;

        } else if (bandera) {

            contMe++;

        } else {

            contme++;

        }

        if (a == 0) {

            cont1++;

        } else if (bandera2) {

            contMe++;

        } else {

            contme++;

        }

        if (b == 0) {

            cont1++;

        } else if (bandera3) {

            contMe++;

        } else {

            contme++;

        }

        if (c == 0) {

            cont1++;

        } else if (bandera4) {

            contMe++;

        } else {

            contme++;

        }

        if (i == -1) {
            cont2++;
        }
        if (a == -1) {
            cont2++;
        }
        if (b == -1) {
            cont2++;
        }
        if (c == -1) {
            cont2++;
        }

        if (i == 1) {
            cont3++;
        }
        if (a == 1) {
            cont3++;
        }
        if (b == 1) {
            cont3++;
        }
        if (c == 1) {
            cont3++;
        }
      
        ///////////////////////////////////////////////////////////////////////////////////////        
        
        // se informa cuantas de las personas estan en sus distintos niveles de peso segun el IMC
        System.out.print("Peso Ideal -> " + cont1 + "\n"
                + "Peso Bajo -> " + cont2 + "\n"
                        + "Peso Alto -> " + cont3 + "\n\n" );
        
        // se informa cuantos son mayores de edad y cuantos son menores.
         System.out.print("Mayores de Edad -> " + contMe + "\n"
                + "Menores de Edad -> " + contme + "\n\n" );
        
         
    }
    
}


/**
 * Datos para realizar la segund parte del enunciado:
 * Pesona1:
 * a) IMC->  entera ->i
 * b) Mayor de edad -> booleano -> bandera
 * 
 * Pesona1:
 * a) IMC->  entera ->a
 * b) Mayor de edad -> booleano -> bandera2
 * 
 * Pesona1:
 * a) IMC->  entera ->b
 * b) Mayor de edad -> booleano -> bandera3
 * 
 * Pesona1:
 * a) IMC->  entera ->c
 * b) Mayor de edad -> booleano -> bandera4
 * 
 * EL ENUNCIADO NOS PIDES, PORCENTAJES:
 * 
 * 1_) CUANTAS PERSONAS EN PORCENTAJE ESTAN DEBAJO DE SU PESO, PESO IDEAL, POR ENCIMA DE SU PESO
 * 
 * 2_) CUANTAS PERSONAS EN PORCENTAJE SON MAYORES DE EDAD Y CUANTAS SON MENORES DE EDAD.
 */