package Servicio;//paso 7-> este paquete sirve para poder operar con todos los datos del objeto 
//vendedor

import Entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;

public class VendedorServicio {// paso 8-> cramos una clase que se llamara igual que el objeto
    //con la diferencia de ser una clase de servicio donde se haran las operaciones necesarias

    //paso9-> cracion de metodos 
    public Vendedor altaVendedor() {
        /**
         * este metodo no utilizara ningun parametro, pero lo que ya le estoy
         * avisando, es que este metodo va a retornar un objeto, para ello, voy
         * a tener que importar la entidad Vendedor, para avisarles, que lo que
         * esta definido acá (en la pestaña vendedor) va ser utilizado en la
         * pestaña de servicios
         */

        //paso10-> Instanciar UN objeto de tipo vendedor
        Vendedor v1 = new Vendedor();
        /**
         * A)_ lo que realizo acá, es instanciar al objeto del contructor vacio,
         * porque si llego a necesitar el otro contructor vendedor, deberia
         * pasarlo con sus parametros correspondientes
         *
         * B)_ una vez instanciado el objeto de tipo vendedor, este objeto
         * llamado v1 contiene todos los atributos que nosotros definimos en la
         * entiedad, pero están vacios, por lo tanto que vamos a hacer es
         * guardar información adentro de todos esos atributos
         */

        //paso11-> llamo al metodo scanner para poder ingresar los datos del usuario
        // por medio del teclado
        Scanner leer = new Scanner(System.in);

        //paso12-> lleno los atributo de este objeto v1 que instancio la entidad vendedor.
        System.out.println("Ingrese el Nombre del Vendedor");
        /**
         * aca para setear el nombre, se debe: 1)colocar el nombre del objeto
         * del metodo en cuestion-> v1 2)se coloca el "." esto abrira una
         * ventana donde deberia elejir el set correspondiente al atributo que
         * deseamos colocar el dato o info 3)se llama al escanner a travez del
         * nombre que se puso a la variable, aca seria "leer" seguido del la
         * forma del tipo de dato del atributo que se menciono en el atributo
         * del punto 2.
         */
        v1.setNombre(leer.next());

        System.out.println("Ingrese el DNI del Vendedor");
        v1.setDni(leer.nextInt());

        System.out.println("Ingrese el Sueldo Básico del Vendedor");
        v1.setSueldoBasico(leer.nextDouble());

        System.out.println("Ingrese el Día de Inicio del Vendedor");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de Inicio del Vendedor");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de Inicio del Vendedor");
        int anio = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        v1.setFechaInicio(fecha);

        /**
         * no vamos a setear las comisiones ni el sueldomensual ya que mas
         * delante vamos a pregutar el usuario cual es la cantidad de ventas de
         * este vendedor
         */
        return v1;//paso 13-> ya con todos los set realizados, lo que este metodo va a rotornar es 
        //el objeto v1 con todos los atributos requeridos ya cargados.

        //paso 14-> haremos un metodo en donde podamos calcular cuales son las comisiones 
        //que le corresponden a este vendedor por mes y el sueldo total que se le deberia
        //pagar en el mes en el que generó esas comisiones
    }

    public void SueldoMensual(Vendedor v1) {
        Scanner leer = new Scanner(System.in);
        /**
         * paso 15-> aca creamos un metodo de tipo void donde NO hara un retorno
         * de algo, pero si se le cargara POR parametro un objeto de tipo
         * vendedor en el cual es el que yo quiero que se realicen estos
         * calculos, para ello le pedimos al usuario cuales fueron las ventas
         * totales del vendedor
         */
        System.out.println("Ingrese Cuales fueron las ventas totales del Vendedor");
        double ventas = leer.nextDouble();
        v1.setComisiones(ventas * 0.15);
        v1.setSueldoMensual(v1.getSueldoBasico() + v1.getComisiones());
        System.out.println("El Sueldo Mensual del Vendedor " + v1.getNombre() + " es de $" + v1.getSueldoMensual());

    }

    /**
     * paso 16-> metodo que calcula la antiguedad del vendedor para calcular los
     * dias de vacaciones
     */
    public void Vacaciones(Vendedor v1) {
        /**
         * paso 17-> aca creamos un metodo de tipo void donde NO hara un retorno
         * de algo, pero si se le cargara POR parametro un objeto de tipo
         * vendedor en el cual es el que yo quiero que se realicen estos
         * calculos
         */
        Date hoy = new Date();
        int antiguedad = hoy.getYear() - v1.getFechaInicio().getYear();

        if (antiguedad < 5) {
            System.out.println("Le corresponden 14 días de Vacaciones");
        } else if (antiguedad < 10) {
            System.out.println("Le corresponden 21 días");
        } else if (antiguedad < 20) {
            System.out.println("Le corresponden 28 días");
        } else if (antiguedad > 20) {
            System.out.println("Le corresponden 35 días");
        } else {
            System.out.println("El empleado tiene vacaciones proporcionales");
        }
    }
}
