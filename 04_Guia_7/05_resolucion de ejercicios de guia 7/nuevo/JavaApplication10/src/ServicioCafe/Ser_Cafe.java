/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioCafe;

import EntidadCafe.Cafetera;
import java.util.Scanner;


public class Ser_Cafe {
    
     Cafetera c1 = new Cafetera();
    Scanner leer = new Scanner(System.in);
    
    public Cafetera llenarcafetera(){
       c1.setCapAct(c1.setCapMax());        
        return c1;
    }
    
    public void ServirTaza(int tamanio){
        System.out.println("ingrese el tamaño de la taza: ");
        tamanio = leer.nextInt();
        
        if (tamanio>c1.getCapAct()) {
            System.out.println("su taza no se lleno "+c1.getCapAct());
        }else {
            System.out.println("su taza esta llena");
        }
    }
    
}
