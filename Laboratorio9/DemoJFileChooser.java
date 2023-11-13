import javax.swing.*;
import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Collectors;

public class DemoJFileChooser extends JFrame {
    private final JTextArea areaSalida;

    public DemoJFileChooser() throws IOException {
        super("Demo de JFileChooser");
        areaSalida = new JTextArea();
        add(new JScrollPane(areaSalida)); // áreaSalida con controles deslizables
        analizarRuta(); // obtiene el objeto Path del usuario y muestra información
    }

    public void analizarRuta() throws IOException {
        // crea un objeto Path con la ruta al archivo o directorio seleccionado por el usuario
        Path ruta = obtenerRutaArchivoDirectorio();

        if (ruta != null && Files.exists(ruta)) {
            StringBuilder builder = new StringBuilder();
            builder.append(String.format("%s: %s%n", "Nombre", ruta.getFileName()));
            builder.append(String.format("%s: %s%n", "Es un directorio", Files.isDirectory(ruta) ? "Sí" : "No"));
            builder.append(String.format("%s: %s%n", "Es una ruta absoluta", ruta.isAbsolute() ? "Sí" : "No"));
            builder.append(String.format("%s: %s%n", "Última modificación", Files.getLastModifiedTime(ruta)));
            builder.append(String.format("%s: %s%n", "Tamaño", Files.size(ruta)));
            builder.append(String.format("%s: %s%n", "Ruta", ruta));
            builder.append(String.format("%s: %s%n", "Ruta absoluta", ruta.toAbsolutePath()));

            if (Files.isDirectory(ruta)) {
                // objeto para iterar a través del contenido de un directorio
                try (DirectoryStream<Path> flujoDirectorio = Files.newDirectoryStream(ruta)) {
                    for (Path p : flujoDirectorio) {
                        builder.append(String.format("%s%n", p));
                    }
                }
            }

            areaSalida.setText(builder.toString()); // muestra el contenido del objeto StringBuilder
        } else {
            JOptionPane.showMessageDialog(this, ruta.getFileName() + " no existe", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private Path obtenerRutaArchivoDirectorio() {
        JFileChooser selectorArchivos = new JFileChooser();
        int resultado = selectorArchivos.showOpenDialog(this);

        // si el usuario hizo clic en el botón Cancelar en el cuadro de diálogo, termina la aplicación
        if (resultado == JFileChooser.CANCEL_OPTION) {
            System.exit(1);
        }

        // devuelve objeto Path que representa el archivo seleccionado
        return selectorArchivos.getSelectedFile().toPath();
    }

    public static void main(String[] args) throws IOException {
        DemoJFileChooser aplicacion = new DemoJFileChooser();
        aplicacion.setSize(400, 400);
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.setVisible(true);
    }
}
