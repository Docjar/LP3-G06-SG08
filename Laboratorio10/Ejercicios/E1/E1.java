
package e1;

public class E1 {
    public static void main(String[] args) {
        String[] cadena = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho"};
        imprimirArray(cadena);
        imprimirArrayNoGenerica(cadena);
        
    }

    public static <T> void imprimirArray(T[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
            if ((i + 1) % 4 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void imprimirArrayNoGenerica(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
            if ((i + 1) % 4 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
