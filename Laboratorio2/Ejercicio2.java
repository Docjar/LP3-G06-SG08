/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.e2;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class E2 {

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.next();
        
        System.out.println("Ingrese el apellido: ");
        String apellido = sc.next();
        
        System.out.println("Ingrese el sexo: ");
        String sexo = sc.next();
        
        System.out.println("Ingrese la altura: ");
        int altura = sc.nextInt();
        
        System.out.println("Ingrese el peso: ");
        double peso = sc.nextDouble();
        
        System.out.println("Ingrese el dia de nacimiento: ");
        int dia = sc.nextInt();
        
        System.out.println("Ingrese el mes de nacimiento: ");
        int mes = sc.nextInt();
        
        System.out.println("Ingrese el anio de nacimiento: ");
        int anio = sc.nextInt();
        
        PerfilMedico p1 = new PerfilMedico(nombre,apellido,sexo,altura,peso,dia,mes,anio);
        System.out.print(p1+"\n");
        p1.calcularFMC(dia, mes, anio);
        p1.calcularIMC(p1);
    }
}

