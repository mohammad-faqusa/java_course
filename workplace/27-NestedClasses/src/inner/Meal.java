package inner;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private int price = 5;
    private Burger burger;
    private Item drink;
    private Item side;

    private double conversionRate;

    public Meal() {
        this(1);
    }

    public Meal(double conversionRate) {
        this.conversionRate = conversionRate;
        burger = new Burger("regular");
        drink = new Item("coke", "drink", 2.5);
        side = new Item("fries", "side", 1.5);
    }

    public double getTotal() {
        double totalPrice =  burger.getPrice() + drink.price + side.price;
        return Item.getPrice(totalPrice, conversionRate);
    }


    @Override
    public String toString() {
        return "%s%n%s%n%s%n%26s$%.2f".formatted(burger, drink, side,
                "Total Due: ", getTotal());
    }

    public void addToppings(String... selectedToppings) {
        burger.addTopping(selectedToppings);
    }

    private class Item {

        private String name;
        private String type;
        private double price;

        public Item(String name, String type) {
            this(name, type, type.equals("burger") ? Meal.this.price : 0);
        }

        public Item(String name, String type, double price) {
            this.name = name;
            this.type = type;
            this.price = price;
        }

        @Override
        public String toString() {
            return "%10s%15s $%.2f".formatted(type, name,
                    getPrice(price, conversionRate));
        }

        private static double getPrice(double totalPrice, double rate ) {
            return totalPrice * rate;
        }
    }

    private class Burger extends Item {

        private enum Extra {
            LETTUCE, CHEESE, TOMATO, ONION, PINEAPPLE, PEPPERONI;

            private double getPrice() {
                return switch(this) {
                    case LETTUCE -> 0.5;
                    case CHEESE -> 0.75;
                    case TOMATO -> 1.0;
                    case ONION -> 0.25;
                    case PINEAPPLE -> 0.45;
                    case PEPPERONI -> 0.65;
                    default -> 0;
                };
            }
        }

        private List<Item> toppings = new ArrayList<>();

        Burger(String name) {
            super(name, "burger", 5.0);
        }

        private double getPrice() {
            double total = super.price;
            for(Item topping : toppings) {
                total += topping.price;
            }
            return total;
        }

        private void addTopping(String... selectedToppings) {
            for(String selectedTopping : selectedToppings) {
                try {
                    Extra topping = Extra.valueOf(selectedTopping.toUpperCase());
                    toppings.add(new Item(topping.name(), "Topping", topping.getPrice()));
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid topping: " + selectedTopping);
                }
            }
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder(super.toString());
            for(Item topping : toppings) {
                sb.append("\n").append(topping);
            }
            return sb.toString();
        }
    }

}
