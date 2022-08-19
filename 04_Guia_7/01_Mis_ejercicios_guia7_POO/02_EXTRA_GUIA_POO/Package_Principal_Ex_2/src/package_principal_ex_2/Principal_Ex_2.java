

package package_principal_ex_2;

import Pacakage_Puntos_Servicios.Puntos_Servicios;
import Package_Puntos.Puntos;



public class Principal_Ex_2 {

    
    
    public static void main(String[] args) {
        
        Puntos_Servicios p1 = new Puntos_Servicios();
        
        Puntos puntos = p1.crearPuntos();
        
        System.out.println("d(P1 , P2)= " + p1.Calcular());
        System.out.println("********************************************");
        System.out.println("********************************************");
        
    }
    
}
