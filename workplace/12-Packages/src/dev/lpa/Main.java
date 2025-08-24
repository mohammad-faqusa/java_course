package dev.lpa;
import com.abc.first.Item;
public class Main {

    public static void main(String[] args) {
        Item firstItem = new Item("Burger"); // the intellij will suggest by displaying the class package path, and when click, it will automatically improt
        com.abc.first.Item secondClass = new com.abc.first.Item("Burger");

        System.out.println(firstItem);
    }
}