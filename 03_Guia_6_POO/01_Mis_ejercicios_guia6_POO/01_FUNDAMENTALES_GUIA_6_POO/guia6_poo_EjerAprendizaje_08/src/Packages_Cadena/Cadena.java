

package Packages_Cadena;

import java.util.Scanner;


public class Cadena {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    //atributos
    public String frase;
    public int Longitud;
    
    // METODOS 
    
    // Constructores
    // 1_por defecto
    public Cadena(){
        
    }
    
    // 2_por parametro
    public Cadena ( String frase, int Longitud ){
        
        this.Longitud = Longitud;
        this.frase = frase;
        
    }
    
    // Set & Get

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return Longitud;
    }

    public void setLongitud(int Longitud) {
        this.Longitud = Longitud;
    }
    
    // METODOS DE CALCULO
   
    //1_mostrar vocales
    public int  MostrarVocales( String aux , int tamaño ){
        
        int cont = 0;
        
        for (int i = 0; i < tamaño; i++) {
                        
            if (  aux.substring(i, i+1).equalsIgnoreCase("a") || aux.substring(i, i+1).equalsIgnoreCase("e") || aux.substring(i, i+1).equalsIgnoreCase("i")  ||  aux.substring(i, i+1).equalsIgnoreCase("o")  ||  aux.substring(i, i+1).equalsIgnoreCase("u") ) {
                
                cont++;
                
            }
            
        }
        
        return cont;
        
    }
    
    //2_invertir frase
    public String invertirFrase( String aux , int tamaño ){
        
        String aux1 = "" ;
        
        for (int i = tamaño-1 ; i >= 0; i--) {
            
        aux1 += aux.substring(i,i+1);
        // aux1 += aux.charAt(i);
            
        }
        return aux1;
    }
    
    // 3_veces repetido
    public int vecesRepetido(){  
        
        String letra ;
        
        System.out.print("ingrese la letra->");
        
        letra = leer.next();
        
         int cont1 = 0;
        
        int tamaño = frase.length();
        
        for (int i = 0; i < tamaño; i++) {
            
            if (frase.substring(i,i+1).equalsIgnoreCase(letra)) {
                
               cont1++;
               
            }
            
        }
        
        return cont1;
        
    }
    
    // 4_ comparar Longitud
    public void compararLongitud(){
        
        System.out.println("ingrese una nueva frase");
        
        String frase2 = leer.next();
        
        int frase_secundaria = frase2.length();
        
        int frase_original = frase.length();
        
        if (frase_secundaria  <= frase_original) {
            
            System.out.println("la frase orginal posee mas caracteres-> " + frase_original );
            
        }else{
            
            System.out.println("la frase secundaria posee mas caracteres-> " + frase_secundaria );
            
        }                    
        
    }

// 5_unirFrase
    public String unirFrase(){
        
        System.out.print(" ingrese la nueva frase->");
        
        String frase2 = leer.next();
        
       return frase.concat(frase2);
       
    }    
    
    // 7_reemplazar
    public String reemplazar() {

        String aux = frase;
        
        String aux1 = aux.replace('a', '*');

        return aux1;

    }
    
    // 8_Contiene
    public boolean Contiene() {

        boolean bandera, bandera1 = false;

        int tamaño = frase.length();

        System.out.print("ingrese el caracter para comprobación-> ");

        String caracter = leer.next();

        System.out.println("");

        for (int i = 0; i < tamaño; i++) {

            bandera = caracter.equalsIgnoreCase(frase.substring(i, i + 1));
            if (bandera) {
                bandera1 = true;
            }
        }

        return bandera1;
    }

}
