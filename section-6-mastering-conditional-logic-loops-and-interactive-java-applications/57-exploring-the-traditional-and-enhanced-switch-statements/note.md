## 57. Exploring The Traditional And Enhanced Switch Statements


```java

public class Main {

    public static void main(String[] args) {
        
        int value = 1; 
        
        if (value == 1) {
            System.out.println("The value was 1");
        } else if (value == 2) {
            System.out.println("The value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }
    }
}
```

#### the switch statement 
```jshelllanguage
switch(value) {
    case x: 
        // cod for value == x
        break;
    case y:    
        // cod for value == y
        break; 
    default:   
        // code for not y or x 
}
```

##### back to Main code :
```jshelllanguage
    int switchValue = 1;

    switch (switchValue) {
        case 1:
            System.out.println("Value was 1");
            break;
        case 2:
            System.out.println("Value was 2");
            break;
        case 3:
            System.out.println("Value was 3");
            break;
        case 4: case 5: case 6:
            System.out.println("higher a bit");
            break;
        default:
            System.out.println("not 1 or 2 or 3");
    }
```
* change and test the value of variable : `switchValue`
* grouping case test toghether 
* switch statement only be used : 
  * with limited number of variable data types 

##### the limited list of data types are used in switch statement 
byte, short, int, char  
Byte, Short, Integer, Character  
String  
enum 

**important** : cannot use long, float, double or boolean or their wrappers 

#### fall through in switch statement 
* once a case is matched, no more cases are checked 
* any code after the case label where there was a match found, will be executed until break statement , or the end of the switch statements occurs 
* if match and there is no break statement after, then continue and fall through any case lables declared below the matching 

##### for example : 
```jshelllanguage
    int switchValue = 1;

    switch (switchValue) {
        case 1:
            System.out.println("Value was 1");
//            break;
        case 2:
            System.out.println("Value was 2");
//            break;
        case 3:
            System.out.println("Value was 3");
//            break;
        case 4: case 5: case 6:
            System.out.println("higher a bit");
//            break;
        default:
            System.out.println("not 1 or 2 or 3");
            break; 
    }
```
_output :_ 
```bash
Value was 1
Value was 2
Value was 3
higher a bit
not 1 or 2 or 3
```
