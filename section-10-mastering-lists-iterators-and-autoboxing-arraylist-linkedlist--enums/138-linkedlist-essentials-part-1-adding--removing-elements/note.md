## 138. LinkedList Essentials (Part 1): Adding & Removing Elements

### LinkedList 
* we have talked the difference between linkedlist and arraylist 
* ArrayList is implemented on top of an array, but a LinkedList is a doubly linked list 
* both implements all list's methods 
  * but also LinkedList also implements the Queue and Stack methods as well 

#### Queue 
* is first in, firs out (FIFO)

#### Stack 
* vertical part, one top another 
* LIFO

### the code process 
1. create a project LinkedList 

```java
public class Main {

    public static void main(String[] args) {
        
//        LinkedList<String> placesToVisit = new LinkedList<>(); 
        var placesToVisit = new LinkedList<String>(); 
        
        placesToVisit.add("Sydney");
        placesToVisit.add(0,"Canberra");
        System.out.println(placesToVisit);
        
        removeElements(placesToVisit);
        System.out.println(placesToVisit);
        
        
    }
    
    private static void addMoreElements(LinkedLIst<String> list) {
        
        list.addFirst("Darwin"); 
        list.addLast("Hobart"); 
        // queue methods 
        list.offer("Melbourne"); // same as last method 
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba"); 
        // stack methods 
        list.push("Alice Springs");
    }
    
    private static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove();
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst();
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast();
        System.out.println(s3 + " was removed");
        // queue/deque poll methods 
        String p1 = list.poll();
        System.out.println(p1 +" is removed"); 
        String p2 = list.pollFirst();
        System.out.println(p2 + " was removed");
        
        list.push("Mohammad"); 
        list.push("Brisbane"); 
        list.push("Ali");
        System.out.println(list);
        String p4 = list.pop();
        System.out.println(p4 + " was removed");
    }
}
```