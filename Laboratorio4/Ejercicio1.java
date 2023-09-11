import java.util.ArrayList;
import java.util.Scanner;

class Contacto {
    private String nombre;
    private String telefono;
    private String direccion;

    public Contacto(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

public class AgendaContactos {
    public static void main(String[] args) {
        ArrayList<Contacto> agenda = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú de Agenda de Contactos:");
            System.out.println("1) Añadir contacto");
            System.out.println("2) Buscar contacto");
            System.out.println("3) Modificar contacto");
            System.out.println("4) Borrar contacto");
            System.out.println("5) Eliminar todos los contactos");
            System.out.println("6) Mostrar contactos");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Dirección: ");
                    String direccion = scanner.nextLine();
                    Contacto nuevoContacto = new Contacto(nombre, telefono, direccion);
                    agenda.add(nuevoContacto);
                    System.out.println("Contacto añadido correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del contacto a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    boolean encontrado = false;
                    for (Contacto contacto : agenda) {
                        if (contacto.getNombre().equalsIgnoreCase(nombreBuscar)) {
                            System.out.println("Contacto encontrado:");
                            System.out.println("Nombre: " + contacto.getNombre());
                            System.out.println("Teléfono: " + contacto.getTelefono());
                            System.out.println("Dirección: " + contacto.getDireccion());
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Contacto no encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del contacto a modificar: ");
                    String nombreModificar = scanner.nextLine();
                    boolean modificado = false;
                    for (Contacto contacto : agenda) {
                        if (contacto.getNombre().equalsIgnoreCase(nombreModificar)) {
                            System.out.print("Nuevo nombre: ");
                            String nuevoNombre = scanner.nextLine();
                            System.out.print("Nuevo teléfono: ");
                            String nuevoTelefono = scanner.nextLine();
                            System.out.print("Nueva dirección: ");
                            String nuevaDireccion = scanner.nextLine();
                            contacto.setNombre(nuevoNombre);
                            contacto.setTelefono(nuevoTelefono);
                            contacto.setDireccion(nuevaDireccion);
                            System.out.println("Contacto modificado correctamente.");
                            modificado = true;
                            break;
                        }
                    }
                    if (!modificado) {
                        System.out.println("Contacto no encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del contacto a borrar: ");
                    String nombreBorrar = scanner.nextLine();
                    for (int i = 0; i < agenda.size(); i++) {
                        if (agenda.get(i).getNombre().equalsIgnoreCase(nombreBorrar)) {
                            agenda.remove(i);
                            System.out.println("Contacto eliminado correctamente.");
                            break;
                        }
                    }
                    break;
                case 5:
                    agenda.clear();
                    System.out.println("Todos los contactos han sido eliminados.");
                    break;
                case 6:
                    if (agenda.isEmpty()) {
                        System.out.println("La agenda de contactos está vacía.");
                    } else {
                        System.out.println("Lista de contactos:");
                        for (Contacto contacto : agenda) {
                            System.out.println("Nombre: " + contacto.getNombre());
                            System.out.println("Teléfono: " + contacto.getTelefono());
                            System.out.println("Dirección: " + contacto.getDireccion());
                            System.out.println("---------------");
                        }
                    }
                    break;
                case 7:
                    System.out.println("Saliendo de la aplicación.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
