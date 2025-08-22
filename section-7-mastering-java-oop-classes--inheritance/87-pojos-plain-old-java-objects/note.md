## 87. POJOs: Plain Old Java Objects

### introduction 
* is a class that generally only has instance fields 
* it's used to house data and pass data between functional classes
* it usually has no other, or very few methods, otther than getters and setters for the instance fields 
* many database frameworks use POJO's to read data from , or to write data to the databases, files or streams 

#### Examples of POJOS 
* a POJO also might be called a bean or a JavaBean
* a JavaBean is just a POJO with some extra rules applied to it
* is some times called **Entity** because it mirrors database entities 
* another acronym DTO , Data Transfer Object
* it's a description of an object that can be modeled as just data 

#### Support for POJO creation 
* there are many generation tools that will trun a data model into generated POJO's or JavaBeans 

#### Example of POJO

```java
public class Main {

    public static void main(String[] args) {
        for(int i = 1 ; i <= 5 ; i++ ) {
            Student s = new Student("S92300" + i ,
                    switch(i) {
                case 1 -> "Mohammad";
                case 2 -> "Carlo"; 
                case 3 -> "Tim"; 
                case 4 -> "Harry"; 
                case 5 -> "Lisa"; 
                default -> "Anonymous"; 
                    },
                    "05/11/1985",
                    "Java Masterclass");
        }
        
    }
    
    
}
```

```java
public class Student{

    private String id;
    private String name;
    private String dataOfBirth;
    private String classList;

    // select on Intellig 
    // to create constructors 
    // generate setters and getters 


    public Student(String id, String name, String dataOfBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dataOfBirth = dataOfBirth;
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dataOfBirth='" + dataOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }
}
```

##### The entity - the student table 
id, name, dateOfBirth, ClassList

#### Annotation 
* are type of metadata 
* metadata is a way to formally describe additional information about our code
* annotations are more structured and have more meaning that comments
* this is because they can be used by the compiler or other types of pre-processing functions, to get information about the code
* metadata will still run with or without annotations 

* for example : 
  * `@Override` , describe an overridden method

#### Overridden method 
* is not the same thing as **overloaded** method 
* an overridden method is a special method in java that other classes can implement if they use a **specified method signature** 

