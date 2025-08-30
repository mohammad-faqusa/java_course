## 109. Polymorphism in Practice, Part 2: Factory Methods, Runtime Types, and Movie Scen

### from the previous code :
* add methods to Movie
  * return special instance from selection 
```jshelllanguage
public static Movie getMovie(String type, String title) {

    return switch (type.toLowerCase().charAt(0)) {
        case 'A' -> new Adventure(title); 
        case 'C' -> new Comedy(title); 
        case 'S' -> new ScienceFiction(title); 
        default -> new Movie(title); 
    }; 
}
```

* in main method : 
```java
public class Main {

    public static void main(String[] args) {
        Movie comedy = Movie.getMovie("comedy", "because I am happy"); 
        Movie adventure = Movie.getMovie("adventure", "Uncharted"); 
        Movie comedy = Movie.getMovie("comedy", "because I am happy"); 
        comedy.watchMovie(); 
    }
}
```
* this way, the Main does not need to know about the sub classes , just pass the name with String, and the `Movie` will take the process 

```jshelllanguage

public static void main(String[] args) {
//        Movie comedy = Movie.getMovie("comedy", "because I am happy"); 
//        Movie adventure = Movie.getMovie("adventure", "Uncharted"); 
//        Movie comedy = Movie.getMovie("comedy", "because I am happy"); 
//        comedy.watchMovie(); 
    
    Scanner s = new Scanner(System.in); 
    
    while(true) {
        System.out.println("Enter type (A for Adevnture , C for Comedy , S for Sience, Q to quit )");
        String type = s.nextLine(); 
        if("Qq".contains(type)){
            break; 
        }

        System.out.println("Enter Movie Title : ");
        String title = s.nextLine(); 
        Movie movie = Movie.getMovie(type, title); 
        movie.watchMovie(); 
    }
}
```
* run the application 

#### Imports 
* auto imports enabled (recommended); 
* for example : if you add : 
```jshelllanguage
import java.util.ArrayList; 
List list = new ArrayList<String>(); // auto import ArrayList 
```

#### Polymorphism in action 
* the ability to execute different behavior for different types at runtime 
* enables to write generic code 
* the code can handle classes, or subclasses, 