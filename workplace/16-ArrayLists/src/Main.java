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

        System.out.println(Arrays.toString(groceryList.toArray()));

    }
}