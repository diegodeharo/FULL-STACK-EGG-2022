/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author hGauna
 */
public class Menu {
    private String opcion1 = "Opcion 1 - Agregar Pelicula";
    private String opcion2 = "Opcion 2 - Buscar Pelicula por  titulo";
    private String opcion3 = "Opcion 3 - Buscar Peliculas por director ";
    private String opcion4 = "Opcion 4 - Salir";

    public String getOpcion1() {
        return opcion1;
    }

    public void setOpcion1(String opcion1) {
        this.opcion1 = opcion1;
    }

    public String getOpcion2() {
        return opcion2;
    }

    public void setOpcion2(String opcion2) {
        this.opcion2 = opcion2;
    }

    public String getOpcion3() {
        return opcion3;
    }

    public void setOpcion3(String opcion3) {
        this.opcion3 = opcion3;
    }

    public String getOpcion4() {
        return opcion4;
    }

    public void setOpcion4(String opcion4) {
        this.opcion4 = opcion4;
    }

    public void printMenu() {
        System.out.println("");
        System.out.println("Elegir una opcion");

        System.out.println(this.opcion1);
        System.out.println(this.opcion2);
        System.out.println(this.opcion3);
        System.out.println(this.opcion4);
    }
}
