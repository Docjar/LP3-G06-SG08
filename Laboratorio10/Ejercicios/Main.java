import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso con un arreglo de enteros
        Integer[] arregloEnteros = {1, 2, 3, 4, 5};
        System.out.println("Arreglo original: " + Arrays.toString(arregloEnteros));

        // Intercambiar elementos en el arreglo de enteros
        IntercambioElementos.intercambiarElementos(arregloEnteros, 1, 3);
        System.out.println("Arreglo después del intercambio: " + Arrays.toString(arregloEnteros));

        // Ejemplo de uso con un arreglo de cadenas
        String[] arregloCadenas = {"uno", "dos", "tres", "cuatro", "cinco"};
        System.out.println("Arreglo original: " + Arrays.toString(arregloCadenas));

        // Intercambiar elementos en el arreglo de cadenas
        IntercambioElementos.intercambiarElementos(arregloCadenas, 0, 4);
        System.out.println("Arreglo después del intercambio: " + Arrays.toString(arregloCadenas));
    }
}
