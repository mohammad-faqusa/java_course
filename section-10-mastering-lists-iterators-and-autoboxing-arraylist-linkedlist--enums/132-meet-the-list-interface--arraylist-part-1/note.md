## 132. Meet the List Interface & ArrayList (Part 1)

### java Array vs Java list 
* arrays
  * is mutable 
* list : 
  * add , remove , and resize 


#### what is a List 
* special type in Java, called an interface
* [method summary of lists](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/List.html#method-summary)

#### the ArrayList
* is a class that maintains an array in memory that's actually bigger than what we need, in most casse
* it keeps track the capacity or maximum size 
* but alos keeps track of the elements that've been assigned or set, which is the size of the ArrayList
* as elements are added to an ArrayList, 
  * capacity may need to grow 
  * this occurs automatically behind the sciences 

## the code process 
1. create project ArrayLists 

```java

record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name, "DIARY", 1);
    }
}
public class Main {

    public static void main(String[] args) {
        
        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = "5 oranges";
        System.out.println(Array.toString(groceryArray));
    }
}
```
* run the code and review the output 
* try to change from `Object[]` to GroceryItem[]
  * compiler require to change this `groceryArray[2] = "5 oranges";`
  * to this `groceryArray[2] = new GroceryItem("orange", PRODUCE, 5);`

#### create using ArrayList 
```jshelllanguage
ArrayList objectList = new ArrayList(); // warn to use Raw use of parameterized class 'ArrayList'
objectList.add(new GroceryItem("Butter"));
objectList.add("Yogurt"); 
```
* if we don't specify the class of ArrayList, it will be Object[] 

##### specify arrayLIst type 
```jshelllanguage
ArrayList<GroceryItem> groceryList = new ArrayList<GroceryItem>();
    groceryList.add(new GroceryItem("Butter"));
```