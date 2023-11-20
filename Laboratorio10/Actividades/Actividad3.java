public class Actividad3 {
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

        System.out.printf("%nArray integerArray contiene (rango 1-3):%n");
        try {
            imprimirArray(intArray, 1, 3);
        } catch (LimiteInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray) {
            System.out.printf("%s ", elemento);
        }
        System.out.println();
    }

    public static <T> void imprimirArray(T[] inputArray, int limiteInferior, int limiteSuperior) throws LimiteInvalidoException {
        if (limiteInferior < 0 || limiteSuperior >= inputArray.length || limiteInferior > limiteSuperior) {
            throw new LimiteInvalidoException("Límites inválidos");
        }

        int elementosEnRango = 0;
        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            System.out.printf("%s ", inputArray[i]);
            elementosEnRango++;
        }
        System.out.println();

        System.out.printf("Número de elementos en el rango: %d%n", elementosEnRango);
    }
}

class LimiteInvalidoException extends Exception {
    public LimiteInvalidoException(String mensaje) {
        super(mensaje);
    }
}

class Persona {
    private String dni;
    private String nombre;
    private String direccion;

    public Persona(String dni, String nombre, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return String.format("(%s, %s, %s)", dni, nombre, direccion);
    }
}
