
package com.mycompany.testcomposicion;


import java.util.Scanner;
import java.io.IOException;


public class TestComposicion {

    public static void main(String[] args) throws IOException{
                int opc;
                Scanner sc = new Scanner(System.in);
                char tc = '\0';
                int id=0; String n="b";String a="a";double d = 10.0;double r = 10.2;
                do{
                    System.out.println("======MENU======");
                    System.out.println("1)Ingreso de datos");
                    System.out.println("2)Retirar dinero");
                    System.out.println("3)Depositar dinero");
                    System.out.println("4)Mostrar información");
                    System.out.println("5)Salir");
                    System.out.println("Ingrese una opción:");
                    opc= sc.nextInt();
                    Cuenta c1 = new Cuenta(50.0);
                    switch(opc){
                        case 1:
                            System.out.println("Ingrese el tipo de cliente: ");
                            tc = (char)System.in.read();
                            System.out.println("Ingrese su id: ");
                            id =sc.nextInt();
                            System.out.println("Ingrese su nombre: ");
                            n = sc.next();
                            System.out.println("Ingrese su apellido: ");
                            a = sc.next();
                            break;
                        case 2:
                        System.out.println("¿Cuánto dinero retirará?");
                        r = sc.nextDouble();
                        if(c1.getSaldo()<= 50){
                            System.out.println("No puedes retirar el fondo minimo");
                        }
                        break;

                    case 3:
                        System.out.println("¿Cuánto dinero depositará?");
                        d = sc.nextDouble();
                        
                        break;
                    case 4:
                        Persona p1 = new Persona(id,n,a,tc,c1);
                        Persona.tipoCliente(p1, tc);
                        p1.depositar(d);
                        p1.retirar(r);
                        System.out.println("=======INFORMACION======");
                        System.out.println(p1);
                        break;
                    case 5:
                        System.out.println("Saliendo");
                        break;
                    default:
                        System.out.println("Opción inválida");
                        break;

                }
                }while(opc!=5);
                

	}   
    
}
