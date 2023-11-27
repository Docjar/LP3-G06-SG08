public class BagTest {
    public static void main(String[] args) {
        try {
            Bag<Integer> integerBag = new Bag<>(5);
            integerBag.add(1);
            integerBag.add(2);
            integerBag.add(3);

            System.out.println("Contenido de la bolsa de enteros:");
            System.out.println(integerBag);

            Bag<String> stringBag = new Bag<>(3);
            stringBag.add("Uno");
            stringBag.add("Dos");
            stringBag.add("Tres");

            System.out.println("Contenido de la bolsa de cadenas:");
            System.out.println(stringBag);

            Bag<Persona> personaBag = new Bag<>(2);
            personaBag.add(new Persona("Juan", "Calle A", "555-1234"));
            personaBag.add(new Persona("Ana", "Calle B", "555-5678"));

            System.out.println("Contenido de la bolsa de personas:");
            System.out.println(personaBag);

            Persona personaNoExistente = new Persona("Carlos", "", "");
            personaBag.remove(personaNoExistente);

        } catch (IsFull | ObjectNotExist e) {
            System.out.println("Excepción: " + e.getMessage());
        }
    }
}
