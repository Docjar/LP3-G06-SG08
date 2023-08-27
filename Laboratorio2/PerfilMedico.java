/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e2;

/**
 *
 * @author Alumno
 */
public class PerfilMedico {
    public String primerNombre;
    public String apellido;
    public String sexo;
    public int dia;
    public int mes;
    public int anio;
    private int altura;
    private double peso;

    public PerfilMedico(String primerNombre, String apellido, String sexo, int altura, double peso,int dia, int mes, int anio ) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;

    }
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    private int calcularEdad(int Dia, int Mes, int Anio)
    {
        if(Dia <= 24 && Mes <= 8 && Anio <= 2023)
        {
            int edad = 2023 - Anio;
            return edad;
        }
        else
        {
            int edad = (2023 - Anio) - 1;
            return edad;
        }
    }

    @Override
    public String toString() {
        return "PerfilMedico{" + "primerNombre=" + primerNombre + ", apellido=" + apellido + ", sexo=" + sexo + ", dia=" + dia + ", mes=" + mes + ", anio=" + anio + ", altura=" + altura + ", peso=" + peso + '}';
    }

    public void calcularFMC(int Dia, int Mes, int Anio)
    {
        int edad = calcularEdad(Dia,Mes,Anio);
        System.out.println("Su edad es: "+edad);
        double Fmc = 208 - (0.7)*edad;
        System.out.println("La FMC es: "+ Fmc);
    }
    public void calcularIMC(PerfilMedico p1)
    {
        double Peso = p1.peso;
        int Altura = p1.altura;
        double Imc = Peso/Altura;
        System.out.println("El IMC es: " + Imc);
    }
    
}
