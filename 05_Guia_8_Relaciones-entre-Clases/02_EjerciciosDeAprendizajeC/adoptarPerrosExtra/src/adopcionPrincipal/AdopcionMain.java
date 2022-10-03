/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adopcionPrincipal;

import servicioDeAdopcion.Servicios;

/**
 *
 * @author EL_SEMENTAL
 */
public class AdopcionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instanciamientos de clases
        Servicios sr = new Servicios();

        //System.out.println(sr.crearPersonas()); asi no puedo instanciar el 
        // metodo ya que me devuelve un void, por lo tanto debo hacer un meto
        //aparte donde me permita ver la lista de personas

        sr.personaPerro();
    }

}
