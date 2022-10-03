/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unoAuno;

/**
 *
 * @author EL_SEMENTAL
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dni d = new Dni();
        d.setNumero(34873426);
        d.setSerie("abc");

        Persona p = new Persona();
        p.setNombre("Diego");
        p.setApellido("deHaro");
        p.setDni(d);

        System.out.println("PERSONA-> " + p.getNombre() + "\n"
                + "APELLIDO-> " + p.getApellido() + "\n"
                + "Dni:\n" + "Serie-> " + p.getDni().getSerie() + "\n"
                + "Numero-> " + p.getDni().getNumero() + "\n");
    }

}
