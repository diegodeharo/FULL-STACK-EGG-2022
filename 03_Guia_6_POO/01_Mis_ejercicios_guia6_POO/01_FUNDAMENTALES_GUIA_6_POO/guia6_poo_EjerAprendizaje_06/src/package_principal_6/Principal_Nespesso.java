package package_principal_6;

import Package_Cafetera.Cafetera;
import Package_Cafetera_Operaciones.Cafetera_Operaciones;
import java.util.Scanner;

public class Principal_Nespesso {

    public static void main(String[] args) {

        // creo mi objeto leer del tipo scanner
        Scanner leer = new Scanner(System.in);

        // creo o intancio un objeto de tipo Cafetera operaciones ya que desde ahi tomare los metodos para 
        //calculo        
        Cafetera_Operaciones coffe = new Cafetera_Operaciones();

        // debo asignar los datos cargados a mis atributos de la clase Cafetera, por lo tanto, tambien
        //debo instanciar mi objeto cafe de tipo carfetera
        Cafetera cafe = coffe.llenarcafetera();

        int op;

        do {
            System.out.println("**************************************");
            System.out.println("*******NESPRESSO********\n\n"
                    + "Selecciones una opción:\n"
                    + "1_)Servir Cafe\n"
                    + "2_)Vaciar Cafetera\n"
                    + "3_)Agregar Cafe\n"
                    + "4_)Salir\n");
            System.out.println("**************************************");

            System.out.print("Opción-> ");
            op = leer.nextInt();
            System.out.println("**************************************");

            switch (op) {

                case 1:

                    //llamo al metodo servir taza donde se ingresa el tamaño de una taza vacia
                    System.out.println("**************************************");
                    System.out.print("El volumen de una taza vacia es-> ");
                    coffe.servirTaza(leer.nextDouble());
                    System.out.println("");

                    break;

                case 2:

                    //llamo al metodo vaciar cafetera       
                    System.out.println("**************************************");
                    coffe.vaciarCafetera();
                    System.out.println("");

                    break;

                case 3:

                    //llamo al metodo de agregar cafe a la cafetera        
                    System.out.println("**************************************");
                    System.out.print("Cuanto desea agregar-> ");
                    coffe.agregarCafe(leer.nextDouble());
                    System.out.println("");

                    break;

                case 4:

                    System.out.println("Que Disfrute de un Delicioso Nespresso\n"
                            + "Hasta luego");

                    break;

            }

        } while (op != 4);

    }

}
