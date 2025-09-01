## 142. LinkedList Challenge Continued: Interactive Navigation
```text
Available actions (select word or letter ) : 
(F)forward
(B)ackward
(L)ist places 
(M)enu
(Q)uit
```
* we will use scanner 

#### back to main code 
```java
public class Main {
    public static void main(String[] args) {

//        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0,"Canberra");
        System.out.println(placesToVisit);

//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);

        removeElements(placesToVisit);
        var iterator = placesToVisit.listIterator(); 
        Scanner scanner = new Scanner(System.in); 
        boolean forward = true; 
        boolean quitLoop = false; 
        
        while(!quitLoop) {
            if(!iterator.hasPrevious()){
                System.out.println("Originating :  " + iterator.next());
                forward = true; 
            }

            if(!iterator.hasNext()){
                System.out.println("Final :  " + iterator.previous());
                forward = false;
            }
            System.out.println("Enter a value");
            String menuItem = scanner.nextLine().toUpperCase().substring(0,1);
            switch(menuItem) {
                case "F" :
                    System.out.println("User wants to go forward");
                    
                    if(!forward) {
                        forward = true; 
                        if(iterator.hasNext()) {
                            iterator.next(); 
                        }
                    }
                    if(iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    break;
                    
                case "B":
                    System.out.println("user want to go backwards");
                    if(forward) {
                        forward = false;
                        if(iterator.hasPrevious()) {
                            iterator.previous();
                        }
                    }
                    if(iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break; 
                    
                case "M": 
                    printMenu(); 
                    break; 
                case "L" :
                    System.out.println(placesToVisit);
                    break;
                default: 
                    quitLoop = true; 
            }
            
        }


    }

    private static void printMenu() {

        System.out.println("""
                Available actions (select word or letter ) : 
                (F)forward
                (B)ackward
                (L)ist places 
                (M)enu
                (Q)uit
                """);
    }
}
```