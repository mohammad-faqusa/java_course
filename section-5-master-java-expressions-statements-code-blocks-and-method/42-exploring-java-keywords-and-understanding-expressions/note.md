## 42. Exploring Java Keywords And Understanding Expressions

### keywords 
* java uses `character sequence` terminoloyg to find these,  
so easy fo find 
* java has 16 contextual keywords, that are used in special situations 


### create new project 
* name : `KeywordsAndExpressions` 
* create new class `Main`
```java
public class Main {
    public static void main(String[] args) {
//        int int = 5; // wrong : varaible name is reserve word
//        int int2 = 5;     
        
        double kilometers = (100 * 1.609344); // convert miles to kilometers 
        
        if (highScore > 25) {
            highScore = 1000 + highScore; // add bonus points 
            
        }
        
        int health = 100; 
        
        if((health < 25) && (highScore > 1000)) {
            highScore = highScore - 1000; 
        }
    }
    
}
```
* naming variables  
* `true/false` are not keywords, rather the `null` literal 

### Java's Code units 
* hierarchical units 
  * expression : building block unit for expressions or statements 
  * statement
  * code block : group of statement

#### apply units to code 
```jshelllanguage
double kilometers = (100 * 1.609344);
```
* this is expression : `(100 * 1.609344)`
* statement : `double kilometers = (100 * 1.609344);`

```jshelllanguage
if (highScore > 25) {
    highScore = 1000 + highScore; // add bonus points 

}
```
* expressions :
  * `highScore > 25`  
  * `1000 + highScore`
  * ``

```jshelllanguage
int health = 100;

if ((health < 25) && (highScore > 1000)) {
    highScore = highScore - 1000;
}
```
* expressions (6): 
  * `health = 100`
  * `health < 25`
  * `highScore > 1000`
  * `(health < 25) && (highScore > 1000)`
  * `highScore - 1000`
  * `highScore = highScore - 1000`## 42. Exploring Java Keywords And Understanding Expressions
