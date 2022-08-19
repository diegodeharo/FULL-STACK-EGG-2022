/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas.
 */
package Molde;//paso->1

/**
 *
 * @author EL_SEMENTAL
 */
public class CrearLibro {

    //paso 2-> atributos de mi clase o molde crear libro
    public int isbn;
    public String titulo;
    public String autor;
    public int paginas;

    //paso 3-> creamos nuestros constructores
//1-contructor por defecto
    public CrearLibro() {

    }
//2-constructor por parametros

    public CrearLibro(int isbn, String titulo, String autor, int paginas) {
        //usamos el this. ya que hace referencia la objeto donde estamos trabajando
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;        
        this.paginas = paginas;
    }
//paso->4 hacemos el set y get para poder introducir los datos y tambien luego pedir los datos.

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
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
}
