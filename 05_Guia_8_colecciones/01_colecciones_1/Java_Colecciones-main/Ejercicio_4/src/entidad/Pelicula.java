/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Johana
 */
public class Pelicula {

    private String titulo;
    private String director;
    private Double duracion;

    public Pelicula(String titulo, String director, Double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public void mostrarDatos() {

        System.out.println("Titulo --> " + titulo
                + ", Director --> " + director
                + ", Duracion --> " + duracion + "Hs"
                + "\n*************************************************************");

    }

    public double getDuracion() {

        return duracion;

    }

    public String getTitulo() {

        return titulo;
    }

    public String getDirector() {

        return director;
    }
}
