
package pelicula;


public class Pelicula {
    
    // ATRIBUTOS
    private String titulo;
    private Integer duracion;
    private String director;
    private Integer edadminima;
    
    // CONSTRUCTOR POR DEFECTO
    public Pelicula() {
    }
    
    // CONSTRUCTOR POR PARAMETRO
    public Pelicula(String titulo, Integer duracion, String director, Integer edadminima) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.director = director;
        this.edadminima = edadminima;
    }
    
    // GET AND SET
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getEdadminima() {
        return edadminima;
    }

    public void setEdadminima(Integer edadminima) {
        this.edadminima = edadminima;
    }
    
    // toSTRING
    @Override
    public String toString() {
        return " * Pelicula * \n"
                + "Titulo->" + titulo + "\n"
                + "Duracion->" + duracion + "\n"
                + "Director->" + director + "\n"
                + "Edad Minima->" + edadminima + "\n"
                + " ****** " + "\n";
    }

    
    
}
