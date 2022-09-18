
// PERFIL DONDE COLOCO TODOS LOS ATRIBUTOS QUE PUEDO AGREGAR DE MI OBJETO EN ESTA CLASE

package Package_Cafetera;


public class Cafetera {

    //atributos
    private double CapMax; //capacidad max que puede contener la cafetera

    private double CapAct; //capacidad actual que contiene la cafetera

//************************************************************************************************************************
    // METODOS Principales
//************************************************************************************************************************ 
    //CONSTRUCTORES
    
    //constructor por defecto
    public Cafetera() {

    }

    //contructor por parametros
    public Cafetera(double CapMax, double CapAct) {

        this.CapAct = CapAct;
        this.CapMax = CapMax;

    }

    //************************************************************************************************************************    
    // GET & SET
    
    public double getCapMax() {
        return CapMax;
    }

    public void setCapMax(double CapMax) {
        this.CapMax = CapMax;
    }

    public double getCapAct() {
        return CapAct;
    }

    public void setCapAct(double CapAct) {
        this.CapAct = CapAct;
    }

    //************************************************************************************************************************    
}
