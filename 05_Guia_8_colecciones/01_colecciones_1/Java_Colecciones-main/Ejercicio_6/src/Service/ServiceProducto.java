/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Johana
 */
public class ServiceProducto {

    Scanner leer = new Scanner(System.in);
    HashMap<String, Double> productos = new HashMap();

    public void Menu() {

        boolean bandera = true;

        do {

            System.out.println("Selecciones la operacion a realizar: \n1) Crear producto \n2) Modificar producto \n3) Eliminar producto \n4) Listar productos \n5) Salir");
            int op = leer.nextInt();

            switch (op) {

                case 1:

                    crearProducto();
                    break;

                case 2:

                    modificarProducto();
                    break;

                case 3:

                    eliminarProducto();
                    break;

                case 4:

                    listarProductos();
                    break;

                case 5:

                    bandera = false;
                    break;

            }

        } while (bandera);

    }

    private void crearProducto() {

        boolean activo = true;

        do {

            System.out.print("Ingrese el nombre del producto: ");
            String nomProducto = leer.next().toUpperCase();

            System.out.print("Ingrese el precio del producto: ");
            Double precioP = leer.nextDouble();

            productos.put(nomProducto, precioP);

            System.out.print("Desea seguir agregando mas productos?. y/n --> ");
            activo = leer.next().equalsIgnoreCase("y") ? true : false;
            
        } while (activo);
    }

    private void modificarProducto() {

        listarProductos();

        System.out.print("Ingrese el nombre del producto a modificar: ");
        String nombreP = leer.next().toUpperCase();

        if (productos.containsKey(nombreP)) {

            System.out.print("Ingrese el nuevo nombre del producto: ");
            String nomActualizado = leer.next().toUpperCase();
            System.out.print("Ingrese el nuevo precio del producto: ");
            double precioActualizado = leer.nextDouble();

            productos.remove(nombreP);

            productos.put(nomActualizado, precioActualizado);

        }
    }

    private void eliminarProducto() {

        listarProductos();

        System.out.print("Ingrese el producto a eliminar: ");
        String nomProd = leer.next().toUpperCase();

        if (productos.containsKey(nomProd)) {

            productos.remove(nomProd);

        }
    }

    private void listarProductos() {

        System.out.println("*********************************");
        System.out.println("Productos           Precio");
        System.out.println("*********************************");
        for (Map.Entry<String, Double> aux : productos.entrySet()) {

            System.out.println(aux.getKey() + "            " + aux.getValue());

        }
        System.out.println("*********************************");
    }
}
