package revolverDeAgua;

public class RevolverDeAgua {

    //atributos que se generan de manera aleatoria
    private int posAcual;
    private int posicionAgua;

    //metodo constructor por defecto
    public RevolverDeAgua() {

        this.posAcual = (int) ((Math.random() * (6)) + 1);
        this.posicionAgua = (int) ((Math.random() * (6)) + 1);

    }

    //constructor parametrizado 
    public RevolverDeAgua(int posAcual, int posicionAgua) {
        this.posAcual = posAcual;
        this.posicionAgua = posicionAgua;
    }

    //get and set
    public int getPosAcual() {
        return posAcual;
    }

    public void setPosAcual(int posAcual) {
        this.posAcual = posAcual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    //tostring
    @Override
    public String toString() {
        return " ** RevolverDeAgua ** \n"
                + "PosAcual->" + posAcual + "\n"
                + "PosicionAgua-> " + posicionAgua + "\n";
    }

}
