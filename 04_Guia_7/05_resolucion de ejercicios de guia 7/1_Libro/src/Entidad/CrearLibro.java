package Entidad;

/**
 *
 * @author Maxi
 */
public class CrearLibro {
    
    public int isbn;
    public String titulo;
    public String autor;
    public int paginas;
    
    
    public CrearLibro(){

}
    public CrearLibro(int isbn,String titulo, String autor, int paginas){
            
        this.isbn=isbn;
        this.titulo=titulo;
        this.autor=autor;
        this.paginas=paginas;
        
}

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

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    public void setIsbn(int isbn){
        this.isbn=isbn;
    }
    
    public int getIsbn(){
    return isbn;
    }
    
    
}

