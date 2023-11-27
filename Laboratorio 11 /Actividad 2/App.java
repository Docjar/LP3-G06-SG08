public class App {
    public static void main(String[] args) {
        OrderedPair<Integer, Integer> pair1 = new OrderedPair<>(1, 100);
        OrderedPair<Integer, String> pair2 = new OrderedPair<>(2, "Doscientos");
        OrderedPair<String, Persona> pair3 = new OrderedPair<>("Trescientos", new Persona("Juan", "123 Calle Principal", "555-1234"));

        System.out.println("Pair 1: " + pair1);
        System.out.println("Pair 2: " + pair2);
        System.out.println("Pair 3: " + pair3);
    }
}

