import java.util.List;

public class Pizza {
    private String name;
    private String dough;
    private String sauce;
    private String size;
    private List<String> topping;

    public Pizza(String name, String dough, String sauce, String size, List<String> topping) {
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
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", size='" + size + '\'' +
                ", topping=" + topping +
                '}';
    }
}
