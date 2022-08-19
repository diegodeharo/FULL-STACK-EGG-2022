/*
 10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package ejercicio10poo;

import java.util.Arrays;


public class Ejercicio10POO {

  
    public static void main(String[] args) {
      
      double arregloA[] = new double [50];
      double arregloB[] = new double [20];
      
      //llenar arregloA con aleatorios
      
        for (int i = 0; i < 50; i++) {
            arregloA[i]= Math.random()*10;
        }
      
        for (int i = 0; i < 50; i++) {
            System.out.print(arregloA[i]+" ");
        }
       
      // ordenamiento del arreglo A  
        System.out.println("\n  "); 
        Arrays.sort(arregloA); 
        System.out.println(Arrays.toString(arregloA)); 
        
    }

   
    
}
