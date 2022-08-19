package Package_Entidad_Persona;

public class Persona {

    //ATRIBUTOS de un objeto persona
    private String Nombre;

    private int Edad;

    private String Sexo;

    private double Peso;

    private double Altura;

    //****************************************************
    //********* METODOS PRINCIPALES ***********
    //****************************************************
    
    // Constructor vacio
    public Persona() {
    }

    // Constructo por defecto
    public Persona(String Nombre, int Edad, String Sexo, double Peso, double Altura) {
        
        this.Nombre = Nombre;
        
        this.Edad = Edad;
        
        this.Sexo = Sexo;
        
        this.Peso = Peso;
        
        this.Altura = Altura;
    }
    
    //****************************************************

    // GET & SET
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    //****************************************************
}
