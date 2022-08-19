 
package Package_Entidad_Persona;

 
public class Persona {
    
    //atributos
    public String nombre;
    public int dia;
    public int mes;
    public int anio;
    
    //contructor vacio
    public Persona() {
    }
    
    //constructor parametrizado
    public Persona(String nombre, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    // Get & Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
        
}
