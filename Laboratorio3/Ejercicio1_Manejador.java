/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Alumno
 */
public class Manejador {
    public static double area(Rectangulo r1){
        int x = r1.base;
        int y = r1.altura;
        double area = x*y;
        return area;
    }
    public static double perimetro(Rectangulo r1){
        int x  = r1.base;
        int y = r1.altura;
        double perimetro = 2*(x+y);
        return perimetro;
    }
    public static int moverX(Rectangulo r,int puntos){
        int lado = r.base;
        int moverX = puntos + lado;
        return moverX;

    }
    public static int moverY(Rectangulo r1,int puntos){
        int lado2 = r1.altura;
        int moverY = puntos + lado2;
        return moverY;
    }
}
