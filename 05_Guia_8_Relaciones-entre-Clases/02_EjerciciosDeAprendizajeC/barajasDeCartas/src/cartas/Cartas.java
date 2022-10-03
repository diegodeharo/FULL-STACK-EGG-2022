/*
 Realizar una baraja de cartas españolas orientada a objetos.
Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) y 
un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. 
La baraja estará compuesta por un conjunto de cartas, 40 exactamente.

 */
package cartas;

import palo.Palo;





/**
 *
 * @author EL_SEMENTAL
 */
public class Cartas {
    
    //atributos
    private Integer numero ;
    private Palo palo;
//    private List<Cartas> carta;
    
    //constructor vacio
    public Cartas() {
//        this.carta = new ArrayList();
    }
    
    //constructor parametrizado
    public Cartas(Integer numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
//        this.carta = carta;
    }
    
    //get and set

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

//    public List<Cartas> getCarta() {
//        return carta;
//    }
//
//    public void setCarta(List<Cartas> carta) {
//        this.carta = carta;
//    }
    
   
    
    //toString
    @Override
    public String toString() {
        return " ** Cartas ** \n"
//                + "Numero-> " + Arrays.toString(numero) + "\n"
                + "Palo-> " + palo + "\n";
    }
    
   
    
}
