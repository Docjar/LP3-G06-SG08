
package com.mycompany.clase;

public class Prestamo implements PorPagar{
    private int numeroDeCuotas;
    private int montoDeCuota;

    public Prestamo(int numeroDeCuotas, int montoDeCuota) {
        this.numeroDeCuotas = numeroDeCuotas;
        this.montoDeCuota = montoDeCuota;
    }

    public int getNumeroDeCuotas() {
        return numeroDeCuotas;
    }

    public void setNumeroDeCuotas(int numeroDeCuotas) {
        this.numeroDeCuotas = numeroDeCuotas;
    }

    public int getMontoDeCuota() {
        return montoDeCuota;
    }

    public void setMontoDeCuota(int montoDeCuota) {
        this.montoDeCuota = montoDeCuota;
    }
    @Override
    public double obtenerMontoPago(){
        return getNumeroDeCuotas() * getMontoDeCuota(); 
    }

    @Override
    public String toString() {
        return "Prestamo{" + "numeroDeCuotas=" + numeroDeCuotas + ", montoDeCuota=" + montoDeCuota + '}';
    }
    
}
