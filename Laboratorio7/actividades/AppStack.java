/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.appstack;

/**
 *
 * @author Alumno
 */
public class AppStack {
    public static void main(String[] args) {
        try{
            metodo1();
        }catch(Exception e){
            System.out.printf("%s\n\n",e.getMessage());
            e.printStackTrace();
            
            StackTraceElement[] item = e.getStackTrace();
            
            System.out.println("\nRastreo de la pila getStackTrace");
            System.out.println("Clase \t\t\tArchivo\t\tLinea\tMetodo");
            for(StackTraceElement i: item){
                System.out.printf("%s\t",i.getClassName());
                System.out.printf("%s\t",i.getFileName());
                System.out.printf("%s\t",i.getLineNumber());
                System.out.printf("%s\t",i.getMethodName());
            }
        }
    }
    public static void metodo1() throws Exception{
        metodo2();
    }
    public static void metodo2() throws Exception{
        metodo3();
    }
    public static void metodo3() throws Exception{
            throw new Exception("La excepcion se lanzo");
        
    }
}
