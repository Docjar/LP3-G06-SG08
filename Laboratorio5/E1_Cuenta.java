
package com.mycompany.testcomposicion;


public class Cuenta {
    private int numero;
	private double saldo;

	public Cuenta(double saldo) {
		this.saldo = saldo;
		
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double s) {
		saldo = s;
	}
	public void retirar(double cantidad){
            saldo = saldo - cantidad;
        }
        public void depositar(double cantidad){
            saldo = saldo+cantidad;
        }
	public String toString() {
		return "";
	}
}
