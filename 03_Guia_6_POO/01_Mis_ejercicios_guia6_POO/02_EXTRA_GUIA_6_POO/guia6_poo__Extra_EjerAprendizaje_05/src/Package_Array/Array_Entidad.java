 
package Package_Array;

import java.util.Scanner;

 
public class Array_Entidad {
    
    Scanner leer = new Scanner(System.in);
    
    public String[ ] mes = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio" , "agosto" , "septiembre" , "octubre" , "noviembre" , "diciembre" } ;
    
    public String mesSecreto;
    
    

    public Array_Entidad() {
    }
    
    public Array_Entidad(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public String[] getMes() {
        return mes;
    }

    public void setMes(String[] mes) {
        this.mes = mes;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    
    public void adivinanza(){
        
        System.out.println("Adivina el Mes");
        System.out.print("Mes-> ");
        mesSecreto = leer.next();
        mesSecreto = mesSecreto.toLowerCase();
        System.out.println("");
        
        boolean bandera = false;
        
            if (mesSecreto.equalsIgnoreCase(mes[7])) {
                
                System.out.println( "Acerto");
//                System.out.println("el mes correcto es-> " + mes[9]);
                
            }else{
                
               System.out.println( "No Acerto" );
//                System.out.println("el mes correcto es-> " + mes[9]);
                
            }
            
        }
    
}

