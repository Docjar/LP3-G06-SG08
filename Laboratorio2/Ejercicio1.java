import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el nombre del titular: ");
        String titular = scanner.nextLine();
    
        System.out.println("¿Desea ingresar una cantidad inicial? (S/N):");
        String ingreso = scanner.nextLine();
        double cantidadInicial = 0.0;

        if(ingreso == "S"){
            System.out.println("Ingrese la cantidad inicial:");
            cantidadInicial = scanner.nextDouble();

        }
        
        CuentaBancaria cuenta;
        if(cantidadInicial > 0){
            cuenta = new CuentaBancaria(titular, cantidadInicial);
        }else{
            cuenta = new CuentaBancaria(titular);
        }   

        System.out.println("Informacion de la cuenta: " + cuenta);
        
        int opcionMenu;
        do {
            System.out.println("========MENU========");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Mostrar saldo actual");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcionMenu = scanner.nextInt();

            switch (opcionMenu) {
                case 1:
                    System.out.print("Ingrese la cantidad a ingresar: ");
                    double cantidadIngresar = scanner.nextDouble();
                    cuenta.ingresar(cantidadIngresar);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidadRetirar = scanner.nextDouble();
                    cuenta.retirar(cantidadRetirar);
                    break;
                case 3:
                    System.out.println("Saldo actual: " + cuenta.getCantidad());
                    break;
                case 4:
                    break;
            }
        } while (opcionMenu != 4);

        scanner.close();
    }
}





