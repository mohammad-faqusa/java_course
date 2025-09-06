## 174. Static Methods in Generics & Multiple Upper Bounds Explained

### the process 
1. create util.QueryItem 

```java
public interface QueryItem {
    
    boolean matchFieldValue(String fieldName, String value);
    
}
```
2. create QueryList
```java
public class QueryList<T extends QueryItem> {
    
    private List<T> items; 
    
    public QueryList(List<T> items) {
        this.items = items; 
    }

    public static <T extends QueryItem> List<T> getMatches(List<T> items, String field, String value) {

        List<T> matches = new ArrayList<>();
        for(var item : items) {
            if(item.matchFieldValue(field, value)) {
                matches.add(item);
            }
        }
        return matches;
    }
    
    public List<T> getMatches(String field, String value) {
        
        List<T> matches = new ArrayList<>(); 
        for(var item : items) {
            if(item.matchFieldValue(field, value)) {
                matches.add(item); 
            }
        }
        return matches; 
    }
}
```
* to pass the vlaues and fields 

3. in Student class implement the QueryItem interface 
```java
public class Student implements QueryItem{
    
    public boolean matchFieldValue(String fieldName, String value) {
        String fName = fieldName.toUpperCase(); 
        return swtich(fName) {
            case "NAME" -> name.equalsIgnoreCase(value); 
            case "COURSE" -> course.equalsIgnoreCase(value); 
            case "YEARSTARTED" -> yearStarted == (Integer.parseInt(value)); 
            
            default -> false; 
        };
    }
}
```

4. in Main class 
```java
public class Main {

    public static void main(String[] args) {
        
        // ... previous 
        var queryList = new QueryList<>(lpaStduents); 
        var matches = queryList.getMatches(
                "Course" , "Python"
        ); 
        printMoreLists(matches); 
        var students2021 = QueryList.<Student>getMatches(students, "YearStarted" , "2021");
        printMoreLists(matches);

    }
}
```

#### extends multiple types : 

```java
public class QueryList<T extends Stduent & QueryItem > {
    
}
```
* the class must come first 
*  