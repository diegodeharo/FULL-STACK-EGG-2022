

package Package_NIF;


import java.util.Scanner;

 
public class NIF {
    
    Scanner leer = new Scanner(System.in);
    
    // Atributos
    public long DNI;
    public char letra;

    // Constructor vacio
    public NIF() {
    }
    
    // Constructor parametrizado
    public NIF(long DNI, char letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    // Get & Set
    public long getDNI() {
        return DNI;
    }
    
    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    // Metodos de Calculo
    public void CrearNif(){
        
        System.out.print("ingrese el DNI-> ");    
        this.DNI = leer.nextInt();
        System.out.println("");
        calculodeletra();
    }
    
    // funcion de ayuda para el calculo de la letra
    public char calculodeletra() {

        /**
         * La letra correspondiente al dígito verificador se calculará a traves
         * de un método que funciona de la siguiente manera: Para calcular la
         * letra se toma el resto de dividir el número de DNI por 23 (el
         * resultado debe ser un número entre 0 y 22). El método debe buscar en
         * un array (vector) de caracteres la posición que corresponda al resto
         * de la división para obtener la letra correspondiente. La tabla de
         * caracteres es la siguiente
         */
        char[] letras = {'T', 'R', 'W', 'S', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        int aux = (int) this.getDNI() % 23;

//        int aux1 = (int) Math.abs(aux);
        if (aux >= 0 && aux <= 22) {

//            System.out.println("aux1-> " + aux);    
            letra = letras[aux];

        }

        return letra;
    }
    
    // mostrar dni + NIF
    
    public void mostrar (){
        
        System.out.println( DNI +  "-" + calculodeletra() );
        
    }
}
