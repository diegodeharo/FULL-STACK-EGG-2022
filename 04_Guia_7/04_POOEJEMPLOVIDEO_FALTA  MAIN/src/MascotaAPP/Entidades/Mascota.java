/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MascotaAPP.Entidades;

/**
 *
 * @author EL_SEMENTAL
 */
public class Mascota { // AL HABER UNA CLASE MASCOTA DEBE HABER UN CONSTRUCTOR PARA QUE ESTA CLASE NAZCA

    // public // es un denomiador de accesibilidad
 /*   
    //declaramos nuestros Atributos
    public String nombre;
    public String apodo;
    //conejo, Gato, Perro, Loro, Carpincho
    public String tipo;
    public String color;
    public int edad;
    public boolean cola;
    public String raza;
  */
    //declaramos nuestros Atributos de manera privada lo que provoca q cuando invoquemos en el main nos salga un error porque antes
    //estaba de modo publico
    private String nombre;
    private String apodo;
    //conejo, Gato, Perro, Loro, Carpincho
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private String raza;
    private int energia; 

    //COMO CREAMOS UN CONSTRUCTOR
    public Mascota() {
       this.energia = 1000;// hacemos que por defecto cada vez que nazca una mascota sea cual sea su contructor, energia comience en 1000
                       //aca podemos colocar this.energia, pero no es necesario porque no hay redundancia de variables 
    }

    //PARA QUE SE DIFERENCIA CON EL OTRO CONTRUCTOR, DEBO AGRAGARLE ARGUMENTOS que recibe le contructor p/poder funcionar
    public Mascota(String nombre, String apodo, String tipo) {
        // ahora tenemos que designar o asignar 
        //esto se debe a que si yo por ej coloco nombre
        //nombre=nombre; //cuando acercamos el puntero del mouse cualquiera de la variable, hago referencia que estoy apuntando a nombre
        // el cual es tanto para el objeto de variable m1 como en esta clase mascota con los argumentos, para poder 
        //diferenciar con la otra clase mascota, debemos hacer que nuestras variables hagan referencia a nuestra clase
        //que estamos ahora, eso lo hacemos mediante la palabra reservada this. 
        //el this. hace referencia al objeto
        // esto nos indica que desde esta clase tomamos el nombre que llega como argumento a la nuestra clase mascota
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        if (tipo.equalsIgnoreCase("perro") || tipo.equalsIgnoreCase("gato") || tipo.equalsIgnoreCase("loro") || tipo.equalsIgnoreCase("conejo") || tipo.equalsIgnoreCase("carpincho")) {

            this.tipo = tipo;

        }
        
       this.energia=1000;
        
    }

    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.energia=1000;
    }

    //como realizamos un set
    //aca vemos como definimos a set con "s" minuscula ya que es un metodo, y al estar compuesto con nombre, a nombre la comenzamos con 
    //"N" mayuscula
    public void setNombre(String nombre) {
        this.nombre = nombre;
        if (nombre.length() > 0) {
            this.nombre = nombre;
        }
    }

    
    
    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    //como hacemos un getter->
    //es una funcion que nos permite entrar a la clase obtener el atributo que necesitamos e irnos

    public String getNombre() {
        return nombre;// en ese caso no ponemos "this.nombre" porque en este caso no hay redundancia, por ello tranquilamente ponemos
                      // nombre porque no hay nada que interfiera con la variable nombre dentro del get nombre
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }
    
    //primera forma-> ahora pondremos una metodo de operacion
    /**
     * funcion destinada a pasear
     * @param energiaRestar
     * @return energia
     */
    public int pasear(int energiaRestar) {
        energia -=  energiaRestar;
        return energia;
    }
    //otro tema importante es la sobrecarga de un metodo donde ambos metodos poseen el mismo nombre, pero reciben distinto argumentos
    /**
     * funcion destinada a pesear por vueltas
     * @param energiaRestar
     * @param vueltas
     * @return energia
     */
     public int pasear(int energiaRestar, int vueltas) {
         for (int i = 0; i < vueltas; i++) {             
             energia -=  energiaRestar;
         }
        return energia;
    }

    //una funcion que me devuelve un msj formateado y armado segun cada mascota, haciendo referencia a cada atributo del objeto.

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + '}';
    }
   
    
    
    
    
}
