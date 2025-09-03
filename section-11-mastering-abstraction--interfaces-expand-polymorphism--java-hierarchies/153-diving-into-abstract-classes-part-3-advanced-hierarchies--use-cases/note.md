## 153. Diving into Abstract Classes (Part 3): Advanced Hierarchies & Use Cases

### animal class 
add methods : 
```jshelllanguage
public String getExplicitType() {
    return getClass().getSimpleName() + " ( " + type + " ) " ; 
}
```
call this method in another overriden methods 
```jshelllanguage
@Override
public void makeNoise() {
    System.out.println(getExplicitType() + "Bark!");
}
```

##### try to define the getExplicitType as final 
```jshelllanguage
public final String getExplicitType() {
    return getClass().getSimpleName() + " ( " + type + " ) " ; 
}
```
back to Dog class 
* we can't override the `getExplicitType` method , becuase it is final 

##### back to main class 
* create class Mammal 
```java
abstract class Mammal extends Animal  {
    
    // include constructor using intelliJ 

    @Override
    public void move(String speed) {
        System.out.println(getExplicitClass()+" Run at " + speed + " miles per hour.");
    
    }
    
    public abstract void shedHair(); 
    
}
```
* an abstract class can extends another abstract class 
* it can implement all the parents methods 
* some of them 
* none of them 
* include additional abstract methods 

##### create house class 
```java
public class Horse extends Mammal {
    
    @Override 
    public void shedHair() {

        System.out.println(getExplicitType() + " shedding hair");
    }
    
}
```

back to Main 
```jshelllanguage
for (Animal a : animals) {
    a.makeNoise();
    a.move("Slow");
    if(Animal instanceof Mammal currentMammal){
        currentMammal.shedHair(); 
    }
}
```