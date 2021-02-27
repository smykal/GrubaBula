import java.util.ArrayList;
import java.util.List;

public class GrubaBula {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("name", "kindOfDough", "kindOfSauce", "kindOfsize", new ArrayList<>());
        System.out.println(pizza.toString());
    }
}
