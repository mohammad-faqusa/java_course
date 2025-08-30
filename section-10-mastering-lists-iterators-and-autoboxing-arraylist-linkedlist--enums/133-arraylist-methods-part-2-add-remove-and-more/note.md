## 133. ArrayList Methods (Part 2): Add, Remove, and More

### the process code 

#### introduction 
* raw version of ArrayList 
* determine the type of ArrayList , diamond operator <> 
  * if you skip it , you get warning about the raw use

#### back to main code 
```java
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = "5 oranges";
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList(); // warn to use Raw use of parameterized class 'ArrayList'
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        System.out.println(Arrays.toString(objectList.toArray()));

        ArrayList<GroceryItem> groceryList = new ArrayList<GroceryItem>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Yogurt"));
        groceryList.add(new GroceryItem("oranges", "PRODUCE", 6));
        groceryList.add(0, new GroceryItem("apples", "PRODUCE", 7));

        System.out.println(Arrays.toString(objectList.toArray()));


    }
}
```

* override the toString method
```java
record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name, "DIARY", 1);
    }
    
    @Override 
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type); 
    }
}
 
```

##### create antoher class MoreLists 
```java
public class MoreLists {

    public static void main(String[] args) {
        
        String items = {"apples", "bananas", "milk", "eggs"}; 
        
        List<String> list = List.of(items); 
        System.out.println(list);

        System.out.println(list.getClass().getName());
        
//        list.add("yogurt"); // exception , immutalbe
        
        ArrayList<String> groceries = new ArrayList<>(list); 
        groceries.add("yogurt");
        System.out.println(groceries);
        
        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard", "cheese")
        );
        
        groceries.addAll(nextList);
        System.out.println(groceries);
    }
}
```