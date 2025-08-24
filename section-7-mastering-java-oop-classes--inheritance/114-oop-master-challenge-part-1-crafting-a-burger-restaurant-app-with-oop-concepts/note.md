## 114. OOP Master Challenge, Part 1: Crafting a Burger Restaurant App with OOP Concepts

### Welcome to the object-oriented programming master challenge! 
* create OOP project using all the principles learnt in this course.
* project : food restaurant 

#### Bill's Burger challenge 
* meal order combines of three **items** : 
  * hamburger 
  * the drink 
  * the side item 
* build application to select the items for the order 

##### Meal order 
* this should composed of (one burger, one drink, one side item)
* specify each item 

##### drink 
* must have at least (type, size, price) 
* the price change accrording to the size 

##### side item 
* need at least a type and price 

##### Burger 
* must have (type, base price, up to maximum three toppings ) 
* the constructor should include (burger type , price); 
* extra toppings are added some how 

##### deluxe burger 
* has set price 
  * any additional toppings do not change the price 
* should have room for an additional two toppings 

#### the functionality 
* create a default meal uses no args constructor 
* create a meal with (burger, drink, side items ) , 
* create a meal with deluxe burger, where all items, drink, side item, and up to 5 extra toppings are included in the burger price

* you want to perform these functions 
  * add some additional toppings to the burger
  * change the size of the drink 
  * print itemized list with its price (burger, extra toppings, the drink, side item)
  * print total amount of the meal 

### the solution 

#### the design 

#### entities : 
* item 
* burger 
* deluxe burger 
* meal order 

#### item : 
* fields : 
  * type : string 
  * name : string 
  * price : double 
  * size : string 
* methods : 
  * get name; 
  * getBasePrice 
  * getAdjustedPrice 
  * setSize 
  * printItem 
* constructor of 3 fields 

##### objects form item : 
* drink 
* side item 

#### burger extends item 
* fields : 
  * extra toppings 
* constructor 
  * (type, price) 
* methods : 
  * override : 
    * getName 
    * getAdjustedPrice
    * printItem
  * addExtraTopping 
  * printItemizedList 

#### meal order : 
* fields : 
  * burger 
  * drink 
  * side item 
* methods : 
  * printItemizedList 
  * getTotalPrice
  * addExtraTopping 
  * setDrinkSize 
* constructor 
  * (burger, drink, side item)

### implemented code : 
#### Item 

```java

public class Item {
    private String type;
    private String name;
    private double price;
    private String size = "MEDIUM";

    public Item(String type, String name, double price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        if(type.toUpperCase().equals("SIDE") || type.toUpperCase().equals("DRINK"))
            return type + " " + name;
        
        return name;
    }

    public double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice() {
        return price + switch (size) {
            case "SMALL" -> 0.5;
            case "MEDIUM" -> 0.0;
            case "LARGE" -> 0.75;
            default -> 0.0;
        };
    }
    
    public void setSize(String size) {
        this.size = size;
    }
    
    public static void printItem(String name, double price) {
        System.out.printf("%20s:%6.2f%n");
    }
    
    public void printItem() {
        printItem(getName(), getAdjustedPrice()); 
    }
}
```

#### Main class 
```java
public class Main {

    public static void main(String[] args) {
        
        Item coke = new Item("drink", "coke", 1.5); 
        coke.printItem();
        coke.setSize("large");
        coke.printItem();
        
        Item avocado = new Item("Topping", "avocado", 1.5); 
        avocado.printItem();
    }
}
```