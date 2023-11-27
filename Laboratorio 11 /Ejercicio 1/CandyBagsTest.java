public class CandyBagsTest {
    public static void main(String[] args) {
        try {
            CandyBags candyBags = new CandyBags(5);

            candyBags.add(new Goodies(1, "Chocolate", 2.5f));
            candyBags.add(new Goodies(2, "Galletas", 1.8f));
            candyBags.add(new Goodies(3, "Chicles", 1.0f));
            candyBags.add(new Goodies(4, "Caramelos", 3.0f));

            System.out.println("Contenido de la bolsa de golosinas:");
            System.out.println(candyBags);

            Goodies cheapestGoodie = candyBags.cheapest();
            System.out.println("Golosina más económica: " + cheapestGoodie);

            Bag<Goodies> mostExpensiveBag = candyBags.mostExpensive(2);
            System.out.println("Las 2 golosinas más caras:");
            System.out.println(mostExpensiveBag);

            candyBags.add(new Goodies(2, "Galletas Duplicadas", 2.0f));

        } catch (IsFull | IsEmpty e) {
            System.out.println("Excepción: " + e.getMessage());
        }
    }
}
