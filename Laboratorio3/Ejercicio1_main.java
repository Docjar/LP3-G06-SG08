/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author Alumno
 */
public class Main {

    public static void main(String[] args) {
        Coordenada c2 = new Coordenada(6,9);
        Coordenada c3 = new Coordenada(4,5);
        
        Rectangulo r1 = new Rectangulo(6,9);
        Rectangulo r2 = new Rectangulo(4,7);
        Rectangulo r3 = new Rectangulo(3,4);
        Rectangulo r4 = new Rectangulo(3,9);
        Rectangulo r5 = new Rectangulo(4,2);
            
        System.out.println("Primer rectangulo: "+r1);
        System.out.println("Segundo rectangulo: "+r2);
        System.out.println("Tercer rectangulo: "+r3);
        System.out.println("Cuarto rectangulo: "+r4);
        System.out.println("Quinto verdaderO:" +r5);
        System.out.println("Color del ultimo rectangulo: "+Rectangulo.getUlColor());
        
        System.out.println("Distancia: "+c2.distancia(c2));
        System.out.println("Distancia de dos coordenadas: "+Coordenada.distanciaS(c2,c3));
        System.out.println("Area del rectangulo: "+Manejador.area(r2));
        System.out.println("Perimetro del rectangulo: "+Manejador.perimetro(r2));
        System.out.println("Rectangulo antes de modificar: ("+r2.base + ","+r2.altura+")");
        System.out.println("Rectangulo modificado: ("+Manejador.moverX(r2,5)+","+Manejador.moverY(r2,3)+")");
    }}

