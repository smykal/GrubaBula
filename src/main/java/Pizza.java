import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private Sauce sauce;
    private Size size;
    private List<Topping> topping;

    public static final class PizzaBuilder {
        private String name;
        private Dough dough;
        private Sauce sauce;
        private Size size;
        private List<Topping> topping;

        PizzaBuilder() {
        }

        public PizzaBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public PizzaBuilder withDough(Dough dough) {
            this.dough = dough;
            return this;
        }

        public PizzaBuilder withSauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public PizzaBuilder withSize(Size size) {
            this.size = size;
            return this;
        }

        public PizzaBuilder withTopping(List<Topping> topping) {
            this.topping = topping;
            return this;
        }

        public Pizza build() {
            Pizza pizza = new Pizza();
            pizza.topping = this.topping;
            pizza.sauce = this.sauce;
            pizza.dough = this.dough;
            pizza.size = this.size;
            pizza.name = this.name;
            return pizza;
        }
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
