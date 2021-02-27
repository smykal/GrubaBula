import java.util.ArrayList;

public class GrubaBula {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Pizza", Dough.MEDIUM, Sauce.GARLIC, Size.MEDIUM, new ArrayList<>());
        System.out.println(pizza.toString());
    }
}
