public class Main {

    public static void main(String[] args) {

//        Item coke = new Item("drink", "coke", 1.5);
//        coke.printItem();
//        coke.setSize("large");
//        coke.printItem();
//
//        Item avocado = new Item("Topping", "avocado", 1.5);
//        avocado.printItem();

//        Burger burger = new Burger("Cheese Burger", 10.0);
//        burger.addToppings("CHEESE", "BACON", "HAN");
//        burger.printItem();

//        MealOrder order = new MealOrder();
//        order.addBurgerToppings("CHEESE", "BACON", "HAN");
//        order.setDrinkSize("small");
//        order.printItemizedList();
//
//        MealOrder mealOrder = new MealOrder("turkey", "coke", "fries");
//        mealOrder.addBurgerToppings("CHEESE", "BACON", "HAN");
//        mealOrder.setDrinkSize("small");
//        mealOrder.printItemizedList();

        MealOrder order = new MealOrder("deluxe", "coke", "chicken");
        order.addBurgerToppings("cheese", "pepperoni", "onion", "avocado", "salami");
        order.setDrinkSize("SMALL");
        order.printItemizedList();
    }
}