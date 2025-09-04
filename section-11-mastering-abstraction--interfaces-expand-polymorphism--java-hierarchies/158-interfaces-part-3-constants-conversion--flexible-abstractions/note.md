## 158. Interfaces (Part 3): Constants, Conversion & Flexible Abstractions

### Extending interfaces 
* can be extended similar to class 
```java
interface OrbitEarth extends FlightEnabled {}
```

#### implements is invalid on an interface 
```java
interface OrbitEarth implements FlightEnabled{} // invalid 
```

### the code process 

bacck to FlightEnabled class 

```java
class Satellite implements OrbitEarth {
    
    public void achieveOrbit() {
        System.out.println("Orbit achieved");
    }
    
    // override by using intellij 
    
}


interface OrbitEarth extends FlightEnabled {
    
    void achieveOrbit; 
}
```

* add record `DragonFly` implements interface 
```java
record DragonFly(String name, String type) implements FlightEnabled{} 
```
* create enum type 
```jshelllanguage
enum FlightStages impelements Trackabe {
GOURNDED, LAUNCH, CRUISE, DATA_COOLECTION;

@Override 
public void track() {
    
}
}
```

```jshelllanguage
public void track() {
    
    if(this != GROUNDED) {
        System.out.println("Monitoring " + this);
    }
}
```

#### Abstracted types - conding to an interface 
* both inteerfaces and abstract classes are **abstracted reference types**
* reference type can be used :
  * variable types, method parameters , return types, list types 
* when using abstracted reference type, this is referred as **coding to an interface**
* more generlized 
* technique  is preferred  

```jshelllanguage
ArrayList<FlightEnabled> fliers = new ArrayList<>(); 
fliers.add(bird); 

List<FlightEnabled> fliers = new ArrayList<>() ; 
fliers.add(bird); 
```

#### creating methods with param types 
* replace the arrayList type in method parameters to List 
* declare a list and pass the `fliers`

#### coding to an interface advantages : 
* supports new subtypes, helps when refactoring code 

#### disadvantages : 
* alterations to the interface may wreak havoc, on the client code 