package com.grubabula.order;

import com.grubabula.pizza.Pizza;
import com.grubabula.pizza.Topping;

import java.util.Scanner;

public class Order {
    public void addPizza() {
        try(Scanner scanner = new Scanner(System.in)) {
            Pizza.PizzaBuilder pizza = new Pizza.PizzaBuilder();

            System.out.println("Give name of your Pizza");
            pizza.withName(scanner.nextLine());

            System.out.println("Give me kind of dough: THIN THICK MEDIUM");
            java.lang.String dough = scanner.nextLine();
            pizza.withDough(dough);

            System.out.println("Give me kind of souce: TOMATO ONION GARLIC CREAM");
            java.lang.String sauce = scanner.nextLine();
            pizza.withSauce(sauce);

            System.out.println("Give me kind of size: SMALL MEDIUM LARGE");
            java.lang.String size = scanner.nextLine();
            pizza.withSize(size);

            while (true) {
                System.out.println("which topping do u want? CHEESE ONIONS HAM PROSCIUTO PAPRICA MUSHROMS RUCOLA SALAMI");
                pizza.addTopping(Topping.valueOf(scanner.nextLine()));

                System.out.println("more topping yes/no");
                String nextTopping = scanner.nextLine();
                if (nextTopping.equals("NO")) {
                    break;
                }
            }
            Pizza placek = pizza.build();
            System.out.println(placek);
        }
    }
}
