/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.  
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no. 
Después de ese bucle tendremos el siguiente método en el servicio de Alumno: 
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos.  Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main. 
 */
package guia8.ej3;

import entidades.Alumno;
import entidades.Menu;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import servicios.ServicioAlumno;

/**
 *
 * @author hGauna
 */
public class Guia8Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat a2Dec = new DecimalFormat("#.00");
        boolean existe = false;
        ServicioAlumno servAl = new ServicioAlumno();
        List<Alumno> alumnos = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Menu menu = new Menu();
        int input;
        do{
            menu.printMenu();
            input = leer.nextInt();
            if (input == 1) alumnos.add(servAl.crearAlumno());
        } while (input != 2);
        System.out.println("Ahora evaluaremos las notas de cada alumno");
        System.out.println("Ingrese el nombre del alumno ");
        String nombre = leer.next();
        
        for (Alumno element : alumnos){
            if (element.getNombre().equals(nombre)){
                existe = true;
                System.out.println("El promedio del alumno: " + element.getNombre() + " es: " + a2Dec.format(servAl.notaFinal(element)));
            }
        }
        if (!existe) System.out.println("El alumno ingresado no existe");
    }
    
}
