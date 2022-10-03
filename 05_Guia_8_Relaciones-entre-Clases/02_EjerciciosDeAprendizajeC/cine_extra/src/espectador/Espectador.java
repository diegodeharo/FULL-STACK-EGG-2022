 
package espectador;

 
public class Espectador {
    
    // ATRIBUTO
    private String nombre;
    private Integer edad;
    private Integer dinerodisponible;
    
    // CONSTRUCTOR POR DEFECTO
    public Espectador() {
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Espectador(String nombre, Integer edad, Integer dinerodisponible) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinerodisponible = dinerodisponible;
    }
    
    // GET AND SET 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDinerodisponible() {
        return dinerodisponible;
    }

    public void setDinerodisponible(Integer dinerodisponible) {
        this.dinerodisponible = dinerodisponible;
    }
    
    
    // toString
    @Override
    public String toString() {
        return " * Espectador * \n"
                + "Nombre=" + nombre + "\n"
                + "Edad=" + edad + "\n"
                + "Dinerodisponible=" + dinerodisponible + "\n"
                + " ****** " + "\n";
    }
    
}
