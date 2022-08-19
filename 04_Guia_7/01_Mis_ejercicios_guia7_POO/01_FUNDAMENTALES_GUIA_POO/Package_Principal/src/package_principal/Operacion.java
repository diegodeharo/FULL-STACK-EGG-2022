
package package_principal;

import java.util.Scanner;

public class Operacion {
    
    Scanner leer = new Scanner(System.in);
    
    //atributos
    
    private int num1;
    private int num2;
    //METODOS
    //Constructores
    
   
    
    //vacio
    public Operacion(){
        
    }
    
    //por parametro
    public Operacion(int num1, int num2) {
      
        this.num1 = num1;
        this.num2 = num2;
    }
 
    // get & set
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    //Ingreso los numeros
    
    public void crearoperacion() {

        System.out.print("Ingrese el primer numero->");
        this.num1 = leer.nextInt();
        System.out.println("");

        System.out.print("Ingrese el segundo numero mayor que el primero->");
        this.num2 = leer.nextInt();
        System.out.println("");
        
    }
    
    //calculos
    
    //suma
    /*
    public int suma(){
        
         int resultado;
        
       resultado = this.num1 + this.num2 ;
       
        return resultado;
        
    }
    */
    
     public int suma(int num1, int num2){
        
           
     int  resultado =num1 + num2 ;
       
        return resultado;
        
    }
     
   /*  
    //resta
    public int resta() {
        
        int resultado;

        resultado = this.num1 - this.num2;

        return resultado;
    }
*/
     
     //resta
    public int resta(int num1, int num2) {        

       int resultado = num1 - num2;

        return resultado;
    }
        
    //multiplicacion
    public int multiplicar(){        
        
         int resultado;
        
        if (this.num1!=0 || this.num2!=0) {
            
            resultado = this.num1 * this.num2;
                        
        }else{
            
            resultado = 0;
            
        }
        return resultado;
        
    }
       
    //division
    public float division() {

        float resultado = 0 ;

        if (this.num2 != 0) {

            if (this.num1 != 0) {

                resultado = this.num1 / this.num2;

            } else {
                resultado = 0 ;
            }
            
        }

        return resultado;

    }
    
}
