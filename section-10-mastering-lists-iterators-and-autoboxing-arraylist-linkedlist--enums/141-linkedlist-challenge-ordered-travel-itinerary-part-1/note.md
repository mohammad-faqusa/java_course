## 141. LinkedList Challenge: Ordered Travel Itinerary (Part 1)

### LinkedList Challenge 
* create a **list** of **places** , **ordered by distance** from the **starting** point
* use listIterator 


#### steps : 
1. create a type that has a field for a town or place name 
2. field for storing the distance from the start 
3. create an itinerary of places or towns to visit

5. create linked list for places 
6. create linked list for distances 

7. create interactive program : 
```text
Available actions (select word or letter ) : 
(F)forward
(B)ackward
(L)ist places 
(M)enu
(Q)uit
```

#### solution 
1. create a record 
```java
record Place(String name, int distance) {
    
    @Override 
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
} 

public class Main {

    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinedList<>(); 
        Place aldelaide = new Place("adelaide") ; 
        addPlace(placesToVisit, aldelaide);
        addPlace(placesToVisit, new Place("Adelaide", 1437)); // will return duplicate 
        addPlace(placesToVisit, new Place("adelaide", 1437)); 
        addPlace(placesToVisit, new Place("hebron", 2000)); 
        addPlace(placesToVisit, new Place("jerico", 1500)); 
        addPlace(placesToVisit, new Place("darwin", 3000)); 
        System.out.println(placesToVisit);
        
    }
    
    private static void addPlace(LinkedList<Place> list, Place place) {
        
        if(list.contains(place)) {
            System.out.println("Found duplicate : " + place);
            return; 
        }
        
        for(Place p : list) {
             if(p.name.equalsIgnoreCase(place.name())) {
                 System.out.println("Found duplicate " + place);
                 return; 
             }
        }
        
        int matchedIndex = 0; 
        for(var listPlace: list) {
            if(place.distance() < listPlace.distance()) {
                list.add(matchedIndex, place) ; 
                return; 
            }
            matchedIndex++; 
        }
        list.add(place); 
    }
}
```