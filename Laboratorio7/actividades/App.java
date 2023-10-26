/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.app;
import java.util.Scanner;

public class App {
    public static int cociente(int numerador, int denominador){
        return numerador/denominador;
    }
    public static void main(String[] args) {
        Scanner explorador = new Scanner(System.in);
        System.out.println("Introduzca un numerador entero: ");
        int numerador = explorador.nextInt();
        System.out.println("Introduzca un denominador entero: ");
        int denominador = explorador.nextInt();
        
        int resultado = cociente(numerador, denominador);
        System.out.printf("\nResultado: %d / %d = %d\n",numerador,denominador, resultado);
    }
}
