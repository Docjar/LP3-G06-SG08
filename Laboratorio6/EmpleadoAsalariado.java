
package com.mycompany.clase;
public class EmpleadoAsalariado extends Empleado implements PorPagar{
    private double salarioSemanal;
    public EmpleadoAsalariado(String nombre, String apellido, String nss,double salario){
        super(nombre,apellido,nss);
        establecerSalarioSemanal(salario);
    }

    public double obtenerSalarioSemanal(){
        return salarioSemanal;
    }
    public void establecerSalarioSemanal(double salario){
        salarioSemanal = salario;
    }
    @Override
    public double obtenerMontoPago(){
        return obtenerSalarioSemanal();
    }

    @Override
    public String toString() {
        return "EmpleadoAsalariado:" + getPrimerNombre()+ " "+getApellidoPaterno()+"\nnumero de seguro social: "+getNumeroSeguroSocial()+"\nsalarioSemanal=" + salarioSemanal ;
    }


}
