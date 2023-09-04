/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Alumno
 */
public class Coordenada {
    private int x;
    private int y;
    
    public Coordenada(){}
    
    public Coordenada(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public Coordenada(Coordenada c){
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public double distancia(Coordenada c){
        double distancia = Math.sqrt(c.x*c.x+c.y*c.y);
        return distancia;
    }
    
    public static double distanciaS(Coordenada c1, Coordenada c2){
        double distanciaS = Math.sqrt((c1.x*c1.x-c2.x*c2.x)+(c1.y*c1.y-c2.y-c2.y));
        return distanciaS;
    }
    @Override
    public String toString() {
        return "Coordenada{" + "x=" + x + ", y=" + y + '}';
    }

}
