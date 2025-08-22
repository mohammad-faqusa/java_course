## 79. Setters, Object Creation, and OOP Practice

#### using setter methods 
* create getters and setters
* apply it to main method, by creating multiple car objects 

```jshelllanguage
public void setMake(String make) {
    this.make = make; 
}
```
#### this 
* is a keyword in java 
* reference to the instance that was created when the object was instantiated 

#### advantages of setters
* validation 
* compine other operations while setting the field 
* 

```jshelllanguage
Car target = new Car(); 
target.setMake("Porche"); 
target.setModel("Target");
target.setDoors(2); 
// .....
```