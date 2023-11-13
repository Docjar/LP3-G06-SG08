import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TestFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del archivo o directorio:");
        // Crear objeto Path base entrada de usuario
        Path ruta = Paths.get(sc.nextLine());

        if (Files.exists(ruta)) {
            // Mostrar información de archivo (o directorio)
            System.out.printf("El archivo %s existe%n", ruta.getFileName());
            System.out.printf("Es un directorio: %s%n", Files.isDirectory(ruta) ? "Sí" : "No");
            System.out.printf("Es una ruta absoluta: %s%n", ruta.isAbsolute() ? "Sí" : "No");
            System.out.printf("Fecha de última modificación: %s%n", Files.getLastModifiedTime(ruta));
            System.out.printf("Tamaño: %d%n", Files.size(ruta));
            System.out.printf("Ruta absoluta: %s%n", ruta.toAbsolutePath());

            if (Files.isDirectory(ruta)) {
                // Objeto para iterar en el contenido de un directorio
                DirectoryStream<Path> flujoDirectorio = Files.newDirectoryStream(ruta);
                for (Path p : flujoDirectorio) {
                    System.out.println(p);
                }
            } else {
                System.out.println("No es un directorio");
            }
        } else {
            System.out.printf("El archivo %s no existe%n", ruta);
        }
        sc.close();
    }
}

