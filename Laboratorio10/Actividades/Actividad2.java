public class Actividad2 {
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
                new Persona("987654321", "María", "Calle B"),
                new Persona("111111111", "Ana", "Calle C"),
                new Persona("222222222", "Pedro", "Calle D")
        };
        System.out.printf("%nArray personaArray contiene:%n");
        imprimirArray(personaArray);

        // Verificación del método minimo
        Integer minInt = minimo(1, 5, 3, 2);
        System.out.printf("%nEl mínimo de los enteros es: %d%n", minInt);

        Double minDouble = minimo(1.1, 5.5, 3.3, 2.2);
        System.out.printf("El mínimo de los doubles es: %.1f%n", minDouble);

        String minString = minimo("hola", "adios", "java", "mundo");
        System.out.printf("El mínimo de las cadenas es: %s%n", minString);

        Persona minPersona = minimo(
                new Persona("123456789", "Juan", "Calle A"),
                new Persona("987654321", "María", "Calle B"),
                new Persona("111111111", "Ana", "Calle C"),
                new Persona("222222222", "Pedro", "Calle D")
        );
        System.out.printf("El mínimo de las personas es: %s%n", minPersona.getNombre());
    }

    public static <T extends Comparable<T>> T minimo(T a, T b, T c, T d) {
        T min = a;

        if (b.compareTo(min) < 0) {
            min = b;
        }
        if (c.compareTo(min) < 0) {
            min = c;
        }
        if (d.compareTo(min) < 0) {
            min = d;
        }

        return min;
    }

    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray) {
            System.out.printf("%s ", elemento);
        }
        System.out.println();
    }

    // Clase Persona
    static class Persona implements Comparable<Persona> {
        private String dni;
        private String nombre;
        private String direccion;

        public Persona(String dni, String nombre, String direccion) {
            this.dni = dni;
            this.nombre = nombre;
            this.direccion = direccion;
        }

        public String getNombre() {
            return nombre;
        }

        @Override
        public int compareTo(Persona otraPersona) {
            return this.nombre.compareTo(otraPersona.getNombre());
        }
    }
}
