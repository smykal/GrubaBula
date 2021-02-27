package com.grubabula.pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private java.lang.String name;
    private Dough dough;
    private Sauce sauce;
    private Size size;
    private List<Topping> topping = new ArrayList<>();

    public static final class PizzaBuilder {
        private java.lang.String name;
        private Dough dough;
        private Sauce sauce;
        private Size size;
        private List<Topping> topping = new ArrayList<>();

        public PizzaBuilder() {
        }

        public PizzaBuilder withName(java.lang.String pizzaName) {
            if (pizzaName.isBlank()) {
                pizzaName = "Gruba Bula";
            }
            this.name = pizzaName;
            return this;
        }

        public PizzaBuilder withDough(java.lang.String doughValue) {
            if (doughValue.isBlank()) {
                doughValue = "THICK";
            }
            this.dough = Dough.valueOf(doughValue);
            return this;
        }

        public PizzaBuilder withSauce(java.lang.String sauceValue) {
            if (sauceValue.isBlank()) {
                sauceValue = "TOMATO";
            }
            this.sauce = Sauce.valueOf(sauceValue);
            return this;
        }

        public PizzaBuilder withSize(java.lang.String sizeValue) {
            if (sizeValue.isBlank()) {
                sizeValue = "SMALL";
            }
            this.size = Size.valueOf(sizeValue);
            return this;
        }

        public PizzaBuilder withTopping(List<Topping> topping) {
            this.topping = topping;
            return this;
        }
        public PizzaBuilder addTopping(Topping topping) {this.topping.add(topping); return this; }

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
    public java.lang.String toString() {
        return "com.grubabula.pizza.Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", size=" + size +
                ", topping=" + topping +
                '}';
    }
}
