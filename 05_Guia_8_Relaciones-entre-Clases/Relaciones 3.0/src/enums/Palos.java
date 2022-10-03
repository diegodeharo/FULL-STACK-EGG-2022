
package enums;


public enum Palos {
    
    ORO("Oro"), ESPADA("Espada"), BASTO("Basto"), COPA("Copa");
    
   private String nombre;

    private Palos(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
   
   
    
    
}
