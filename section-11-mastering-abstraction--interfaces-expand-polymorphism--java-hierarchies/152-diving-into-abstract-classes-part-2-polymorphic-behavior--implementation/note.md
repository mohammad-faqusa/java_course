## 152. Diving into Abstract Classes (Part 2): Polymorphic Behavior & Implementation

### override the methods 

```java
public class Dog extends Animal {
    
    @Override 
    public void makeNoise() {
        
        if(type == "Wolf")
            System.out.println("Howling !");
        else
            System.out.println("Woof!");
    }
    
    @Override 
    public void move(int speed) {
        
        if (speed > 50)
            System.out.println("running");
        else 
//            walking 
    }
}
```

```java
public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("animal", "big", 100); // we can't create animal class, has no constructor 
        Dog dog = new Dog("wolf", "big", 100); 
        dog.makeNoise();
        doAnimalStuff(god); 
        
        ArrayList<Animal> animals = new ArrayList<>(); 
        animals.add(dog); 
        animals.add(new Dog);
        animals.add(new Fish); 
        
        for(Animal a : animals) {
            a.move(); 
            a.makeNoise(); 
        }
        
    }
    
    private static void doAnimalStuff(Animal animal) {
        animal.makeNoise(); 
        animal.move("slow"); 
    }
}
```

```java
public class Fish extends Animal {

    @Override
    public void makeNoise() {

        if(type == "Wolf")
            System.out.println("Howling !");
        else
            System.out.println("Woof!");
    }
}
```