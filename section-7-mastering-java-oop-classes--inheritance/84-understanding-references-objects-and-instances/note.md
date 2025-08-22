## 84. Understanding References, Objects, and Instances

### Reference vs object vs instance vs class 

#### object vs instance vs class 
* exmaple of building house 
* blue print : class 
* house we build: instance , using new operator, 
* each house has and address : reference 

```jshelllanguage
House blueHouse = new House("blue");
```
![img.png](img.png)
```jshelllanguage
House anotherHouse = house; 
```
![img_1.png](img_1.png)

```jshelllanguage
house greenHouse = new House("green"); 
```
![img_2.png](img_2.png)

```jshelllanguage
anotherHouse = greenHouse; 
```
![img_3.png](img_3.png)

### The reference vs The object 
```java
new House("red");
House myHouse = new House("beige"); 

House redHouse = new House("red");

new House("red"); 
```
* in first line, we created an object, but not assigned to a variable
  * this compiles file 
  * but can't access it later 
  * becasue we didn't create a reference to it 
* the third line has no relationship to the second line 