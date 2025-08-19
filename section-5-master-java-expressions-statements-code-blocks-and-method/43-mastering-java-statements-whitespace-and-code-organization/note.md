## 43. Mastering Java Statements, Whitespace, And Code Organization

### introduction 


### The process

```java
public class Main {

    public static void main(String[] args) {
        
        int myVariable = 50; 
        
        myVariable++;
        myVariable--;

        System.out.println("This is test");

        System.out.println("This is " +
                " another" + 
                " still more.");

//        System.out.println("This is " // error incomplete statement 
    
        if(myVariable == 0) {
            System.out.println("It's now zero");
        }
    }
}
```

#### structure  code 
* statements : 
  * `int myVariable = 50;`
  * `myVariable++;` (with semicolon)
  * `myVariable--;` (with semicolon)
  * `System.out.println("This is test");`
  * `System.out.println("This is " +
                " another" + 
                " still more.");`

* expression : 
  * `myVariable = 50`
  * `myVariable++`
  * `myVariable--`

#####  we can have multiple statements in one line
```jshelllanguage
int myVariable = 50;myVariable++;myVariable--;System.out.println("This is test");
```

#### white space : 
* extra spacing
* human readability  
* for java, is ignored 
* you can write code like this : 
```jshelllanguage
int myVariable                                      = 
        
        50
        
        ;

    myVariable++;
    
    myVariable--;
```

* [recommendation for whitespace](https://google.github.io/styleguide/javaguide.html#s4.6-whitespace)
* you can reformat the code to set to recommended white space ,
  * on intellig (reformat command), to get back to default 
* **Indentation** 
  * remove Indentation : shift + tab 

##### code convention for whitespace 
* google java style guide
  * you can reformat the code to set to recommended white space ,
