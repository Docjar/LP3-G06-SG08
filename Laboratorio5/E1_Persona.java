
package com.mycompany.testcomposicion;

public class Persona {
	private int id;
	private String nombre;
	private String apellido;
	private Cuenta cuenta;
	private char tipoCliente;
	private String noCu;
	
	public static  final int cuentaC= 999;
	public static final int cuentaB= 4999;
	public static final int cuentaE= 7999;
        
        public static int C = cuentaC;
        public static int B = cuentaB;
        public static int E = cuentaE;
	public String cuen;

	public Persona(int id, String nombre, String apellido, char tipoCliente,Cuenta cuenta) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoCliente = tipoCliente;
                this.cuenta = cuenta;
                switch(tipoCliente){
                    case 'C':
                        C++;
                       cuen = tipoCliente+String.valueOf(C);
                       break;
                    case 'B':
                        B++;
                        cuen = tipoCliente+String.valueOf(B);
                        break;
                    case 'E':
                        E++;
                        cuen = tipoCliente+String.valueOf(E);
                        break;
                    default:
                        C++;
                       cuen = 'C'+String.valueOf(C);
                       break;
                }
		
	}
	public char getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(char tc) {
		tipoCliente = tc;
	}
        public Cuenta getCuenta(){
            return cuenta;
        }
	
	public static char tipoCliente(Persona p1,char tc) {
		switch(tc) {
		case 'C':
			p1.setTipoCliente(tc);
			return tc;
		case 'B':
			p1.setTipoCliente(tc);
			return tc;
		case 'E':
			p1.setTipoCliente(tc);
			return tc;
		default:
			p1.setTipoCliente('C');
			return tc;
		}
		
	}
        public void retirar(double cantidad){
            cuenta.retirar(cantidad);
        }
        public void depositar(double cantidad){
            cuenta.depositar(cantidad);
        }
	public String toString() {
		return "Cliente: " + id + "\n"+"Tipo: "+tipoCliente+"\n"+"Nombres: "+nombre+" "+apellido+"\n"+"No.Cuenta: "+cuen+"\t\t"+"Saldo: "+cuenta.getSaldo()+"\n";
		
	}
	
}


