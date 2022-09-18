package servicioAlumnos;

import alumnosAtributos.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoServicio {

    // Creo mis método de operación
    /*crear un bucle que instancie un objeto alumnos y se pida toda la 
    información de este al usuario
     */
    Scanner leer = new Scanner(System.in);

    ArrayList<Alumno> alumno = new ArrayList();//creo una lista de alumnos
    //Alumno alum = new Alumno();

    public void crearAlumno() {

        /*debo crear un array nuevo aux, para guardar las notas ya que un
        requerimiento es que las notas sean un array dentro de cada 
        alumno, entonces, si un array es un atributo, cada vez que trabaje
        en un paquete o clase distinto donde no vea al atributo array
        debo crear un Array aux solo para guardar los elementos, total, 
        ya cuando necesite trabajar con los elementos del alumno del array
        en este caso, hablamos de las notas, cuando llame del main, o 
        de cualquier otro lado, independientemente del nombre de mi array,
        sé, que mis datos o elementos ( en este caso , las notas ) están
        guardadas como un atributo de mi clase alumno.        
         */
        // creo mi array aux y luego con nombre, lo guardo en una lista
        // de alumnos
        ArrayList<Integer> notasAux = new ArrayList();

        //creo una bandera para insertar tantos alumnos como el usuario
        //desee mientras aux==true
        boolean aux = true;

        while (aux) {
            System.out.println("*****************");
            System.out.println("Datos del Alumno:");
            System.out.println("*****************");

            //nombre
            System.out.print("Nombre-> ");
            String nombre = leer.next();

            System.out.println("///////////////////////////////////");

            //notas
            System.out.print("Nota_1 -> ");
            int nota1 = leer.nextInt();

            System.out.print("Nota_2 -> ");
            int nota2 = leer.nextInt();

            System.out.print("Nota_3 -> ");
            int nota3 = leer.nextInt();

            System.out.println("\n///////////////////////////////////\n");

            // adhiero a cada nota en mi lista notaAux
            notasAux.add(nota1);
            notasAux.add(nota2);
            notasAux.add(nota3);

            //ahora debo guardar estos atributos en mi lista de cada alumno
            // que yo ingrese.
            /**
             * lo que hago, es guardar en mi lista, mi ALUMNO con sus
             * respectivos atributos
             */
            
            // cada ves que instancio a new Alumno, siempre estoy
            //reservando un espacio de memoria distinto? 
            alumno.add(new Alumno(nombre, notasAux));

            // desea agregar un nuevo alumno?
            System.out.println("Desea agregar un nuevo Alumno? ");
            System.out.print("Opción S/N -> ");

            //creo una variable string para la respuesta 
            String resp = leer.next();

            // si resp es distinta de S entonces sale de cracion de alumnos
            aux = resp.equalsIgnoreCase("s");
            System.out.println();

            System.out.println("///////////////////////////////////");
        }

    }

    //creamos un metodo para la nota final
    public void mostrarPromedioAlumno() {

        //variable bandera aux
        boolean aux = true;

        while (aux) {

            //coloco el nombre del alumno para mostrar sus datos y promedio
            System.out.print("Igrese el Nombre del Alumno-> ");
            String nom = leer.next();

            System.out.println("\n///////////////////////////////////");

            //for para buscarlo en la lista de alumnos
            for (Alumno alumno1 : alumno) {

                if (alumno1.getNombre().equalsIgnoreCase(nom)) {

                    System.out.println("El Alumno " + alumno1.getNombre()
                            + " posee un promedio de " + alumno1.notaFinal()
                            + "\n");

                }

            }

            System.out.println("///////////////////////////////////\n");

            System.out.println("Desea Saber Promedio de otro Alumno?");
            System.out.print("Opoción (S /N )-> ");
            String resp = leer.next();

            aux = resp.equalsIgnoreCase("s\n");

            System.out.println("///////////////////////////////////");

            //otroAlumno();
        }

        System.out.println("///////////////////////////////////");

    }

    // creo un metodo para saber si hay otro alumno para mostar sus datos
//    public boolean otroAlumno(){
//        
//        //creo la variable a retornar 
//        boolean aux = false;
//        
//        //pregunto si hay elemtos en mi lista de alumnos
//        
//        int tamaño = alumno.size();
//        
//        
//        return false;
//    }
    // creo un metodo para saber si hay otro alumno para mostar sus datos
    public void mostrarTamañoLista() {

        System.out.println("Tamaño Lista-> " + alumno.size());

        System.out.println("///////////////////////////////////\n");

    }

}
