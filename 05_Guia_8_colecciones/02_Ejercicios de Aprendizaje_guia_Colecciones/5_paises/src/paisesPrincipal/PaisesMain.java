/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paisesPrincipal;

import paisesEntidad.Paises;

/**
 *
 * @author EL_SEMENTAL
 */
public class PaisesMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //instancio un objeto de tipo Paises
        Paises p = new Paises();

        p.ingresarPaises();
        System.out.println("*******************************");

        p.mostrarPaises();
        System.out.println("*******************************");

        p.eliminarPais();
        System.out.println("*******************************");

    }

}
