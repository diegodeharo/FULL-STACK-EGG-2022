

package Package_Cancion;



public class Cancion {
    
    // atributos
    
    public String titulo;
    public String autor;
    
    // METODOS

    // a_contructos por defecto
    public Cancion() {
       titulo = " ";
       autor = " ";
    }
    
    // contructor por parametros
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    // get & set

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}
