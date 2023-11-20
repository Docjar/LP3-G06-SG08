import java.util.Arrays;

public class IntercambioElementos {

    public static <T> void intercambiarElementos(T[] arreglo, int indice1, int indice2) {
        if (indice1 < 0 || indice1 >= arreglo.length || indice2 < 0 || indice2 >= arreglo.length) {
            System.out.println("Índices fuera de rango. No se pueden intercambiar elementos.");
            return;
        }

        T temp = arreglo[indice1];
        arreglo[indice1] = arreglo[indice2];
        arreglo[indice2] = temp;
    }
}
