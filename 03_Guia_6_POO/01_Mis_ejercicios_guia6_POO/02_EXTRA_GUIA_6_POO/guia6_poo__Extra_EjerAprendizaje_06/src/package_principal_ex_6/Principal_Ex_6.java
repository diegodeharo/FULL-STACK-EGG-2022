package package_principal_ex_6;

import Package_Ahorcado_Entidad.Ahorcado;
import java.util.Scanner;

public class Principal_Ex_6 {

    public static void main(String[] args) {

        // objeto de tipo scanner
        Scanner leer = new Scanner(System.in);
        
        // intanciar un objeto de tipo ahorcado
        Ahorcado a1 = new Ahorcado();
        
//        // llamamos a nuestros metodos
//       
//        //1_ crear juego
//        a1.crearjuego();
//        
//        // 2_ longitud de la palabra introducida
//        a1.longitud();
//        
//        // 3_buscar letra
//        System.out.print("Ingrese el caracter-> ");
//        
//        String carac = leer.next();
//        
//        System.out.println("");
//        
//        a1.buscarletra(carac);
//        
//        a1.encontradas(carac);
//        
//        a1.intentos();

a1.juegos();
        
    }

}
