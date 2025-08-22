## 88. Java Records: The Modern POJO Approach

### The POJO vs The Record

#### The Record Type
* the purpose to replace the boilerplate code of the POJO but to be more restrictive 
* java calls them "plain data carriers"
* the record is a special class that contains data that's not mean to be altered 
* it seeks to achieve immutability  for the data in its members
* it contains only the most fundamental methods, such as constructors and accessors 

#### code process
1. create new class 
2. choose Record
3. name : LPAStudent

```jshelllanguage
public record LPAStudent(){
}
```
* there are a `()` after the name of this record : 
  * we can set parameters within those parentheses 

```jshelllanguage
public record LPAStudent(String id, String name, String dateOfBirth, String classList){
}
```

#### Implicit or Generated code that java provides 
* the parenthesis of the record is called `record header`
* record header consist of : record components and comma-delimited list of components 

* for each **component in the header** 
  * a field with the same name and declared type as teh record component 
  * field is declared private and final
  * the field sometimes referred to as a component field 
* toString 
* public accessors , has the same name of type component,but it doesn't have any kind of special prefix like get or is, for example 
  * the accessor method for id, in this example , is simply id().

```java
public class Main {

    public static void main(String[] args) {
        
        Student pojoStudent = new Student("234523" , "Ann", "05/11/1985", "Java MasterClass");
        LPAStudent lpaStudent = new Student("234523" , "Ann", "05/11/1985", "Java MasterClass");

        System.out.println(pojoStudent);
        System.out.println(lpaStudent);

        System.out.println(pojoStudent.getName());
        
//        System.out.println(lpaStudent.getName()); compiler error
        System.out.println(lpaStudent.name());
        
        // setting the data 
        pojoStudent.setName("Mohammad"); 
//        lpaStudent.setName("Mohammad"); // error, does not compile 
    
        
        
    }
    
}
```

### Why have an immutable record? 
* to protect the data from unintended mutations 
* there are more use cases for immutable data transfer objects, and keeping them well encapsulated

#### POJO vs RECORD 
* if you want to modify your class, you won't be using the record 
* if you're reading a whole lot of records from a database or file source and simply passing this data around, then the record is a big improvement 



