package com.grubabula.order;

import com.grubabula.pizza.Pizza;
import com.grubabula.pizza.Topping;

import java.util.Scanner;

public class Order {
    Pizza pizza;

    public Pizza addPizza() {
        try(Scanner scanner = new Scanner(System.in)) {
            Pizza.PizzaBuilder pizza = new Pizza.PizzaBuilder();

            addPizzaName(scanner, pizza);
            addPizzaDough(scanner, pizza);
            addPizzaSauce(scanner, pizza);
            addPizzaSize(scanner, pizza);
            addPizzaToppings(scanner, pizza);

        }
        return pizza;
    }

    public Pizza getPizza() {
        return pizza;
    }

    private void addPizzaName(Scanner scanner, Pizza.PizzaBuilder pizza) {
        System.out.println("Give name of your Pizza");
        pizza.withName(scanner.nextLine());
    }

    private void addPizzaDough(Scanner scanner, Pizza.PizzaBuilder pizza) {
        System.out.println("Give me kind of dough: THIN THICK MEDIUM");
        java.lang.String dough = scanner.nextLine();
        pizza.withDough(dough);
    }

    private void addPizzaSauce(Scanner scanner, Pizza.PizzaBuilder pizza) {
        System.out.println("Give me kind of sauce: TOMATO ONION GARLIC CREAM");
        java.lang.String sauce = scanner.nextLine();
        pizza.withSauce(sauce);
    }

    private void addPizzaSize(Scanner scanner, Pizza.PizzaBuilder pizza) {
        System.out.println("Give me kind of size: SMALL MEDIUM LARGE");
        java.lang.String size = scanner.nextLine();
        pizza.withSize(size);
    }

    private void addPizzaToppings(Scanner scanner, Pizza.PizzaBuilder pizza) {
        while (true) {
            System.out.println("which topping do u want? CHEESE ONIONS HAM PROSCIUTO PAPRICA MUSHROMS RUCOLA SALAMI");
            pizza.addTopping(Topping.valueOf(scanner.nextLine()));

            System.out.println("more topping yes/no");
            String nextTopping = scanner.nextLine();
            if (nextTopping.equals("no")) {
                break;
            }
        }
    }
}
