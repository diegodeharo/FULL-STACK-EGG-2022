/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Johana
 */
public class ServiceAlumno {

    Scanner leer = new Scanner(System.in);
    ArrayList<Alumno> alumnos = new ArrayList();

    public void inicializar() {

        crearAlumno();
        notaFinal();
    }

    private void crearAlumno() {

        boolean ejecutar = true;

        while (ejecutar) {

            ArrayList<Integer> listaAux = new ArrayList();

            System.out.println("Ingrese el nombre del Alumno: ");
            String nombre = leer.next();

//            for (int i = 0; i < 3; i++) {
//                
//                System.out.print("Ingrese la nota "+(i+1));
//                listaAux.add(leer.nextInt());
//            }
            
            System.out.println("Ingrese la primera nota: ");
            int nota1 = leer.nextInt();

            System.out.println("Ingrese la segunda nota: ");
            int nota2 = leer.nextInt();

            System.out.println("Ingrese la tercera nota: ");
            int nota3 = leer.nextInt();

            System.out.println("Desea seguir agregando alumnos?. y/n");
            String op = leer.next();

            listaAux.add(nota1);
            listaAux.add(nota2);
            listaAux.add(nota3);

            alumnos.add(new Alumno(nombre, listaAux));

            ejecutar = op.equalsIgnoreCase("y"); //? true : false;

        }
        
    }

    private void notaFinal() {

        System.out.println("Ingrese el nombre del alumno para "
                + "calcular su nota final: ");
        
        String nombre = leer.next();

        for (Alumno alumno : alumnos) {

            if (alumno.getNombre().equalsIgnoreCase(nombre)) {

                alumno.mostrarNombre();
                System.out.print("Promedio --> " + alumno.notaFinal() +
                        "\n\n");
            }

        }

    }

}
