public class Main {
    public static void main(String[] args) {
        Persona[] personas = {
            new Persona("Juan", "Calle 1", "555-1234"),
            new Persona("Ana", "Calle 2", "555-5678"),
        };
        Persona personaBuscada = new Persona("Alice", "", "");
        System.out.println("Persona está en el arreglo: " + contieneElemento(personas, personaBuscada));

        Goodies[] goodiesArray = {
            new Goodies(1, "Item 1", 10.0f),
            new Goodies(2, "Item 2", 20.0f),
        };
        Goodies goodiesBuscado = new Goodies(2, "", 0.0f);
        System.out.println("Goodies está en el arreglo: " + contieneElemento(goodiesArray, goodiesBuscado));

        Estudiante[] estudiantes = {
            new Estudiante("Roberto", "789 Pine St", "555-4321", "Computacion", new Procedencia("Dept1", "Prov1")),
            new Estudiante("Ana", "987 Cedar St", "555-8765", "Matematicas", new Procedencia("Dept2", "Prov2")),
        };
        Estudiante estudianteBuscado = new Estudiante("Eva", "", "", "Matematicas", new Procedencia("Dept2", "Prov2"));
        System.out.println("Estudiante está en el arreglo: " + contieneElemento(estudiantes, estudianteBuscado));
    }

    private static <T> boolean contieneElemento(Contenedora<T>[] arreglo, T elemento) {
        for (Contenedora<T> contenedor : arreglo) {
            if (contenedor.contiene(elemento)) {
                return true;
            }
        }
        return false;
    }
}

