import java.util.ArrayList;

public class GrubaBula {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder()
                .withName("name for pizza like in Sturbacks")
                .withDough(Dough.MEDIUM)
                .withSauce(Sauce.CREAM)
                .withTopping(new ArrayList<>())
                .withSize(Size.LARGE)
                .build();

        System.out.println(pizza.toString());
    }
}
