/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.e2lab3;

/**
 *
 * @author Nadier
 */
public class E2Lab3 {

    public static void main(String[] args) {
        Fecha f = new Fecha();
        f.leer();
        System.out.println("Es anio bisiesto: "+f.bisiesto());
        System.out.println("Dias del mes: "+f.diasMes(f.getMes()));
        System.out.println("Dias desde 1/1/1900: "+f.diasTranscurridos());
        System.out.println("Dias de la semana: "+f.diaSemana());
    }
    
}
