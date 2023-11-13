import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class Seria15 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        Alumno a;
        Fecha f;

        try {
            fos = new FileOutputStream("ficheros/alumnos.dat");
            salida = new ObjectOutputStream(fos);

            f = new Fecha();
            a = new Alumno("12345678A", "Lucas González", 20, f);
            salida.writeObject(a);

            f = new Fecha();
            a = new Alumno("Anacleto Jiménez", 19, f);
            salida.writeObject(a);

            f = new Fecha();
            a = new Alumno("María Zapata", 21, f);
            salida.writeObject(a);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
