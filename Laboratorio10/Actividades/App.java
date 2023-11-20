public class App {
    public static void main(String[] args) throws Exception {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'O', 'L', 'A'};

        System.out.printf("Array integerArray contiene:%n");
        imprimirArray(intArray);

        System.out.printf("%nArray doubleArray contiene:%n");
        imprimirArray(doubleArray);

        System.out.printf("%nArray charArray contiene:%n");
        imprimirArray(charArray);

        Float[] floatArray = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        System.out.printf("%nArray floatArray contiene:%n");
        imprimirArray(floatArray);

        Boolean[] boolArray = {true, false, true, false};
        System.out.printf("%nArray boolArray contiene:%n");
        imprimirArray(boolArray);

        Persona[] personaArray = {
                new Persona("123456789", "Juan", "Calle A"),
                new Persona("987654321", "María", "Calle B")
        };
        System.out.printf("%nArray personaArray contiene:%n");
        imprimirArray(personaArray);
    }

    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray) {
            System.out.printf("%s ", elemento);
        }
        System.out.println();
    }
}

