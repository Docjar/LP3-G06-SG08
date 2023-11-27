public class App4 {
    public static void main(String[] args) {
        try {
            Bag<Goodies> goodiesBag = new Bag<>(5);

            goodiesBag.add(new Chocolates(1, "Chocolate Negro", 2.5f));
            goodiesBag.add(new Biscuits(2, "Galletas Saladas", 1.8f));
            goodiesBag.add(new Soda(3, "Refresco de Cola", 1.0f));
            goodiesBag.add(new Sweet(4, "Dulce de Leche", 3.0f));

            System.out.println("Contenido de la bolsa de Goodies:");
            System.out.println(goodiesBag);

            goodiesBag.add(new Chocolates(5, "Chocolate con Leche", 2.0f));

            Goodies removedGoodie = goodiesBag.remove(new Biscuits(2, "", 0.0f));
            System.out.println("Objeto eliminado de la bolsa: " + removedGoodie);

        } catch (IsFull | ObjectNotExist e) {
            System.out.println("Excepción: " + e.getMessage());
        }
    }
}
