public class Goodies implements Contenedora<Goodies> {
    private int id;
    private String description;
    private float price;

    public Goodies(int id, String description, float price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    @Override
    public boolean contiene(Goodies valor) {
        return this.id == valor.id;
    }
}
