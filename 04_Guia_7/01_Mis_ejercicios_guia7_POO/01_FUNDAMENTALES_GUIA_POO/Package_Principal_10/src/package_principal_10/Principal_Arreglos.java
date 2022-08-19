 
package package_principal_10;

import java.util.Arrays;

 
public class Principal_Arreglos {

    public static void main(String[] args) {

        // crar dos arreglos A y B
        // A
        double arreglo_A[] = new double[50];
        // B
        double arreglo_B[] = new double[20];

        // Inicializacion del arreglo A
        System.out.println("******************************************");
        for (int i = 0; i < 50; i++) {
            
          arreglo_A[ i ] = Math.random() * 10; //lleno de forma aleatoria
          // Arrays.fill(arreglo_A, i, i=50, Math.random()*10);
           
        }
        
        
        System.out.println("El Arreglo A-> " + Arrays.toString(arreglo_A));// me muestra un arreglo

        System.out.println("******************************************");

        Arrays.sort(arreglo_A);

        System.out.println("El Arreglo A de menor a Mayor-> " + Arrays.toString(arreglo_A));
        
        System.out.println("******************************************");

        for (int i = 0; i < 20; i++) {

            if ( i < 10 ) {
                
                Arrays.sort(arreglo_A);
                
                arreglo_B[ i ] = arreglo_A[ i ];
               
                
            } else {
                
              Arrays.fill(arreglo_B, i, i=20, 0.5);
             
             // arreglo_B[ i ] = 0.5;
                
            }
            
        }
        
        System.out.println("El Arreglo_B -> " + Arrays.toString(arreglo_B));

        System.out.println("******************************************");

    }

}
