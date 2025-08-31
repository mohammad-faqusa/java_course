## 139. LinkedList Essentials (Part 2): Retrieving & Itinerary Example

```java

public class Main {


    public static void main(String[] args) {
        
        gettingelements(placesToVisit); 
    }
    
    public static void gettingElements(LinkedList<String> list) {

        System.out.println("Retrieved element = " + list.get(4));
        System.out.println("first element = " + list.getFirst());
        System.out.println("last element = " + list.getLast());

        System.out.println("Darwin is at position " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position : " + list.lastIndexOf("Melbourne"));
        
        
        // Queue retrieval method 
        System.out.println("Element from element() = " + list.element());
        // stack retrieval methods 
        System.out.println("Element from peek() = " + list.peak());
        System.out.println("Element from peakFirst() = " + list.peakFirst());
        System.out.println("Element from peakLast() = " + list.peakLast());
        
        
        
        
    }
}
```

#### another way to loop through elements 

```jshelllanguage
public static void printInterator(LinkedList<String> list) {
    ListIterator<String> iterator = list.listIterator(); 
    while(iterator.hasNext()) {
        var town = iterator.next();
        System.out.println("---> From : " + previouseTown + " to " + town);
        previouseTown = town;
    }
}
```