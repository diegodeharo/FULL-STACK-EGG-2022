 
package package_principal_9_;

import Package_Matematicas.Matematicas;
import Package_Matematicas_Calculo.Matematicas_Servicio;

 
public class Principal_9 {
 
    public static void main(String[] args) {
        
        Matematicas_Servicio introducir = new Matematicas_Servicio();
        Matematicas numeros = new Matematicas();
        
        numeros.setNum1(Math.random()*10);
        numeros.setNum2(Math.random()*10);
        System.out.println("num1-> " + numeros.getNum1());
        System.out.println("num2-> " + numeros.getNum2());
        System.out.println("**************************************************");
        System.out.println("El Mayor es-> " + introducir.devolverMayor( numeros.getNum1(), numeros.getNum2() )); 
        System.out.println("**************************************************");
        System.out.println("La Potencia del Mayor es -> " + introducir.Potencia(numeros.getNum1(), numeros.getNum2()));
        System.out.println("**************************************************");
        System.out.println("La Raiz Cuadrada del Menor es -> " + introducir.calcularRaiz(numeros.getNum1(), numeros.getNum2()));
        
    }
    
}
