import java.util.Scanner;

public class Contactos {
    private Diccionario<String, Contacto> contactos = new Diccionario<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Contactos misContactos = new Contactos();
        int opcion;

        do {
            System.out.println("\n======= Menú de Contactos =======");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Obtener contacto por DNI");
            System.out.println("4. Mostrar contactos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = misContactos.scanner.nextInt();
            misContactos.scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("DNI: ");
                    String dniAgregar = misContactos.scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = misContactos.scanner.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = misContactos.scanner.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = misContactos.scanner.nextLine();
                    misContactos.contactos.agregar(dniAgregar, new Contacto(nombre, apellido, telefono));
                    break;

                case 2:
                    System.out.print("DNI: ");
                    String dniEliminar = misContactos.scanner.nextLine();
                    if (misContactos.contactos.eliminar(dniEliminar)){
                        System.out.println("Contacto eliminado.");
                    } else{
                        System.out.println("Contacto no encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("DNI: ");
                    String dniObtener = misContactos.scanner.nextLine();
                    try {
                        System.out.println("Contacto: " + misContactos.contactos.obtenerValor(dniObtener));
                    }
                    catch (ObjectNoExist e) {
                        System.out.println("Contacto no encontrado.");
                    }
                    break;

                case 4:
                    System.out.println(misContactos.contactos);
                    break;
                    
                case 0:
                    break;
                default:
                    System.out.println("Opción no valida.");
                    break;
            }
        } while (opcion != 0);

        misContactos.scanner.close();
        
    }
}
