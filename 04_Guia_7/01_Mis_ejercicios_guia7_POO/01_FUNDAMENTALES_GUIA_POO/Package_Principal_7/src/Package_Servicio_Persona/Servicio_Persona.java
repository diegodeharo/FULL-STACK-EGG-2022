package Package_Servicio_Persona;

import Package_Entidad_Persona.Persona;
import java.util.Scanner;

public class Servicio_Persona {

    Scanner leer = new Scanner(System.in);

    // debo instanciar un objeto del tipo Persona para realizar las asignacion de los datos 
    // o info a los atributos
    Persona persona = new Persona();

    //***********************************************************************************    
    // TODAS LAS OPERACIONES Y CALCULOS Y LOGICA NECESARIA   
    //***********************************************************************************
    //***********************************************************************************
    // Metodos de Cálculo y llenado de atributos    
    //***********************************************************************************
    // 1_)metodo Persona -> asignar la info que se introduce
    public Persona crearPersona() {

        String seleccion = null;

        System.out.print("Ingrese el Nombre de la persona->");
        persona.setNombre(leer.next());   

        System.out.print("Ingrese la Edad de la persona->");
        persona.setEdad(leer.nextInt());        

        System.out.print("Ingrese el Peso de la persona->");
        persona.setPeso(leer.nextDouble());

        System.out.print("Ingrese la Altura de la persona->");
        persona.setAltura(leer.nextDouble());

        persona.setSexo(sexo());
        System.out.println("Sexo-> " + persona.getSexo());

        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
        
        return persona;

    }

    // 1_A) funcion de ayuda para la seleecion de sexo
    public String sexo() {
        
        String aux = null , seleccion;

        do {

            System.out.print("Ingrese el Sexo H / M / O -> ");

            seleccion = leer.next();           

            seleccion = seleccion.toLowerCase();

            if (seleccion.equalsIgnoreCase("h")) {

                aux = "HOMBRE";

            } else if (seleccion.equalsIgnoreCase("m")) {

                aux = "MUJER";

            } else if (seleccion.equalsIgnoreCase("o")) {
                
                aux = "Otro";
                
            }else{
                
                System.out.println("Seleccion incorrecta");
                
            }

        } while ( !seleccion.equalsIgnoreCase("h") && !seleccion.equalsIgnoreCase("m") && !seleccion.equalsIgnoreCase("o") );
        
        return aux;

    }
    
    // 2_) Metodo calcular IMC
    public int IMC(){
        
        int peso = 0;
        
        System.out.println( "El Peso-> " + persona.getPeso() + "Kg" );        
        
        System.out.println( "La Altura-> " + persona.getAltura() + "m" );       
        
        double imc = persona.getPeso() / ( Math.pow(persona.getAltura(), 2) );
        
        if ( imc < 20 ) {
            
            peso = -1; //en el main seria bajo peso
            
        }else if ( imc >= 20  &&  imc <= 25 ) {
            
            peso = 0; //en el main seria peso ideal
            
        }else{
            
            peso = 1; // en el main seria alto peso
            
        }
                
        return peso;
        
    }
    
    // 3_) Metodo es mayor de edad
    public boolean esMayordeEdad(int edad){
        
        boolean edades = edad >=18; // en el main, si es mayor toma un true e iforma q es mayor
                                                           // si es false, indica que no es mayor 
        
        return edades; 
        
    }

}
