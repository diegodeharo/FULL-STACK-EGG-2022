/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import utilidades.Menu;

/**
 *
 * @author hGauna
 */
public class ServMenu {
    Menu newMenu = new Menu();
    public void imprmirMenu(){
        System.out.println("Elija una opcion");
        System.out.println(newMenu.getOpcion1());
        System.out.println(newMenu.getOpcion2());
        System.out.println(newMenu.getOpcion3());
        System.out.println(newMenu.getOpcion4());
    }
}
