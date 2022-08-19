
package MascotaAPP;

import MascotaAPP.Entidades.Mascota;
import java.util.Scanner;


public class MascotaaAPP {

    
    public static void main(String[] args) {
        
        //creamos una variabledel tipo scanner
        Scanner leer = new Scanner(System.in);// creo una variable de tipo escaner que se llama leer al cual yo le asigno lo de la derecha, es decir que estamos 
        //creando un scanner
        
        //la primera interaccion y la mas importante que vamos a hacer es creando nuestro primer objeto
        //un objeto se crea:
        // tipo de dato          el nombre de la variable----ya con esto, tenemos declarado un objeto PERO NO CREADO O INICIALIZADO, para ello hacemos lo siguiente
        //       Mascota                m1;
      
        // al final de la declaración lo que se hara es inicializar y crear un objeto
        //se inicializa coloconado el " = NEW- que es una palabra reservada de java. PARA INSTANCIAR UN OBJETO, DONDE VAMOS A HACER NACER UN OBJETO.
      //  Mascota m1= new Mascota(); // aca hermos creado y hemos hecho nacer un objeto
                  //new Mascota(); // esto que esta a la derecha del igual, hago nacer el objeto
                  //Mascota m1     // esto que esta a la izquierda del igual ES DONDE LO ASIGNO 
                  //CON TODOS ESTOS PASOS TENGO CREADA MI PRIMERA MASCOTA
    // en este caso es una mascota fantasma, ya que no tiene tipo, no tiene nombre, apodo, edad, no tiene nada
    //lo que vamos a hacer es asignarle valores, aca vamos a abrir Mascota
    
    
    
    
    //***** CON ESTA AYUDA AHORA VAMOS A DARLE CARACTERISTICA A ESTA  MASCOTA QUE ESTA EN LA VARIABLE M1
    /*    //declaramos nuestros Atributos
    public String nombre;
    public String apodo;
    //conejo, Gato, Perro, Loro, Carpincho
    public String tipo;
    public String color;
    public int edad;
    public boolean cola;
    public String raza;
*/
    // POR EJE COMO LE DAMOS EL NOMBRE? PRIMERO COLOCAMOS EL NOMBRE DE LA VARIABLE Y COLOCAMOS UN PUNTO AL FINAL, AHI SE
    //NOS PERMITE ACCEDER A LAS CARACTERISTICAS ES DECIR A LOS ATRIBUTOS.
    
 /*   m1.apodo="Mijo";// aca, yo le asigne un valor a la variable Apodo que corresponde a un atributo de esta Mascota
   // m1.nombre="Zeus Odin";
    m1.nombre=leer.next();//SABEMOS QUE LA VARIABLE NOMBRE QUE CORRESPONDE AL ATRIBUTO DE MASCOTA DE LA VARIABLE m1 VA A TENER EL VALOR ZEUS QUE YO ESCRIBI MEDIANTE TECLADO
    m1.tipo="perro";
    m1.edad=2;
    m1.raza="Pincher";
    m1.cola=true;
    m1.color="Marron";*/
            
 // ahora, como hago para mostrar los datos de m1?   
 // utilizo un sout para mostrar los valores que poseen cada una de las varibles que corresponden a los atributos de esta mascota en cuestion
 
 /*       System.out.println("APODO-" + m1.apodo + "\n"
                + "NOMBRE-" + m1.nombre + "\n"
                + "TIPO-" + m1.tipo + "\n"
                + "EDAD-" + m1.edad + "\n"
                + "RAZA-" + m1.raza + "\n"
                + "COLA-" + m1.cola + "\n"
                + "COLOR-" + m1.color + "\n");

*/
        //ahora realizaremos otro metodo de llamar un objeto
        Mascota m1 = new Mascota("Zeus", leer.next(), "pincher");
        //System.out.println(m1.apodo + " " + m1.edad + " " + m1.tipo + " " + m1.color);
        
        //ahora si no queremos que se llame ZEUS hacemos lo siguiente
        //encapsulamos el objeto tipo mascota
        //m1. -> si nosotros hacemos ahora un cntrl+espacio veremos que no nos sale los atributos de la clase de la mascota, esto 
        //se debe a que se cambio el modificador de accesibilidad a privado
        //ahor para poder acceder a ellos, es decir a los atributos que estan el privados, lo haremos mediante un set o setear
        //
        m1.setNombre("Odin");
        
        // no puedo mostrar mi set por medio del sou System.out.println("");
        //System.out.println(m1.getNombre());//me mostrara el nombre anterior mas la modificacion ultima que sufrio
        
        System.out.println(m1);
        
        //aca realizamosel metodo de operacion que llamamos pasear donde provocara una disminucion en 100 del valor asignado a energia
        m1.pasear(100);
        System.out.println(m1);
    }

}
