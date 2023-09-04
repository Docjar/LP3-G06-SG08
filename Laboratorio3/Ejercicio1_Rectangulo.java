/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Alumno
 */
public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;
    
    private  String color ;
    private static String ulColor;
    private static String pColor = "Verde";
    
    public int base;
    public int altura;
    public Rectangulo(Coordenada c1, Coordenada c2){}
    /*
    public Rectangulo(Coordenada esquina1, Coordenada esquina2){
        this.esquina1 = esquina1;
        this.esquina2 = esquina2;
    }
*/
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
        this.color = pColor;
        ultimoColor();
    }

    public String getColor() {
        return color;
    }

    public static String getUlColor() {
        return ulColor;
    }
    
    public void ultimoColor()
    {
        switch (pColor) {
            case "Verde":
                pColor = "Amarillo";
                ulColor = "Verde";
                break;
            case "Amarillo":
                pColor = "Rojo";
                ulColor = "Amarillo";
                break;
            case "Rojo":
                pColor = "Verde";
                ulColor = "Rojo";
                break;
        }
    }
    public Coordenada getEsquina1() {
        return esquina1;
    }

    public void setEsquina1(Coordenada esquina1) {
        this.esquina1 = esquina1;
    }

    public Coordenada getEsquina2() {
        return esquina2;
    }

    public void setEsquina2(Coordenada esquina2) {
        this.esquina2 = esquina2;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "color=" + color + ", base=" + base + ", altura=" + altura + '}';
    }


    
 
    
    
}
