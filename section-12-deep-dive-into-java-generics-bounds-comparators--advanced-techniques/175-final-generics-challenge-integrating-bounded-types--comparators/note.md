## 175. Final Generics Challenge: Integrating Bounded Types & Comparators

### Putting it all together , final section challenge 
* change the QueryList to extended ArrayList removing the items field 
* add a student id field to the Student class, and implement a way to ocmparte Students, so that students are naturally oredered by a student id 
* implement at leas other mechanism for comparing Students by course or year , or for LPA students by percent complete 
* Override the matchFieldValue method on the LPAStudent class , for percent less than or equal to a submitted value 
* run the code on 25 random students selecting : 
  * completed <= 50 % 
  * print the list 
  * stored at elast two ways : 
    * List.sort with comparator naturalOrder 
    * your own comparator 
* have some fun 

the structure : 
* model : 
  * LPAStudent 
  * Student 
* util : 
  * QueryItem 
  * QueryList
* Main class 

### the steps 
on QueryList 
```java
public class QueryList <T extends Student & QueryItem> extends ArrayList<T> {
    
    public QueryList() {
        
    }
    
    public QueryList(List<T> items) {
        super(items); 
    }
    
    public QueryList<T> getMatches(String field, String value) {

        QueryList<T> result = new QueryList<>();
        for(var item : this) {
            if(item.matchFieldValue(field, value)) {
                result.add(item); 
            }
        }
        return result;
    }
} 
```

2. add student id to student 
```java
public class Student { 
    
    private static int LAST_ID = 10_000; 
    private int studentId; 
    
    public Student() {
        
        // ... 
        studentId = LAST_ID++; 
    }
    
    public toString {
        return " ..." + studentId 
    }
    
}
```

in Main class

```java
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        QueryList<LPAStudent> queryList = new QueryList<>();
        for (int i = 0; i < 5; i++) {
            queryList.add(new LPAStudent());
        }

        System.out.println("Ordered");
//        queryList.sort(null); 
        queryList.sort(Comparator.naturalOrder()); 
    }
    
    public static void printList(List<?> students) { 
        for(var student : students) {
            System.out.println(student);
        }
    }
}
```
* back to Student class ,impelements Comparable 
```java
public class Student implements QueryItem, Comaprable<Student>{
    
    public int compareTo(Student o) {
        return Integer.valueOf(studentId).compareTo(o.studentId); 
    }
} 
```