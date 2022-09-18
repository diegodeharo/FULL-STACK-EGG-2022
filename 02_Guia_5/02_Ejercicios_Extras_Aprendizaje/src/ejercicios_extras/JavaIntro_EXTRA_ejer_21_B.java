/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_extras;

import java.util.Scanner;

/**
 *
 * @author EL_SEMENTAL
 */
public class JavaIntro_EXTRA_ejer_21_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        /*
        Los profesores del curso de programación de Egg necesitan llevar un registro de las notas 
        adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y 
        desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos 
        prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
        Primer trabajo práctico evaluativo 10%
        Segundo trabajo práctico evaluativo 15%
        Primer Integrador 25%
        Segundo integrador 50%
        Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del 
        programa los profesores necesitan obtener por pantalla la cantidad de aprobados y 
        desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o 
        igual al 7 de sus notas del curso.

        */
        //declaro las variables y vectores con su dimensión
        double suma = 0, prom = 0, primer_tp = 0, segundo_tp = 0, int1 = 0, int2 = 0;
        int n = 4;
        String[] alumno = new String[n];
        String[] ap_ds = new String[n];
        double[] P_TPEV = new double[n];
        double[] S_TPEV = new double[n];
        double[] P_INT = new double[n];
        double[] S_INT = new double[n];
        double[] Sumas = new double[n];

        System.out.println("*************************************");
        System.out.println("Notas de los 10 Estudiantes de Egg");
        System.out.println("Coloque el Nombre y cada Nota\n"
                + "la cual ira desde 1 a 10");
        System.out.println("*************************************");

        for (int i = 0; i < n; i++) {
            //introducir el nombre del alumno y cada una de las notas            

            //Ingresamos el nombre del Alumno
            System.out.print("(" + (i + 1) + ") Alumno-> ");
            alumno[i] = leer.next();
            System.out.println("");

            System.out.println("Ingrese las Notas");
            System.out.println("");
            // ingresamos las notas de los alumnos
            do {
                System.out.print("Primer Trabajo Práctico Evaluativo-> ");
                P_TPEV[i] = leer.nextDouble();
                System.out.println("");
            } while (P_TPEV[i] <= 0 || P_TPEV[i] > 10);
            do {
                System.out.print("Segundo Trabajo Práctico Evaluativo-> ");
                S_TPEV[i] = leer.nextDouble();
                System.out.println("");
            } while (S_TPEV[i] <= 0 || S_TPEV[i] > 10);
            do {
                System.out.print("Primer Integrador-> ");
                P_INT[i] = leer.nextDouble();
                System.out.println("");
            } while (P_INT[i] <= 0 || P_INT[i] > 10);
            do {
                System.out.print("Segundo Integrador-> ");
                S_INT[i] = leer.nextDouble();
                System.out.println("");
            } while (S_INT[i] <= 0 || S_INT[i] > 10);
            System.out.println("*********************************");
            System.out.println("*********************************");

            //aca se realiza cada calculo correspondiente
            //primer_tp=0,segundo_tp=0, int1=0,int2=0;
            primer_tp += P_TPEV[i] * 0.1;
            segundo_tp += S_TPEV[i] * 0.15;
            int1 += P_INT[i] * 0.25;
            int2 += S_INT[i] * 0.5;
            //suma de todas las notas
            Sumas[i] = (primer_tp + segundo_tp + int1 + int2);
            primer_tp = 0;
            segundo_tp = 0;
            int1 = 0;
            int2 = 0;
            //promedio de las notas de todos los alumnos
            suma += Sumas[i];
            prom = suma / (i + 1);
            //condicion de saber si el alumno posee una nota mayor o igual a 7 para estar APROBADO o Desaprobado
            if (Sumas[i] >= 7) {
                ap_ds[i] = "APROBADO";
            } else {
                ap_ds[i] = "DESAPROBADO";
            }
        }

        //Ahora mostramos el nombre del alumno e informamos si el alumno aprobo o desaprobo
        for (int i = 0; i < n; i++) {
            System.out.println("//////////////////////////////////////////");
            System.out.println("El Alumno/a->" + alumno[i] + " está->" + ap_ds[i]);
            System.out.println("Sus Notas son:\n"
                    + "Primer Trabajo Práctico Evaluativo->" + P_TPEV[i] + "\n"
                    + "Segundo Trabajo Práctico Evaluativo->" + S_TPEV[i] + "\n"
                    + "Primer Integrador->" + P_INT[i] + "\n"
                    + "Segundo Integrador->" + S_INT[i] + "\n"
                    + "La Nota Final es->" + Sumas[i]);
            System.out.println("//////////////////////////////////////////");
            System.out.println("");
        }
        System.out.println("El Promedio de todas las Notas de los 10 Alumnos es->" + prom);
        System.out.println("El Promedio de todas las Notas de los 10 Alumnos es->" + (float) Math.abs(prom));
        

    }
}
