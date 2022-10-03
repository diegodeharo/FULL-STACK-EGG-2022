
package Carta;

import enums.Numeros;
import enums.Palos;


public class Carta {
    
    private Numeros numero;
    private Palos palo;


    public Carta(Numeros numero, Palos palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Numeros getNumero() {
        return this.numero;
    }

    public void setNumero(Numeros numero) {
        this.numero = numero;
    }

    public Palos getPalo() {
        return this.palo;
    }

    public void setPalo(Palos palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta" + "numero=" + numero + ", palo=" + palo ;
    }
    
    
}
