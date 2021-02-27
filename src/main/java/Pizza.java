import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private Sauce sauce;
    private Size size;
    private List<Topping> topping;

    public Pizza(String name, Dough dough, Sauce sauce, Size size, List<Topping> topping) {
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
        this.size = size;
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", size=" + size +
                ", topping=" + topping +
                '}';
    }
}
