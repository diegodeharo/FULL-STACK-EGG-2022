
package alumnosAtributos;

import java.util.ArrayList;

/**
 *
 * @author EL_SEMENTAL
 */
public class Alumno {
    
    //ATRIBUTOS DE LOS ALUMNOS
    private String nombre;
    private ArrayList<Integer> notas = new ArrayList();
    
    
    // METODOS

    public Alumno() {
    }

    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        //this.notas = new ArrayList(); cual es la diferencia entre esto y
        this.notas = notas;// con esto inicializado en el atributo
    }
    
    //set & get

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    
    //creamos un metodo de calculo de nota final perteneciente a cada 
    // alumno, tipo double para enviar el resultado luego cuando 
    // sea llamada la función.    
    public float notaFinal(){ 
        
        float promedio = 0; //promedio inicializado en 0
        double suma = 0;//variable acumuladora
        
        //suma y luego promedio
        for (Integer nota : notas) {            
            suma+= nota;            
        }        
        promedio = (float) suma/3;
                
        return promedio ;
    }
    
    
    
    
    
}
