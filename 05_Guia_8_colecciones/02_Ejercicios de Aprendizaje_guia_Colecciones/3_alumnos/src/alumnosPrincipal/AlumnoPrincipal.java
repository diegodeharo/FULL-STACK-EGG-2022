
package alumnosPrincipal;

import servicioAlumnos.AlumnoServicio;

/**
 *
 * @author EL_SEMENTAL
 */
public class AlumnoPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Instancio un objeto del tipo servicio
        AlumnoServicio alum= new AlumnoServicio();
        
        alum.crearAlumno();
        alum.mostrarPromedioAlumno();
        alum.mostrarTamañoLista();
        
        
    }
    
}
