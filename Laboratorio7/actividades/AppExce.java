/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.appexce;

/**
 *
 * @author Alumno
 */
public class AppExce {

    public static void main(String[] args) {
        try{
            metodo1();
        }catch(Exception e){
            System.out.println("La excepcion se manejo en main");
        }
        metodo2();
    }
    public static void metodo1() throws Exception{
        try{
            System.out.println("Metodo1");
            throw new Exception();
        }catch(Exception excepcion){
            System.out.println("La excepcion se manejo en metodo1");
            throw excepcion;
        }finally{
            System.out.println("Se ejecuto finally en metodo1");
        }
    }
    public static void metodo2(){
        try{
            System.out.println("Metodo2");
        }catch(Exception excepcion){
            System.out.println(excepcion);
        }finally{
            System.out.println("Se ejecuto finally en metodo2");
        }
        System.out.println("Fin del metodo2");
    }}
