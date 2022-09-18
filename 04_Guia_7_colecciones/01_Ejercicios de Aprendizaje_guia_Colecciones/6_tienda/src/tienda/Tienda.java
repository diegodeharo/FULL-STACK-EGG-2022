/*
 *  Se necesita una aplicación para una tienda en la cual queremos 
almacenar los distintos productos que venderemos y el precio que
tendrán. Además, se necesita que la aplicación cuente con las 
funciones básicas. Estas las realizaremos en el servicio. Como,
introducir un elemento, modificar su precio, eliminar un producto y
mostrar los productos que tenemos con su precio (Utilizar Hashmap). 
El HashMap tendrá de llave el nombre del producto y de valor el precio. 
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package tienda;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author EL_SEMENTAL
 */
public class Tienda {

    //instanciamos un objeto de tipo scanner
    Scanner leer = new Scanner(System.in);

    //creamos un mapa de precio y valor 
    HashMap< String, Integer> precioValor = new HashMap();

    //metodo menu
    public void menu() {

        int op;

        System.out.println("************************");
        System.out.println(" ** Elija un Opoción ** ");
        System.out.println("************************");

        System.out.println("1_) Ingresar Productos y Precios");
        System.out.println("2_) Mostrar  Productos y Precios");
        System.out.println("3_) Modificar Precio de Producto");
        System.out.println("4_) Borrar Producto");
        System.out.println("5_) salir");

        do {

            System.out.println("************");
            System.out.print("op-> ");
            op = leer.nextInt();
            System.out.println("************");

            switch (op) {

                case 1:
                    ingresarProducto();
                    break;
                case 2:
                    mostrarProductos();
                    break;
                case 3:
                    modificarPrecio();
                    break;
                case 4:
                    borrarProducto();
                    break;
                case 5:
                    System.out.println(" ** Hasta Luego ** ");
                    break;

            }
        } while (op != 5);
    }

    //metodo de muestra de productos
    public void mostrarProductos() {

        System.out.println("*************************");
        System.out.println(" ** Tieda Doña Blanca ** ");
        System.out.println("*************************");

        for (Map.Entry<String, Integer> entry : precioValor.entrySet()) {
            System.out.println("///////////////////////////////////////////"
                    + "/////\n"
                    + "** Producto-> " + entry.getKey() + "\n"
                    + "** Precio-> " + entry.getValue() + "\n"
                    + "////////////////////////////////////////////////\n");

        }

    }

    //ingrese el valor y el precio del producto    
    public void ingresarProducto() {

        //bandera 
        String bandera = "s";

        //condicion para que ingrese otro producto
        do {

            System.out.print("Ingrese el Producto-> ");
            String producto = leer.next().toUpperCase();

            System.out.print("Ingrse su precio $ ");
            int precio = leer.nextInt();

            //agregamos nuestro valor a nuestro mapa 
            precioValor.put(producto, precio);

            System.out.println("******************************************");
            //seguir agregando
            System.out.println("Desea agregar un nuevo Producto? ( S / N )");
            System.out.print("op-> ");
            bandera = leer.next();
            System.out.println("******************************************");

        } while (bandera.equalsIgnoreCase("s"));

    }

    //metodo de modificar hasMap
    public void modificarPrecio() {

        System.out.println("Que producto desea Modificar");
        String modificar = leer.next().toUpperCase();

        for (Map.Entry<String, Integer> entry : precioValor.entrySet()) {

            if (modificar.equalsIgnoreCase(entry.getKey())) {

                System.out.print("Ingrese el Nuevo Precio-> ");
                Integer cambio = leer.nextInt();

                //precioValor.put(cambio, modificar);
                precioValor.replace(modificar, cambio);

                System.out.println("El Precio de " + entry.getKey()
                        + " es " + entry.getValue() + "\n");
            }
        }

        //mostrarProductos();       
    }

    //METOTOD ELIMINAR PRODUCTO
    public void borrarProducto() {

        System.out.println("Que Producto desea Eliminar");
        String eliminar = leer.next().toUpperCase();

        if (precioValor.containsKey(eliminar)) {

            precioValor.remove(eliminar);

        }

    }

}
