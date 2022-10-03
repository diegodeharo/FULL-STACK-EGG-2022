/* Realizar un programa para que una Persona pueda adoptar un Perro.
Vamos a contar de dos clases. Perro, que tendrá como atributos: nombre,
raza, edad y tamaño; y la clase Persona con atributos: nombre, apellido, 
edad, documento y Perro. Ahora deberemos en el main crear dos Personas y
dos Perros. Después, vamos a tener que pensar la lógica necesaria para
asignarle a cada Persona un Perro y por ultimo, mostrar desde la clase
Persona, la información del Perro y de la Persona.
 */
package personaPerroMain;

import java.util.Scanner;
import perro.Perro;
//import perro.Perro;
import persona.Persona;
//import persona.servicioPersona;

/**
 *
 * @author EL_SEMENTAL
 */
public class AdoptarUnPerro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //instancio un objeto scanner para el ingreso de datos por teclado        
        Scanner leer = new Scanner(System.in);
        //instancio dos objeto de tipo persona
        Persona person = new Persona();
        Persona person2 = new Persona();
        //instanciar dos objeto Perro
        Perro dog = new Perro();
        Perro dog2 = new Perro();

        //variables 
        int o;

        //creo dos personas
        person.crearPersona();
        person2.crearPersona();

        //creo dos perros
        dog.crearPerro();
        dog2.crearPerro();

        //operativa para la seleccion de un perro a cada persona
        System.out.println(" ** Mostrar Personas ** ");
        System.out.println(person + "\n" + person2 + "\n");

        System.out.println(" ** Mostrar Perros ** ");
        System.out.println(dog + "\n" + dog2 + "\n");

        //seleccion del animal
        do {

            System.out.println("Quien desea comenzar: \n"
                    + "1_)" + person.getNombre() + "\n"
                    + "2_)" + person2.getNombre());

            System.out.print("op-> ");
            o = leer.nextInt();

        } while (o != 1 && o != 2);

        if (o == 1) {
            System.out.println(" " + person.getNombre() + " que Perro desea: \n"
                    + " ** " + dog.getNombre() + "\n"
                    + " ** " + dog2.getNombre() + "\n");

            System.out.print("Ingrese el Nombre-> ");
            String nom = leer.next();
            if (dog.getNombre().equalsIgnoreCase(nom)) {

                System.out.println("Gracias por Adoptar, " + dog.getNombre()
                        + " es parte de la familia "
                        + person.getApellido() + "\n"
                );

                person.setPerro(dog);
                person2.setPerro(dog2);

            } else {

                System.out.println("Gracias por Adoptar, " + dog2.getNombre()
                        + " es parte de la familia "
                        + person.getApellido() + "\n"
                );

                person.setPerro(dog2);
                person2.setPerro(dog);

            }

        } else {

            System.out.println(" " + person2.getNombre() + " que Perro desea: \n"
                    + " ** " + dog.getNombre() + "\n"
                    + " ** " + dog2.getNombre() + "\n");

            System.out.print("Ingrese el Nombre-> ");
            String nom = leer.next();
            if (dog.getNombre().equalsIgnoreCase(nom)) {

                System.out.println("Gracias por Adoptar, " + dog.getNombre()
                        + " es parte de la familia "
                        + person2.getApellido() + "\n"
                );

                person2.setPerro(dog);
                person.setPerro(dog2);

            } else {

                System.out.println("Gracias por Adoptar, " + dog2.getNombre()
                        + " es parte de la familia "
                        + person2.getApellido() + "\n"
                );

                person2.setPerro(dog2);
                person.setPerro(dog);

            }

        }
        
        //mostramos a las personas con sus animales adoptados
        System.out.println(person + "\n" + person2 + "\n");

    }
}
//****************************************************************************
// ********** manera de crear un array de objetos Perros *********************
//        creo un array de perros
//        System.out.print("Cuantos Perros están en Adopción: ");
//        int can = leer.nextInt();//cantidad de perros que puedan haber
//        System.out.println(" **************** \n");
//
//        Perro[] pe = new Perro[can];//Array de perros
//
//        for (int i = 0; i < can; i++) {
//            Perro p = new Perro();//instancio un objeto perro
//
//            //instancio los metodos
//            p.crearPerro();
//
//            //guardo el objeto en mi array
//            pe[i] = p;
//            person.setPerro(p);            
//
//        }
//        
//        System.out.println(person);
