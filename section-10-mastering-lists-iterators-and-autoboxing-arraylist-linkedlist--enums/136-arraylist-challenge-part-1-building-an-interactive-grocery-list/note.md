## 136. ArrayList Challenge Part 1: Building an Interactive Grocery List

### The ArrayList Challenge 
* the challenge is to create an interactive console progra, with a menu of options as shown here, and functionality that I will describe now : 

```bash
Availabe actions 
0 - to shutdown 
1 - to add item(s) to list (comma delimited list)
2 - ro remove any items (comman delimited list) 
Enter a number for which action you want to do : 
```

Using the Scanner class, solicit a menu choice , 0, 1 , or 2 and process the item accordingly 

* the list will be a grocery list and should be an ArrayList 
* use methods to add items, remove items , check if an item is already in the list, and print a sorted list 
* print the list sorted alphabetically 
* you shouldn't duplicated the items 

```java
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

```

### the instructor solution

```java
import java.util.concurrent.ConcurrentMap;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();

        while (flag) {
            printActions();
            switch (Integer.parseInt(Scanner.nextLine)) {
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
        
    }
    
    private static void addItems(ArrayList<String> groceries) {
        System.out.print("Add item(s) [seperate items by comma]:");
        String[] items = scanner.nextLine().split(","); 
//        groceries.addAll(List.of(items)); 
        
        for(String i: items) {
            String trimmed = i.trim(); 
            if(groceries.indexOf(trimmed) < 0) {
                groceries.add(trimmed); 
            }
        }
    }

    private static void removeItems(ArrayList<String> groceries) {
        System.out.print("remove item(s) [seperate items by comma]:");
        String[] items = scanner.nextLine().split(",");

        for(String i: items) {
            String trimmed = i.trim();
            if(!(groceries.indexOf(trimmed) < 0)) {
                groceries.remove(trimmed);
            }
        }
    }
    
    private static void printActions() {
        String textBlock = ("""
                Available actions 
                0 - to shutdown 
                1 - to add item(s) to list (comma delimited list)
                2 - to remove any items (comma delimited list) 
                Enter a number for which action you want to do : 
                """);
        System.out.print(textBlock + " ");
    }
}
```