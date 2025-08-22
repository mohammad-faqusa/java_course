## 63. Sum 3 And 5 Challenge With IntelliJ Debugger Insights

### sum 3 and 5 challenge 
* create for loop range numbers : 1 to 1000
* sum of all number divided by 3 and 5 
* print the met conditions 
* break if 5 numbers found met the conditions 
* print the sum of numbers 

```java
public class Main {

    public static void main(String[] args) {
        
        int count = 0; 
        int sum = 0; 

        for (int number = 1; number < 1000; number++) {
            
            if(number % 3 == 0 && number % 5 == 0){
                System.out.println("The number " + number + " is divisable");
                count++; 
                sum += number; 
            }
            
            if(count == 5)
                break; 
            
        }
        System.out.println("the sum of numbers : " + sum);
    }
    
    
}
```

### IntelliJ's Java Debugger 
* [page](https://www.jetbrains.com/help/idea/debugging-code.html)
* in intellij the debugger icon is shown next to run icon 
* or in debugger menu you can find 
* properties 
  * break point 
  * arguments of a method 
  * scope variables 
  * watch list : (add varaibles or expression) to see the supposed results 
* icons
  * most care about : step over 
  * step through : execute methods from other methods 