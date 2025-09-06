## 179. Applying Inner Classes: Bill’s Burger Revisited

### the process

1. create new class Meal 
```java
public class Meal {
    
    private double base = 5.0; 
    private Item burger; 
    private Item drink;
    private Item side; 
    
    public Meal() {
        burger = new Item("regular" , "burger"); 
        drink = new Item("coke", "drink", 1.5);
        System.out.println(drink.name);
        side = new Item("fries", "side", 2.0); 
    }
    
    @Override 
    public String toString() {
        return "%s%n%n%s%n".formatted(burger, drink, side); 
    }
    
    private class Item {
        
        private String name; 
        private String type ; 
        private double price ;

        public Item(String name, String type) {
            this(name, type, type.equals("burger") ? base : 0); 
        }
        
        public Item(String name, String type, double price) {
            this.name = name; 
            this.type = type; 
            this.price = price; 
        }
        
        @Override 
        public String toString() {
            return "%10s%15s$%.2f".formatted(type, name, price); 
        }
    }
}
```

2. create new class Store 

```java
public class Store {

    public static void main(String[] args) {
        
        Meal regularMeal = new Meal();
        System.out.println(regularMeal);
    }
}
```

3. on the meal class, cahgne the base price
```jshelllanguage
//private double base = 5.0
private double  price = 5.0
```
here we face scope promlem, use 'Meal.this' to avoide that 

add method to item 
```jshelllanguage
private static double getPrice(double price, double rate ) {
    return price * rate ; 
}
```

4. add field to Meal : 
```jshelllanguage
private doubel conversionRage; // include also in constructor 
```
5. make no args constructor in Meal 

6. add method to meal `getTotal` 
```jshelllanguage
public double getTotal() {
    doube total = burger.price + drink.price + side.price; 
    return Item.getPrice(total, conversionRate); 
}
```
7. refine the tostring method in Meal 
```jshelllanguage
@Override
public String toString() {
    return "%s%n%n%s%n%26s%.2f".formatted(burger, drink, side, "Total Due: " , getTotal());
}
```

8. in main method 
```java
public class Store {

    public static void main(String[] args) {
        
        // .... 
        
        Meal USRegularMeal = new Meal(0.68);
        System.out.println(USRegularMeal);
    }
}
```