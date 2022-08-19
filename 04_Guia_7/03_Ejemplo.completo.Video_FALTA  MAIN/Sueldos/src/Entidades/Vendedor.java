/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author EL_SEMENTAL
 */
public class Vendedor {//paso 2-> cramos el paquete entidades donde tendra a los objetos vendedores o vendedor

    //paso3-> se define cuales serán los atributos que van a caracterizar a este objeto
    //aca declaro atributos de forma encapsulada
    private String Nombre;
    private Integer dni;
    private double SueldoBasico;
    private double Comisiones;
    private double SueldoMensual;
    private Date FechaInicio;

    //paso4->una vez definidos los atributos se van a armar los contructores
    //a_constructores por defecto o vacio
    public Vendedor() {

    }

    //B_Constructor por parametro
    public Vendedor(String Nombre, Integer dni, double SueldoBasico, double Comisiones, double SueldoMensual, Date FechaInicio) {
        this.Nombre = Nombre;
        this.dni = dni;
        this.SueldoBasico = SueldoBasico;
        this.Comisiones = Comisiones;
        this.SueldoMensual = SueldoMensual;
        this.FechaInicio = FechaInicio;
    }

    //paso5-> agregamos los getter & setter
    public String getNombre() { //el metodo get-> es una funcion que retorna un dato de tipo String que la 
        //vamos a invocar con el nombre "getNombre", no necesita ningún parametro para funcionar y lo que retorna
        //es el atributo de este objeto, que seria Nombre
        return Nombre;
    }

    /**
     * el set-> es una metodo de tipo void donde no se va a retornar nada, pero
     * aca yo le tengo que pasar un parametro y lo que va a hacer, es alojarlo
     * en el atributo que este requiriendo en este caso seria nombre, por lo
     * tanto el parametro que yo le pase a la funcion se asignara al atributo
     * Nombre
     *
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public double getSueldoBasico() {
        return SueldoBasico;
    }

    public void setSueldoBasico(double SueldoBasico) {
        this.SueldoBasico = SueldoBasico;
    }

    public double getComisiones() {
        return Comisiones;
    }

    public void setComisiones(double Comisiones) {
        this.Comisiones = Comisiones;
    }

    public double getSueldoMensual() {
        return SueldoMensual;
    }

    public void setSueldoMensual(double SueldoMensual) {
        this.SueldoMensual = SueldoMensual;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    //paso 6-> agragamos el Metodo tostring con la finalidad de retornar una impresion del objeto con todos 
    //sus atributos o caracteristicas detallados 
    @Override
    public String toString() {
        return "Vendedor{" + "Nombre=" + Nombre + ", dni=" + dni + ", SueldoBasico=" + SueldoBasico + ", Comisiones=" + Comisiones + ", SueldoMensual=" + SueldoMensual + ", FechaInicio=" + FechaInicio + '}';
    }

}
