/*
 * Click nbfs://nbhost/SystemFileSystenEm/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Punto {
   public static int cociente(int numerador,int denominador) throws ArithmeticException{
       return numerador/denominador;
   }
    public static void main(String[] args) {
        Scanner explorador = new Scanner(System.in);
        boolean flag  = true;
        do{
            try{
                System.out.print("Introduzca un numerador entero: ");
                int numerador = explorador.nextInt();
                System.out.println("Introduzca un denominador entero: ");
                int denominador = explorador.nextInt();
                int resultado = cociente(numerador, denominador);
                System.out.printf("\nResultado: %d / %d = %d\n",numerador,denominador,resultado);
                flag = false;
            }catch(InputMismatchException inputMismatchE){
                System.out.printf("\nExcepcion : &s\n", inputMismatchE);
                explorador.nextLine();
                System.out.println("Debe introducir enteros. Intente de nuevo ...\n");
                
            }catch(ArithmeticException arithmeticE){
                System.out.printf("\nExcepcion: %s\n", arithmeticE);
                explorador.nextLine();
                System.out.println("Cero es un denominador invalido. Intente de nuevo... \n");
            }
        }while(flag);
    }}