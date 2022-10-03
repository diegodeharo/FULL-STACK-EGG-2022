/* Realizar un programa para que una Persona pueda adoptar un Perro.
Vamos a contar de dos clases. Perro, que tendrá como atributos: nombre,
raza, edad y tamaño; y la clase Persona con atributos: nombre, apellido, 
edad, documento y Perro. Ahora deberemos en el main crear dos Personas y
dos Perros. Después, vamos a tener que pensar la lógica necesaria para
asignarle a cada Persona un Perro y por ultimo, mostrar desde la clase
Persona, la información del Perro y de la Persona.
 */
package persona;

/**
 *
 * @author EL_SEMENTAL
 */
public class servicioPersona {

    //instanciar un objeto persona
    Persona persons = new Persona();

    /**
     * seleccion seleccion de perro
     */
    public void seleccionPerro() {
        
        //VARIABLE BANDERA  
        String op = "s";
        
        do{
            
        persons.crearPersona();
        
        System.out.println("\n Desea agregar otra persona?");
        System.out.print("S/N-> ");
        
        }while (op.equalsIgnoreCase("s"));

    }

}
