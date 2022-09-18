package Package_Ahorcado_Entidad;

import java.util.Scanner;

public class Ahorcado {
    
    Scanner leer = new Scanner(System.in);

    // Atributos
    public String[ ] palabrabuscar;
    
    public String palabra ;

    public int can_letras_encontradas ;
    
    public int can_letras_NO_encontradas ;

    public int max_jugadas;

    // contructores
    public Ahorcado() {
        
         int n = 10;  // esto es importante para evitar un error null es decir, evitar un error en el tamaño de mi vector arrey
         palabrabuscar = new String [n];
        
    }

    public Ahorcado(String[] palabrabuscar, int can_letras_NO_encontradas,  int can_letras_encontradas, int max_jugadas, String palabra) {
        this.palabrabuscar = palabrabuscar;
        this.can_letras_encontradas = can_letras_encontradas;
        this.max_jugadas = max_jugadas;
        this.palabra = palabra;
        this.can_letras_NO_encontradas = can_letras_NO_encontradas;
    }

    // Set & Get
    public String[] getPalabrabuscar() {
        return palabrabuscar;
    }

    public void setPalabrabuscar(String[] palabrabuscar) {
        this.palabrabuscar = palabrabuscar;
    }

    public int getCan_letras_encontradas() {
        return can_letras_encontradas;
    }

    public void setCan_letras_encontradas(int can_letras_encontradas) {
        this.can_letras_encontradas = can_letras_encontradas;
    }

    public int getMax_jugadas() {
        return max_jugadas;
    }

    public void setMax_jugadas(int max_jugadas) {
        this.max_jugadas = max_jugadas;
    }
    
    public String getpalabra() {
        return palabra;
    }

    public void setpalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    
    
    // metodos de calculo
    
    // metodo crearJuego
    public void  crearjuego() {
       
        System.out.println("*******************************************************");

        System.out.print(" Ingrese la Palabra a Buscar-> ");

        this.palabra = leer.next();

        this.palabra = this.palabra.toLowerCase();

        System.out.println("");

        this.max_jugadas = this.palabra.length() + 1;

        for (int i = 0; i < this.palabra.length(); i++) {

            this.palabrabuscar[i] = this.palabra.substring(i, i + 1);

        }
        
        can_letras_NO_encontradas = palabra.length();
        
        System.out.println("*******************************************************");
        
    }

    // Metodo Longitud
    public void longitud() {

        System.out.println(" La Longitud de la Palabra es-> " + this.palabra.length());

        System.out.println("*******************************************************");
    }        
  
    //metodo buscar letra
    public void buscarletra(String carac) {

        boolean bandera = false;

        System.out.println("*******************************************************");
        
        for (int j = 0; j < this.palabra.length(); j++) {

            if (carac.equalsIgnoreCase( this.palabrabuscar[ j ] ) )  {

                bandera = true;
                
            } 

        }

        if (bandera) {

            System.out.println("La Letra es Parte de la palabra");

        } else {

            System.out.println("La Letra NO Pertenece a la Palabra");

        }

        System.out.println("*******************************************************");
    }

    // Metodo Encontradas
    public void encontradas(String carac) {
        
        boolean bandera;
       
        for (int i = 0; i < this.palabra.length(); i++) {
            
            if (carac.equalsIgnoreCase( this.palabrabuscar[ i ] ) ) {

                bandera = true;
               
                this.can_letras_encontradas += 1; 
                
            } 

        }

        System.out.println("Letras Encontradas-> " + this.can_letras_encontradas);
        
        System.out.println("Letras Restantes-> " + ( this.can_letras_NO_encontradas - can_letras_encontradas ));
        
       can_letras_NO_encontradas = palabra.length();
       
        System.out.println("*******************************************************");
    }

    // Metodo intentos
    public void intentos() {

        System.out.println("Oportunidades-> " + this.max_jugadas);
        
        max_jugadas -- ;        
        
        System.out.println("*******************************************************");

    }

    // Metodo juego
    public void juegos() {
        
        boolean salida = false;
        
        // metodo 1
        crearjuego();        
        
        while ( this.max_jugadas!= 0 ){
            
            // metodo 2
            intentos();
            
            // metodo 3
            longitud();
            
            // introducir letra
            System.out.println("---------------------------------------------------------------");
            
            System.out.print("Ingrese el Caracter->");
            
            String carac = leer.next();
            
             System.out.println("---------------------------------------------------------------");      
            
            
            // metodo 4
            
            buscarletra(carac);
            
            // metodo 5
            encontradas(carac);
            
            // sabes la respuesta ?
            System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
            
            System.out.println("SABES LA RESPUESTA....? S/N");
            
            System.out.print("S o N ->");
            
            String respuesta = leer.next();
            respuesta = respuesta.toLowerCase();
            
            System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
     
            if ( respuesta.equalsIgnoreCase("s") ) {

                System.out.print("Ingrese la Respuesta->");

                String res = leer.next();
                
//                res = res.toLowerCase();
                
                System.out.println("");

                if (res.equalsIgnoreCase(palabra)) {
                    
                    salida = true;

                    max_jugadas = 0;
                    
                    break;
                }

            }

        }
        
        if (salida) {
            
            System.out.println("En Hora Buena, descubriste la palabra-> " + palabra );
            
        }else{
            
            System.out.println("Ohhhh!! AHORCADO");
            
        }
        
        System.out.println("");
        
    }

}
