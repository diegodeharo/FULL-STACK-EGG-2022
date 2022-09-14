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

    private String opcion1 = "Opcion 1 - Agregar Alumno";
    private String opcion2 = "Opcion 2 - Salir";

    public void setOpcion1(String opcion1) {
        this.opcion1 = opcion1;
    }

    public void setOpcion2(String opcion2) {
        this.opcion2 = opcion2;
    }

    public String getOpcion1() {
        return opcion1;
    }

    public String getOpcion2() {
        return opcion2;
    }

    public void printMenu() {
        System.out.println("");
        System.out.println("");
        System.out.println("Elegir una opcion");

        System.out.println(this.opcion1);
        System.out.println(this.opcion2);
        this.setOpcion1("Opcion 1 - Agregar otro Alumno");
    }

}
