package inner;

public class Store {


    public static void main(String[] args) {
        Meal orderMeal1 = new Meal();
        orderMeal1.addToppings("cheese", "pepperoni");
        System.out.println(orderMeal1);
        Meal orderMeal2 = new Meal(0.68);
        System.out.println(orderMeal2);
    }

}
