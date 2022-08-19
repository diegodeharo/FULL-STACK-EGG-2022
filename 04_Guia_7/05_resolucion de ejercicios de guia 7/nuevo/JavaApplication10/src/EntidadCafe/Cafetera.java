/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadCafe;


public class Cafetera {
    
    //atributos
    private int CapMax;
    private int CapAct;
    
    //contructor por defecto
    public Cafetera(){
        
    }
    
    //constructor por parametro
    public Cafetera(int CapMax, int CapAct) {
        this.CapMax = CapMax;
        this.CapAct = CapAct;
    }
    
    //get and set

    public int getCapMax() {
        return CapMax;
    }

    public void setCapMax(int CapMax) {
        this.CapMax = CapMax;
    }

    public int getCapAct() {
        return CapAct;
    }

    public void setCapAct(int CapAct) {
        this.CapAct = CapAct;
    }

    public int setCapMax() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
