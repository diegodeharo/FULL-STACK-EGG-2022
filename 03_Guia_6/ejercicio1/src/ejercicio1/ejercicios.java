/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author EL_SEMENTAL
 */
public class ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos el Scanner
        Scanner leer= new Scanner (System.in);
        
        //ejercicio 4 define variables donde coloque el nombre y otra la edad y luego lo muestro en pantalla        
        String nombre = "diego";
        int edad = 31;
        System.out.println("mi nombre es: "+nombre);
        System.out.println("mi edad es: "+ edad);
        
        //ejercicio 5 Define una variable de tipo boolean, double y char. Guarda información en ellas a través del Scanner.
        System.out.println("la bandera es verdadera?");
        boolean band = leer.nextBoolean();
        System.out.println("ingrese un valor Real");
        double numReal= leer.nextDouble();
        System.out.println("ingrese un caracter");
        char letra= leer.next().charAt(0);
        
        //mostramos los resultados
        System.out.println("la bandera fue-> "+band);
        System.out.println("el numReal es-> "+numReal);
        System.out.println("el caracter es-> "+letra);
        
        //ejercicio 6 Implementar un programa que le pida dos números enteros al usuario y determine si ambos o alguno de ellos es mayor a 25.
        System.out.println("ingrese el primer numero");
        int num1 = leer.nextInt();
        System.out.println("numero 1->" +num1);
          System.out.println("ingrese el segundo numero");
        int num2 = leer.nextInt();
        System.out.println("numero 2->" +num2);
        
        //creo una estructura if        
        if(num1>=25 ){
            System.out.println("el num1 es el mayor-> "+num1);
        }else if (num2 >= 25){
            System.out.println("el num2 es el mayor-> " + num2);
        } else{
            System.out.println("Ninguno de los numero es mayor a 25-> "+num1+ " " + num2);
        }
        
        //ejercicio 7
        /* Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos 
        *que se trata del tipo de motor de una bomba para mover fluidos). Definir una variable tipoMotor y 
        *permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
        *o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”. 
        *o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de 
        *gasolina”.
        *o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de 
        *hormigón”. 
        *o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta 
        *alimenticia”.
        *o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor 
        *válido para tipo de bomba”
        */
        
        int tipomotor;
        System.out.println("MOTOR DE UNA BOMBA PARA MOVER FLUIDOS");
        System.out.println("");
        //creo el menú de opciones
        System.out.println("Ingrese una opción:");
        switch (tipomotor= leer.nextInt()){
        case(1):
                System.out.println("La bomba es una bomba de agua");
            break;
        case(2):
                System.out.println("La bomba es una bomba de gasolina");
            break;
        case(3):
                System.out.println("La bomba es una bomba de hormigón");
            break;
        case(4):
                System.out.println("La bomba es una bomba de pasta alimenticia");
            break;
        default:
            System.out.println("No existe un valor válido para tipo de bomba");
        }
        
        //ejercicio 8-> Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se 
        //pedirá de nuevo hasta que la nota sea correcta.
        
        int nota;
        System.out.println("");
        System.out.println("NOTA DEL ALUMNO");
        //estructura while
         nota= leer.nextInt();
        while(nota < 1 || nota > 10){
            System.out.println("la nota del alumno es-> " +nota);
            nota= leer.nextInt();
        }
        if(nota<6){
            System.out.println("la nota del alumno es desaprobado-> " +nota);                       
        }else{
             System.out.println("la nota del alumno es aprobado-> " +nota);
        }
          
        /* ejercicio 9 ->Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del 
        *bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el 
        *resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. 
        *Nota: recordar el uso de la sentencia break.*/
       
        float num;
        int cont=0;
        float suma=0;
        do{          
            System.out.println("ingrese el numero:");
            num= leer.nextFloat();            
            suma= suma+num;
            if(num<0){
                System.out.println("el numero debe ser positivo");
                break;
            }else if(num!=0){
                cont++;
            }
        }while (num!=0 && cont < 20);
        
        if(num==0){
            System.out.println("se capturo el numero 0");
            System.out.println("la cantidad de numero ingresados es \n" +cont+"\n la suma fue de-> "+suma);
        }else{
            System.out.println("se llego a la cantidad max de numero");
             System.out.println("la suma fue de-> "+suma);
        }
        
        /* ejercicio 10 -> Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número 
        ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
        5 *****
        3 ***
        11 ***********
        2 **
        */
        
        int numero;
        int a=1;
        int contador=0;
        do{
            System.out.println("ingrese el numero "+a+":");
            a++;  
            numero=leer.nextInt();
            //creo un if para determinar que solo ingresen un rango de num
            if(numero<1 || numero >20){
            break;
            }else{           
            System.out.print(numero +"-> ");
             //creo el bucle for bucle de repeticion hasta que se compare la variable con la finalizacion
            for(int i=0;i < numero; i++){
                System.out.print("*");
            }
            }
            System.out.println("");            
            //cuenta la cantidad de num que debe ser max 4
             contador++;
            
        }while ( contador!=4);
    
   

    }
}