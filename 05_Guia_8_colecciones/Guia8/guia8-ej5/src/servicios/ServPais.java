/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import static utilidades.Comparador.ordenarAsc;



/**
 *
 * @author hGauna
 */
public class ServPais {

    HashSet<Pais> paises = new HashSet<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ServMenu newMenu = new ServMenu();

    public Pais ingresarPais() {
        System.out.println("Ingrese el nombre del pais:");
        String paisIngresado = leer.next();
        return new Pais(paisIngresado);
    }
    
    public void elimiarPais(){
        boolean flag = true;
        System.out.println("");
        System.out.println("Ingrese el pais que quiere eliminar");
        String inputPais = leer.next();
        System.out.println("------------------------");
        Iterator<Pais> it = paises.iterator();
        while (it.hasNext()) {
            String aux = it.next().getPais();
            if (aux.equals(inputPais)) {
                flag = false;
                System.out.println(inputPais + " removido del conjunto");
                it.remove();
            }
        }
        if(flag) System.out.println("No se modifico en conjunto, no se encontro: " + inputPais);        
        System.out.println("-------");
        System.out.println("");
        paises.forEach((e) -> System.out.println(e.getPais()));
    }
    
    private void buscarPais(){
        System.out.println("Buscar Pais");
    }

    //public void ejecutar(HashSet<Pais> paises) {
    public void ejecutar() {
        int input = 0;
        do {
            System.out.println("");
            newMenu.imprmirMenu();
            System.out.println("_______________________");
            input = leer.nextInt();
            switch (input) {
                case 1:
                    paises.add(this.ingresarPais());
                    break;
                case 2:
                this.buscarPais();
                break;
                case 3:
                this.elimiarPais();
                break;
                case 4:
                    System.out.println("");
                    System.out.println("Hasta luego...");
                    System.out.println("");
                    break;
                default:
                    System.out.println("");
                    System.out.println("Verifique la opcion ingresada");
                    System.out.println("");
            }

        } while (input != 4);
        paises.forEach((element) -> System.out.println(element.getPais()));
        
    }
    
    //public void mostrarOrdenado(HashSet<Pais> paises){
    public void mostrarOrdenado() {
        limpiarConsola();
        ArrayList<Pais> paisesOrd = new ArrayList(paises);        
        System.out.println("");
        System.out.println("----------ordenados------------");
        //paises.stream().sorted().forEach(System.out::println);
        //paisesOrd.sort(ordenarAsc); // son dos maneras de aplicar sort en el arrayList
        Collections.sort(paisesOrd, utilidades.Comparador.ordenarAsc);
        paisesOrd.forEach((e)-> System.out.println(e.getPais()));
    }
    
    public void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }    
}
