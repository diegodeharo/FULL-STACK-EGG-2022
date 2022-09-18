

package Package_Calculo;

import Package_Molde_Rectangulo.Rectangulo;
import static java.lang.Math.floor;
import java.util.Scanner;


public class Rectangulo_Calculo {
    
    //realizo una instanciacion del objeto leer del tipo Scanner el cual me permite introducir dato o info por
    //por medio del teclado
    
    Scanner leer = new Scanner(System.in);
    
    //realizo una instanciacion del objeto rectangulo del tipo Rectangulo, donde representa la entidad de los 
    //atributos, donde en este metodo Dato, se introducira informacion para rellenar el atributo

    Rectangulo rectangulo = new Rectangulo();
    
    //Metodo para ingresar la altura y la base
    
    public Rectangulo datos(){
        
        System.out.print("Ingrese la Altura-> ");
        rectangulo.setAltura(leer.nextDouble());
        System.out.println("");
        
         System.out.print("Ingrese la Base-> ");
        rectangulo.setBase(leer.nextDouble());
        System.out.println("");
        
        return rectangulo;
        
    }
    
        //Metodos de calculos
    
        //superficie        
        public double superficie(Rectangulo rectangulo){
            
           return rectangulo.getAltura() * rectangulo.getBase() ;            
            
        }
        
        //Perimetro        
        public double perimetro (Rectangulo rectangulo){
            
           return Math.pow((rectangulo.getAltura() + rectangulo.getBase()), 2) ;            
            
        }
        
      //metodo para mostrar una superficio por asteriscos
    public void rectangulo_asteriscos() {

        //craar un rectangulo con los valores de altura 
        // y de la base
        //filas
        int n = (int) floor(rectangulo.getAltura());

        //columnas
        int m = (int) floor(rectangulo.getBase());

        /**
         *        / / / / / /
         *       /          /
         *       / / / / / /
         */
        
        //filas
        for (int i = 0; i < n; i++) {
            //columnas
            for (int j = 0; j < m; j++) {

                if (i == 0 || i == n - 1) {

                    System.out.print(" * ");

                } else if (j == 0 || j == m - 1) {

                    System.out.print(" * ");

                } else if (j > 0 && j < m - 1 || i > 0 && i < n - 1) {

                    System.out.print("   ");

                }

            }

            System.out.println("");

        }

        //*****************************************************************
        System.out.println("");
        //*****************************************************************

    }

}

