


// PERFIL DONDE COLOCO TODOS LAS OPERACIONES Y CALCULOS QUE PUEDO REALIZAR 

package Package_Cafetera_Operaciones;

import Package_Cafetera.Cafetera;
import java.util.Scanner;

public class Cafetera_Operaciones {

    //debo crear o dar nacer o instanciar un objeto de tipo cafetera para que a su vez
    // pueda trabajar con la clase cafetera donde se pusiseron los atributos
    Cafetera cafe = new Cafetera();

    //necesito un objeto de tipo scanner para el ingreso de informacion
    Scanner leer = new Scanner(System.in);

//************************************************************************************************************************    
// METODOS DE OPERACION, CALCULO, LOGICA
//************************************************************************************************************************
// 1_) Metodo LLenar Cafetera
    public Cafetera llenarcafetera() {

        double ml;//creo una variable volumen de mi cafetera

        System.out.print("Ingrese el Volumen Max de su Cafetera(ml)->");
        ml = leer.nextDouble();      //ingreso el volumen

        cafe.setCapMax(llenado(ml));//creo una funcion que me devuelve un valor real y se carga a mi capMax

        cafe.setCapAct(cafe.getCapMax());//igualo mi capMax con mi capActual

        return cafe;

    }

    // 1_a) funcion de ayuda de carga de la cafetera analizandola desde cuado esta vacia
    public double llenado(double ml) {

        int op;
        double llenado = 0;

        do {
            System.out.println("*************************************************************************************");
            System.out.println("");
            System.out.print("Desea llenar al max o Desea agregar una determinada cantidad: \n\n"
                    + "Seleccione una Opción\n\n"
                    + "1)_Llenado Maximo\n"
                    + "2)_Carga Manual\n"
                    + "3)_Salir\n");

            System.out.println("**************************************");
            System.out.print("Opción->");
            op = leer.nextInt();
            System.out.println("**************************************");
            System.out.println("");

            switch (op) {

                case 1:

                    System.out.print("su cafetera posee-> " + llenado + "\n");
                    llenado = ml;
                    System.out.println("Su cafetera ya se cargo con su capacidad Max, Gracias.");

                    break;

                case 2:

                    System.out.println("su cafetera posee-> " + llenado);
                    System.out.print("Cuanto le desea cargar a su cafetera-> ");
                    llenado = leer.nextDouble();
                    System.out.println("");

                    if (llenado < ml) {

                        System.out.println("su cafetera se cargo con-> " + llenado + " (ml) ");

                    } else if (llenado == ml) {

                        System.out.println("Su Cafetera esta llena de Café");
                        System.out.print("su cafetera posee-> " + llenado);
                        System.out.println("");

                    } else {

                        System.out.print(" Disculpe, su cafetera es de menor volumen de la que desea\n"
                                + " agregar, por favor intente nuevamente\n\n ");
                        System.out.println("valumen de cafetera-> " + ml);

                    }

                    break;

                case 3:

                    System.out.println("Hasta luego, Gracias");

                    break;

            }

        } while (op != 3);

        return llenado;

    }

    //2_) Metodo servir taza (analizar luego si deberia retornar el vol_taza por  si las dudas)
    public void servirTaza(double taza_volumen) {

        System.out.println("");

        double vol_taza;

        if (cafe.getCapAct() < taza_volumen) {

            System.out.println("La capacidad de su taza es mayor al contenido de su Cafetera\n"
                    + "su taza posee un volumen de " + taza_volumen + " y su cafetera posee " + cafe.getCapAct() + ""
                            + "\n\n");

            vol_taza = taza_volumen - cafe.getCapAct();

            System.out.println(" su taza se cargo con la catidad de cafe restante ");
            System.out.println(" El Volumen restante de la taza es-> " + vol_taza);

            cafe.setCapAct(0);

        } else {

            System.out.println("Su taza fue llenada con éxito\n");

            System.out.print("El volumen de su taza es-> " + taza_volumen + "\n");

            cafe.setCapAct(cafe.getCapAct() - taza_volumen);

            System.out.print("El volumen de su cafetera actual es-> " + cafe.getCapAct() + "\n");

        }

    }
    
    //3_)metodo Vaciar cafetera
    public void vaciarCafetera() {

        cafe.setCapAct(0);
        System.out.print("El volumen de su cafetera es-> " + cafe.getCapAct());

    }

    //4_) metodo agregarCafe
    public void agregarCafe(double cantidad) {

        System.out.println("");
        System.out.println("Capacidad Max de su cafetera es-> " + cafe.getCapMax() + "\n"
                + "Capacidad Actual de cafe es-> " + cafe.getCapAct() + "\n\n"
                + "Desea agregar más cafe?-> S / N: ");

        String letra = leer.next();
        String toLowerCase = letra.toLowerCase();
        System.out.println("");

        if (letra.equalsIgnoreCase("s")) {

            double agregar = cantidad;

            if (agregar > cafe.getCapMax()) {

                System.out.println("Disculpe la cantidad que desea agregar exede \n"
                        + "el volumen de su Cafetera\n");

            } else if ((agregar + cafe.getCapAct()) > cafe.getCapMax()) {

                System.out.print("Diculpe, lo que desea agregar, más el contenido de su\n"
                        + "cafetera, exede el Max volumen de la misma, por favor\n"
                        + "agregue menos \n\n");

                /* do {
                    System.out.println("Ingrese la cantidad :");
                    agregar = leer.nextDouble();
                } while ( (agregar + cafe.getCapAct()) > cafe.getCapMax() );*/
                
            } else {

                cafe.setCapAct(cafe.getCapAct() + agregar);

                System.out.println("Su Cafetera quedo recargada Nuevamente\n"
                        + "Capacidad Max-> " + cafe.getCapMax() + "\n"
                        + "Capacidad Actual -> " + cafe.getCapAct());

            }

        } else {

            System.out.println("Muchas gracias");

        }

    }

}
