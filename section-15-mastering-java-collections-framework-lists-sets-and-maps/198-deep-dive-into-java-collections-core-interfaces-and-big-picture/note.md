## 198. Deep Dive into Java Collections: Core Interfaces and Big Picture

#### a collection 
* is an object represent a group of related objects 
* have specific names and expected behaviours : arrays, lists, vectors, sets, queues, tables, dictionaries, and maps
* these collections are differentiated by how they store objects in memory , how they are retrieved in order 


#### a collections framework 
* oracle definition of a collection framework : a unified architecture for representing and manipulating collections, enabling collections to be manipulated independently of implementation details

![img.png](img.png)

#### what is in the framework , what is not ? 
* Arrays and the Array utilities are not considered as a part of this framework 
* a collection object implements the Collection interface, with the exception of maps 
* the collection interface is the foundation of the collection in java hierarchy 


#### The collection interface 
![img_1.png](img_1.png)

#### the code process 
1. create project : CollectionsOverview
2. replace the List with Collection 
```jshelllanguage
//List<String> list = new ArrayList<>();
Collection<String> list = new ArrayList<>();

```
3. change the array list to tree set  
the elements are unordered 
```jshelllanguage
//Collection<String> list = new ArrayList<>();
Collection<String> list = new TreeSet<>();
```
4. add to sort elements  
the **collection** interface does not have **sort** method  
but **list** interface has sort method  
because list extends the collection interface, and add sort method
```java

import java.util.Arrays;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        List<String> list = new TreeSet<>();

        String[] names = {"Mohammad", "Khaled", "Hasan", "Ali"};

        list.addAll(Arrays.asList(names));
        System.out.println(list);

        list.add("Fred");
        list.addAll(Arrays.asList("George", "Gary", "Grace"));
        System.out.println(list);
        System.out.println("Garies in the list ? " + list.contains("Gary"));

        list.removeIf(s -> s.charAt(0) == "G");
        System.out.println("Garies in the list ? " + list.contains("Gary"));

        list.sort(Comparator.naturalOrder()); 
    }
}
```

#### what is TreeSet ? 
* a collection interface 
* later we talk about 

14. try HashSet init 
    * the elements are not in order 
15. call sort method (sort does not compile)
   * collection interface does not have method sort 


#### the collection interface 
![img_2.png](img_2.png)

#### Collections - The big picutre : 
![img_3.png](img_3.png)

#### the list 
![img_4.png](img_4.png)

#### The queue : 
![img_5.png](img_5.png)

#### the set 
![img_6.png](img_6.png)

#### hte map 
![img_7.png](img_7.png)

#### polymorphic algorithm 
* static methdos : java.util.Collections 
* 