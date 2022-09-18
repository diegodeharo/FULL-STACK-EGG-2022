/*
Realizar un programa que pida dos números enteros 
positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa 
deberá mostrar el resultado por pantalla y luego
volver al menú. El programa deberá ejecutarse hasta
que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la
opción 5, en vez de salir del programa directamente, 
se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si 
el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
package ejerciciodeaprendizaje1;

import java.util.Scanner;

/**
 *
 * @author EL_SEMENTAL
 */
public class JavaIntro_ejer_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        /*
            Realizar un programa que pida dos números enteros positivos por teclado y muestre por 
            pantalla el siguiente menú:
            MENU
            1. Sumar
            2. Restar
            3. Multiplicar
            4. Dividir
            5. Salir
            Elija opción:
            El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla 
            y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. 
            Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa 
            directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que 
            desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del 
            programa, caso contrario se vuelve a mostrar el menú
         */

        System.out.println("ingrese el numero1");
        double num1=leer.nextInt();
        System.out.println("ingrese el numero2");
        double num2=leer.nextInt();
        int opcion=0;
        do{
            System.out.println("selecione una opción del Menú\n"+
"            1. Sumar\n" +
"            2. Restar\n" +
"            3. Multiplicar\n" +
"            4. Dividir\n" +
"            5. Salir");          
             opcion=leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("suma");
                    double suma=num1+num2;
                    System.out.println("la suma es-> "+suma);                    
                break;
                case 2:
                    System.out.println("resta");
                    double resta=num1-num2;
                    System.out.println("la resta es-> "+resta);
                break;
                case 3:
                    System.out.println("multiplicacion");
                    double multiplicacion=num1*num2;
                    System.out.println("la multiplicacion es-> "+multiplicacion);
                break;
                case 4:
                    System.out.println("division");
                    double div = num1/num2;
                    System.out.println("la division es-> "+div);
                break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String letra=leer.next();
                    if(letra.equalsIgnoreCase("s")){
                        break;
                    }else{
                        opcion=0;                     
                        
                    }
                    
            }
        
        }while (opcion!= 5);

    }

}
