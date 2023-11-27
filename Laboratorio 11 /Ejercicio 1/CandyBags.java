import java.util.ArrayList;

public class CandyBags extends Bag<Goodies> {

    public CandyBags(int n) {
        super(n);
    }

    @Override
    public void add(Goodies obj) throws IsFull {
        if (getIndex(obj) == -1) {
            super.add(obj);
        }
    }

    public Goodies cheapest() throws IsEmpty {
        if (count == 0) {
            throw new IsEmpty("La bolsa de golosinas está vacía.");
        }

        Goodies cheapestGoodie = list[0];
        for (int i = 1; i < count; i++) {
            if (list[i].price < cheapestGoodie.price) {
                cheapestGoodie = list[i];
            }
        }
        return cheapestGoodie;
    }

    public Bag<Goodies> mostExpensive(int n) throws IsEmpty {
        if (count == 0) {
            throw new IsEmpty("La bolsa de golosinas está vacía.");
        }

        Goodies[] sortedArray = Arrays.copyOf(list, count);

        Arrays.sort(sortedArray, Comparator.comparing(Goodies::getPrice).reversed());

        Bag<Goodies> expensiveBag = new Bag<>(n);

        for (int i = 0; i < Math.min(n, count); i++) {
            expensiveBag.add(sortedArray[i]);
        }

        return expensiveBag;
    }
}

