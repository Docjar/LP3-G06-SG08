
package com.mycompany.clase;

public class Factura implements PorPagar{
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;
    public Factura(String pieza, String descripcion,int cuenta,double precio){
        numeroPieza = pieza;
        descripcionPieza = descripcion;
        establecerCantidad(cuenta);
        establecerPrecioPorArticulo(precio);
    }
    public int obtenerCantidad(){
        return cantidad;
    }
    public double obtenerPrecioPorArticulo(){
        return precioPorArticulo;
    }
    public void establecerCantidad(int cuenta){
        cantidad = cuenta;
    }
    public void establecerPrecioPorArticulo(double precio){
        precioPorArticulo = precio;
    }
    @Override
    public double obtenerMontoPago(){
        return obtenerCantidad() * obtenerPrecioPorArticulo();
    }

    @Override
    public String toString() {
        return "Factura{" + "numeroPieza=" + numeroPieza + ", descripcionPieza=" + descripcionPieza + ", cantidad=" + cantidad + ", precioPorArticulo=" + precioPorArticulo + '}';
    }
    
}
