import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListChallenge {

    public static void main(String[] args) {

        ArrayList<String> groceries = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int inputKey;
        boolean flag = true;
        do {
            System.out.println("""
                    Available actions 
                    0 - to shutdown 
                    1 - to add item(s) to list (comma delimited list)
                    2 - to remove any items (comma delimited list) 
                    Enter a number for which action you want to do : 
                    """);
            inputKey = sc.nextInt();
            sc.nextLine(); // ⚡ consume newline after number input

            switch (inputKey) {

                case 0 -> flag = false;
                case 1 -> {
                    System.out.println("Input the items, comma delimited");
                    String inputStr = sc.nextLine();
                    var items = List.of(inputStr.split(","));
                    for (String el : items) {
                        if (!groceries.contains(el.trim()))
                            groceries.add(el.trim());
                    }
                    System.out.println("Current list: " + groceries);
                }
                case 2 -> {
                    System.out.println("Enter the elements to remove : ");
                    var items = List.of(sc.nextLine().split(","));
                    for (String el : items) {
                        groceries.remove(el.trim());
                    }
                    System.out.println("Current list: " + groceries);
                }
                default -> System.out.println("Invalid input");
            }

        } while (flag);
    }
}
