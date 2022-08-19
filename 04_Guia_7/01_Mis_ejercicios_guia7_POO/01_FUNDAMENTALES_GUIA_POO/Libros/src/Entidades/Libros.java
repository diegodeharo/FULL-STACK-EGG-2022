package Entidades;

public class Libros {
    
    //atributos
    
    private int isbn;
    
    private String Titulo;
    
    private String Autor;
    
    private int Numerosdepag;
    
   //mi constructor por defecto o vacio 
   public Libros(){
       
   }
   
   //mi constructor por parametro

    public Libros(int isbn, String Titulo, int Numerosdepag) {
        this.isbn = isbn;
        this.Titulo = Titulo;
        this.Numerosdepag = Numerosdepag;
    }
  
    //creo los get & set para luego introducir dato y retornarlos de donde sen solicitados

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumerosdepag() {
        return Numerosdepag;
    }

    public void setNumerosdepag(int Numerosdepag) {
        this.Numerosdepag = Numerosdepag;
    }
    
    //dejo ascentado un tostring para que cuando lo solicite desde el main pueda mostrarme todos los atributos cargados de mi objeto de la clase correspondiente

    @Override
    public String toString() {
        return "Libros{" + "isbn=" + isbn + ", Titulo=" + Titulo + ", Autor=" + Autor + ", Numerosdepag=" + Numerosdepag + '}';
    }
    

}
